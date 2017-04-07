package io.zhudy.ucenter.service.impl

import io.zhudy.ucenter.domain.User
import io.zhudy.ucenter.repository.UserRepository
import io.zhudy.ucenter.service.UserService
import io.zhudy.ucenter.utils.CodeGenerator
import org.springframework.stereotype.Service

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
@Service
class UserServiceImpl(val codeGenerator: CodeGenerator, val userRepository: UserRepository) : UserService {

    override fun register(user: User) {
        // 邮箱注册

        // 手机注册

        user.code = codeGenerator.generateCode()
        if (userRepository.insert(user) != 1) {
            // FIXME 错误处理
        }
    }

}
