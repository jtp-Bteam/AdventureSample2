package jp.ac.dendai.c.jtp.adventuresample.scene

import jp.ac.dendai.c.jtp.adventuresample.R

class Ending : AbstractScene() {
    override val imageId = R.drawable.ending

    override val messageId = R.array.messageending

    override val questionId = 0

    override fun next(no: Int): GameState? = null

    override val dateId = R.string.dateending

    override val musicId = R.raw.owarininokorumono
}