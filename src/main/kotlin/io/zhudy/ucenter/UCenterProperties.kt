package io.zhudy.ucenter

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
@ConfigurationProperties("ucenter")
class UCenterProperties {

    var jdbcUrl: String? = null

}
