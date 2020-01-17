public class EnhancedForLoops {


    public static String printStandardFor(String[] arr){
       String finalArray = "";
        for(int x = 0; x < arr.length; x++)
            finalArray += arr[x] + " ";
        return finalArray;


    }

    public static String printStandardFor(int[] arr){
        String finalArray = "";

        for(int x = 0; x < arr.length; x++)
            finalArray += arr[x] + " ";
        return finalArray;
    }

    public static String printStandardFor(double[] arr) {
        String finalArray = "";
        for(int x = 0; x < arr.length; x++)
            finalArray += arr[x] + " ";
        return finalArray;
    }

    public static String printEnhancedFor(String[] arr){
        String finalArray = "";
        for (String x:arr)
            finalArray += x + " ";
        return finalArray;

    }

    public static String printEnhancedFor(int[] arr){
        String finalArray ="";
        for (int x: arr)
            finalArray += x + " ";
        return finalArray;
    }

    public static String printEnhancedFor(double[] arr){
        String finalArray ="";
        for (double x: arr)
            finalArray += x + " ";
        return finalArray;
    }

    public static String printStandardWhile(String[] arr) {
        String finalArray = "";
        int x = 0;
        while (x < arr.length){
            finalArray += arr[x] + " ";
            x++;
        }
        return finalArray;

    }

    public static String printStandardWhile(int[] arr) {
        String finalArray = "";
        int x = 0;
        while (x < arr.length){
            finalArray += arr[x] + " ";
            x++;
        }
        return finalArray;

    }

    public static String printStandardWhile(double[] arr) {
        String finalArray = "";
        int x = 0;
        while (x < arr.length){
            finalArray += arr[x] + " ";
            x++;
        }
        return finalArray;

    }






    public static void main(String[] args){

        int [] numList = {4, 7, 6, 9, 10 ,0};

        String [] stringList = {"Bob", " Renee", "Zidane", "Messi", "Goat"};

        double [] doubleList = {9.0, 4.0, 6.8, 7.8, 4.5, 5.6};


        System.out.println(printEnhancedFor(numList));
        System.out.println(printStandardFor(numList));
        System.out.println(printStandardWhile(numList));

    }
}



