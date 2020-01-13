/*
Yerim-Oumar Dia
AP Computer Science
January 13, 2020
This program calculates the percentage of sme birthdays found through a random generator that runs 1000 times
 */


public class BirthdayParadox {
    public static int[] dates(int num){
        int [] array = new int[num];
        for (int i = 0; i < num; i++){
            int x = (int)(Math.random() * 364);
            array[i] = x;
        }
        return array;
        // This method generates a random number that picks a day between 0 and 364
    }
    public static boolean hasDupes(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int x = array.length-1; x > i; x--){
                if (array[i] == array[x])
                    return true;
            }
        }
        return false;
    }
    // This method checks to see for any duplicate days

    public static void main(String[] args){
        int sameBirthdays = 0;
        for (int i = 0; i < 1000; i++){
            // this runs the program 1000 times
            int [] array = new int[23];
            array = dates(23);
            if(hasDupes(array)){
                sameBirthdays++;
            }
        }
        double finalBirthdays = (double)sameBirthdays/ 10;
        System.out.println("There were the same birthdays" + finalBirthdays + "% of the time.");
    }


}
