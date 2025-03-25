package Lab01;
import java.util.Scanner;
import Lab01.Coordenada;
import Lab01.Rectangulo;
import Lab01.Verificador;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una esquina del Rectángulo A (x1 y y1):");
        double x1 =sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Ingrese la esquina opuesta del Rectángulo A (x2 y y2):");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Rectangulo A = new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));

        System.out.println("Ingrese una esquina del Rectángulo B (x3 y y3):");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        System.out.println("Ingrese la esquina opuesta del Rectángulo B (x4 y y4):");
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();
        Rectangulo B = new Rectangulo(new Coordenada(x3, y3), new Coordenada(x4, y4));

        mostrarRectangulo(A);
        mostrarRectangulo(B);

        if (Verificador.seSobreponen(A, B)) {
            System.out.println("Los rectangulos se sobreponen.");
            Rectangulo areaSobreposicion = rectanguloSobre(A, B);
             System.out.println("Area de sobreposicion = " + areaSobreposicion.calculoArea());
        } else if (Verificador.estanJuntos(A, B)) {
            System.out.println("Los rectangulos estan juntos.");
        } else if (Verificador.sonDisjuntos(A, B)) {
            System.out.println("Los rectangulos estan disjuntos.");
        }

        sc.close();
    }

    public static void mostrarRectangulo(Rectangulo r) {
        System.out.println(r);
    }

}
