package io.zhudy.ucenter.dto

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
data class OAuth2Token(
        val accessToken: String,
        val refreshToken: String
) {
    val expiresIn: Int = 3600
    val tokenType: String? = null
    val state: String? = null
}
