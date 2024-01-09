package Model;

public class Retangulo {
    public double h;
    public double b;
    public double area(){
        return b * h;
    }
    public double perimetro(){
        return 2 * (h + b);
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(h, 2) + Math.pow(b, 2));
    }
}
