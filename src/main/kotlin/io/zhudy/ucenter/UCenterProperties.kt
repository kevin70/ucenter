package io.zhudy.ucenter

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
@ConfigurationProperties("u-center")
class UCenterProperties {

    var jdbcUrl: String? = null

}
