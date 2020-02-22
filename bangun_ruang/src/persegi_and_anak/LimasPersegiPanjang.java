package persegi_and_anak;

public class LimasPersegiPanjang extends PersegiPanjang {

    private double t_limas_persegi;
    private double vol,luasmuka,luasSegitigaPanjang,luasSegitigaLebar;
    public LimasPersegiPanjang(double panjang, double lebar,double tLimas) {
        super(panjang, lebar);
        this.t_limas_persegi = tLimas;
    }
    public double volumenya(){
        vol =(super.luasnya() * t_limas_persegi)/3;
        return vol;
    }
    @Override
    public double luasnya(){
        double tSegitigaPanjang,tSegitigaLebar;
        tSegitigaPanjang = Math.sqrt(Math.pow(0.5*getL(),2)+ Math.pow(t_limas_persegi,2));
        tSegitigaLebar = Math.sqrt(Math.pow(0.5*getP(),2)+ Math.pow(t_limas_persegi,2));
        luasSegitigaPanjang = 0.5*getP()*tSegitigaPanjang;
        luasSegitigaLebar = 0.5*getL()*tSegitigaLebar;
        luasmuka = super.luasnya() + 2*luasSegitigaLebar + 2*luasSegitigaPanjang;
        return luasmuka;
    }
}
