package jp.ac.dendai.c.jtp.adventuresample.scene

import jp.ac.dendai.c.jtp.adventuresample.R

class Second : AbstractScene() {
    override fun next(no: Int): GameState? {
        when (no) {
            0 -> return GameState.ending
            1 -> return GameState.badend
            2 -> return GameState.trueend
        }
        return null
    }

    override val imageId = R.drawable.second

    override val messageId = R.array.message2

    override val questionId = R.array.question2

    override val dateId = R.string.date2

    override val musicId = R.raw.owarininokorumono
}