package wenance_tpfinal;


public class App
{
    public static void main( String[] args )
    {

        Astronauta primerAstronauta = new Astronauta();
        String nombre = primerAstronauta.getNombre();
        String edad = primerAstronauta.getEdad();
        String pais = primerAstronauta.getPais();

        System.out.println("El astronauta " + nombre + " tiene " + edad + " años y nacion en  " + pais);
    }


}
