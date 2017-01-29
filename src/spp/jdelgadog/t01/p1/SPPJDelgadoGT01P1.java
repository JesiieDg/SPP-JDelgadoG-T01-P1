/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelgadog.t01.p1;
//Jessica Delgado González A01411536 IMT
import java.util.Scanner;
/**
 *
 * @author GILDARDO
 */
public class SPPJDelgadoGT01P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculador de promedio");
        // Variables Jessica Delgado González A01411536 IMT
        Double mat, cal1, cal2, cal3, cal4,cal5, pro;
        String res;
        //Indicador de que usaremos teclado. Jessica Delgado González A01411536 IMT
        Scanner teclado=new Scanner (System.in);
        //Pedir datos. Jessica Delgado González A01411536 IMT
        System.out.println("Introduce tu matrícula");
        mat=teclado.nextDouble();
        System.out.println("Introduce tu cal1");
        cal1=teclado.nextDouble();
        System.out.println("Introduce tu cal2");
        cal2=teclado.nextDouble();
        System.out.println("Introduce tu cal3");
        cal3=teclado.nextDouble();
        System.out.println("Introduce tu cal4");
        cal4=teclado.nextDouble();
        System.out.println("Introduce tu cal5");
        cal5=teclado.nextDouble();
        //Resolviendo el problema. Jessica Delgado González A01411536 IMT  
        pro=(cal1+cal2+cal3+cal4+cal5)/5;
        //Evaluando pro. Jessica Delgado González A01411536 IMT
        if (pro>7){
           res="Aprobado";
        }else {
            res="Reprobado";
        }
        //Mostrar el resultado. Jessica Delgado González A01411536 IMT
        System.out.println("Promedio"+pro);
        System.out.println("Tu estas "+res);
        
    }
    
}
