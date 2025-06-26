package Model;
public class Consulta {
    private String idConsulta;
    private String idPaciente;
    private String idMedico;
    private String sintomas;
    private String diagnostico;
    private String fecha;

    public Consulta(String idConsulta, String idPaciente, String idMedico, 
            String sintomas, String diagnostico, String fecha) {
        this.idConsulta = idConsulta;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.fecha = fecha;
    }
    
    public Consulta(String[] datos){
        this.idConsulta = datos[0];
        this.idPaciente = datos[1];
        this.idMedico = datos[2];
        this.sintomas = datos[3];
        this.diagnostico = datos[4];
        this.fecha = datos[5];
    }

    public String getIdConsulta() {
        return idConsulta;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public String getSintomas() {
        return sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String toArchivo() {
        return idConsulta + "|" + idPaciente + "|" + idMedico + "|" + sintomas + "|" + diagnostico + "|" + fecha;
    }
}
