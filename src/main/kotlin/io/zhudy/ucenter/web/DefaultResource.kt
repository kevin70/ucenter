package io.zhudy.ucenter.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Kevin Zou <kevinz@weghst.com>
 */
@RestController
class DefaultResource {

    @GetMapping(path = arrayOf("/"))
    fun index(): String {
        return "HellGGGo"
    }
}
