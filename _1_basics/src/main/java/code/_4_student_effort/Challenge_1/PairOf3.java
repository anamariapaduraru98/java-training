package code._4_student_effort.Challenge_1;

public class PairOf3 {

    public int countPairs (Integer [] array, int sum){
    
        int[] array2 = new int[array.length];
        int sumof2 = 0;
        int counter = 0;
        boolean verify = false;
        
        for (int i = 0; i < array.length; i++) {
            if (array2[i] == 1) {
                continue;
            }
            for (int j = 0; j < array.length; j++) {
                if (j == i) continue;
                if (array2[j] == 0) {
                    sumof2 = array[j] + array[i];

                    for (int k = 0; k < array.length; k++) {
                        if (k == i || k == j) continue;
                        if (array2[k] == 0) {
                           if (sumof2 + array[k] == 0) {
                               array2[j] = 1;
                               array2[i] = 1;
                               array2[k] = 1;
                               counter++;
                               verify = true;
                               break;
                           }
                        }
                    }
                }
                if (verify) {
                    verify = false;
                    break;
                }
            }
        }
        return counter;
    }
}
