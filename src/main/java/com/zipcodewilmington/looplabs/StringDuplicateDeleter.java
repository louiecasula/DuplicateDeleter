package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        for (String string : array) {
            if (numberOfOccurrences(string) >= maxNumberOfDuplications) {
                toBeRemovedCount++;
            }
        }
        String[] output = new String[array.length - toBeRemovedCount];
        int i = 0;
        for (String string : array) {
            if (numberOfOccurrences(string) < maxNumberOfDuplications) {
                output[i] = string;
                i++;
            }
        }
        toBeRemovedCount = 0;
        return output;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        for (String string : array) {
            if (numberOfOccurrences(string) == exactNumberOfDuplications) {
                toBeRemovedCount++;
            }
        }
        String[] output = new String[array.length - toBeRemovedCount];
        int i = 0;
        for (String string : array) {
            if (numberOfOccurrences(string) != exactNumberOfDuplications) {
                output[i] = string;
                i++;
            }
        }
        toBeRemovedCount = 0;
        return output;
    }
}
