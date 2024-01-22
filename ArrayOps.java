public class ArrayOps {
    public static void main(String[] args) {
      int [] array = {0,1,3};
      System.out.println(findMissingInt(array));
    }
    
   
    public static int findMissingInt (int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length+1; i++){
            sum = sum + i;
        }
        int sumArray = 0;
        for (int j = 0; j < array.length; j++ ) {
            sumArray = sumArray + array[j];
        }
        return sum-sumArray;
    }
       

    
        
    
    // TODO: nice solution, but will not work correct for array [5,5,5] for example
    public static int secondMaxValue(int [] array) {
        int max = -999;
        for (int i = 0; i< array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        int secondMaxValue = -999;
        for (int j = 0; j < array.length; j++) {
            if ((array[j] != max) && (array[j] > secondMaxValue)) {
                secondMaxValue = array[j];
            }
        }
        return secondMaxValue;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for (int i = 0; i < array1.length; i++) { 
            if (isInArray(array2, array1[i]) == false){
                return false;
            }
        }
        for (int i = 0; i < array2.length; i++) { 
            if (isInArray(array1, array2[i]) == false){
                return false;
            }
        }

        // Write your code here:
        return true;
    }

    public static boolean isInArray(int [] array, int number){
        boolean isInArray = false;
        for (int j = 0; j < array.length; j++) {
           if (number== array[j]) {
                isInArray = true;
           }
        }
        return isInArray;
    }

    public static boolean isSorted(int [] array) {
        boolean up = true;
        
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] > array[i+1]) {
                up = false;
            }
            // TODO: keep your code clean, remove the empty line
        }
        if(up == true){
            return true;
        }
        boolean down = true;
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] < array[i+1]) {
                down = false;
            }

        }
        if(down == true){
            return true;
        }
        return false;
    }

}
