/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAD;

/**
 *
 * @author User
 */
public class NewClass {
    import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author lenin
 */
public class Operaciones_TAD extends Main{

    public Operaciones_TAD(int radio) {
    }
    
    public Operaciones_TAD() {
    }
    
    static Scanner sc = new Scanner(System.in);
        
        public void muestra_de_valores(){
            System.out.println("--------------------------------------");
            System.out.println("El área es: \n");
            area();
            System.out.println("--------------------------------------");
            System.out.println("El diametro es: \n");
            System.out.println(radio*2);
            System.out.println("--------------------------------------");
            System.out.println("La circunferencia es: \n");
            circunferencia();
            System.out.println("--------------------------------------");
            System.out.println("El volumen es: \n");
            volumen();
        }
        public void area(){
            Double area = 4* Math.PI *(radio*radio);
            System.out.println(area);
    }

        public void circunferencia (){
            Double circunferencia = Math.PI *(radio*2);
            System.out.println(circunferencia);
        }
        
        public void volumen(){
            Double volumen = (4/3)* Math.PI * Math.pow(radio, radio);
            System.out.println(volumen);
        }
        
    public static int getRadio() {
        return radio;
    }

    public static void setRadio(int radio) {
        Operaciones_TAD.radio = radio;
    }
    
    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Operaciones_TAD.sc = sc;
    }
    
}
}
