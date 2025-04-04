package Lab01;
import java.util.*;

public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada c1, Coordenada c2){
        setEsquina1(c1);
        setEsquina2(c2);
    }

    public void setEsquina1(Coordenada co){
        this.esquina1 = co;
    }

    public void setEsquina2(Coordenada co){
        this.esquina2 = co;
    }

    public Coordenada getEsquina1(){
        return esquina1;
    }

    public Coordenada getEsquina2(){
        return esquina2;
    }
    
    public double calculoArea() {
         double base = Math.abs(esquina2.getX() - esquina1.getX());
         double altura = Math.abs(esquina2.getY() - esquina1.getY());
         return base * altura;
     }
    
    @Override
    public String toString(){
        return "[esquina1=" + esquina1 + ", esquina2=" + esquina2 + "]";
    }
}
