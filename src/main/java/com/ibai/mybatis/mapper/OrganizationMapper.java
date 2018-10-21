package com.ibai.mybatis.mapper;

import com.ibai.mybatis.entity.Organization;

import java.util.List;
import java.util.Map;

/**
 * @author baizhizhen
 */
public interface OrganizationMapper {
    Organization select(Long organId);

    int insert(Organization organization);

    int update(Organization organization);

    Map<String,Object> selectToMap(Long organId);

    Organization selectByParams(Organization params);

    List<Organization> selectList(List<Long> ids);
}
