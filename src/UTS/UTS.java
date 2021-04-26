package UTS;

import java.util.Scanner;
import java.util.Stack;

public class UTS {
    public static void main(String[] args) {
        Soal soal = new Soal();
        soal.InputData();
    }
}

class Soal{

    Scanner obj;
    String datainput;
    Stack<Integer> dataStack;

    int nilai = 0;
    int batas = 0;
    boolean hasil = false;

    void Looping()
    {
        Scanner loop = new Scanner(System.in);
        System.out.print("Ingin mengulang (y/t) : ");
        String inputloop = loop.nextLine();
        System.out.println();
        char c= inputloop.charAt(0);
        if (c == 'y')
        {
            InputData();
        }
        else if (c == 't')
        {
            System.out.printf("Program selesai.");
            return;
        }
        else System.out.printf("Inputan salah.");
    }

    void ResetData()
    {
        batas = 0;
        nilai = 0;
        hasil = false;
        datainput = "";
    }

    void InputData()
    {
        ResetData();
        System.out.print("Inputkan data : ");
        obj = new Scanner(System.in);
        datainput = obj.nextLine();
        dataStack = new Stack<Integer>();
        HitungData();
    }

    void HitungData()
    {
        //hapus spasi yang ada
        datainput = datainput.replaceAll("\\s","");
        System.out.println("Data : " + datainput.toString());
        for(int i = 0; i<datainput.length();i++)
        {
            char c = datainput.charAt(i);
            if(c == '1')
            {
                nilai++;
            }
            else if (c == '+')
            {
                if(!hasil)
                    batas++;
                    dataStack.push(nilai);
                    nilai=0;
            }
            else if(c == '=')
            {
                if (hasil)
                {
                    System.out.println("Tidak valid. Karakter = lebih dari 1.\n");
                    Looping();
                    return;
                }
                dataStack.push(nilai);
                nilai=0;
                hasil = true;
            }
            else
            {
                System.out.println("Tidak valid. Ada karakter selain 1, +, dan =.\n");
                Looping();
                return;
            }

            if(i==datainput.length()-1)
            {
                dataStack.push(nilai);
            }
        }

        HitungJawaban();
        Looping();

////      print data stack
//        for(int i = 0; i < dataStack.size(); i ++)
//        {
//            System.out.println("stack " + i + " = " + dataStack.get(i).toString());
//        }
    }

    void HitungJawaban()
    {
        String tampilSoal = "";
        int tampungNilai = 0;
        int tampungHasil = 0;

        for (int i = 0; i <= batas; i++)
        {
            if(i == 0)
            {
                tampungNilai += dataStack.get(i);
                tampilSoal += dataStack.get(i).toString();
            }
            else
            {
                tampungNilai += dataStack.get(i);
                tampilSoal += "+" + dataStack.get(i).toString();
            }
        }

        tampilSoal+= " = ";

        for (int i = batas+1; i < dataStack.size(); i++)
        {
            if(i == batas+1)
            {
                tampungHasil += dataStack.get(i);
                tampilSoal += dataStack.get(i).toString();
            }
            else
            {
                tampungHasil += dataStack.get(i);
                tampilSoal += "+" + dataStack.get(i).toString();
            }
        }

        System.out.println("Data : "+tampilSoal);


        //cek jawaban
        if(tampungNilai == tampungHasil) {
            System.out.println("Valid.\n");
        }
        else {
            System.out.println("Tidak valid.\n");
        }
    }
}