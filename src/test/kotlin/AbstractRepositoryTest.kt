import io.objectbox.BoxStore
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.Spec
import java.io.File
import java.util.concurrent.atomic.AtomicReference

abstract class AbstractRepositoryTest(spec : Spec.(store: AtomicReference<BoxStore>) -> Unit) : Spek({
    val store : AtomicReference<BoxStore> = AtomicReference()
    val testResourceDirectory = File(".")

    beforeEachTest {
        store.set(MyObjectBox.builder()
                .directory(testResourceDirectory)
                .build())
    }

    afterEachTest {
        store.get()?.close()
        BoxStore.deleteAllFiles(testResourceDirectory)
    }

    spec(store)
})