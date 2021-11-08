package com.sortingPractice.bubbleSort;

// the code below is used to create a class for doing bubble sort for sorting the elements entered by the user using
// bubble sort
public class BubbleSortPractice {

    // the code below is used to create a class / static function to sort the array using bubble sort and then print
    // the array
    public static void sort(int[] array){
        // the code below is used to traverse the array from the last position to the first position
        for(int lastSortedIndex = 0; lastSortedIndex > 0; lastSortedIndex--){
            // the code below is used to traverse the from the first position to the element at
            // the last sorted position
            for(int index = 0; index < lastSortedIndex; index++){
                // the code below is used to check that if the element at index is
                // greater then the element at index + 1 position then swap the elements
                if(array[index] > array[index + 1]){
                    // the code below is to use the swap  method to swap the elements at index and index + 1 position
                    swap(array, index, index + 1);
                }
            }
        }

        System.out.println("The sorted elements of the array are: ");
        // the code below is used to print the elements of the array after the elements are sorted
        for(int element: array){
            // the code below is used to print the elements of the array
            System.out.println(element);
        }
    }

    // the code below is used to create a method that takes the array and index i and index j and then swap the
    // element at index i with the element at index j
    public static void swap(int[] arr,int i,int j){
        // the code below is used to check that if the value of index i is equal to the value of index j then
        // return since both the index are same
        if(i == j){
            return;
        }

        // the code below is used to create a temporary variable to get the value of the element at index i
        int temp = arr[i];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
