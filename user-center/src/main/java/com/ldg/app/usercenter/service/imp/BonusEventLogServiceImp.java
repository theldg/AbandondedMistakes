package com.ldg.app.usercenter.service.imp;

import com.ldg.app.usercenter.entity.BonusEventLog;
import com.ldg.app.usercenter.mapper.BonusMapper;
import com.ldg.app.usercenter.service.BonusEventLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ldg
 */
@Service
public class BonusEventLogServiceImp implements BonusEventLogService {
    @Autowired
    private BonusMapper bonusMapper;

    @Override
    public BonusEventLog queryById(Integer id) {
        return null;
    }

    @Override
    public List<BonusEventLog> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public BonusEventLog insert(BonusEventLog bonusEventLog) {
        return null;
    }

    @Override
    public BonusEventLog update(BonusEventLog bonusEventLog) {
        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }
}
