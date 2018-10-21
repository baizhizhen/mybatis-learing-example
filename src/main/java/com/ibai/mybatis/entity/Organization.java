package com.ibai.mybatis.entity;

import java.util.Date;
import java.util.List;

/**
 * @author baizhizhen
 */
public class Organization implements Cloneable {
    private Long organId;
    private String name;
    private String code;
    private String email;
    private String telephone;
    private Integer status;
    private String author;
    private Date birth;
    private String token;
    private List<Role> roles;

    @Override
    public Organization clone() {
        Organization o = null;
        try {
            o = (Organization) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Organization that = (Organization) o;

        return organId.equals(that.organId);
    }

    @Override
    public int hashCode() {
        return organId.hashCode();
    }

    public Long getOrganId() {

        return organId;
    }

    public void setOrganId(Long organId) {
        this.organId = organId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
