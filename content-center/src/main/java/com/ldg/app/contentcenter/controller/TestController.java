package com.ldg.app.contentcenter.controller;

import com.ldg.app.contentcenter.entity.Share;
import com.ldg.app.contentcenter.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ldg
 */
@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private ShareService shareService;

    @GetMapping ("select")
    private Share testSelect(Integer id) {
        return shareService.queryById(id);
    }

}
