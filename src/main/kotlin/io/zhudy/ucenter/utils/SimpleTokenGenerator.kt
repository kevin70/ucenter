package io.zhudy.ucenter.utils

import org.springframework.util.DigestUtils
import java.util.*

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
class SimpleTokenGenerator : TokenGenerator {

    override fun generateToken(slot: String): String {

        return DigestUtils.md5DigestAsHex((slot + UUID.randomUUID()).toByteArray())
    }
}