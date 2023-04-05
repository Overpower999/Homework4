
// 4. Кожна тварина має обмеження на дії (біг: кіт 200 м., собака 500 м.; плавання: кіт не вміє плавати, собака 10 м.).
public class Cat extends Animal {
    private static int counterCat;

    private final int maxRangeRunCat = 200;
    private final int maxRangeSwimingCat = 0;

    public Cat(int runningDistance, int cruisingRange) {
        super(runningDistance, cruisingRange);
        counterCat++;
    }

    public void run() {
        if (getRunningDistance() <= maxRangeRunCat && getRunningDistance() > 0) {
            System.out.println("Кошка пробежала - " + getRunningDistance());
        } else {
            System.out.println("Кошка может пробежать только 200 метров");
        }
    }

    public void swimming() {
        if (true) {
            System.out.println("Кошка не умеет плавать");
        }
    }

    public static void counterCatObject() {
        System.out.printf("Количевство созданых котов - ");
        System.out.println(counterCat);
    }

    public static int getCounterCat() {
        return counterCat;
    }
}
