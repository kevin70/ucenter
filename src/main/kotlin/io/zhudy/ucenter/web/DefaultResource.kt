package io.zhudy.ucenter.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

/**
 * @author Kevin Zou <kevinz@weghst.com>
 */
@RestController
class DefaultResource {

    @GetMapping(path = arrayOf("/"))
    fun index(): Mono<String> {
        return Mono.create<String> {
            "World"
        }
        // return "Hello"
    }

}