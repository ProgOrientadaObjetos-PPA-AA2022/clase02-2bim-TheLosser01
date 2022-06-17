/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;
import java.util.Scanner;
/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del estudiante: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese la identificacion del estudiante: ");
        String identificacion = sc.nextLine();
        System.out.println("Ingrese la edad del estudiante: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese el numero de creditos: ");
        int numero = sc.nextInt();
        System.out.println("Ingrese el costo de creditos: ");
        double valor = sc.nextDouble();
        
        EstudiantePresencial estPres = new EstudiantePresencial(nombre,apellido,
        identificacion,edad,numero,valor);
        estPres.calcularMatriculaPresencial();
        
        System.out.println(estPres);

    }

}
