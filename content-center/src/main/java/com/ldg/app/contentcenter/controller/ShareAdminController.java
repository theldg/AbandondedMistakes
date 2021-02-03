package com.ldg.app.contentcenter.controller;

import com.ldg.app.contentcenter.service.ShareService;
import com.ldg.app.dto.ShareAuditDto;
import com.ldg.app.entity.Share;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ldg
 */
@RestController
@RequestMapping("admin/shares")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ShareAdminController {

    private final ShareService shareService;

    @PutMapping("audit/{id}")
    public Share auditById(@PathVariable Integer id, @RequestBody ShareAuditDto auditDto) {
        //TODO 认证,授权

        return shareService.auditById(id, auditDto);
    }
}
