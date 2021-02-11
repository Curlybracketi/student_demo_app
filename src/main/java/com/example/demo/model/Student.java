package com.example.demo.model;

import java.util.Date;

public class Student {

    private String name;
    private int age;
    private String email;
    private String className;
    private Date createTime;
    private String studentId;


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }
    public int getAge() { return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setStudentId(String studentId) { this.studentId = studentId;
    }
}
