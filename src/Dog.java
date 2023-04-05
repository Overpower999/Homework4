public class Dog extends Animal {

    private static int counterDog;
    private final int maxRangeRunDog = 500;
    private final int maxRangeSwimingDog = 10;

    public Dog(int runningDistance, int cruisingRange) {
        super(runningDistance, cruisingRange);
        counterDog++;
    }

    public void run() {
        if (getRunningDistance() <= maxRangeRunDog && getRunningDistance() > 0) {
            System.out.println("Собака пробежала - " + getRunningDistance());
        } else {
            System.out.println("собака может пробежать всего 500 метров");
        }
    }

    public void swimming() {
        if (getCruisingRange() <= maxRangeSwimingDog && getCruisingRange() > 0) {
            System.out.println("Собака проплыла - " + getCruisingRange());
        } else {
            System.out.println("Собака может проплыть всего 10 метров");
        }
    }

    public static int getCounterDog() {
        return counterDog;
    }

    public static void counterDogObject() {
        System.out.printf("Количевство созданых собак - ");
        System.out.println(counterDog);
    }
}
