import java.util.Scanner;

public class moklet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String nama1 = "saya senang";

        String nama2 = "saya anak wikusama";

        String nama3 = "saya anak telkom";

        System.out.print("Berapa kali ingin mengulang nama: ");
        int total = input.nextInt();
        

        int nomor = 15 ;
        int i = 0;
        while (nomor > 1) {
         if (i % 2 == 0) {
            System.out.println(nomor + "." + nama2);
        }else{
            System.out.println(nomor + "." + nama3);
        }
        nomor--;
        i++;
        }
        
        System.out.println("1." + nama1);

        input.close();
    }
}

