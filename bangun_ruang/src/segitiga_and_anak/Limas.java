package segitiga_and_anak;

import java.util.Scanner;

public class Limas extends Segitiga{
    private double t_limas,luas_segitiga;
    private double volume,luasmuka;

    public Limas(double panjang, double tinggi,double tinggi_limas) {
        super(panjang, tinggi);
        t_limas = tinggi_limas;
    }

    public double luasnya(double p_a,double tinggi){
        luas_segitiga = 0.5* p_a * tinggi;
        return luas_segitiga;
    }
    public double volumenya(){
        volume = (luasnya(getP_a(),getT()) * t_limas)/3;
        return volume;
    }
    public double luasnya(){
        double b,c,t_tegak,luas_b,luas_c,luas_a;
        Scanner input = new Scanner(System.in);
        System.out.println("Limas Segitiga");
        System.out.println("Masukkan 2 sisi segitiga bawah selain alas yang sudah di input & tinggi segitiga tegak");
        System.out.print("b : "); b = input.nextDouble();
        System.out.print("c : "); c = input.nextDouble();
        System.out.print("tinggi segitiga tegak : ");t_tegak = input.nextDouble();
        luas_b=0.5*b*t_tegak;
        luas_c= 0.5*c*t_tegak;
        luas_a=0.5*getP_a()*t_tegak;
        luasmuka = luas_a+luas_b+luas_c+luasnya(getP_a(),getT());
        return luasmuka;
    }
}
