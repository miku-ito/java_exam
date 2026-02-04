package com.example.test_spring_mvc_miku;

public class ReceiveNameForm {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Exam04Form [name=" + name + ", toString()=" + super.toString() + "]";
    }
}
