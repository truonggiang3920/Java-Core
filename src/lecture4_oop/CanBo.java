package lecture4_oop;

import java.util.Scanner;

public class CanBo {
    private String name, gender, address ;
    private int age;
    public CanBo(String name, String gender, String address, int age)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public CanBo() {
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setAge(int age) { this.age = age; }
    public int getAge() { return age; }

    public void setGender(String gender) { this.gender = gender; }
    public String getGender() { return gender; }

    public void setAddress(String address) { this.address = address; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return "CanBo{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}


