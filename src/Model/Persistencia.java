package Model;
import java.io.IOException;
import java.util.List;
public interface Persistencia {
    void guardarPaciente(Paciente paciente) throws IOException;
    void guardarMedico(Medico medico) throws IOException;
    void guardarConsulta(Consulta consulta) throws IOException;
    
    List<Paciente> cargarPacientes() throws IOException;
    List<Medico> cargarMedicos() throws IOException;
    List<Consulta> cargarConsultas() throws IOException;
}
