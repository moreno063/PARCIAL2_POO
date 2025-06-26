package Persistencia;
import Model.Medico;
import Model.Paciente;
import Model.Consulta;
import Model.Persistencia;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaArchivo implements Persistencia{
    private final String archivoPacientes = "pacientes.txt";
    private final String archivoMedicos = "medicos.txt";
    private final String archivoConsultas = "consultas.txt";
    
    @Override
    public void guardarPaciente(Paciente paciente) throws IOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoPacientes, true))){
            writer.write(paciente.toArchivo());
            writer.newLine();
        }
    }
    
    @Override
    public List<Paciente> cargarPacientes() throws IOException{
        List<Paciente> pacientes = new ArrayList<>();
        
        File archivo = new File(archivoPacientes);
        if (!archivo.exists()) return pacientes;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea = reader.readLine()) != null){
                String[] datos = linea.split("\\|");
                if (datos.length >= 4 && datos[3].equals("Paciente")){
                    Paciente p = new Paciente (datos);
                    pacientes.add(p);
                }
            }
        }
    return pacientes;
    }
    @Override
    public void guardarMedico(Medico medico) throws IOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoMedicos, true))){
            writer.write(medico.toArchivo());
            writer.newLine();
        }
    }
    
    @Override
    public List<Medico> cargarMedicos() throws IOException{
        List<Medico> medicos = new ArrayList<>();
        
        File archivo = new File(archivoMedicos);
        if (!archivo.exists()) return medicos;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea = reader.readLine()) != null){
                String[] datos = linea.split("\\|");
                if (datos.length >= 4 && datos[4].equals("Medico")){
                    Medico m = new Medico(datos);
                    medicos.add(m);
                }
            }
        }
        return medicos;
    }
    @Override
    public void guardarConsulta(Consulta consulta) throws IOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoConsultas, true))){
            writer.write(consulta.toArchivo());
            writer.newLine();
        }
    }
    
    @Override
    public List<Consulta> cargarConsultas() throws IOException{
        List<Consulta> consultas = new ArrayList<>();
        
        File archivo = new File(archivoConsultas);
        if (!archivo.exists()) return consultas;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea = reader.readLine()) != null){
                String[] datos = linea.split("\\|");
                if (datos.length >= 6){
                    Consulta c = new Consulta(datos);
                    consultas.add(c);
                }
            }
        }
        return consultas;
    }
}



