package io.zhudy.ucenter.repository

import io.zhudy.ucenter.domain.User


/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
interface UserRepository {

    /**
     *
     */
    fun insert(user: User): Int

    fun update(user: User): Int

    fun deleteById(id: Long): Int

    fun findById(id: Long): User

    fun findByCode(code: Long): User?

    fun findByEmail(email: String): User?

    fun findByMobile(mobile: String): User?
}