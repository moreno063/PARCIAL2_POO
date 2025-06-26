package ViewModel;

import Excepciones.UsuarioNoEncontrado;
import Model.Clinica;
import Model.Consulta;
import Model.Medico;
import Model.Paciente;
import Model.Persistencia;
import java.io.IOException;
import java.util.List;

public class ClinicaViewModel {

    private Clinica clinica;
    private Persistencia persistencia;

    public ClinicaViewModel(Clinica clinica, Persistencia persistencia) {
        this.clinica = clinica;
        this.persistencia = persistencia;
    }

    public void agregarPaciente(Paciente p) throws IOException {
        clinica.agregarPaciente(p);
        persistencia.guardarPaciente(p);
    }

    public Paciente buscarPaciente(String id) {
        return clinica.buscarPaciente(id);
    }

    public void agregarMedico(Medico m) throws IOException {
        clinica.agregarMedico(m);
        persistencia.guardarMedico(m);
    }

    public Medico buscarMedico(String id) {
        return clinica.buscarMedico(id);
    }

    public void agregarConsulta(Consulta c) throws IOException {
        clinica.agregarConsulta(c);
        persistencia.guardarConsulta(c);
    }

    public Consulta buscarConsulta(String id) {
        return clinica.buscarConsulta(id);
    }

    public void cargarDatos() throws IOException {
        List<Paciente> pacientes = persistencia.cargarPacientes();
        for (Paciente p : pacientes) {
            clinica.agregarPaciente(p);
        }
        List<Medico> medicos = persistencia.cargarMedicos();
        for (Medico m : medicos) {
            clinica.agregarMedico(m);
        }
        List<Consulta> consultas = persistencia.cargarConsultas();
        for (Consulta c : consultas) {
            clinica.agregarConsulta(c);
        }

    }

    public String obtenerHistorialPaciente(String idPaciente) throws UsuarioNoEncontrado {
        Paciente paciente = clinica.buscarPaciente(idPaciente);
        if (paciente == null) {
            throw new UsuarioNoEncontrado("Paciente no encontrado");
        }
        StringBuilder historial = new StringBuilder();
        historial.append("Historial de ").append(paciente.getNombre()).append("\n");

        for (Consulta c : clinica.getConsultas().values()) {
            if (c.getIdPaciente().equals(idPaciente)) {
                historial.append("- Id Medico: ").append(c.getIdMedico()).append("\n - Fecha: ").append(c.getFecha()).append("\n -Sintomas:")
                        .append(c.getSintomas()).append("\n - Diagnostico:\n").append(c.getDiagnostico());


            }
        }
        return historial.toString();
    }

    public String obtenerConsultasPorMedico(String idMedico) throws UsuarioNoEncontrado {
        Medico medico = clinica.buscarMedico(idMedico);
        if (medico == null) {
            throw new UsuarioNoEncontrado("Medico no encontrado");
        }
        StringBuilder consultasStr = new StringBuilder();
        consultasStr.append("Historial del Dr. ").append(medico.getNombre()).append("\n");

        for (Consulta c : clinica.getConsultas().values()) {
            if (c.getIdMedico().equals(idMedico)) {
                consultasStr.append("- Id Paciente: ").append(c.getIdPaciente()).append("\n - Fecha: ").append(c.getFecha()).append("\n -Sintomas:")
                        .append(c.getSintomas()).append("\n - Diagnostico:\n").append(c.getDiagnostico());

            }
        }
        return consultasStr.toString();
    }
}