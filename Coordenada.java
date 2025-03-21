import java.util.*;

public class Coordenada{
    private double x;
    private double y;
    
    public Coordenada(){
        this.x = 0;
        this.y = 0;
    }

    public Coordenada(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Coordenada(Coordenada c){
        this.x = c.x;
        this.y = c.y;
    }

    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    //Metodo distancia euclideana
    double distancia(Coordenada c){
        double dx = this.x - c.getX();
        double dy = this.y - c.getY();
        return sqrtAprox(dx * dx + dy * dy);
    }

    public static double distancia(Coordenada c1, Coordenada c2){
        double dx = c1.getX() - c2.getX();
        double dy = c1.getY() - c2.getY();
        return sqrtAprox(dx * dx + dy * dy);
    }

    private static double sqrtAprox(double num){
        double x = num /2;
        for (int i = 0; i < 10; i++){
        x = (x + num / x ) / 2;
        }
        return x;

    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
