/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        String nombre = "Victor";
        String apellido = "Mendoza";
        String identificacion = "1104476906";
        int edad = 19;
        
        EstudiantePresencial estPres = new EstudiantePresencial(nombre,apellido,
        identificacion,edad);
        estPres.establecerNumeroCreditos(5);
        estPres.establecerCostoCredito(50.25);
        estPres.calcularMatriculaPresencial();
        
        System.out.println(estPres);
    }
    
}
