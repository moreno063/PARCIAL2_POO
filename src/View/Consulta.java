package View;

import Excepciones.CampoVacio;
import ViewModel.ClinicaViewModel;
import javax.swing.JOptionPane;

public class Consulta extends javax.swing.JFrame {
    private ClinicaViewModel viewModel;
    public Consulta(ClinicaViewModel viewModel) {
        this.viewModel = viewModel;
        initComponents();
        setLocationRelativeTo(null);
        configurarAcciones();
    }
    private void configurarAcciones(){
        btnRegistrarConsulta.addActionListener(e ->{
            try{
                String id = txtIdConsulta.getText().trim();
                String idPaciente = txtIdPaciente.getText().trim();
                String idMedico = txtIdMedico.getText().trim();
                String sintomas = txtSintomas.getText().trim();
                String fecha = txtFecha.getText().trim();
                String diagnostico = txtDiagnostico.getText().trim();
               
                if(id.isEmpty() || idPaciente.isEmpty() || idMedico.isEmpty() 
                       || sintomas.isEmpty() || fecha.isEmpty() || diagnostico.isEmpty() ){
                    throw new CampoVacio("Todos los campos son obligatorios");
                }
                Model.Consulta consulta = new Model.Consulta(id, idPaciente, idMedico, sintomas, diagnostico, fecha);
                viewModel.agregarConsulta(consulta);
                
                JOptionPane.showMessageDialog(this, "consulta registrada correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
            }catch (CampoVacio ex){
                JOptionPane.showMessageDialog(this, ex.getMessage(), "campo vacio", JOptionPane.WARNING_MESSAGE);
            }catch (Exception ex){
                JOptionPane.showMessageDialog(this, "Error al registrar la consulta" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        btnVolver.addActionListener(e ->{
            this.setVisible(false);
            new VentanaPrincipal(viewModel).setVisible(true);
        });
        
    }
    private void limpiarCampos(){
        txtIdConsulta.setText("");
        txtIdPaciente.setText("");
        txtIdMedico.setText("");
        txtSintomas.setText("");
        txtDiagnostico.setText("");
        txtFecha.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdConsulta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdPaciente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdMedico = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDiagnostico = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnRegistrarConsulta = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtSintomas = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ID PACIENTE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("REGISTRAR CONSULTA");

        txtIdConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdConsultaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("ID CONSULTA");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("DIAGNOSTICO");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("ID MEDICO");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("FECHA");

        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnRegistrarConsulta.setText("REGISTRAR");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("SINTOMAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDiagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(txtFecha)))
                            .addComponent(btnRegistrarConsulta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdMedico)
                                    .addComponent(txtIdPaciente)
                                    .addComponent(txtIdConsulta)
                                    .addComponent(txtSintomas, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtDiagnostico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btnRegistrarConsulta)
                .addGap(19, 19, 19)
                .addComponent(btnVolver)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtIdConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarConsulta;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDiagnostico;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdConsulta;
    private javax.swing.JTextField txtIdMedico;
    private javax.swing.JTextField txtIdPaciente;
    private javax.swing.JTextField txtSintomas;
    // End of variables declaration//GEN-END:variables
}
