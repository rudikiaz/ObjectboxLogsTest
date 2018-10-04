import io.objectbox.BoxStore

class DemoRepo(
        store : BoxStore
)   {
    private val demoBox = store.boxFor(Demo::class.java)

    fun put(demo : Demo) : Long{
        return demoBox.put(demo)
    }

    fun get(id : Long): Demo {
        return demoBox.get(id)
    }
}