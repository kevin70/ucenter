package io.zhudy.ucenter.web.v1

import io.zhudy.ucenter.domain.User
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
@RequestMapping("/api/v1/users")
@RestController
class UserResource {

    @PostMapping
    fun post(): User {
        val user = User()
        user.id = 55
        user.mobile = "13085162323"

        return user
    }

}