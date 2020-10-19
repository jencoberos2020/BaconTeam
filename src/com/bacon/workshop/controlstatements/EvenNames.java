package com.bacon.workshop.controlstatements;

public class EvenNames {
    public void namePrinter(String[] nameArray) {
        String newName;
        boolean switched;
        do {
            switched = false;
            for (int nameIndex = 0; nameIndex < nameArray.length - 1; nameIndex++){
                if(nameArray[nameIndex].compareTo(nameArray[nameIndex + 1]) > 0){
                    newName = nameArray[nameIndex + 1];
                    nameArray[nameIndex + 1] = nameArray[nameIndex];
                    nameArray[nameIndex] = newName;
                    switched = true;
                }
            }
        } while (switched);

        for (int newNameIndex = 0; newNameIndex < nameArray.length; newNameIndex++) {
            if (newNameIndex % 2 == 0) {
                System.out.println(nameArray[newNameIndex]);
            }
        }
    }
}
