/* 1. Створити порожній проект в IntelliJ



 2. Створити класи Собака та Кіт з успадкуванням від класу Тварини.



 3. Всі тварини можуть бігти та плисти. Як параметр кожному методу передається довжина перешкоди.
 Результатом виконання дії буде друк у консоль. (Наприклад, dogBobik.run(150); -> 'Бобік пробіг 150 м');



 4. Кожна тварина має обмеження на дії (біг: кіт 200 м., собака 500 м.; плавання: кіт не вміє плавати, собака 10 м.).



 5. * Додати підрахунок створених котів, собак та тварин.*/

import java.util.Scanner;

public class Animal {


    private int runningDistance;

    private static int counterAnimal;
    private int cruisingRange;

    public int getRunningDistance() {
        return runningDistance;
    }

    public int getCruisingRange() {
        return cruisingRange;
    }


    public Animal(int runningDistance, int cruisingRange) {
        this.runningDistance = runningDistance;
        this.cruisingRange = cruisingRange;
        counterAnimal++;
    }

    public void run() {
        System.out.println("Животное пробежало " + runningDistance);

    }

    public void swimming() {
        System.out.println("Животное проплыло " + cruisingRange);
    }

    public static void counterAnimalObject() {
        System.out.printf("Количевство созданых животных - ");
        System.out.println(counterAnimal - Cat.getCounterCat() - Dog.getCounterDog());
    }
}
