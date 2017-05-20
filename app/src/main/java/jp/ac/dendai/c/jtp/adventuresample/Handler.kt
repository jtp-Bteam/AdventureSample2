package jp.ac.dendai.c.jtp.adventuresample

import jp.ac.dendai.c.jtp.adventuresample.scene.Scene

interface Handler {
    fun step(s: Scene)
}