package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;
    protected int toBeRemovedCount;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
        this.toBeRemovedCount = 0;
    }

    abstract public T[] removeDuplicates(int maxNumberOfDuplications);
//    public T[] removeDuplicates(int maxNumberOfDuplications){
//        return array;
//    }

    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);
//    public T[] removeDuplicatesExactly(int exactNumberOfDuplications){
//
//        // Iterate through array
//        for(int i = 0; i < array.length; i++){
//            // Get number of occurrences for each element
//            // If number of occurrences == parameter
//            if(numberOfOccurrences(array[i]) == exactNumberOfDuplications){
//                // If element's index == 0,
//                    // Jump to next element
//                // Else, move element to beginning of array
//                System.out.println(numberOfOccurrences(array[i]));
//                toBeRemovedCount++;
//                moveElementToBeginning(array[i], i);
//            }
//        }
//        // Return copy of array starting after the amount of elements to be removed
//        return Arrays.copyOfRange(array, toBeRemovedCount - 1, array.length - 1);
//    }
//
    public int numberOfOccurrences(T elementToEvaluate){
        int count = 0;
        for(T element: array){
            if(element.equals(elementToEvaluate)){
                count++;
            }
        }
        return count;
    }
//
//    public void moveElementToBeginning(T element, int indexOfElement){
//        if (indexOfElement > 0){
//
//        }
//    }

}
