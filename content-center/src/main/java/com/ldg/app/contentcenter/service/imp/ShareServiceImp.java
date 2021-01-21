package com.ldg.app.contentcenter.service.imp;

import com.ldg.app.contentcenter.entity.Share;
import com.ldg.app.contentcenter.mapper.ShareMapper;
import com.ldg.app.contentcenter.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ldg
 */
@Service
public class ShareServiceImp implements ShareService {
    @Autowired
    private ShareMapper shareMapper;

    @Override
    public Share queryById(Integer id) {
        return shareMapper.selectById(id);
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
