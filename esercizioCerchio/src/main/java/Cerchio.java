//import math package
import java.lang.Math;

public class Cerchio {
    private double raggio;
    private String colore;

    public Cerchio() {
        raggio = 1.0;
        colore = "rosso";
    }

    public Cerchio(double r){
        raggio = r;
        colore = "rosso";
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double r) {
        raggio = r;
    }

    public double getArea(){
        return Math.PI * Math.pow(raggio, 2);
    }

    public double getCirconferenza(){
        return 2 * Math.PI * raggio;
    }

    public String toString(){
        return "Cerchio di raggio " + raggio + " e colore " + colore;
    }
}
