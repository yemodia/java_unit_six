public class TraverseArrays {
    public static int countEven(int [] nums){
        int evenNum = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0)
                evenNum++ ;
        }
        return evenNum;
    }

    public static int [] buildArray(int desiredLength){
        int []finalArray = new int[desiredLength];
        for (int i = 0; i < desiredLength; i++){
            finalArray[i] = i;

        }
        return finalArray;
    }


    public static boolean sum28(int[] numbers){
        int xfinal = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == 2)
                xfinal += 2;
        }
        if (xfinal == 8)
            return true;
        else
            return false;

    }

    public static int[] zeroMax(int[] original){
         int [] finalArray = new int[original.length];
        for (int i = 0; i < original.length; i++){
            if(original[i] == 0){
                int max = original[i+1];
                for (int j = i + 1; j < original.length; j++){
                    if (original[j] % 2 == 1){
                        if (original[j] > max)
                        max = original[j];

                    }
                }
                finalArray[i] = max;
            }
            else
                finalArray[i] = original[i];

        }
        return finalArray;
    }





    public static void main(String[] args){
        int [] nums = {0,9,6,5,4,6,8,1};





        System.out.println(countEven(nums));

    }
}
