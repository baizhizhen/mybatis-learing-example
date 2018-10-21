package com.ibai.mybatis.entity;

/**
 * @author baizhizhen
 */
public class Student {
    private Long id;
    private String name;
    private Integer age;
    private String password;
    private Score score;
    private Gender gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
