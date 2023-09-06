/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ordenar;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Banana {

    public static void main(String[] args) {
        //Un Scanner para leer los datos
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese Datos: ");
        String entrada = scanner.nextLine();

        //Primer split para separar por ","
        String[] conjuntos = entrada.split(",");

        for (String conjunto : conjuntos) {
            //Segundo split para separar los espacios por " "
            String[] datos = conjunto.split(" ");

            //Condicional para tomar los datos por su respectivo posicionamiento
            if (datos.length >= 5) {
                String id = datos[0].trim();
                String primerNombre = datos[3].trim();
                String apellido1 = datos[1].trim();

                //Imprimir los datos en su respectivo orden
                System.out.println("ID: " + id);
                System.out.println("Primer Nombre: " + primerNombre);
                System.out.println("Primer Apellido: " + apellido1);
                System.out.println();
            } else {
                System.out.println("No contener menos de 5 datos antes de cada coma");
            }
        }

        scanner.close();
    }
  
}
