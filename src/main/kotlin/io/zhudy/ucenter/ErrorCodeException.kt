package io.zhudy.ucenter

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
class ErrorCodeException : RuntimeException {

    val errorCode: ErrorCode

    /**
     *
     */
    constructor(ec: ErrorCode) : super(ec.toString()) {
        this.errorCode = ec
    }

    /**
     *
     */
    constructor(ec: ErrorCode, e: Exception) : super(ec.toString(), e) {
        this.errorCode = ec
    }
}