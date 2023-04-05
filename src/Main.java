public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(199, 10);
        cat.run();
        cat.swimming();

        Dog dog = new Dog(499, 11);
        dog.run();
        dog.swimming();

        Animal animal = new Animal(200, 2);
        Animal animal1 = new Animal(212, 21);
        Animal.counterAnimalObject();
        Cat.counterCatObject();
        Dog.counterDogObject();
    }
}