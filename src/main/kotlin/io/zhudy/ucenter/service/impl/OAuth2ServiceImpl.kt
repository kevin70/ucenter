package io.zhudy.ucenter.service.impl

import io.zhudy.ucenter.ErrorCode
import io.zhudy.ucenter.ErrorCodeException
import io.zhudy.ucenter.dto.OAuth2Token
import io.zhudy.ucenter.repository.UserRepository
import io.zhudy.ucenter.service.OAuth2Service
import io.zhudy.ucenter.utils.TokenGenerator
import org.springframework.stereotype.Service

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
@Service
class OAuth2ServiceImpl(val tokenGenerator: TokenGenerator, val userRepository: UserRepository) : OAuth2Service {

    override fun authorizeImplicit(): OAuth2Token {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun authorizePassword(username: String, password: String): OAuth2Token {
        val user = (if (username.indexOf('@') > 0) {
            userRepository.findByEmail(username)
        } else {
            userRepository.findByMobile(username)
        }) ?: throw ErrorCodeException(ErrorCode.E3000)

        if (user.password != password) {
            throw ErrorCodeException(ErrorCode.E10003)
        }

        val accessToken = tokenGenerator.generateToken(username)
        val refreshToken = tokenGenerator.generateToken(username)
        val token = OAuth2Token(accessToken, refreshToken)

        return token
    }

}