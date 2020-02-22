package persegi_and_anak;

public class Balok extends PersegiPanjang {
    private double t_balok;
    private double volume,luasmuka;


    public Balok(double panjang, double lebar,double t) {
        super(panjang, lebar);
        this.t_balok = t;
    }
    public double volumenya(){
        volume = super.luasnya() * t_balok;
        return volume;
    }
    @Override
    public double luasnya(){
        luasmuka = 2*super.luasnya() + 2*getP()*t_balok + 2*getL()*t_balok;
        return luasmuka;
    }
}
