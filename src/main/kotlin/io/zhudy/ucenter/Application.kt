package io.zhudy.ucenter

import com.fasterxml.jackson.module.kotlin.KotlinModule
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
open class Application {

//    @Bean
//    fun viewResolver(messageSource: MessageSource) = MustacheViewResolver().apply {
//        val prefix = "classpath:/templates/"
//        val suffix = ".mustache"
//        val loader = MustacheResourceTemplateLoader(prefix, suffix)
//        setPrefix(prefix)
//        setSuffix(suffix)
//        setCompiler(Mustache.compiler().escapeHTML(false).withLoader(loader))
//    }

    /**
     *
     */
    @Bean
    open fun kotlinModule(): KotlinModule {
        return KotlinModule()
    }

    /**
     *
     */
    @Bean
    open fun codeGenerator(): CodeGenerator {
        return SnowflakeCodeGenerator(1)
    }

    @Bean
    open fun tokenGenerator(): TokenGenerator {
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
