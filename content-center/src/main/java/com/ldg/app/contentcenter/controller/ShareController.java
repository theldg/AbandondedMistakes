package com.ldg.app.contentcenter.controller;


import com.ldg.app.contentcenter.service.ShareService;
import com.ldg.app.dto.ShareDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ldg
 */
@RestController
@RequestMapping("shares")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ShareController {
    private final ShareService shareService;

    @GetMapping("{id}")
    public ShareDto findById(@PathVariable Integer id) {
        return shareService.queryDtoById(id);
    }


}
