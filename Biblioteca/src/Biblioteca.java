import java.util.ArrayList;
public class Biblioteca {
    private Libro[] libros;
    private Usuario[] usuarios;
    private int numLibros;
    private int numUsuarios;
    private final int MAX_LIBROS = 100;
    private final int MAX_USUARIOS = 50;

    public Biblioteca(){
        libros = new Libro[MAX_LIBROS];
        usuarios = new Usuario[MAX_USUARIOS];
        numLibros = 0;
        numUsuarios = 0;
    }

    public void agregarLibro(Libro libro){
        if(numLibros < MAX_LIBROS) {
            libros[numLibros++] = libro;
        }else {
            System.out.println("La biblioteca esta llena, no se pueden agregar mas libros");
        }
    }

    public void agregarUsuario(Usuario usuario){
        if(numUsuarios < MAX_USUARIOS){
            usuarios[numUsuarios++] = usuario;
        }else {
            System.out.println("La biblioteca a alcanzado el maximo de usuarios");
        }
    }

    public void mostrarLibrosDisponible(){
        System.out.println("Libros disponible");
        for(Libro libro : libros){
            if(libro != null && libro.isDisponible()){
                System.out.println(libro);
            }
        }
    }

    public void prestarLibro(Libro libro, Usuario usuario){
        if(libro.isDisponible()){
            System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido prestado a " + usuario.getNombre());
            libro.setDisponible(false);
        }else {
            System.out.println("El libro \"" + libro.getTitulo() + "\" no esta disponible para prestamo.");
        }
    }
}
