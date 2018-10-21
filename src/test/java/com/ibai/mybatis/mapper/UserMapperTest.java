package com.ibai.mybatis.mapper;

import com.ibai.mybatis.entity.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author baizhizhen
 */

public class UserMapperTest extends BaseTest<UserMapper> {
    @Test
    public void selectAll() throws Exception {
        List<User> users = mapper.selectAll();
        Assert.assertTrue(!users.isEmpty());
    }

    @Test
    public void testSelect() {
        Long userId = 176L;
        User user = mapper.select(userId);
        String account = user.getAccount();
        Assert.assertTrue(account != null);
        Assert.assertTrue(user != null);
        Assert.assertTrue(user.getEmployeeId() != null);
//        Assert.assertTrue(user.getOrganization() != null);

        //测试一级缓存
//        User user1 = mapper.select(userId);
//        Assert.assertTrue(user1 != null);
    }

    @Test
    public void testCache() {
        Long userId = 176L;
        User user = mapper.select(userId);
        Assert.assertTrue(user != null);
    }
}
