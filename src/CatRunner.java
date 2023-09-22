public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Penelope", 12, 15.75);
        cat1.introduce();
        cat1.printCatInfo();


        Cat cat2 = new Cat("James", 7, 1.5);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
