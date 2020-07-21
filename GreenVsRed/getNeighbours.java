package GreenVsRed;

import javax.swing.*;
public class getNeighbours {

    static void getRules(int arr[][], int N, int b[][],int rows,int columns,int x,int y) {
        //N- number of itterations
        // Count of 1s,0s
        // b[][]-the main matrix to which we copy arr
        int c,k = 0;
        int count=0;//count for turned green
        while (N != 0) {
            N--;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    c = 0;
                    k = 0;


                    // Counting all neighbouring 1s AND 0s
                    if (arr[i][j]==0 && i > 0 && arr[i - 1][j] == 1) {
                        c++;
                    }else if (arr[i][j]==1 &&i > 0 && arr[i - 1][j] == 1)
                    k++;

                    if (arr[i][j]==0 &&j > 0 && arr[i][j - 1] == 1) {
                        c++;
                    }else if (arr[i][j]==1 &&j > 0 && arr[i][j - 1] == 1)
                    k++;

                    if (arr[i][j]==0 && i > 0 && j > 0  && arr[i - 1][j - 1] == 1) {
                        c++;
                    }else if (arr[i][j]==1 &&i > 0 && j > 0 && arr[i - 1][j - 1] == 1)
                        k++;

                    if (arr[i][j]==0 && i < rows - 1 && arr[i + 1][j] == 1) {
                        c++;
                    }else if (arr[i][j]==1 &&i < rows - 1 && arr[i + 1][j] == 1)
                        k++;

                    if (arr[i][j]==0 && j < columns - 1 && arr[i][j + 1] == 1) {
                        c++;
                    }else if (arr[i][j]==1 &&j < columns - 1 && arr[i][j + 1] == 1)
                        k++;

                    if (arr[i][j]==0 && i < rows - 1 && j < columns - 1 && arr[i + 1][j + 1] == 1) {
                        c++;
                    }else if (arr[i][j]==1 &&i < rows - 1 && j < columns - 1 && arr[i + 1][j + 1] == 1)
                        k++;

                    if (arr[i][j]==0 && i < rows - 1 && j > 0 && arr[i + 1][j - 1] == 1) {
                        c++;
                    }else if (arr[i][j]==1 &&i < rows - 1 && j > 0 && arr[i + 1][j - 1] == 1)
                        k++;

                    if (arr[i][j]==0 && i > 0 && j < columns - 1 && arr[i - 1][j + 1] == 1) {
                        c++;
                    }else if (arr[i][j]==1 &&i > 0 && j < columns - 1 && arr[i - 1][j + 1] == 1)
                        k++;

/*========================================================================================================
========================================================================================================*/

                    // RULES THAT
                    // CREATE NEXT GENERATION

                    if (arr[i][j] == 1) {//green
                        if (k == 2 || k== 3 || k==6)
                            b[i][j] = 1;//stays green
                        else if(k==1|| k==0|| k==4|| k==5|| k==7|| k==8)
                            b[i][j] = 0;
                    }
                   else if (arr[i][j] == 0) {//red
                        if (c == 3 || c == 6)
                            b[i][j] = 1;//turns green
                        else if (c==0||c==1||c==2||c==4||c==5||c==7||c==8)
                            b[i][j] = 0;
                    }


                }
            }
/*========================================================================================================
========================================================================================================*/
//          GET COUNT FOR TURNED GREEN
            if (b[x][y]==1)
                count+=1;

            // MANUAL COPYING ARR
            //TO ARR B WHICH IS OUT
            // MAIN MATRIX
            for (int l = 0; l < rows; l++) {
                for (int m = 0; m < columns; m++) {
                    arr[l][m] = b[l][m];
                }
            }



        }
        System.out.println(x+" "+y+" turned green for "+ count);

    }

}
