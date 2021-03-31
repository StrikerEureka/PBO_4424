package praktikum4.soal3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah usb2 : ");
        int usb2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan jumlah usb3 : ");
        int usb3 = Integer.parseInt(scanner.nextLine());
        MotherBoard.USB usb = new MotherBoard.USB();
        int totalUsb = usb.getTotalPorts(usb2, usb3);
        System.out.println("Total Ports : " + totalUsb);
    }
}