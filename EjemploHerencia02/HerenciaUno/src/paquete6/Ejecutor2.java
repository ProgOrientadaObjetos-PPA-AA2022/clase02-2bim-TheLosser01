/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String nombre, apellido, identificacion;
        int edad, numero;
        double valor;
        boolean bandera = true;
        String cadena = "";

        while (bandera) {
            System.out.println("Ingrese el nombre del estudiante: ");
            nombre = sc.nextLine();
            System.out.println("Ingrese el apellido del estudiante: ");
            apellido = sc.nextLine();
            System.out.println("Ingrese la identificacion del estudiante: ");
            identificacion = sc.nextLine();
            System.out.println("Ingrese la edad del estudiante: ");
            edad = sc.nextInt();
            System.out.println("Ingrese el numero de creditos: ");
            numero = sc.nextInt();
            System.out.println("Ingrese el costo de creditos: ");
            valor = sc.nextDouble();

            EstudiantePresencial estPres = new EstudiantePresencial(nombre, apellido,
                    identificacion, edad, numero, valor);

            estPres.calcularMatriculaPresencial();

            System.out.println("Desea salir, pulse Y");
            String opcion = sc.nextLine();
            if (opcion.equals("Y")) {
                bandera = false;
            }
        }
        System.out.printf("%s\n", cadena);

    }
