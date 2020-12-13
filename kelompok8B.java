import java.io.IOException;
import java.util.Scanner;

public class kelompok8B {
    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser,pilihanUserHewan;
        boolean isLanjutkan = true;

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
                    System.out.println("\n=================");
                    System.out.println("1.\tAnjing");
                    System.out.println("2.\tKucing");
                    tampilkanData();
                    break;
                case "2":
                     System.out.println("\n=================");
                     System.out.println("1.\tAnjing");
                     System.out.println("2.\tKucing");
                     tampilkanData();
                    // cari data
                    break;
                case "3":
                     System.out.println("\n=================");
                     System.out.println("1.\tAnjing");
                     System.out.println("2.\tKucing");
                     tampilkanData();
                    break;
             
                default:
                    System.out.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-3]");
            }

            isLanjutkan = getYesorNo("Apakah Anda ingin melanjutkan");
        }
//baru

       





    }

    private static void tampilkanData() throws IOException{
 


        boolean isTambah = getYesorNo("Apakah Anda ingin menambah data");
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