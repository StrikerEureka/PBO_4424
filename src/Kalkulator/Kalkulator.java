package Kalkulator;

public class Kalkulator {
    int angka1;
    int angka2;

    public Kalkulator(int angka1, int angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }
    public int tambah() {
        return this.angka1 + this.angka2;
    }
    public int bagi() {
        return this.angka1 / this.angka2;
    }
    public int kurang() {
        return this.angka1 - this.angka2;
    }
    public int kali() {
        return this.angka1 * this.angka2;
    }
    public int modulo() {
        return this.angka1 % this.angka2;
    }
}
