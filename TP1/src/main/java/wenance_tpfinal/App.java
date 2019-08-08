package wenance_tpfinal;


import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Scanner;


public class App implements Serializable {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.println("Ingrese el nombre");
        String nombre = teclado.next();
        System.out.println("Ingrese la edad");
        int edad = teclado.nextInt();
        System.out.println("Ingrese el pais");
        String pais = teclado.next();
        System.out.println("Ahora ingrese los datos del segundo Astronauta");
        System.out.println("Ingrese el nombre");
        String nombre1 = teclado.next();
        System.out.println("Ingrese la edad");
        int edad1 = teclado.nextInt();
        System.out.println("Ingrese el pais");
        String pais1 = teclado.next();


        Astronauta primerAstronauta = new Astronauta();
        primerAstronauta.setNombre(nombre);
        primerAstronauta.setEdad(edad);
        primerAstronauta.setPais(pais);

        Astronauta segundoAstronauta = new Astronauta(nombre1, edad1, pais1);

        Gson gson = new Gson();
        String JSON = gson.toJson(primerAstronauta);
        String JSON2 = gson.toJson(segundoAstronauta);
        System.out.println(JSON);
        System.out.println(JSON2);
        System.out.println("El astronauta " + nombre + " tiene " + edad + " años y nacio en " + pais);
        System.out.println("El astronauta " + nombre1 + " tiene " + edad1 + " años y nacio en " + pais1);
    }


}



