import java.util.Scanner;
import java.util.Locale;

public class PRA105_2510817220019_TYSALUTHFIA {
	public static final double PI = 3.14;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);

		System.out.print("Masukkan jari-jari: ");
		double radius = input.nextDouble();
		System.out.print("Masukkan tinggi: ");
		double height = input.nextDouble();

		double volume = PI * radius * radius * height;

		System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", radius, height, volume);
	}
}