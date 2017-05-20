package jp.ac.dendai.c.jtp.adventuresample.scene

import jp.ac.dendai.c.jtp.adventuresample.R

class First : AbstractScene() {
    override val imageId = R.drawable.first

    override val messageId = R.array.message1

    override val questionId = 0

    override fun next(no: Int): GameState = GameState.second

    override val dateId = R.string.date1

    override val musicId = R.raw.owarininokorumono
}