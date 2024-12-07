public class sulit2 {
  public static void main(String[] args) {
    int [] array = {1,2,2,3,3,3,4};

    int angka = array[0];
    for (int i = 1; i < array.length; i++){
        if (array[i]>angka){
            angka = array[i];
        }
    }
    int [] frekuensi= new int[angka + 1];
    for (int elemen : array){
        frekuensi[elemen]++;
    }
    for (int i = 0; i < frekuensi.length; i++){
        if (frekuensi[i] > 0){
            System.out.println(i + " muncul " + frekuensi[i] + " kali");
        }
    }
  }    
}
