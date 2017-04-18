package io.zhudy.ucenter

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Configuration
import org.springframework.http.codec.ServerCodecConfigurer
import org.springframework.http.codec.json.Jackson2JsonDecoder
import org.springframework.http.codec.json.Jackson2JsonEncoder
import org.springframework.web.reactive.config.CorsRegistry
import org.springframework.web.reactive.config.WebFluxConfigurer

/**
 * @author Kevin Zou <kevinz@weghst.com>
 */
@Configuration
open class WebConfig(val objectMapper: ObjectMapper) : WebFluxConfigurer {

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/*")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowCredentials(false)
                .maxAge(3600)
    }

    override fun configureHttpMessageCodecs(configurer: ServerCodecConfigurer) {
        configurer.defaultCodecs().jackson2Encoder(Jackson2JsonEncoder(objectMapper))
        configurer.defaultCodecs().jackson2Decoder(Jackson2JsonDecoder(objectMapper))

        println(configurer)
    }

//    : WebMvcConfigurerAdapter(), UndertowBuilderCustomizer {
//
//    override fun customize(builder: Undertow.Builder) {
//        builder.setBufferSize(1024 * 16)
//                .setServerOption(Options.BACKLOG, 10000)
//                .setServerOption(UndertowOptions.ALWAYS_SET_KEEP_ALIVE, false)
//                .setServerOption(UndertowOptions.ALWAYS_SET_DATE, true)
//                .setServerOption(UndertowOptions.ENABLE_STATISTICS, false)
//                .setServerOption(UndertowOptions.RECORD_REQUEST_START_TIME, false)
//                .setServerOption(UndertowOptions.ENABLE_HTTP2, true)
//    }
//
//    override fun addCorsMappings(registry: CorsRegistry) {
//        registry.addMapping("/*")
//                .allowedOrigins("*")
//                .allowedMethods("*")
//                .allowCredentials(false)
//                .maxAge(3600)
//    }
//
//    override fun configureMessageConverters(converters: MutableList<HttpMessageConverter<*>>) {
//        converters.add(mappingJackson2HttpMessageConverter)
//    }
}