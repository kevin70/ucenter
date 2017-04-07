package io.zhudy.ucenter.domain

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
data class User(
        /**
         * 主键.
         */
        var id: Long = 0,
        var code: Long = 0,
        var mobile: String? = null,
        var email: String? = null,
        var password: String? = null,
        var nickname: String? = null,
        var avatar: String? = null,
        var enabled: Byte = 0,
        var createdTime: Long = 0,
        var updatedTime: Long = 0
)
