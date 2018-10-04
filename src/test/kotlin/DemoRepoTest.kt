import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.on

class DemoRepoTest : AbstractRepositoryTest({ storeFactory ->
    lateinit var repository: DemoRepo

    beforeEachTest {
        repository = DemoRepo(storeFactory.get())
    }

    given("test1") {
        on("test1") {
            val demo = Demo(0, "M", "UH")
            for (i in 0..100) {
                repository.put(demo)
                demo.id = 0
            }
        }
    }
})