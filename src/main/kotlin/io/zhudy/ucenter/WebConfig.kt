package io.zhudy.ucenter

import io.undertow.Undertow
import io.undertow.UndertowOptions
import org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import org.xnio.Options

/**
 * @author Kevin Zou <kevinz@weghst.com>
 */
@Configuration
open class WebConfig(val mappingJackson2HttpMessageConverter: MappingJackson2HttpMessageConverter)
    : WebMvcConfigurerAdapter(), UndertowBuilderCustomizer {

    override fun customize(builder: Undertow.Builder) {
        builder.setBufferSize(1024 * 16)
                .setServerOption(Options.BACKLOG, 10000)
                .setServerOption(UndertowOptions.ALWAYS_SET_KEEP_ALIVE, false)
                .setServerOption(UndertowOptions.ALWAYS_SET_DATE, true)
                .setServerOption(UndertowOptions.ENABLE_STATISTICS, false)
                .setServerOption(UndertowOptions.RECORD_REQUEST_START_TIME, false)
                .setServerOption(UndertowOptions.ENABLE_HTTP2, true)
    }

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/*")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowCredentials(false)
                .maxAge(3600)
    }

    override fun configureMessageConverters(converters: MutableList<HttpMessageConverter<*>>) {
        converters.add(mappingJackson2HttpMessageConverter)
    }
}