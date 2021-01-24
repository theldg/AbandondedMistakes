package com.ldg.app.contentcenter.service.imp;

import com.ldg.app.contentcenter.dto.ShareDto;
import com.ldg.app.contentcenter.entity.Share;
import com.ldg.app.contentcenter.entity.User;
import com.ldg.app.contentcenter.mapper.ShareMapper;
import com.ldg.app.contentcenter.service.ShareService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ldg
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ShareServiceImp implements ShareService {

    private final ShareMapper shareMapper;

    private final RestTemplate restTemplate;

    @Override
    public Share queryById(Integer id) {
        return shareMapper.selectById(id);
    }

    @Override
    public ShareDto queryDtoById(Integer id) {
        Share share = shareMapper.selectById(id);
        Integer userId = share.getUserId();
        //怎么通过userId获取用户名称
        //调用用户微服务/users/{userid}
        //1.resttemplate
        ResponseEntity<User> forEntity = restTemplate.getForEntity("http://localhost:8080/users/{id}", User.class, userId);
        //消息的装配
        User user = forEntity.getBody();
        ShareDto shareDto = new ShareDto();
        BeanUtils.copyProperties(share, shareDto);
        shareDto.setWxNickname(user.getWxNickname());
        return shareDto;
    }

    @Override
    public List<Share> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public Share insert(Share share) {
        return null;
    }

    @Override
    public Share update(Share share) {
        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }
}
