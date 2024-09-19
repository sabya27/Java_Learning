 class Maxminnuminarray {
     public static void main(String[] args) {
         System.out.println("Welcome to maximum and minimum value in an array");
         int[] numArray = Arrayutility.inputArray();
         int max = max(numArray);
         int min = min(numArray);
         System.out.println("Maximum number in your array is : " + max);
         System.out.println("Minimum number in your array is : " + min);

     }
     public static int min (int[] numArray){
         int min = Integer.MAX_VALUE;
         int i = 0;
         while (i < numArray.length){
             if (min > numArray[i]){
                 min= numArray[i];
             }
             i++;
         }
         return min;


     }
     public static int max(int[] numArray){
         if(numArray.length == 0){
             return Integer.MIN_VALUE;

         }
         int max = numArray [0];
         int i = 0;
         while (i < numArray.length){
             if(max < numArray[i]){
                 max = numArray[i];
             }
             i++;
         }
         return max;
     }
}
