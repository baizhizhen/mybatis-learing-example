package com.ibai.mybatis.mapper;

import com.ibai.mybatis.common.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;

import java.lang.reflect.ParameterizedType;

/**
 * @author baizhizhen
 */
public class BaseTest<T> {
    private static Logger logger = Logger.getLogger(BaseTest.class);
    protected SqlSession sqlSession;
    protected T mapper;

    @Before
    public void setUp() {
        sqlSession = SessionFactory.getInstance().openSession(true);
        mapper = sqlSession.getMapper(getMapperClass());
        logger.info("open new session");
    }

    @After
    public void tearDown() {
        sqlSession.close();
        logger.info("close session");
    }

    private Class<T> getMapperClass() {
        ParameterizedType type = (ParameterizedType) this.getClass()
                .getGenericSuperclass();
        return (Class<T>) type.getActualTypeArguments()[0];
    }

}
