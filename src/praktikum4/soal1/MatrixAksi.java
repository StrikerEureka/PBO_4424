package praktikum4.soal1;

import praktikum4.soal1.Matrix;

public class MatrixAksi {
    public static void main(String[] args) {
        System.out.println();
        Matrix A = Matrix.random(3,3);
        System.out.println("Matriks A : ");
        A.show();

        System.out.println();
        Matrix B = A.transpose();
        System.out.println("Matriks B (Transpose dari matriks A) : ");
        B.show();

        System.out.println();
        Matrix C = Matrix.identity(3);
        System.out.println("Matriks Identitas C : ");
        C.show();

        System.out.println();
        Matrix penjumlahanAB = A.plus(B);
        System.out.println("Matriks A + Matriks B : ");
        penjumlahanAB.show();

        System.out.println();
        Matrix perkalianBA = B.times(A);
        System.out.println("Matriks B * Matriks A : ");
        perkalianBA.show();
    }
}