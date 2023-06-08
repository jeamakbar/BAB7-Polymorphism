package Prak7;

public class Main {
    public static void main(String[] args) {
        Kue[] kueArray = new Kue[20];
        kueArray[0] = new KuePesanan("Kue Bolu         ", 10000, 0.5);
        kueArray[1] = new KuePesanan("Kue Brownies     ", 12000, 0.4);
        kueArray[2] = new KuePesanan("Kue Lapis        ", 15000, 0.8);
        kueArray[3] = new KuePesanan("Kue Tart         ", 20000, 1.2);
        kueArray[4] = new KuePesanan("Kue Sus          ", 8000, 0.3);
        kueArray[5] = new KueJadi("Kue Donat        ", 5000, 10);
        kueArray[6] = new KueJadi("Kue Pie          ", 15000, 5);
        kueArray[7] = new KueJadi("Kue Croissant    ", 12000, 8);
        kueArray[8] = new KueJadi("Kue Roll         ", 10000, 12);
        kueArray[9] = new KueJadi("Kue Cheese Cake  ", 25000, 3);
        kueArray[10] = new KueJadi("Kue Coklat", 10000, 3);
        kueArray[11] = new KueJadi("Kue Strawberry", 5000, 1);
        kueArray[12] = new KueJadi("Kue Lemon", 7000, 2);
        kueArray[13] = new KueJadi("Kue Cream", 12000, 4);
        kueArray[14] = new KueJadi("Kue Susu", 10000, 4);
        kueArray[15] = new KuePesanan("Kue Nastar", 10000, 1);
        kueArray[16] = new KuePesanan("Kue Geprek", 2000, 0.5);
        kueArray[17] = new KuePesanan("Kue Manis", 10000, 0.7);
        kueArray[18] = new KuePesanan("Kue Cantik", 8000, 1);
        kueArray[19] = new KuePesanan("Kue Freya", 2000, 0.8);

// Tampilkan semua kue dan jenisnya
for (Kue kue : kueArray) {
    System.out.println(kue.toString());
    if (kue instanceof KuePesanan) {
        System.out.println("Jenis Kue: Kue Pesanan");
    } else {
        System.out.println("Jenis Kue: Kue Jadi");
    }
}

// Hitung total harga dari semua jenis kue
double totalHarga = 0;
for (Kue kue : kueArray) {
    totalHarga += kue.hitungHarga();
}
System.out.println("\n|==========================================|");
System.out.println("Total Harga Semua Jenis Kue     : " + (int)totalHarga);

// Hitung total harga dan total berat dari KuePesanan
double totalHargaKuePesanan = 0;
double totalBerat = 0;
for (Kue kue : kueArray) {
    if (kue instanceof KuePesanan) {
        totalHargaKuePesanan += kue.hitungHarga();
        totalBerat += ((KuePesanan) kue).getBerat();
    }
}
System.out.println("Total Harga Kue Pesanan         : " + (int)totalHargaKuePesanan);
    System.out.println("Total Berat Kue Pesanan         : " + totalBerat +"kg");

    // Hitung total harga dan total jumlah dari KueJadi
    double totalHargaKueJadi = 0;
    double totalJumlah = 0;
    for (Kue kue : kueArray) {
        if (kue instanceof KueJadi) {
            totalHargaKueJadi += kue.hitungHarga();
            totalJumlah += ((KueJadi) kue).getJumlah();
        }
    }
    System.out.println("Total Harga Kue Jadi            : " + (int)totalHargaKueJadi);
    System.out.println("Total Jumlah Kue Jadi           : " + (int)totalJumlah +" Kue");

    // Tampilkan informasi kue dengan harga (harga akhir) terbesar
    Kue kueTerbesar = kueArray[0];
    for (Kue kue : kueArray) {
        if (kue.hitungHarga() > kueTerbesar.hitungHarga()) {
            kueTerbesar = kue;
        }
    }
    System.out.println("Kue dengan Harga Terbesar       : " + kueTerbesar.toString());
    System.out.println("|==========================================|");
    }
}
