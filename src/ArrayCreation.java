public class ArrayCreation{


    public static double getAverage(double[] numbers){
        double array_average;
        if (numbers.length < 3)
            return 0.0;
        else{
            array_average = (numbers[0]) + numbers[(numbers.length / 2)] + numbers[(numbers.length-1)];
            array_average = array_average /3;
            array_average = ((array_average * 100) + 0.5) / 100;
            array_average = (int)(array_average);


            return array_average;

        }
    }

    public static String stringArray(String[] friends){
        String finalFriends = "";
        if (friends.length != 5)
            return "";
        else{
            finalFriends += friends[0].length() + " ";
            finalFriends += friends[1].length() + " ";
            finalFriends += friends[2].length() + " ";
            finalFriends += friends[3].length() + " ";
            finalFriends += friends[4].length() + " ";


            return finalFriends;
        }
    }

    public static String countryData(){

        int picker = (int)(Math.random() * 13) ;

        String[] countries = {"China", "Egypt", "France", "South Korea", "Germany",
                "India", "Japan", "Ghana", "Kenya", "Mexico", "United Kingdom", "Burkina Faso", "United States"};

        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi", "Tokyo", "Accra",
                "Nairobi", "Mexico City", "London", "Ouagadougou", "Washington D.C."};

        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi", "Japanese", "Akuapem Twi",
                "Swahili", "Spanish", "English", "French", "English"};

        return "The capital of " + countries[picker] + " is " + capitals[picker] +" and the primary language " +
                "is " + languages[picker] ;


    }


    public static void main(String[] args){

        double[] numbers = {40,40,40};
        System.out.println(getAverage(numbers));

        String[] names = {"Fred", "Barney", "Betty", "Wilma", "Pebbles"};
        System.out.println(stringArray(names));

        System.out.println(countryData());


    }
}
