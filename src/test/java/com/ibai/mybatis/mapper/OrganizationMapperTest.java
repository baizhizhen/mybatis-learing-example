package com.ibai.mybatis.mapper;

import com.ibai.mybatis.entity.Organization;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author baizhizhen
 */
public class OrganizationMapperTest extends BaseTest<OrganizationMapper> {
    @Test
    public void selectList() throws Exception {
        List<Long> ids = new ArrayList<>();
        ids.add(102L);
        ids.add(1L);
        ids.add(65L);
        List<Organization> list = mapper.selectList(ids);
        Assert.assertTrue(!list.isEmpty());
    }

    @Test
    public void selectByParams() throws Exception {
        Organization params = new Organization();
//        params.setOrganId(102L);
        params.setName("数尊");
//        params.setCode("001");
        Organization organization = mapper.selectByParams(params);
        Assert.assertTrue(organization != null);
    }

    @Test
    public void selectToMap() throws Exception {
        Long organId = 102L;
        Map<String, Object> map = mapper.selectToMap(organId);
        Assert.assertTrue(!map.isEmpty());
    }

    @Test
    public void update() throws Exception {
        Long organId = 1L;
        Organization organization = mapper.select(organId);
        organization.setToken(null);
        int update = mapper.update(organization);
        Assert.assertTrue(update == 1);
    }

    @Test
    public void insert() throws Exception {
        Organization organization = new Organization();
        organization.setAuthor("Jason");
        organization.setBirth(new Date());
        organization.setCode("001");
        organization.setEmail("bzz_xd@sina.com");
//        organization.setStatus(1);
        organization.setTelephone("18192506680");
//        organization.setToken("8b6dbc81-77db-46a0-8229-bcdbcc043c37");
//        organization.setOrganId(20L);
        int insert = mapper.insert(organization);
        //测试useGeneratedKeys
        Assert.assertTrue(organization.getOrganId() != null);
        Assert.assertTrue(insert == 1);
    }

    @Test
    public void select() throws Exception {
        Long organId = 102L;
        Organization organization = mapper.select(organId);
        //复用预处理语句
//        mapper.select(2L);
        Assert.assertTrue(organization != null);
//        Assert.assertTrue(organization.getOrganId() != null);

        //验证两个session中，一级缓存是否失效
//        Organization organization2 = organization.clone();
//        organization2.setTelephone("12346579022");
////        Assert.assertTrue(organization == organization2);
//        OrganizationMapper mapper1 = SessionFactory.getInstance().openSession(true).getMapper(OrganizationMapper.class);
//        mapper1.update(organization2);
//        Organization organization1 = this.mapper.select(organId);
//        Assert.assertTrue(organization == organization1);
//        Assert.assertTrue(organization1.getTelephone().equals("12346579022"));
    }

}