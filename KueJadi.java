package Prak7;

public class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }
    public double getJumlah() {
        return this.jumlah;
    }

    public double hitungHarga() {
        return super.getHarga() * this.jumlah * 2;
    }

    @Override
    public String toString() {
        return super.toString() + " per " + (int) jumlah + " buah )";
    }

}

