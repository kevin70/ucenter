package io.zhudy.ucenter.repository.impl

import io.zhudy.ucenter.domain.User
import io.zhudy.ucenter.repository.UserRepository
import org.springframework.jdbc.core.RowMapper
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.jdbc.support.GeneratedKeyHolder
import org.springframework.stereotype.Repository
import java.sql.ResultSet

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
@Repository
class UserRepositoryImpl(val template: NamedParameterJdbcTemplate) : UserRepository {

    val insertSql = """INSERT INTO t_user(mobile, email, password, nickname, avatar, created_time)
VALUES(:mobile, :email, :password, :nickname, :avatar, unix_timestamp())
"""
    val updateSql = """UPDATE t_user
SET mobile=:mobile, email=:email, password=:password, nickname=:nickname, avatar=:avatar, updated_time=unix_timestamp()
WHERE id=:id
"""
    val deleteByIdSql = "DELETE FROM t_user WHERE id=:id"
    val findByIdSql = "SELECT * FROM t_user WHERE id=:id"
    val findByCodeSql = "SELECT * FROM t_user WHERE errorCode=:errorCode"
    val findByEmailSql = "SELECT * FROM t_user WHERE email=:email"
    val findByMobileSql = "SELECT * FROM t_user WHERE mobile=:mobile"

    val fullMapper = RowMapper<User> { rs: ResultSet, i: Int ->
        User(
                id = rs.getLong("id"),
                code = rs.getLong("errorCode"),
                mobile = rs.getString("mobile"),
                email = rs.getString("email"),
                password = rs.getString("password"),
                nickname = rs.getString("nickname"),
                avatar = rs.getString("avatar"),
                enabled = rs.getByte("enabled"),
                createdTime = rs.getLong("created_time"),
                updatedTime = rs.getLong("updated_time")
        )
    }

    override fun insert(user: User): Int {
        val keyHolder = GeneratedKeyHolder()
        val r = template.update(insertSql, BeanPropertySqlParameterSource(user), keyHolder)
        user.id = keyHolder.key.toLong()
        return r
    }

    override fun update(user: User): Int {
        return template.update(updateSql, BeanPropertySqlParameterSource(user))
    }

    override fun deleteById(id: Long): Int {
        return template.update(deleteByIdSql, MapSqlParameterSource("id", id))
    }

    override fun findById(id: Long): User {
        return template.queryForObject(findByIdSql, MapSqlParameterSource("id", id), fullMapper)
    }

    override fun findByCode(code: Long): User {
        return template.queryForObject(findByCodeSql, MapSqlParameterSource("errorCode", code), fullMapper)
    }

    override fun findByEmail(email: String): User {
        return template.queryForObject(findByEmailSql, MapSqlParameterSource("email", email), fullMapper)
    }

    override fun findByMobile(mobile: String): User {
        return template.queryForObject(findByMobileSql, MapSqlParameterSource("mobile", mobile), fullMapper)
    }
}