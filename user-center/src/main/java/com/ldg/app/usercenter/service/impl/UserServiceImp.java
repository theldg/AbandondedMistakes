package com.ldg.app.usercenter.service.impl;

import com.ldg.app.entity.User;
import com.ldg.app.usercenter.mapper.UserMapper;
import com.ldg.app.usercenter.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
/**推荐使用这种方式来避免idea读取不到bean**/
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImp implements UserService {

    /**
     * @Autowired idea不能智能识别mybatis的注解认为bean为null, 而且spring不推荐直接在field中使用
     **/
    private final UserMapper userMapper;

    @Override
    public User queryById(Integer id) {
        if (id != null) {
            return userMapper.selectById(id);
        } else {
            return null;
        }
    }

    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public User insert(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }
}
