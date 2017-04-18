package io.zhudy.ucenter.web

import io.zhudy.ucenter.dto.OAuth2Token
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Kevin Zou <kevinz@weghst.com>
 */
@RestController
class DefaultResource {

    @GetMapping(path = arrayOf("/"))
    fun index(): OAuth2Token {
        return OAuth2Token(accessToken = "HELLLO", refreshToken = "GGGGGGGGGGGGGGG")
    }
}
