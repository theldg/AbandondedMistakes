package com.ldg.app.usercenter.controller;

import com.ldg.app.usercenter.entity.User;
import com.ldg.app.usercenter.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 分享(User)表控制层
 *
 * @author makejava
 * @since 2021-01-20 16:50:19
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }

}