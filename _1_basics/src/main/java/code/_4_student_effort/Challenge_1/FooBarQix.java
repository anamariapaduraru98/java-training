package code._4_student_effort.Challenge_1;

public class FooBarQix {

    public String compute(int number) {
    
        String aux = String.valueOf(number);
        char[] temp = aux.toCharArray();
        String s = "";
        
        if (number % 3 == 0) {
            s = s.concat("Foo");
        }
        if (number % 5 == 0) {
            s = s.concat("Bar");
        }
        if (number % 7 == 0) {
            s = s.concat("Qix");
        }
        for(int i = 0; i < aux.length(); i++) {
            if (temp[i] == '3') {
                s = s.concat("Foo");
            }
            if (temp[i] == '5') {
                s = s.concat("Bar");
            }
            if (temp[i] == '7') {
                s = s.concat("Qix");
            }
        }
        if (s.isEmpty()) {
            return String.valueOf(number);
        } else {
            return s;
        }
    }

    public String compute2(int number) {
    
        String aux = String.valueOf(number);
        char[] temp = aux.toCharArray();
        String s = "";
        
        if (number % 3 == 0) {
            s = s.concat("Foo");
        }
        if (number % 5 == 0) {
            s = s.concat("Bar");
        }
        if (number % 7 == 0) {
            s = s.concat("Qix");
        }
        for(int i = 0; i < aux.length(); i++) {
            if (temp[i] == '3') {
                s = s.concat("Foo");
            }
            if (temp[i] == '5') {
                s = s.concat("Bar");
            }
            if (temp[i] == '7') {
                s = s.concat("Qix");
            }
            if (temp[i] == '0') {
                s = s.concat("*");
            }
        }
        if (s.isEmpty()) {
            return String.valueOf(number);
        } else {
            return s;
        }
    }
}
