package com.javapractice;

//2.Get a matrix data(3*4) from user , print transpose of it
import java.util.Scanner;

public class MatrixTranspose {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = new int[3][4];

		// Get the matrix input data from the user for 3*4 Matrix
		System.out.println("Enter the elements of a 3x4 matrix row by row:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		// Print the original matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
		// Calculate the transpose of the matrix
		int[][] transpose = new int[4][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		// Print the transposed matrix
		System.out.println("\nTransposed Matrix:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}

		scanner.close();
	}
}
