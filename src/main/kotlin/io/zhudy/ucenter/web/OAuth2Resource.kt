package io.zhudy.ucenter.web

import org.springframework.util.MultiValueMap
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
@RequestMapping("/api/oauth2")
@RestController
class OAuth2Resource {

    @PostMapping("/token")
    fun token(params: MultiValueMap<String, String>) {
        val grantType = params.getFirst("grant_type")
        if (grantType == "password") {
            val username = params.getFirst("username")
            val password = params.getFirst("password")
        }
    }

}