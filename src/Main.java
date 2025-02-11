import Animal.Animal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("blah");
        Animal dog = new Animal();
        dog.age = 15;
        dog.breed = "german";

        Animal cat = dog;
        cat.breed = "turkish";

        System.out.println(dog.breed);
        System.out.println(cat.breed);

        String firstBook = "firstBook";
        String secondBook = firstBook;

        secondBook = "secondBook";

        System.out.println(firstBook);
        System.out.println(secondBook);

        String thirdBook = firstBook.replace("first", "third");

        System.out.println(thirdBook);

        AnimalData bruno = new AnimalData("labra", 2); //

        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);

        // FizzBuzz
//        Scanner scanner = new Scanner(System.in);
//        int fizzBuzzNum = scanner.nextInt();
//
//        boolean isDivisibleBy5 = fizzBuzzNum % 5 == 0;
//        boolean isDivisibleBy3 = fizzBuzzNum % 3 == 0;

        // Java doesn't support switch statements for multiple variables
//        switch (isDivisibleBy3, isDivisibleBy5) {
//            case (true, true):
//                System.out.println("FizzBuzz");
//
//        }

        String numberStr = "123456";
        int number = Integer.parseInt(numberStr);
        System.out.print("printing number: ");
        System.out.println(number);

    }

}
