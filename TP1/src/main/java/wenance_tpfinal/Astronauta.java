package wenance_tpfinal;


import java.util.Scanner;

public class Astronauta {

   public String nombre;
   public String edad;
   public String pais;

   public Astronauta(){
   }
   public String getEdad(){
      Scanner teclado = new Scanner(System.in);
      System.out.println("Ingrese su edad por favor");
      String edad = teclado.next();
      return edad;
   }

   public String getNombre(){
      Scanner teclado = new Scanner(System.in);
      System.out.println("Ingrese su nombre por favor");
      String nombre = teclado.next();
      return nombre;
   }
   public String getPais(){
      Scanner teclado = new Scanner(System.in);
      System.out.println("Ingrese su nombre por nacionalidad");
      String pais = teclado.next();
      return pais;
   }

}
