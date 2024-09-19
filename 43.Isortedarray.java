 class Isortedarray {
    public static void main(String[] args) {
        System.out.println("Welcome to array sorting checkpost");
        int[] numArray = Arrayutility.inputArray();
        boolean IsInc = IsIncreasing(numArray);
        boolean IsDec = IsDecreasing(numArray);
        if (IsInc || IsDec){
            System.out.println("Your array is sorted");
        } else {
            System.out.println("Your array is not sorted");
        }

    }
    public static boolean IsDecreasing(int [] numArray){
        int i = 1;
        while (i < numArray.length){
            if (numArray[i] < numArray[i-1]){
                return false;
            }
            i++;

        }
        return true;
    }
    public static boolean IsIncreasing(int[] numArray){
        int i = 1;
        while (i < numArray.length){
            if (numArray[i] > numArray[i-1]){
                return false;
            }
            i++;
        }

        return true;
    }
}
