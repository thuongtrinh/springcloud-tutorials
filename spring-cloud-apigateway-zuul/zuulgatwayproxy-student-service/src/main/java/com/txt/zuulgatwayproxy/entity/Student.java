package com.txt.zuulgatwayproxy.entity;

public class Student {

    private String name;
    private String address;
    private String clazz;

    public Student(String name, String address, String cls) {
        super();
        this.name = name;
        this.address = address;
        this.clazz = cls;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getClazz() {
        return clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }
}
