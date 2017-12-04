package com.river.service;

import org.activiti.engine.repository.Model;

import java.util.List;

/**
 * @author: he.feng
 * @date: 20:56 2017/11/30
 * @desc:
 **/
public interface ModelerService {

    /**
     * 创建空model
     * @param name
     * @param key
     * @param description
     * @return
     */
    String crateModel(String name,String key,String description);


    /**
     * 获取模型列表
     * @return
     */
    List<Model> queryModelList();
}
