package Main;

import Model.Clinica;
import Model.Persistencia;
import Persistencia.PersistenciaArchivo;
import View.Registro;
import View.VentanaPrincipal;
import ViewModel.ClinicaViewModel;


public class Main {
    public static void main(String[] args){
        Clinica clinica = new Clinica();
        PersistenciaArchivo persistencia = new PersistenciaArchivo();
        ClinicaViewModel viewModel = new ClinicaViewModel(clinica, persistencia);
        
        java.awt.EventQueue.invokeLater(() ->{
            new VentanaPrincipal(viewModel).setVisible(true);
        });
    }
}
