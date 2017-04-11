package io.zhudy.ucenter

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
class OAuth2Exception : RuntimeException {

    val error: String

    constructor(error: String, message: String) : super(message) {
        this.error = error
    }

    fun getErrorDescription(): String? {
        return message
    }
}