package io.zhudy.ucenter

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
enum class ErrorCode(code: Int, message: String) {

    // 100 - 999 系统错误码
    E100(100, "系统错误"),

    // 1000 - 9999 公共错误码
    E1000(1000, "缺少必选参数"),
    E1001(1001, "参数类型错误"),
    E1002(1002, "参数格式错误"),

    // FIXME
    E3000(3000, "对象未找到"),

    // 10000 - 10499 用户错误码
    E10000(10000, ""),
    E10001(10001, "邮箱已存在"),
    E10002(10002, "手机已存在")
}