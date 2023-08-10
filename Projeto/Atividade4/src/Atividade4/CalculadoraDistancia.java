package Atividade4;
import java.util.Scanner;

public class CalculadoraDistancia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as coordenadas do primeiro ponto:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();
        
        System.out.println("Digite as coordenadas do segundo ponto:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();
        
        double distancia = calcularDistancia(x1, y1, x2, y2);
        
        System.out.println("A distância entre os pontos é: " + distancia);
        
        scanner.close();
    }
    
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
