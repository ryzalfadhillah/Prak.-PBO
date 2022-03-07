package bangun.datar;

public class Balok extends PersegiPanjang implements MenghitungRuang{

    private final double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    
            
    @Override
    public double menghitungVolume() {
        double volume = panjang * lebar * tinggi;
        return volume;
    }
    
    //overload
     public double menghitungLuas(double tinggi) {
        double luas = (panjang * lebar + panjang * tinggi + lebar * tinggi) * 2;
        return luas;
    }
}
