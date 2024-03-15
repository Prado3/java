public class Usuario {
    private String nombre;
    private int ID;
    private static int contadorId = 1;

    public Usuario(String nombre, int ID) {
        this.nombre = nombre;
        this.ID = contadorId++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getID() {
        return ID;
    }

    public String toString(){
        return nombre + "(ID: " + ID + ")";
    }
}
