package Model;

public class Medico extends Persona implements Agendable {
    private String disponibilidad;

    public Medico(String disponibilidad, String id, String nombre, String correo) {
        super(id, nombre, correo);
        this.disponibilidad = disponibilidad;
    }
    
    public Medico(String[] datos){
        super(datos[0], datos[1], datos[2]);
        this.disponibilidad = datos[3];
    }
    
    @Override
    public String getTipo(){
        return "Medico";
    }
    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toArchivo() {
        return id + "|" + nombre + "|" + correo + "|" + disponibilidad + "|" + getTipo();
    }     
}
