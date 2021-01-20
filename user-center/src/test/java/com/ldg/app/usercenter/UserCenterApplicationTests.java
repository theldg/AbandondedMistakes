package com.ldg.app.usercenter;

import com.ldg.app.usercenter.entity.Bonus;
import com.ldg.app.usercenter.mapper.BonusMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserCenterApplicationTests {
    @Autowired
    private BonusMapper bonusMapper;

    @Test
    public void test() {
        List<Bonus> bonuses = bonusMapper.select();
        System.out.println(bonuses);

    }


}
