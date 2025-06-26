package Model;

public class Paciente extends Persona {

    public Paciente(String id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    public Paciente(String[] datos) {
        super(datos);
    }
    
    @Override
    public String getTipo(){
        return "Paciente";
    }
}
