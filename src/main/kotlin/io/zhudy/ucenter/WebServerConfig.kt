package io.zhudy.ucenter

//import io.undertow.Undertow
//import io.undertow.UndertowOptions
//import org.springframework.boot.web.embedded.undertow.UndertowBuilderCustomizer
import org.springframework.context.annotation.Configuration
//import org.xnio.Options

/**
 * @author Kevin Zou <kevinz@weghst.com>
 */
@Configuration
open class WebServerConfig {

//    override fun customize(builder: Undertow.Builder?) {
//        builder!!.setBufferSize(1024 * 16)
//                .setServerOption(Options.BACKLOG, 10000)
//                .setServerOption(UndertowOptions.ALWAYS_SET_KEEP_ALIVE, false)
//                .setServerOption(UndertowOptions.ALWAYS_SET_DATE, true)
//                .setServerOption(UndertowOptions.ENABLE_STATISTICS, false)
//                .setServerOption(UndertowOptions.RECORD_REQUEST_START_TIME, false)
//                .setServerOption(UndertowOptions.ENABLE_HTTP2, true)
//    }
}