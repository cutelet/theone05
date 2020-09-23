package com.itheima.test02;

public class test {
    public test() {
    }

    public test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        test test = (test) o;

        if (age != test.age) return false;
        return name != null ? name.equals(test.name) : test.name == null;
    }




    String name;
    int age;
}
