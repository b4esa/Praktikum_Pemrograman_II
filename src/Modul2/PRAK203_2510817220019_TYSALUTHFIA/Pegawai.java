package Modul2.PRAK203_2510817220019_TYSALUTHFIA;

// Pada baris ini terjadi error karena nama class tidak sesuai dengan nama file.
// public class Employee {
public class Pegawai {
    public String nama;

    // Pada baris ini terjadi error karena tipe data char hanya untuk 1 karakter.
    // Harus menggunakan String karena isiannya berupa teks panjang.
    // public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // Pada baris ini terjadi error karena method setJabatan tidak memiliki parameter
    // public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}