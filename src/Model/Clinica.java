package Model;
import java.util.HashMap;
import java.util.Map;
    
public class Clinica {
    private HashMap<String, Paciente> pacientes;
    private HashMap<String, Medico> medicos;
    private HashMap<String, Consulta> consultas;

    public Clinica(){
        this.pacientes = new HashMap<>();
        this.medicos = new HashMap<>();
        this.consultas = new HashMap<>();
    }
    
    public void agregarPaciente(Paciente p){
        pacientes.put(p.getId(), p);
    }
    
    public Paciente buscarPaciente(String id){
        return pacientes.get(id);
    }
    
    public HashMap<String, Paciente> getPacientes(){
        return pacientes;
    }
    
    
    
    public void agregarMedico(Medico m){
        medicos.put(m.getId(), m);
    }
    
    public Medico buscarMedico(String id){
        return medicos.get(id);
    }
    
    public HashMap<String, Medico> getMedicos(){
        return medicos;
    }
    
    public void agregarConsulta(Consulta c){
        consultas.put(c.getIdConsulta(), c);
    }
    
    public Consulta buscarConsulta(String id){
        return consultas.get(id);
    }
    
    public HashMap<String, Consulta> getConsultas(){
        return consultas;
    }
    
    public void limpiar(){
        pacientes.clear();
        medicos.clear();
        consultas.clear();
    }
}   

