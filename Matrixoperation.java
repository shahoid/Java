import java.util.Scanner;

class Matrix {
    int a[][] = new int[2][2];
    int b[][] = new int[2][2];
    Scanner sc = new Scanner(System.in);

    void getArrayElements() {
        System.out.println("\nENTER THE ELEMENTS OF THE 1ST MATRIX:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nENTER THE ELEMENTS OF THE 2ND MATRIX:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("THE ELEMENTS OF THE 1ST MATRIX:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("THE ELEMENTS OF THE 2ND MATRIX:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    void add() {
        System.out.println("ADDITION OF THE ELEMENTS:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int c = a[i][j] + b[i][j];
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    void subtract() {
        System.out.println("SUBTRACTION OF THE ELEMENTS:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int d = a[i][j] - b[i][j];
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }

    void multiply() {
        System.out.println("MULTIPLICATION OF THE ELEMENTS:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
            {
                int c = 0;
                for(int k = 0;k<2;k++)
                {
                    c+= a[i][k]*b[k][j];
                }
                System.out.print(c+ " ");
            }
            System.out.println();
        }
    }
}

public class MatrixOperation {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.getArrayElements();
        m.add();
        m.subtract();
        m.multiply();
    }
}
