package com.river.dao;

import com.river.model.Leave;

public interface LeaveMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Leave record);

    int insertSelective(Leave record);

    Leave selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Leave record);

    int updateByPrimaryKey(Leave record);
}