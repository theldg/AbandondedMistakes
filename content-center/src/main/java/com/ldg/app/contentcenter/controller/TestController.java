package com.ldg.app.contentcenter.controller;

import com.ldg.app.contentcenter.entity.Share;
import com.ldg.app.contentcenter.service.ShareService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ldg
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("test")
public class TestController {

    private final ShareService shareService;

    @GetMapping("select")
    public Share testSelect(Integer id) {
        return shareService.queryById(id);
    }

}
