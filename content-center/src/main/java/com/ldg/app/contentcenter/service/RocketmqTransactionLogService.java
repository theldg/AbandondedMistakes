package com.ldg.app.contentcenter.service;

import com.ldg.app.contentcenter.entity.RocketmqTransactionLog;
import java.util.List;

/**
 * RocketMQ事务日志表(RocketmqTransactionLog)表服务接口
 *
 * @author makejava
 * @since 2021-01-20 18:34:57
 */
public interface RocketmqTransactionLogService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RocketmqTransactionLog queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<RocketmqTransactionLog> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param rocketmqTransactionLog 实例对象
     * @return 实例对象
     */
    RocketmqTransactionLog insert(RocketmqTransactionLog rocketmqTransactionLog);

    /**
     * 修改数据
     *
     * @param rocketmqTransactionLog 实例对象
     * @return 实例对象
     */
    RocketmqTransactionLog update(RocketmqTransactionLog rocketmqTransactionLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}