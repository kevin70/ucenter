package io.zhudy.ucenter

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan

/**
 * @author Kevin Zou <kevinz@weghst.com>
 */
@ComponentScan(basePackages = arrayOf("io.zhudy.ucenter"))
@SpringBootApplication
//@EnableAutoConfiguration(exclude = arrayOf(
//    WebSocketAutoConfiguration::class.java,
//    MultipartAutoConfiguration::class.java,
//    DataSourceAutoConfiguration::class.java,
//    JdbcTemplateAutoConfiguration::class.java,
//    ValidationAutoConfiguration::class.java)
//)}
open class Application {

    @Bean
    fun embeddedServletContainerFactory() {
//        UndertowEmbeddedServletContainerFactory factory = new UndertowEmbeddedServletContainerFactory()
//        factory.addBuilderCustomizers(b -> b.setBufferSize(1024 * 16)
//        .setServerOption(Options.BACKLOG, 10000)
//                .setServerOption(UndertowOptions.ALWAYS_SET_KEEP_ALIVE, false)
//                .setServerOption(UndertowOptions.ALWAYS_SET_DATE, true)
//                .setServerOption(UndertowOptions.ENABLE_STATISTICS, false)
//                .setServerOption(UndertowOptions.RECORD_REQUEST_START_TIME, false)
//                .setServerOption(UndertowOptions.ENABLE_HTTP2, true));
//        return factory;
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
