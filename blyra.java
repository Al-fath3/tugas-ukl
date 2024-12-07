import java.util.Scanner;

public class blyra {
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           
                System.out.print("Masukkan berat paket (kg): ");
                int berat = input.nextInt();
                System.out.print("Masukkan jarak tempuh (km): ");
                int jarak = input.nextInt();
                System.out.print("Masukkan panjang paket (cm): ");
                int panjang = input.nextInt();
                System.out.print("Masukkan lebar paket (cm): ");
                int lebar = input.nextInt();
                System.out.print("Masukkan tinggi paket (cm): ");
                int tinggi = input.nextInt();
        
                int volume = panjang * lebar * tinggi;
        
                int biayaPerKg;
                if (jarak <= 10) {
                    biayaPerKg = 4250;
                } else {
                    biayaPerKg = 6000;
                }
    
                int biayaTambahanVolume = 0;
                if (volume > 100) {
                    biayaTambahanVolume = 50000;
                }

                int totalBiaya = (berat * biayaPerKg) + biayaTambahanVolume;

                System.out.println("Volume paket: " + volume + " cm³");
                System.out.println("Total biaya pengiriman: Rp." + totalBiaya);
        
                input.close();
            }
        }
        
    