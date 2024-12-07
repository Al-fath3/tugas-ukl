import java.util.Scanner;

public class kuisMtk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            int bilangan1 = (int) (Math.random() * 100) + 1; 
            int bilangan2 = (int) (Math.random() * 100) + 1; 
            int operator = (int) (Math.random() * 3); 
            int jawabanBenar = 0;
            String simbolOperator = "";

            switch (operator) {
                case 0:
                    simbolOperator = "x";
                    jawabanBenar = bilangan1 * bilangan2;
                    break;
                case 1:
                    simbolOperator = ":";
                    jawabanBenar = bilangan1 / bilangan2;
                    break;
                case 2:
                    simbolOperator = "+";
                    jawabanBenar = bilangan1 + bilangan2;
                    break;
            }

            System.out.printf("%d %s %d = ", bilangan1, simbolOperator, bilangan2);
            int jawabanUser = input.nextInt();

            if (jawabanUser == jawabanBenar) {
                System.out.println("Benar!");
            } else {
                System.out.println("Salah, jawaban yang benar adalah: " + jawabanBenar);
            }

            System.out.print("Apakah Anda ingin melanjutkan kuis? (ya/tidak): ");
            String lanjutInput = input.next();
            if (!lanjutInput.equalsIgnoreCase("ya")) {
                lanjut = false;
            }
        }

        input.close();
    }
}

