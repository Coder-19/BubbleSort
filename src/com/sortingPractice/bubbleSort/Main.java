package com.sortingPractice.bubbleSort;

// the code below is used to create the main class for the project
public class Main {

    public static void main(String[] args) {
        // the code below is used to create an instance of the scanner class to get the input from the user
//        Scanner sc = new Scanner(System.in);

        // the code below is used to create an array to get the elements from the user
//        int[] arr= new int[50];


        int[] arr = {20, -1,5,-20,44};

//        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

//        // the code below is used to get the number of elements in the array from the user
//        System.out.println("Enter the number of elements in the array: ");
//        // the code below is used to get the number of elements in the array
//        int num = sc.nextInt();
//
//        //  the code below is used to get the array elements as input from the user
//        System.out.println("Enter the elements of the array: ");
//        for(int index = 0; index < num; index++){
//            // the code below is used to get the elements of the array from the user
//            arr[index] = sc.nextInt();
//        }
//
//        // the code below is used to print the elements of the array entered by the user
//        System.out.println("The elements in the array are: ");
//        for(int element: arr){
//            // the code below is used to print the elements of the array
//            System.out.println(element);
//        }

        // the code below is used to call the sort class method using the BubbleSortPractice class
        BubbleSortPractice.sort(arr);
    }
}
