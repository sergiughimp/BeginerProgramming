// one line comment

/*
multiple line comment
*/

import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class IntroJava {

    // body of the function

    // function with no return, no parameters
    public static void printGreetings(){
        System.out.println("Hello! Welcome!");
    }

    // function with no return, with parameters
    public static void printGreetingsByName(String first_name, String last_name){
        System.out.println("Hello! " + first_name + " " + last_name);
    }
    // function with return and with parameters. calculates average of 3 numbers
    public static double averageNumbers(double number1, double number2, double number3){
        double average = (number1 + number2 + number3) / 3;
        return average;
    }

    // function that give value of pi
    public static double piValue(){
        // constant = variable that can't be overwrited
        final double pi = 3.14;
        return pi;
    }
    // function the counts how many caracters has the first_name and last_name
    public static int countCharacters(String first_name, String last_name){
        int count = first_name.length() + last_name.length();
        return count;
    }

    public static void main(String[] args) { // main function starts here
        // the code starts from here
        // print "Hello World" on console
        System.out.println("Hello World ");

        System.out.println("*************************************** Variables");
        // declaration
        String first_name;
        String last_name;
        // initialization
        first_name = "Michael";
        last_name = "Jordan";
        int age = 34;

        // ------------------------------ concatenation
        System.out.println("The full name is: " + first_name + " " + last_name + "." + "The age is " + age);

        // declaration and initialization of variables
        String brandCar = "Volvo";
        String modelCar = "XC 60";

        // strongly typed = have to specify the data types of variables

        System.out.println("I bought a car with the brand: " + brandCar);
        System.out.println("The model is: " + modelCar);

        // ------------------------------ overwriting
        modelCar = "XC 60 Facelift";
        System.out.println("The new model is "+ modelCar);


        System.out.println("*************************************** 4 main Data types");
        // String = characters that are separated with " " between them
        String brand = "Dacia";
        String model = "1310";
        // make the 'brand' to upper case
        System.out.println(brand.toUpperCase());
        // length of a string
        System.out.println(brand.length());
        // integer = numbers
        int released_year = 1990;
        // double = decimal numbers
        double price = 23000.32;
        // boolean = true or false
        boolean insurance = true;
        // char = one character (any from keyboard)
        char grade = 'A';

        System.out.println("*************************************** Operators");
        // arithmetics: +, -, *, /, %
        // comparison: ==, <, >, !=
        // logical: &&, ||
        int a = 3; // declaration && initialization
        int b = 5;
        a = b; // overwriting
        System.out.println(a);
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);

        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a != b);

        System.out.println(a > 4 && b > 6);
        System.out.println(a > 4 || b > 6);

        // ----------------------------- flow control: if else
        // = check the condition. if is true, it executes, if is false go to next statement

        System.out.println("*************************************** if");
        // if
        System.out.println("Turn on radio");
        // if the song is good, make it louder
        boolean good_song = true;
        if (good_song == true){
            System.out.println("Make is louder");
            System.out.println("Start to sing");
        }
        System.out.println("Turn of radio");

        System.out.println("*************************************** if else");
        // if - else

        // check if the number is even
        int number = 4;
        if (number % 2 == 0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        // check if the number is positive
        if (number > 0){
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is not positive");
        }

        System.out.println("*************************************** if else if else");
        // if, else, if, else
        // take data from keyboard
//        Scanner sc = new Scanner(System.in);
//        int hour = sc.nextInt();
        System.out.print("Write the hour: ");
        int hour = 19;

        if (hour < 0){
            System.out.println("Hour doesn't exist");
        } else if (hour < 11) {
            System.out.println("Good morning");
        } else if (hour < 18) {
            System.out.println("Hello");
        } else if (hour < 21) {
            System.out.println("Good evening");
        } else if (hour < 24) {
            System.out.println("Good night");
        } else {
            System.out.println("Hour doesn't exist");
        }

        System.out.println("*************************************** Switch");
        // flow control
        // switch - is used when we know how many values are

//        switch ()
//        System.out.println("choose the option");
//        Scanner sc = new Scanner(System.in);
//        int option = sc.nextInt();
//        switch (option){
//            case 0:
//                System.out.println("previous menu");
//                break;
//            case 1:
//                System.out.println("romanian language");
//                break;
//            case 2:
//                System.out.println("english language");
//                break;
//            default:
//                System.out.println("invalid option. choose again");
//        }
        System.out.println("*************************************** Data Structures");
        System.out.println("*************************************** Arrays");
        // declaration and initialization an array. When we know the values
        // an array contain more elements with the same data type
        // access the elements through the index. the index starts with 0
        // has a fixed dimension
        // has 'length' function to find the dimension of an array
        String[] students = {"Michael", "John", "Eva", "Dana", "Ada"};
        int[] numbers = {1, 33, 81, 99, 201};

        System.out.println(students[2]);
        students[2] = "David";
        System.out.println(students[2]);

        System.out.println(students.length);

        System.out.println(students[0] + " " + students[1]);
        System.out.println(students.length + 5);

        // print the last element from array
        System.out.println("last student from array is: " + students[students.length - 1]);

        // declaration and allocation of memory
        int[] grades = new int[5]; // 0, 0, 0, 0, 0
        System.out.println(grades[1]);
        grades[0] = 10;
        grades[1] = 9;
        System.out.println(grades[1]);

        System.out.println("*************************************** Lists");
        // an empty list
        List<String> fruits = new ArrayList<>();
        // has a dynamic dimension
        // add the element in the list
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        // take elements from the list
        System.out.println(fruits.get(0));
        // take the index from the list
        System.out.println(fruits.indexOf("banana"));

        // is the list is empty?
        System.out.println(fruits.isEmpty());

        // take off an element from the list
        fruits.remove("apple");
        // print the elements
        System.out.println(fruits);

        // dimension of the list
        System.out.println(fruits.size());

        if(!fruits.isEmpty()) { // if is Not empty
            System.out.println("There are fruits on the basket");
        } else {
            System.out.println("There are no fruits on the basket");
        }

        // declare a list and initialize with values
        List<String> list = Arrays.asList(new String[]{"foo", "bar"});
        System.out.println(list);

        // declare an immutable list and initialize with values
        List<Integer> numbers2 = Arrays.asList(new Integer[]{3, 98});
        System.out.println(numbers2);

        // declare a dynamic list
        String[] flowers = {"Ageratum", "Allium", "Poppy", "Catmint"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        flowerList.add("Rose");
        System.out.println(flowerList);

        // index of Poppy
        int poppy_index = flowerList.indexOf("Poppy");
        System.out.println(poppy_index);
        // delete what was in that index
        flowerList.remove(poppy_index);
        // delete the value from the index
        flowerList.remove("Catmint");
        System.out.println(flowerList);

        System.out.println("*************************************** Map");
        // map = key and value pairs
        // michael: 10, john: 9

        // declare and initialize a map with values
        // map is not ordered
        Map<String, Integer> months = new HashMap<String, Integer>(){{
           put("Jan", 1);
           put("Feb", 2);
           put("March", 3);
        }};
        System.out.println(months);

        // declare a map
        Map<String, Integer> grades_students = new HashMap<>();
        // add elements to map
        grades_students.put("Michael",10);
        grades_students.put("John", 9);
        grades_students.put("Mary", 8);

        System.out.println(grades_students.get("Mary"));

        // update values on the map
        grades_students.replace("Mary", 10);
        System.out.println(grades_students);

        // size of map
        System.out.println(grades_students.size());

        // delete values from map
        grades_students.remove("Michael");
        System.out.println(grades_students.get("Michael"));


        System.out.println("*************************************** Loops");
        System.out.println("*************************************** while");
        //  block of code that repeats while a condition is true

        // car drives while it has gas
        int liter_gas = 5;
        while(liter_gas > 0){
            // car drives
            System.out.println("Car drives");
            // the gas goes down
            liter_gas = liter_gas - 1;
            // the bulb goes to red
            if (liter_gas <= 3){
                System.out.println("The light bulb is red");
            }
        }
        System.out.println("Stop! The car has no more gas.");

        System.out.println("*************************************** for");
        // block of code the repeats until the condition is true
        // for has a start, a condition, step

        // print 101 dalmatians
        for (int i = 1; i <= 101; i++){
            System.out.println("Dalmatian with the number " + i);
        }
        // go through an array by the index
        int[] numbers3 = {3, 7, 3, 7};
        for (int i = 0; i < numbers3.length; i++){
            System.out.println("Element with the index: " + i + " has the value " + numbers3[i]);
        }

        System.out.println("*************************************** for each");
        // goes through all the elements from array and takes the value
        for(int number3 : numbers3){
            System.out.println("The number is " + number3);
        }

        // array of colors
        String[] colors = {"white", "red", "black"};
        for (String color : colors){
            System.out.println("The color is " + color);
        }

        // sum of numbers from array
        int sum = 0;
        for (int number4 : numbers3){
            sum = sum + number4;
        }
        System.out.println("The sum is " + sum);

        System.out.println("*************************************** functions");
        // block of code that can be reused

        // function than print something
        // no spaces in name of functions

        // calling the function
        printGreetings();
        printGreetingsByName("Michael", "Jordan");
        System.out.println(averageNumbers(3, 4, 5));
        System.out.println(piValue());
        System.out.println(countCharacters("Michael", "Jordan"));
    } // main function ends here
} // the class ends here
