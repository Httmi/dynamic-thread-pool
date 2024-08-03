package com.zongze.middleware.dynamic.thread.pool.sdk.registry;

import com.zongze.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @author Wuzongze
 * @description
 * @create 2024-07-31 11:25
 */
public interface IRegistry {

    void reportThreadPool(List<ThreadPoolConfigEntity> threadPoolEntities);

    void reportThreadPoolConfigParameter(ThreadPoolConfigEntity threadPoolConfigEntity);


}
