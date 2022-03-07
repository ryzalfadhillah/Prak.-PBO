package bangun.datar;

public class PersegiPanjang implements MenghitungBidang{
    
    double panjang;
    double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
        
    @Override
    public double menghitungLuas() {
        double luas = panjang * lebar;
        return luas;
    }

    @Override
    public double menghitungKeliling() {
        double keliling = (panjang + lebar) * 2;
        return keliling;
    }

    
    
}
