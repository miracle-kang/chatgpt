package com.miraclekang.chatgpt.common.model;

/**
 * 实现该接口，在实体移除前，会调用该实现，用以清理对象关联逻辑
 */
public interface EntityCleaner {

    /**
     * 清理数据
     */
    void clean();
}
