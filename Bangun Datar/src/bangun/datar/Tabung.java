package bangun.datar;

public class Tabung extends Lingkaran implements MenghitungRuang{

    double tinggi;

    public Tabung(double tinggi, double radian) {
        super(radian);
        this.tinggi = tinggi;
    }  
    
    @Override
    public double menghitungVolume() {
        double volume = 3.14 * radian * radian * tinggi;
        return volume;
    }
    
    //overload 
    public double menghitungLuas(double tinggi) {
        double luas = (2 * menghitungLuas()) + (tinggi * menghitungKeliling());
        return luas;
    }
    
}
