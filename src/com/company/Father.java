package com.company;

public class Father extends Family {

    private String job;
    private Car car;

    public Father(int age, String name, String job, Car car) {
        super(age, name);
        this.job = job;
        this.car = car;
    }


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    // перегруженные методы
    public void work(String where, int hours) {
        System.out.println( "______\n" +  getClass().getSimpleName() + " " +  getName() + " works at " + where + ", " + hours + " hours a day" );
    }

    // неперезаписываемый метод (FINAL)
    public final void work(String where) {
        System.out.println( "______\n" +  getClass().getSimpleName() + " " + getName() + " works at " + where);
    }

    @Override
    public String info() {
        return super.info() +
                "\nJob: " + job +
                "\nCar: " + car;
    }
}
