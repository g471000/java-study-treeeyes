package ch15.serialization;

import java.io.Serializable;

public class UserInfo implements Serializable {
    String name;
    String password;
    int age;

    public UserInfo() {
        this("Unknown", "1234", 1);
    }

    public UserInfo(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String toString() {
        return "(" + name + "," + password + "," + age + ")";
    }
}
