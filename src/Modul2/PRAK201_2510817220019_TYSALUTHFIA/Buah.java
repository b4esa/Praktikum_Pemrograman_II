package Modul2.PRAK201_2510817220019_TYSALUTHFIA;

public class Buah {
    private String nama;
    private double berat;
    private double harga;
    private double jumlahBeli;

    public Buah(String nama, double berat, double harga, double jumlahBeli) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    public double getDiskon() {
        double diskon = 0;
        double harga4kg = harga * (4 / berat);

        for (int i = 0; i < (int)(jumlahBeli / 4); i++) {
            diskon += harga4kg * 0.02;
        }
        return diskon;
    }

    public void info() {
        double totalSebelumDiskon = (jumlahBeli / berat) * harga;
        double totalDiskon = getDiskon();
        double hargaSetelahDiskon = totalSebelumDiskon - totalDiskon;

        System.out.printf("Nama Buah: %s\n", nama);
        System.out.printf("Berat: %.2f\n", berat);
        System.out.printf("Harga: %.1f\n", harga);
        System.out.printf("Jumlah Beli: %.1fkg\n", jumlahBeli);
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", totalSebelumDiskon);
        System.out.printf("Total Diskon: Rp%.2f\n", totalDiskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", hargaSetelahDiskon);
    }
}