package com.ibai.mybatis.entity;

import java.util.Date;

/**
 * @author baizhizhen
 */
public class User {
    private Long userId;
    private String account;
    private String employeeId;
    private String password;
    private String nickName;
    private String cellPhone;
    private String email;
    private String qq;
    private String latestTime;
    private String latestIp;
    private int status;
    private Date birth;
    private String author;
    private Organization organization;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

        return userId.equals(user.userId);
    }

    @Override
    public int hashCode() {
        return userId.hashCode();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getLatestTime() {
        return latestTime;
    }

    public void setLatestTime(String latestTime) {
        this.latestTime = latestTime;
    }

    public String getLatestIp() {
        return latestIp;
    }

    public void setLatestIp(String latestIp) {
        this.latestIp = latestIp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
