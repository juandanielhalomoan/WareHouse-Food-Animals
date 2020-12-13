import java.io.IOException;
import java.util.Scanner;

public class kelompok8B {
    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        Scanner terminalInput2 = new Scanner(System.in);
        String pilihanUser, pilihanUserHewan, pilihanUser2, jumlah1, pilihan, hewan, jenis, totalHarga;
        int jumlah, harga;
        boolean isLanjutkan = true;
        jumlah1 = "";
        pilihan = "";
        hewan = "";
        jenis = "";
        totalHarga = "";
        harga = 0;

        while (isLanjutkan) {
            clearScreen();
            System.out.println("===========================================");
            System.out.println("Selamat Datang Di WareHouse Food Animals");
            System.out.println("===========================================\n");
            System.out.println("1.\tMakanan Hewan");
            System.out.println("2.\tAksesoris Hewan");
            System.out.println("3.\tPerawatan Hewan");
        
            System.out.print("\n\nPilihan anda: ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    pilihan = "Makanan";
                    pilihHewan();
                    System.out.print("\n\nPilihan anda: ");
                    pilihanUserHewan = terminalInput.next();
                    switch (pilihanUserHewan){
                        case "1":
                            hewan = "Anjing";
                            makananAnjing();
                            System.out.print("\n\nPilihan anda: ");
                            pilihanUser2 = terminalInput.next();
                                switch (pilihanUser2){
                                    case "1":
                                        jenis = "makanan basah kitten 400 gr";
                                        harga = 21000;
                                        System.out.print("\n\nBanyaknya makanan yang anda beli: ");
                                        jumlah = terminalInput2.nextInt();
                                        jumlah1 = "" + jumlah;
                                        totalHarga = "Rp. " + hitung(harga, jumlah);
                                    break;
                                    case "2":
                                        jenis = "makanan basah adult 400 gr";
                                        harga = 22000;
                                        System.out.print("\n\nBanyaknya makanan yang anda beli: ");
                                        jumlah = terminalInput2.nextInt();
                                        jumlah1 = "" + jumlah;
                                        totalHarga = "Rp. " + hitung(harga, jumlah);
                                    break;
                                    case "3":
                                        jenis = "makanan kering kitten 400 gr";
                                        harga = 13000;
                                        System.out.print("\n\nBanyaknya makanan yang anda beli: ");
                                        jumlah = terminalInput2.nextInt();
                                        jumlah1 = "" + jumlah;
                                        totalHarga = "Rp. " + hitung(harga, jumlah);
                                    break;
                                    case "4":
                                        jenis = "makanan kering adult 400 gr";
                                        harga = 14000;
                                        System.out.print("\n\nBanyaknya makanan yang anda beli: ");
                                        jumlah = terminalInput2.nextInt();
                                        jumlah1 = "" + jumlah;
                                        totalHarga = "Rp. " + hitung(harga, jumlah);
                                    break;
                                    default:
                                    System.out.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-4]");
                                    System.exit(0);
                                }
                            break;
                        case "2":
                            hewan = "Kucing";
                            makananKucing();
                            System.out.print("\n\nPilihan anda: ");
                            pilihanUser2 = terminalInput.next();
                            switch (pilihanUser2){
                                    case "1":
                                        jenis = "makanan basah kitten 400 gr";
                                        harga = 18000;
                                        System.out.print("\n\nBanyaknya makanan yang anda beli: ");
                                        jumlah = terminalInput2.nextInt();
                                        jumlah1 = "" + jumlah;
                                        totalHarga = "Rp. " + hitung(harga, jumlah);
                                    break;
                                    case "2":
                                        jenis = "makanan basah adult 400 gr";
                                        harga = 20000;
                                        System.out.print("\n\nBanyaknya makanan yang anda beli: ");
                                        jumlah = terminalInput2.nextInt();
                                        jumlah1 = "" + jumlah;
                                        totalHarga = "Rp. " + hitung(harga, jumlah);
                                    break;
                                    case "3":
                                        jenis = "makanan kering kitten 400 gr";
                                        harga = 12000;
                                        System.out.print("\n\nBanyaknya makanan yang anda beli: ");
                                        jumlah = terminalInput2.nextInt();
                                        jumlah1 = "" + jumlah;
                                        totalHarga = "Rp. " + hitung(harga, jumlah);
                                    break;
                                    case "4":
                                        jenis = "makanan kering adult 400 gr";
                                        harga = 13000;
                                        System.out.print("\n\nBanyaknya makanan yang anda beli: ");
                                        jumlah = terminalInput2.nextInt();
                                        jumlah1 = "" + jumlah;
                                        totalHarga = "Rp. " + hitung(harga, jumlah);
                                    break;
                                    default:
                                    System.out.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-4]");
                                    System.exit(0);
                                }
                            break;
                        default:
                         System.out.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-2]");
                         System.exit(0);
                    }
                    tampilkanData(pilihan, hewan, jenis, totalHarga, jumlah1, harga);
                    break;
                case "2":
                    pilihan = "Aksesoris";
                    pilihHewan();
                    System.out.print("\n\nPilihan anda: ");
                     pilihanUserHewan = terminalInput.next();
                     switch (pilihanUserHewan){
                        case "1":
                            hewan = "Anjing";
                            aksesorisAnjing();
                            System.out.print("\n\nPilihan anda: ");
                            pilihanUser2 = terminalInput.next();
                                switch (pilihanUser2){
                                    case "1":
                                        jenis = "Kalung";
                                        harga = 10000;
                                        System.out.print("\n\nBanyaknya makanan yang anda beli: ");
                                        jumlah = terminalInput2.nextInt();
                                        jumlah1 = "" + jumlah;
                                        totalHarga = "Rp. " + hitung(harga, jumlah);
                                    break;
                                    case "2":
                                        jenis = "Kacamata";
                                        harga = 15000;
                                        System.out.print("\n\nBanyaknya makanan yang anda beli: ");
                                        jumlah = terminalInput2.nextInt();
                                        jumlah1 = "" + jumlah;
                                        totalHarga = "Rp. " + hitung(harga, jumlah);
                                    break;
                                    case "3":
                                        jenis = "Kandang";
                                        harga = 180000;
                                        System.out.print("\n\nBanyaknya makanan yang anda beli: ");
                                        jumlah = terminalInput2.nextInt();
                                        jumlah1 = "" + jumlah;
                                        totalHarga = "Rp. " + hitung(harga, jumlah);
                                    break;
                                    default:
                                    System.out.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-3]");
                                    System.exit(0);
                                }
                            break;
                        case "2":
                            hewan = "Kucing";
                            aksesorisKucing();
                            System.out.print("\n\nPilihan anda: ");
                            pilihanUser2 = terminalInput.next();
                            switch (pilihanUser2){
                                    case "1":
                                        jenis = "Kalung";
                                        harga = 5000;
                                        System.out.print("\n\nBanyaknya makanan yang anda beli: ");
                                        jumlah = terminalInput2.nextInt();
                                        jumlah1 = "" + jumlah;
                                        totalHarga = "Rp. " + hitung(harga, jumlah);
                                    break;
                                    case "2":
                                        jenis = "Kacamata";
                                        harga = 6000;
                                        System.out.print("\n\nBanyaknya makanan yang anda beli: ");
                                        jumlah = terminalInput2.nextInt();
                                        jumlah1 = "" + jumlah;
                                        totalHarga = "Rp. " + hitung(harga, jumlah);
                                    break;
                                    case "3":
                                        jenis = "Kandang";
                                        harga = 12000;
                                        System.out.print("\n\nBanyaknya makanan yang anda beli: ");
                                        jumlah = terminalInput2.nextInt();
                                        jumlah1 = "" + jumlah;
                                        totalHarga = "Rp. " + hitung(harga, jumlah);
                                    break;
                                    default:
                                    System.out.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-4]");
                                    System.exit(0);
                                }
                            break;
                        default:
                         System.out.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-2]");
                         System.exit(0);
                    }
                     tampilkanData(pilihan, hewan, jenis, totalHarga, jumlah1, harga);
                    // cari data
                    break;
                case "3":
                    pilihan = "Perawatan";
                    pilihHewan();
                    System.out.print("\n\nPilihan anda: ");
                    pilihanUserHewan = terminalInput.next();
                    switch (pilihanUserHewan){
                        case "1":
                            hewan = "Anjing";
                            perawatanAnjing();
                            System.out.print("\n\nPilihan anda: ");
                            pilihanUser2 = terminalInput.next();
                                    switch (pilihanUser2){
                                    case "1":
                                        jenis = "Rawat Inap";
                                        harga = 90000;
                                        jumlah1 = "-";
                                        totalHarga = "Rp. " + harga;
                                    break;
                                    case "2":
                                        jenis = "Steril";
                                        harga = 120000;
                                        jumlah1 = "-";
                                        totalHarga = "Rp. " + harga;
                                    break;
                                    case "3":
                                        jenis = "Grooming";
                                        harga = 90000;
                                        jumlah1 = "-";
                                        totalHarga = "Rp. " + harga;
                                    break;
                                    case "4":
                                        jenis = "Melahirkan";
                                        harga = 300000;
                                        jumlah1 = "-";
                                        totalHarga = "Rp. " + harga;
                                    break;
                                    case "5":
                                        jenis = "Suntik Rabies";
                                        harga = 130000;
                                        jumlah1 = "-";
                                        totalHarga = "Rp. " + harga;
                                    break;
                                    case "6":
                                        jenis = "Suntik Jamur";
                                        harga = 130000;
                                        jumlah1 = "-";
                                        totalHarga = "Rp. " + harga;
                                    break;
                                    default:
                                    System.out.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-6]");
                                    System.exit(0);
                                }
                            break;
                        case "2":
                            hewan = "Kucing";
                            perawatanKucing();
                            System.out.print("\n\nPilihan anda: ");
                            pilihanUser2 = terminalInput.next();
                            switch (pilihanUser2){
                                    case "1":
                                        jenis = "Rawat Inap";
                                        harga = 80000;
                                        jumlah1 = "-";
                                        totalHarga = "Rp. " + harga;
                                    break;
                                    case "2":
                                        jenis = "Steril";
                                        harga = 600000;
                                        jumlah1 = "-";
                                        totalHarga = "Rp. " + harga;
                                    break;
                                    case "3":
                                        jenis = "Grooming";
                                        harga = 80000;
                                        jumlah1 = "-";
                                        totalHarga = "Rp. " + harga;
                                    break;
                                    case "4":
                                        jenis = "Melahirkan";
                                        harga = 300000;
                                        jumlah1 = "-";
                                        totalHarga = "Rp. " + harga;
                                    break;
                                    case "5":
                                        jenis = "Suntik Rabies";
                                        harga = 120000;
                                        jumlah1 = "-";
                                        totalHarga = "Rp. " + harga;
                                    break;
                                    case "6":
                                        jenis = "Suntik Jamur";
                                        harga = 120000;
                                        jumlah1 = "-";
                                        totalHarga = "Rp. " + harga;
                                    break;
                                    default:
                                    System.out.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-6]");
                                    System.exit(0);
                                }
                            break;
                        default:
                         System.out.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-2]");
                    }
                    tampilkanData(pilihan, hewan, jenis, totalHarga, jumlah1, harga);
                    break;
             
                default:
                    System.out.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-3]");
                    System.exit(0);
            }

            isLanjutkan = getYesorNo("Apakah Anda ingin melanjutkan");
        }
