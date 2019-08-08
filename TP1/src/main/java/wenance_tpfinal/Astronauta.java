package wenance_tpfinal;


public class Astronauta {

    private String nombre;
    private int edad;
    private String pais;

    public Astronauta() {
    }

    public Astronauta(String nombre, int edad, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;

    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPais() {
        return pais;
    }
}

