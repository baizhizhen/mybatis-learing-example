package com.ibai.mybatis.entity;

import com.ibai.mybatis.typehandler.JsonType;

/**
 * @author baizhizhen
 */
public class Score implements JsonType {
    private Long limit;
    private Double rate;

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
