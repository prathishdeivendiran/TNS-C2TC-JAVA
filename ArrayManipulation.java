package com.tnsifDAY9;

import java.util.Scanner;

public class ArrayManipulation {
    @SuppressWarnings("resource")
	public String getDuplicateElement() {
        try {
            Scanner scanner = new Scanner(System.in);

            // Get the size of the array
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            if (size <= 0) {
                return "Array size should be positive";
            }

            // Create the array
            int[] array = new int[size];

            // Get the elements of the array
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            // Get the index of the array
            System.out.print("Enter the index of the array: ");
            int index = scanner.nextInt();
            if (index < 0 || index >= size) {
      
                return extracted();
            }

            // Get the element at the specified index
            int duplicateElement = array[index];

            scanner.close();

            return "The array elements are " + getArrayAsString(array) + " " + duplicateElement;
        } catch (NegativeArraySizeException e) {
            return "Array size should be positive";
        } catch (ArrayIndexOutOfBoundsException e) {
            return extracted();
        } catch (java.util.InputMismatchException e) {
            return "Input was not in the correct format";
        }
    }

	private String extracted() {
		return "Array index is out of range";
	}

    private String getArrayAsString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
    	ArrayManipulation ui = new ArrayManipulation();
        System.out.println(ui.getDuplicateElement());
       
    }

}
 
