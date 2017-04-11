package io.zhudy.ucenter.utils

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
interface TokenGenerator {

    /**
     *
     */
    fun generateToken(slot: String): String

}