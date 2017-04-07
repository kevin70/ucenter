package io.zhudy.ucenter.utils

import com.relops.snowflake.Snowflake

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
class SnowflakeCodeGenerator(val node: Int) : CodeGenerator {

    val snowflake = Snowflake(node)

    override fun generateCode(): Long {
        return snowflake.next()
    }
}