package rom.edu;
/* @author   Romanyuk Bohdan
   @project   CourseTask4
   @class  Main
   @version  1.0.0
   @since 19.04.2021 - 20.00
  */

import java.util.Arrays;

class Duplicates {
    public  static  boolean hasDuplicates(int[] array){
        Arrays.sort(array);
        boolean a = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    a = true;
                }
                else {
                    a = false;
                }

            }
        }
        return  a;
    }

    public static void main(String[] args) {
        int[] array = {1,5,3,6,2,9,33,21};
        System.out.println(hasDuplicates(array));  // false
        array[5] = 1;
        System.out.println(hasDuplicates(array)); // true
    }
}