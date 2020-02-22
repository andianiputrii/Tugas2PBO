package segitiga_and_anak;

import java.util.Scanner;

public class Prism extends Segitiga{
    private double t_prism,luas_segitiga;
    private double volume,luasmuka;
    public Prism(double panjang, double tinggi,double tinggi_prism) {
        super(panjang, tinggi);
        this.t_prism = tinggi_prism;
    }
    public double luasnya(double p_a,double tinggi){
        luas_segitiga = 0.5* p_a * tinggi;
        return luas_segitiga;
    }
    public double volumenya(){
        volume = luasnya(getP_a(),getT()) * t_prism;
        return volume;
    }
    public double luasnya() {
        double b, c, t_tegak, luas_b, luas_c, luas_a;
        Scanner input = new Scanner(System.in);
        System.out.println("Prisma Segitiga");
        System.out.println("Masukkan 2 sisi segitiga bawah selain alas yang sudah di input & tinggi segitiga tegak");
        System.out.print("b : ");
        b = input.nextDouble();
        System.out.print("c : ");
        c = input.nextDouble();
        luas_a = getP_a() * t_prism;
        luas_b = b * t_prism;
        luas_c = c * t_prism;
        luasmuka = 2 * luasnya(getP_a(), getT()) + luas_a + luas_b + luas_c;
        return luasmuka;
    }
}
