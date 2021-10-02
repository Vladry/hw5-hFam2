package hw5.Family;

public class Main {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        final int divider = 20_000;
        final int arrSize = 100_000;
        Human[] people = new Human[arrSize];
        for (long i = 0; i < arrSize; i++) {
            Human mom1 = new Human("Taisiya"+i, "Guseva", 1960);
            if ((i % divider) * divider == 0) {
                System.out.println("another " + " of Humans has been created!");
            }
        }


    }
}



