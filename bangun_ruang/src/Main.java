import persegi_and_anak.*;
import segitiga_and_anak.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char pilmenu,pilulang;
        double panjangnya,lebarnya,tinggi;
        Scanner input =new Scanner(System.in);
        do {
            System.out.println("Welcome to Bangun Ruang");
            System.out.println("Choose What you want to calculate");
            System.out.println("\t1.Persegi,Balok,& Limas Persegi Panjang");
            System.out.println("\t2.Segitiga,Limas Segitiga,& Prisma Segitiga");
            System.out.print("Your Choice : ");
            pilmenu = input.next().charAt(0);
            switch (pilmenu) {
                case '1':
                    //Penerapan Overriding dan Polymorphism
                    System.out.print("\tInput Panjang\t:"); panjangnya = input.nextDouble();
                    System.out.print("\tInput Lebar \t:"); lebarnya = input.nextDouble();
                    System.out.print("\tInput Tinggi\t:"); tinggi = input.nextDouble();

                    PersegiPanjang asli = new PersegiPanjang(panjangnya, lebarnya);
                    PersegiPanjang balok = new Balok(panjangnya, lebarnya, tinggi);
                    PersegiPanjang limas = new LimasPersegiPanjang(panjangnya, lebarnya, tinggi);

                    System.out.println("\t\tLuas Persegi\t:\t"+asli.luasnya());
                    System.out.println("\t\tVolume Balok\t:\t"+((Balok) balok).volumenya());
                    System.out.println("\t\tLuas permukaan Balok\t:\t"+balok.luasnya());
                    System.out.println("\t\tVolume Limas\t:\t"+((LimasPersegiPanjang) limas).volumenya());
                    System.out.println("\t\tLuas Permukaan Limas\t:\t"+limas.luasnya());
                break;
                case '2':
                    //Penerapan Overloading
                    System.out.print("\tInput alas\t:"); panjangnya = input.nextDouble();
                    System.out.print("\tInput tinggi segitiga\t:"); lebarnya = input.nextDouble();
                    System.out.print("\tInput Tinggi bangun ruang 3d\t:"); tinggi = input.nextDouble();

                    Segitiga segitiga = new Limas(panjangnya, lebarnya, tinggi);
                    Prism prisma = new Prism(panjangnya, lebarnya, tinggi);
                    System.out.println("\t\tLuas Segitiga: "+((Limas) segitiga).luasnya(panjangnya, lebarnya));
                    System.out.println("\t\tVolume Limas Segitiga:"+((Limas) segitiga).volumenya());
                    System.out.println("\t\tLuas Permukaan Limas Segitiga:"+((Limas) segitiga).luasnya());
                    System.out.println("\t\tVolume Prisma Segitiga:"+prisma.volumenya());
                    System.out.println("\t\tLuas Permukaan Prisma Segitiga:"+prisma.luasnya());
                break;
            }
            System.out.print("Back To menu (y/n) : ");pilulang=input.next().charAt(0);
        }while (pilulang=='y'||pilulang=='Y');
    }
}
