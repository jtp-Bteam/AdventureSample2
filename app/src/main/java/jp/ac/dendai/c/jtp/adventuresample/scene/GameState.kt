package jp.ac.dendai.c.jtp.adventuresample.scene

enum class GameState private constructor(val scene: Scene) {
    first(First()), second(Second()),
    ending(Ending()), badend(BadEnd()), trueend(TrueEnd());


    companion object {
        val initialScene: Scene
            get() = first.scene
    }
}