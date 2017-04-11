package io.zhudy.ucenter.service

import io.zhudy.ucenter.dto.OAuth2Token

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
interface OAuth2Service {

    /**
     * 简化模式 (implicit grant type).
     */
    fun authorizeImplicit(): OAuth2Token

    /**
     * 密码模式 (Resource Owner Password Credentials Grant).
     */
    fun authorizePassword(username: String, password: String): OAuth2Token

}