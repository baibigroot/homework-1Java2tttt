package com.company;

public class Family {

    // поля
    private String name;
    private int age;

    // конструктор
    public Family(int age, String name) {
        this.name = name;
        this.age = age;
    }

    // геттер - нужны для получения информации
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info(){
        return "______" +
                "\nInfo about " + getClass().getSimpleName() + ":" +
                "\nName: " + name +
                "\nAge: " + age;
    }


   /**  сеттеры - нужны для ввода информации
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    } **/
}
