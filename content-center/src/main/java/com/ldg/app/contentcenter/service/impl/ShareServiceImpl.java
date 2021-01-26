package com.ldg.app.contentcenter.service.impl;

import com.ldg.app.contentcenter.dto.ShareDto;
import com.ldg.app.contentcenter.entity.Share;
import com.ldg.app.contentcenter.entity.User;
import com.ldg.app.contentcenter.mapper.ShareMapper;
import com.ldg.app.contentcenter.service.ShareService;
import com.ldg.app.json.JsonAndEntity;
import com.ldg.app.response.ReslutDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ldg
 */
@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ShareServiceImpl implements ShareService {

    private final ShareMapper shareMapper;

    private final RestTemplate restTemplate;

    private final DiscoveryClient discoveryClient;

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
        //1.Nacos
//
//        String url = discoveryClient.getInstances("user-center")
//                   .stream()
//                   .map(instance -> instance.getUri().toString() + "/users/{id}")
//                   .findFirst().orElseThrow(() -> new IllegalArgumentException("当前没有实例对象"));
//        自定义随机负载均衡
//        List<String> urlList = discoveryClient.getInstances("user-center")
//                .stream()
//                .map(instance -> instance.getUri() + "/users/{id}")
//                .collect(Collectors.toList());
//        int random = ThreadLocalRandom.current().nextInt(urlList.size());
//
//        log.info("Rest请求路径:{}",urlList.get(random));
        //2.Resttemplate
        //Ribben实现负载均衡
        String url = "http://user-center/users/{userId}";
        ResponseEntity<ReslutDto> forEntity = restTemplate.getForEntity(url, ReslutDto.class, userId);
        //消息的装配
        ReslutDto reslutDto = forEntity.getBody();
        //将Map对象转化实体对象User
        User user = JsonAndEntity.toEnity(reslutDto.getData(), User.class);
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
