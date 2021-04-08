package Minggu5;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan banyak inputan : ");
        ArrayList<Integer> scores = new ArrayList<Integer>();
        int scoreCount = scanner.nextInt();
        for(int i = 0; i < scoreCount; i++){
            System.out.print("Masukkan nilai : ");
            scores.add(scanner.nextInt());
        }
        printScore(scores, scoreCount);
    }
    static String convertScore(Integer score) {
        String alphabetScore = new String();
        if(score >= 85){
            alphabetScore = "A";
        }else if((score>=70) && (score<85)){
            alphabetScore = "B";
        }else if((score>=60) && (score<70)){
            alphabetScore = "C";
        }else if((score>=50) && (score<60)){
            alphabetScore = "D";
        }else if(score<50){
            alphabetScore = "E";
        }
        return alphabetScore;
    }
    static void printScore(ArrayList<Integer> scores, int count){
        System.out.println();
        System.out.println("Daftar nilai : ");
        for(int j = 0; j < count; j++){
            System.out.printf("Nilai %d, nilai hurufnya adalah %s", scores.get(j), convertScore(scores.get(j)));
            System.out.println();
        }
    }
}
