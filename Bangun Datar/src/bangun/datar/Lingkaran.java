package bangun.datar;

public class Lingkaran implements MenghitungBidang{

    double radian;

    public Lingkaran(double radian) {
        this.radian = radian;
    }
    
    
    
    @Override
    public double menghitungLuas() {
        double luas = 3.14 * radian * radian;
        return luas;
    }

    @Override
    public double menghitungKeliling() {
        double keliling = 3.14 * radian * 2;
        return keliling;
    }
        
}
