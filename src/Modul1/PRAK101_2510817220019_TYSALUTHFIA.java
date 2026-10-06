package Modul1;

import java.util.Scanner;
import java.util.Locale;

public class PRAK101_2510817220019_TYSALUTHFIA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);

		System.out.print("Masukkan Nama Lengkap: ");
		String namaLengkap = scan.nextLine();

		System.out.print("Masukkan Tempat Lahir: ");
		String tempatLahir = scan.nextLine();

		int tanggalLahir, bulanLahir, tahunLahir;
		boolean tanggalValid = false;

		do {
			System.out.print("Masukkan Tanggal Lahir: ");
			tanggalLahir = scan.nextInt();

			System.out.print("Masukkan Bulan Lahir: ");
			bulanLahir = scan.nextInt();

			System.out.print("Masukkan Tahun Lahir: ");
			tahunLahir = scan.nextInt();

			if (tahunLahir > 0 && bulanLahir >= 1 && bulanLahir <= 12) {
				int batasHari = 31;

				if (bulanLahir == 4 || bulanLahir == 6 || bulanLahir == 9 || bulanLahir == 11) {
					batasHari = 30;
				}

				else if (bulanLahir == 2) {
					if ((tahunLahir % 4 == 0 && tahunLahir % 100 != 0) || (tahunLahir % 400 == 0)) {
						batasHari = 29;
					} else {
						batasHari = 28;
					}
				}


				if (tanggalLahir >= 1 && tanggalLahir <= batasHari) {
					tanggalValid = true;
				}
			}

			if (!tanggalValid) {
				System.out.println("Input kalender tidak valid! Perhatikan batas hari atau tahun kabisat. Silakan Coba Lagi.\n");
			}

		} while (!tanggalValid);

		int tinggiBadan;
		double beratBadan;

		do {
			System.out.print("Masukkan Tinggi Badan: ");
			tinggiBadan = scan.nextInt();
			if (tinggiBadan <= 0) {
				System.out.println("Coba Lagi");
			}
		} while (tinggiBadan <= 0);

		do {
			System.out.print("Masukkan Berat Badan: ");
			beratBadan = scan.nextDouble();
			if (beratBadan <= 0) {
				System.out.println("Coba Lagi");
			}
		} while (beratBadan <= 0);

		String[] namaBulanArray = {
				"Januari", "Februari", "Maret", "April", "Mei", "Juni",
				"Juli", "Agustus", "September", "Oktober", "November", "Desember"
		};

		String namaBulan = namaBulanArray[bulanLahir - 1];

		System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir + " Pada Tanggal " + tanggalLahir + " " + namaBulan + " " + tahunLahir);
		System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");

		scan.close();
	}
}