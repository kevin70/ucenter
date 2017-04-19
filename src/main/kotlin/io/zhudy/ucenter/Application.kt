package io.zhudy.ucenter

import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.zaxxer.hikari.HikariDataSource
import io.zhudy.ucenter.utils.CodeGenerator
import io.zhudy.ucenter.utils.SimpleTokenGenerator
import io.zhudy.ucenter.utils.SnowflakeCodeGenerator
import io.zhudy.ucenter.utils.TokenGenerator
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration
import org.springframework.boot.autoconfigure.websocket.WebSocketAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import javax.sql.DataSource

/**
 * @author Kevin Zou <kevinz@weghst.com>
 */
@ComponentScan(basePackages = arrayOf("io.zhudy.ucenter"))
@SpringBootApplication
@EnableAutoConfiguration(exclude = arrayOf(
        WebSocketAutoConfiguration::class,
        DataSourceAutoConfiguration::class,
        JdbcTemplateAutoConfiguration::class,
        ValidationAutoConfiguration::class
))
class Application {

    /**
     *
     */
    @Bean
    fun kotlinModule(): KotlinModule {
        return KotlinModule()
    }

    @Bean
    fun dataSource(): DataSource {
        return HikariDataSource()
    }

    @Bean
    fun namedParameterJdbcTemplate(dataSource: DataSource): NamedParameterJdbcTemplate {
        return NamedParameterJdbcTemplate(dataSource)
    }

    /**
     *
     */
    @Bean
    fun codeGenerator(): CodeGenerator {
        return SnowflakeCodeGenerator(1)
    }

    @Bean
    fun tokenGenerator(): TokenGenerator {
        return SimpleTokenGenerator()
    }
}

/**
 *
 */
fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
//    ByteBuddyAgent.install()
//    println(ByteBuddyAgent.getInstrumentation())
}
