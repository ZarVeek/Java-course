package ru.gb;

public class App {
    public static void main(String[] args) {
        Animals[] animal = new Animals[4];
        animal[0] = new Cat("Кот сиамский", "Мурзик", 0, 200);
        animal[1] = new Cat("Кошка абиссинская", "Алиса", 6, 250);
        animal[2] = new Dog("Собака Дог (кобель)", "Наг", 55, 1000);
        animal[3] = new Dog("Собака Пудель (самка) ", "Лора", 25, 500);

        System.out.println("Характеристики созданных животных:" + "\n");
        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i] + "\n");
        }
        System.out.println("---------------------------------------------------------------------------------------");


        //Вывод общих результатов из данных класса;
        System.out.println("Всего котов создано: " + (Cat.getCount()));
        System.out.println("Всего собак создано: " + (Dog.getCount()));
        System.out.println("Всего животных создано: " + Animals.getCount());
        System.out.println();
        System.out.println("Тестирование подопытных на выносливость");
        System.out.println("Бег: ");
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0; i < animal.length; i++) {
            animal[i].run(500);
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Плавание: ");
        System.out.println("---------------------------------------------------------------------------------------");


        for (int i = 0; i < animal.length; i++) {
            animal[i].swim(50);
        }

    }
}