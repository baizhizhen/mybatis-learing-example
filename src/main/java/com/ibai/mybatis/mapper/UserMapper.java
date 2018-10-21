package com.ibai.mybatis.mapper;

import com.ibai.mybatis.entity.User;

import java.util.List;

/**
 * @author baizhizhen
 */
public interface UserMapper {
    User select(Long userId);

    List<User> selectAll();
}
