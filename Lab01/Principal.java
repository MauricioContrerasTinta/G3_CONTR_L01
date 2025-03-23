package Lab01;
import java.util.Scanner;
import Lab01.Coordenada;
import Lab01.Rectangulo;
import Lab01.Verificador;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una esquina del primer rectángulo (x1 y y1):");
        double x1 =sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Ingrese la esquina opuesta del 1er rectángulo (x2 y y2):");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Rectangulo A = new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));

    }
}
