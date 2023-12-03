package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        for (Integer integer : array) {
            if (numberOfOccurrences(integer) >= maxNumberOfDuplications) {
                toBeRemovedCount++;
            }
        }
        Integer[] output = new Integer[array.length - toBeRemovedCount];
        int i = 0;
        for (Integer integer : array) {
            if (numberOfOccurrences(integer) < maxNumberOfDuplications) {
                output[i] = integer;
                i++;
            }
        }
        toBeRemovedCount = 0;
        return output;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        for (Integer integer : array) {
            if (numberOfOccurrences(integer) == exactNumberOfDuplications) {
                toBeRemovedCount++;
            }
        }
        Integer[] output = new Integer[array.length - toBeRemovedCount];
        int i = 0;
        for (Integer integer : array) {
            if (numberOfOccurrences(integer) != exactNumberOfDuplications) {
                output[i] = integer;
                i++;
            }
        }
        toBeRemovedCount = 0;
        return output;
    }
}
