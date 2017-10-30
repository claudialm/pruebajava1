/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author LAB03
 */
public class GuardarDatosPersonales 
{
  public static void main(String[] args)
  { 
     Scanner sc = new Scanner(System.in);
    
    System.out.println("Por favor ingrese su nombre");
    System.out.println("Por favor ingrese su edad");
    System.out.println("Por favor digite su edad + 20 años");
      
     String nombre = sc.nextLine();
     String edad = sc.nextLine();
     
     System.out.println("Bienvenido "+nombre+",en 20 años usted tendra edad");
  }        
    




}
