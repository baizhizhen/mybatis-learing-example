package com.ibai.mybatis.mapper;

import com.ibai.mybatis.entity.Gender;
import com.ibai.mybatis.entity.Student;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author baizhizhen
 */
public class StudentMapperTest extends BaseTest<StudentMapper> {
    @Test
    public void select() throws Exception {
        Long id = 1L;
        Student select = mapper.select(id);
        Assert.assertTrue(select.getScore() != null);
        Assert.assertTrue(select.getGender() == Gender.MALE);
    }

}