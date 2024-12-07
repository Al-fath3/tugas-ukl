public class nggi {
    
    public static void main(String[] args) {
        // Jumlah barang
        double laptop, hardisk, mouse;
        laptop = 7;       // Jumlah laptop
        hardisk = 11;     // Jumlah hardisk
        mouse = 21;       // Jumlah mouse
        
        // Harga per unit (dalam satuan mata uang yang sama)
        long hargaL = 100000000; // Harga per laptop
        long hargaH = 15000000;  // Harga per hardisk
        long hargaM = 150000;    // Harga per mouse

        // Total harga untuk setiap jenis barang
        long totalHargaLaptop, totalHargaHardisk, totalHargaMouse;
        long totalAsset;
        double jumlahBrg;

        // Menghitung total harga untuk setiap jenis barang
        totalHargaLaptop = (long)(laptop * hargaL);
        totalHargaHardisk = (long)(hardisk * hargaH);
        totalHargaMouse = (long)(mouse * hargaM);

        // Menghitung total aset
        totalAsset = totalHargaLaptop + totalHargaHardisk + totalHargaMouse;

        // Menghitung jumlah barang
        jumlahBrg = laptop + hardisk + mouse;

        // Menampilkan hasil
        System.out.println("Jumlah barang: " + jumlahBrg);
        System.out.println("Total harga laptop: Rp " + totalHargaLaptop);
        System.out.println("Total harga hardisk: Rp " + totalHargaHardisk);
        System.out.println("Total harga mouse: Rp " + totalHargaMouse);
        System.out.println("Total aset: Rp " + totalAsset);
    }
}
