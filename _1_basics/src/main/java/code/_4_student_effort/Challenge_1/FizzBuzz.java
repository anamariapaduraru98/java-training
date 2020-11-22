package code._4_student_effort.Challenge_1;

public class FizzBuzz {

    public String fizzBuzz(int number) {
    
        String s = "";
        
        if (number % 3 == 0) {
            s = s.concat("Fizz");
        }
        if (number % 5 == 0) {
            s = s.concat("Buzz");
        }
        if (s.isEmpty()) {
            return String.valueOf(number);
        } else {
            return s;
        }
    }

    public String fizzBuzz2(int number) {
    
        String s = "";
        
        if (number % 3 == 0) {
            s = s.concat("Fizz");
        }
        if (number % 5 == 0) {
            s = s.concat("Buzz");
        }
        if (number % 7 == 0) {
            s = s.concat("Rizz");
        }
        if (number % 11 == 0) {
            s = s.concat("Jazz");
        }
        if (s.isEmpty()) {
            return String.valueOf(number);
        } else {
            return s;
        }
    }

}
