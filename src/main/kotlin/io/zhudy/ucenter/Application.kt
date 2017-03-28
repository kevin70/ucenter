package io.zhudy.ucenter

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration
import org.springframework.boot.autoconfigure.websocket.WebSocketAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.reactive.config.EnableWebFlux

/**
 * @author Kevin Zou <kevinz@weghst.com>
 */
@ComponentScan(basePackages = arrayOf("io.zhudy.ucenter"))
@SpringBootApplication
@EnableAutoConfiguration(exclude = arrayOf(
        WebSocketAutoConfiguration::class,
        MultipartAutoConfiguration::class,
        DataSourceAutoConfiguration::class,
        JdbcTemplateAutoConfiguration::class,
        ValidationAutoConfiguration::class
))
@EnableWebFlux
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

}

/**
 *
 */
fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
