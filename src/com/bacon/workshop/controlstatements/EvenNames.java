package com.bacon.workshop.controlstatements;

public class EvenNames {
    public void namePrinter(String[] nameArray) {=
        for (int nameIndex = 0; nameIndex < nameArray.length - 1; nameIndex++) {
            int indexMinimum = nameIndex;
            for (int newIndex = nameIndex + 1; newIndex < nameArray.length; newIndex++) {
                if (nameArray[newIndex].compareTo(nameArray[indexMinimum]) < 0) {
                    indexMinimum = newIndex;
                }
            }
            if (indexMinimum != nameIndex) {
                String newString = nameArray[nameIndex];
                nameArray[nameIndex] = nameArray[indexMinimum];
                nameArray[indexMinimum] = newString;
            }
        }

        for (int newNameIndex = 0; newNameIndex < nameArray.length; newNameIndex++) {
            if (newNameIndex % 2 == 0) {
                System.out.println(nameArray[newNameIndex]);
            }
        }
    }
}
