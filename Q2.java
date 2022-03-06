import java.util.Scanner;

public class Q2 {

    public static void enterMatrixData(Scanner scan, int[][] matrix, int matrixRow, int matrixCol) {
        System.out.println("Enter Matrix Data");

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] matrix, int matrixRow, int matrixCol) {
        System.out.println("Your Matrix is : ");

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();
        }
    }

    public static boolean isContain(int[][] largeMatrix, int[][] smallMatrix) {
        boolean isContainFlag = false;
        for (int i = 0; i < largeMatrix.length - smallMatrix.length + 1; i++) {
            for (int j = 0; j < largeMatrix[0].length - smallMatrix[0].length + 1; j++) {
                if (largeMatrix[i][j] == smallMatrix[0][0]) {
                    isContainFlag = true;
                    for (int k = 0; k < smallMatrix.length; k++) {
                        for (int l = 0; l < smallMatrix[0].length; l++) {
                            if (largeMatrix[i + k][j + l] != smallMatrix[k][l]) {
                                isContainFlag = false;
                                break;
                            }
                        }
                    }
                    if (isContainFlag) {

                        return isContainFlag;
                    }
                }
            }
        }
        return isContainFlag;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matrixRow = 40, matrixCol = 40;
        int[][] largeMatrix = new int[matrixRow][matrixCol];
        enterMatrixData(scan, largeMatrix, matrixRow, matrixCol);
        matrixRow = 10;
        matrixCol = 10;
        int[][] smallMatrix = new int[matrixRow][matrixCol];
        enterMatrixData(scan, smallMatrix, matrixRow, matrixCol);

        if (isContain(largeMatrix, smallMatrix)) {
            System.out.println("largeMatrix Contains smallMatrix ");
        } else
            System.out.println("largeMatrix does not Contains smallMatrix");
    }
}
