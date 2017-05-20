package jp.ac.dendai.c.jtp.adventuresample.scene

import jp.ac.dendai.c.jtp.adventuresample.R

class BadEnd : AbstractScene() {
    override fun next(no: Int): GameState? {
        return null
    }

    override val imageId= R.drawable.badend

    override val dateId = R.string.datebadend

    override val messageId = R.array.messagebadend

    override val questionId = 0

    override val musicId = R.raw.owarininokorumono
}