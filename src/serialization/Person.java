package serialization;

import java.io.Serializable;



public class Person implements Serializable {
    static final long serialVersionUID = 36L;
    private String name;
    private Integer age;
    private Boolean sex;
    private transient Integer xxx=111; // 该成员变量不进行序列化

    public Person(String name, Integer age, Boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Integer getXxx() {
        return xxx;
    }

    public void setXxx(Integer xxx) {
        this.xxx = xxx;
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

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", xxx=" + xxx +
                '}';
    }
}
