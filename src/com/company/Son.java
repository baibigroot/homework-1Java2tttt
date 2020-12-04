package com.company;

public final class Son extends Father {

    private String sport;
    private Pet pet;


    // конструктор содержащий все поля
    public Son(int age, String name, String job, Car car, String sport, Pet pet) {
        super(age, name, job, car);
        this.sport = sport;
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    // перезаписанный метод от родительского класса Father
    @Override
    public void work(String where, int hours) {
        super.work(where, hours);
    }

    @Override
    public String info() {
        return super.info() +
                "\nSport: " + sport +
                "\nPet: " + getPet().getBreed();
    }

    // метод будет клонировать свойства из себеподобного объекта
    public <T extends Father> void cloningDetails(T object) {
        setAge(object.getAge());
        setCar(object.getCar());
    }

}



