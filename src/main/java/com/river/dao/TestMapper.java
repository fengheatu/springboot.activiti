package com.river.dao;

import com.river.model.Test;

public interface TestMapper {
    int insert(Test record);

    int insertSelective(Test record);
}