package GreenVsRed;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("enter the number of iterations: ");
        int N = scanner.nextInt();
        System.out.println("enter x(width)");
        int rows = scanner.nextInt();
        System.out.println("enter y(height)");
        int columns = scanner.nextInt();
        System.out.println("enter coordinations: \n enter coordinate x:");
        int coord_x = scanner.nextInt();
        System.out.println("enter coordinate y");
        int coord_y = scanner.nextInt();

        int b[][] = new int[rows][columns];
        int arr[][] = {{1, 0, 0, 1}, {1, 1, 1, 1}, {0, 1, 0, 0}, {1, 0, 1, 0}}/*CHANGE THIS ARRAY MANUALY TO TEST OTHER RESULTS*/;


        getNeighbours.getRules(arr, N, b, rows, columns, coord_x, coord_y);//GETTING METHOD FROM getNeighbours class

        // PRINTING THE MAIN MATRIX WHICH WE GOT FROM ARR

        System.out.print("the matrix after the last N iterration: ");
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++)
                System.out.print(b[i][j] + " ");
        }

    }
}


