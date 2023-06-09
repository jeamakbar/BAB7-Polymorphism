package Prak7;

public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return this.nama;   
    }   
    public double getHarga() {     
        return this.harga;   
    }

    public abstract double hitungHarga();

    public String toString() {
        return "" + nama + "( Harga " + (int) harga;
    }

}