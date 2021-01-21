package com.ldg.app.usercenter.service.imp;

import com.ldg.app.usercenter.entity.User;
import com.ldg.app.usercenter.mapper.UserMapper;
import com.ldg.app.usercenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

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
