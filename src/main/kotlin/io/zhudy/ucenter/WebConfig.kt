package io.zhudy.ucenter

/**
 * @author Kevin Zou <kevinz@weghst.com>
 */
//@Configuration
//open class WebConfig(val mappingJackson2HttpMessageConverter: MappingJackson2HttpMessageConverter)
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
//}