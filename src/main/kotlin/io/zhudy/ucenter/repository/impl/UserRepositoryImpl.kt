package io.zhudy.ucenter.repository.impl

import io.zhudy.ucenter.domain.User
import io.zhudy.ucenter.repository.UserRepository
import org.springframework.stereotype.Repository

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
@Repository
class UserRepositoryImpl : UserRepository {

    override fun insert(user: User): Int {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(user: User): Int {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteById(id: Long): Int {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findById(id: Long): User {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}