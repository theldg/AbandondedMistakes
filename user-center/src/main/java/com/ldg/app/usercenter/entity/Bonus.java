package com.ldg.app.usercenter.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ldg
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("bonus_event_log")
public class Bonus {
    private String createTime;
    private String description;
    private String event;
    private Integer id;
    private Integer userId;
    private Integer value;
}
