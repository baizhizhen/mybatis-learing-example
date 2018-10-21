package com.ibai.mybatis.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author baizhizhen
 */
public class SessionFactory {
    private static SqlSessionFactory factory;

    private SessionFactory() {

    }

    public static SqlSessionFactory getInstance() {
        if (factory == null) {
            synchronized (SessionFactory.class) {
                if (factory == null) {
                    String resource = "configuration.xml";
                    try (InputStream inputStream = Resources.getResourceAsStream(resource);) {
                        factory = new SqlSessionFactoryBuilder().build(inputStream);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return factory;
    }
}