//baru


    }
    private static int hitung(int harga, int banyak){
        return harga * banyak;
    }

    private static void perawatanAnjing(){
        System.out.println("\n=================");
        System.out.println("1.Rawat Inap  \tRp. 90.000");
        System.out.println("2.Steril   \tRp. 120.000");
        System.out.println("3.Groming \tRp. 90.000");
        System.out.println("4.Melahirkan  \tRP. 300.000");
        System.out.println("5.Suntik Rabies  \tRp.130.000");
        System.out.println("6.Suntik Jamur  \tRp.130.0000");
    }
    private static void perawatanKucing(){
        System.out.println("\n=================");
        System.out.println("1.Rawat Inap  \tRp. 80.000");
        System.out.println("2.Steril   \tRp. 600.000");
        System.out.println("3.Groming \tRp. 80.000");
        System.out.println("4.Melahirkan  \tRP. 300.000");
        System.out.println("5.Suntik Rabies  \tRp.120.000");
        System.out.println("6.Suntik Jamur  \tRp.120.0000");
    }

    private static void aksesorisAnjing(){
        System.out.println("\n=================");
        System.out.println("1.Kalung  \tRp. 10.000");
        System.out.println("2.Kacamata   \tRp. 15.000");
        System.out.println("3.Kandang \tRp. 180.000");
    }
    private static void aksesorisKucing(){
        System.out.println("\n=================");
        System.out.println("1.Kalung  \tRp. 5.000");
        System.out.println("2.Kacamata   \tRp. 6.000");
        System.out.println("3.Kandang \tRp. 150.000");
    }

    private static void makananKucing(){
        System.out.println("\n=================");
        System.out.println("1.makanan basah kitten 400 gr  \tRp. 18.000");
        System.out.println("2.makanan basah adult 400 gr   \tRp. 20.000");
        System.out.println("3.makanan kering kitten 400 gr \tRp. 12.000");
        System.out.println("4.makanan kering adult 400 gr  \tRp. 13.000  ");
    }
    private static void makananAnjing(){
        System.out.println("\n=================");
        System.out.println("1.makanan basah kitten 400 gr \tRp. 21.000");
        System.out.println("2.makanan basah adult 400 gr  \tRp. 22.000");
        System.out.println("3.makanan kering kitten 400 gr \tRp. 13.000");
        System.out.println("4.makanan kering adult 400 gr  \tRp. 14.000  ");
    }

    private static void pilihHewan(){
        System.out.println("\n=================");
        System.out.println("1.Anjing");
        System.out.println("2.Kucing");

    }

    private static void tampilkanData(String pilihan,String hewan,String jenis, String totalHarga, String jumlah, int harga) throws IOException{
 
        System.out.println("\n==================[Data Pesanan]==================");
        System.out.println("Jenis Pesanan \t\t= " + pilihan);
        System.out.println("Jenis Hewan \t\t= " + hewan);
        System.out.println("Item yang dipilih \t= " + jenis);
        System.out.println("Jumlah item \t\t= " + jumlah);
        System.out.println("Harga satuan \t\t= " + harga);
        System.out.println("Total harga \t\t= " + totalHarga);

        boolean isTambah = getYesorNo("Apakah Anda ingin mengubah data pembelian?");
    }

    private static boolean getYesorNo(String message){
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n"+message+" (y/n)? ");
        String pilihanUser = terminalInput.next();

        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n"+message+" (y/n)? ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");

    }


    private static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex){
            System.err.println("tidak bisa clear screen");
        }
    }
}
