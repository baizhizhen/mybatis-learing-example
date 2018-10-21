package com.ibai.mybatis.mapper;

import com.ibai.mybatis.entity.Student;

/**
 * @author baizhizhen
 */
public interface StudentMapper {
    Student select(Long id);
}
