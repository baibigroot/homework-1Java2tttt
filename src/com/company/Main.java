package com.company;

public class Main {

    public static void main(String[] args) {

        Father father = new Father(45, "Hugo", "Creative director",
                Car.PORSCHE);

        Son son1 = new Son(28, "Ray", "Artist", Car.BMW,
                "Tennis and swimming", new Pet("Arabic cat"));

        Son son2 = new Son(19, "Tom", "Actor",
                Car.MERCEDES_BENZ, "volleyball", new Pet("Pitbull"));

        // создаем массив Family и помещаем в него новосозданные объекты
        Family[] family = {father, son1, son2};

        // распечатываем инфо о семье, используя цикл forEach
        for (Family famMember : family) {
            System.out.println(famMember.info());
        }

        // распечатываем инфо о работе
        father.work("Milano");
        son1.work("Illinois State University", 6);
        son2.work("Paramount Pictures", 5);

        // копируем свойства из объекта 2 в объект 3 (из son1 в son2):
        son2.cloningDetails(son1);
        System.out.println("******\nAfter Cloning details: \n" + son2.info());
    }
}
