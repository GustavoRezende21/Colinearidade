/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Colinearidade;

/**
 *
 * @author Gustavo Rezende <gustavorezendegabriel@hotmail.com>
 * @date 27/04/2024
 * @brief Class Main
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite as coordenadas do primeiro ponto (x1, y1)");
        double x1 = ler.nextDouble();
        double y1 = ler.nextDouble();
        System.out.println("Digite as coordenadas do segundo ponto (x2, y2)");
        double x2 = ler.nextDouble();
        double y2 = ler.nextDouble();
        System.out.println("Digite as coordenadas do terceiro ponto (x3, y3)");
        double x3 = ler.nextDouble();
        double y3 = ler.nextDouble();
        
        System.out.println();
        
        double determinante = (x1*(y2 - y3)) + (x2*(y3 - y1)) + (x3*(y1 - y2));
        
        if(determinante == 0) {
            System.out.println("Sao colineares.");
            
            double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            
            System.out.printf("Distancia entre o primeiro e segundo ponto: %.2f", distancia);
        }
        else {
            System.out.println("Nao sao colineares.");
        }
    }
}
