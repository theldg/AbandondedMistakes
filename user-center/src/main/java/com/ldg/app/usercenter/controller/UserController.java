package com.ldg.app.usercenter.controller;


import com.ldg.app.entity.User;
import com.ldg.app.usercenter.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.NullArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 分享(User)表控制层
 *
 * @author makejava
 * @since 2021-01-20 16:50:19
 */
@Slf4j
@RestController
@RequestMapping("users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
    /**
     * 服务对象
     */
    private final UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public User selectOne(@PathVariable Integer id) {
        log.info("我被请求了");
        User user = this.userService.queryById(id);
        if (user == null) {
            throw new NullArgumentException("user");
        } else {
            return user;
        }
    }

}