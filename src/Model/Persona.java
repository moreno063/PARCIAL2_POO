package Model;

public abstract class Persona {
    protected String id;
    protected String nombre;
    protected String correo;

    public Persona(String id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }
    
    public Persona(String[] datos){
        this.id = datos[0];
        this.nombre = datos[1];
        this.correo = datos[2];
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public abstract String getTipo();
    
    public String toArchivo(){
        return id + "|" + nombre + "|" + correo + "|" + getTipo() + "|";
    }
}
