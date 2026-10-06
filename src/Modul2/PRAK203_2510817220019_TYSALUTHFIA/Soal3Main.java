package Modul2.PRAK203_2510817220019_TYSALUTHFIA;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        // Pada baris ini terjadi error karena kurangnya titik koma (;) di akhir baris
        // p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        // Karena nilai umur (17) ada pada output yang diminta, assign nilai umur.
        p1.umur = 17;

        // Sesuai dengan output yang ada pada modul, kata 'Pegawai' seharusnya dihapus
        // System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);

        // Pada baris ini kurang kata " tahun" agar sesuai dengan ekspektasi output
        // System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}