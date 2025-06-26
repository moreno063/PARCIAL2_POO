package Excepciones;
public class UsuarioNoEncontrado extends Exception {
    public UsuarioNoEncontrado(String mensaje){
        super(mensaje);
    }
}
