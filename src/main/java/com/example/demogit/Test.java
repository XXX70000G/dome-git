package com.example.demogit;

public class Test {

    private String name;

    private String age;

    private String sex;

    private String haha;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHaha() {
        return haha;
    }

    public void setHaha(String haha) {
        this.haha = haha;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", haha='" + haha + '\'' +
                '}';
    }
}
