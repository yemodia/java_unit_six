public class ArrayAlgorithms {
    public static String printArray(int[] nums){
        String finalArray = "";
        for (int i:nums){
            finalArray+= i + " ";
        }
        return finalArray;
    }

    public static boolean checkForAllNegatives(int[] list){
        for (int i:list){
            if(i>=0)
                return false;
        }
        return true;
    }
    public static boolean hasDupes(int[] list){
        for (int i=0; i< list.length; i++){
            for (int x = list.length-1; x > i; x--)
                if (list[i] == list[x])
                    return true;
        }
        return false;
    }
    public static int countEvens(int[] arr){
        int count = 0;
        for(int x: arr){
            if(x % 2 == 0)
                count++;
        }
        return count;
    }

    public static int[] leftShift(int[] nums, int shift){
        int [] finalString = new int[nums.length + shift];
        for(int x = 0; x < nums.length; x++){
            finalString[x] = nums[x];
        }
        for (int i = nums.length; i < nums.length + shift; i++){
            finalString[i] = 0;
        }
        return finalString;
    }

    public static String reverseArray(int [] list){
        int end;
        String finalString = "";
        for( int x = 0; x < list.length / 2; x++){
            end = list[x];
            list[x] = list[list.length-1-x];
            list[list.length-1-x] = end;
        }
        for(int i = 0; i < list.length; i++){
            finalString += list[i] + " ";
        }
        return finalString;
    }


    public static void main(String[] args){
        int[] list1 = {1, 0, 1, 1, 0, 1, 0, 1};
        leftShift(list1, 6);

    }
}





