package code._4_student_effort.Challenge_1;

public class PairOf2 {

    public int countPairs (Integer [] array){
    
        int[] array2 = new int[array.length];
        int counter = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array2[i] == 1) {
                continue;
            }
            for (int j = 0; j < array.length; j++) {
                if (j == i) continue;
                if (array2[j] == 0) {
                    if ((array[i] + array[j]) == 0) {
                        array2[j] = 1;
                        array2[i] = 1;
                        counter++;
                        break;
                    }
                }
            }
        }
        return counter;
    }
}
