package persegi_and_anak;

public class PersegiPanjang {
    private double p,l;
    private double luas;

    public PersegiPanjang(double panjang, double lebar) {
        this.p = panjang;
        this.l = lebar;
    }

    public double getP() {
        return p;
    }

    public double getL() {
        return l;
    }
    public double luasnya(){
        luas = getP() * getL();
        return luas;
    }

}
