package com.ldg.app.usercenter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ldg.app.usercenter.entity.Bonus;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @className: BonusMapper
 * @description:
 * @autor: ldg
 * @date: 2021/1/4-21:48
 **/
public interface BonusMapper extends BaseMapper<Bonus> {

    @Select(value = "select * from bonus_event_log a,user_center.user b where a.user_id=b.id")

    public List<Bonus> select();

}
