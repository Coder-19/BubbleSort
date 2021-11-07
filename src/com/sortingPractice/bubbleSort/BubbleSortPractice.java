package com.sortingPractice.bubbleSort;

// the code below is used to create a class for doing bubble sort for sorting the elements entered by the user using
// bubble sort
public class BubbleSortPractice {

    // the code below is used to create a method to swap the elements in an array at index i and index j
    public void sort(int[] array,int i,int j){
        // the code below is used to check if the index i is equal to the index j then return else do the swapping
        if(i == j){
            return;
        } else {
            // the code below is used to create a variable to store the value at index i
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
