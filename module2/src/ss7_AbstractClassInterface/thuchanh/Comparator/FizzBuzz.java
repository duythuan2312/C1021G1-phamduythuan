package ss7_AbstractClassInterface.thuchanh.Comparator;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean b = number % 3 == 0;
        if(b && number % 5 == 0)
            return "FizzBuzz";

        if(b)
            return "Fizz";

        if(number % 5 == 0)
            return "Buzz";

        return number + "";
    }
}
