/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latorre.Vista;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import latorre.Modelo.Cliente;

/**
 *
 * @author programadorac
 */
public class ClienteActualizar extends javax.swing.JFrame {
String [][] datosdepartamento = null;
String[][]  datosmunicipio= null;
 int departamentoIndex = 0;
 int municipioIndex = 0;
  String[][] departamentoIndex2 = null;
 String[][] municipioIndex2 = null;
    /**
     * Creates new form ClienteActualizar
     */
    public ClienteActualizar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        txtNombre2 = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNIT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmbDepartamento = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMunicipio = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("Nuevo Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel4.setText("Primer Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel5.setText("Segundo Nombre:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel6.setText("Primer Apellido:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));
        jPanel1.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 180, -1));
        jPanel1.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 120, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 90, 50));

        jLabel2.setText("Segundo Apellido:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));
        jPanel1.add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 120, -1));
        jPanel1.add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 120, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 180, -1));

        jLabel7.setText("Direccion:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jLabel3.setText("NIT:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        txtNIT.setEditable(false);
        jPanel1.add(txtNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 180, -1));

        jLabel10.setText("Email:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 180, -1));

        jLabel11.setText("Telefono:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 500, 420));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartamentoActionPerformed(evt);
            }
        });
        jPanel3.add(cmbDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 210, -1));

        jLabel8.setText("Departamento:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel9.setText("Municipio:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        lstMunicipio.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(lstMunicipio);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 390, 310));

        jLabel12.setText("jLabel12");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 410, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
            int idDepartamento = 0;
            int idMunicipio = 0;
            int index1 = cmbDepartamento.getSelectedIndex();
            int index2 = lstMunicipio.getSelectedIndex();
            idDepartamento = Integer.parseInt(datosdepartamento[index1][0].toString());
            idMunicipio = Integer.parseInt(datosmunicipio[index2][0].toString());

            String nitCliente = this.txtNIT.getText();
            String nombre1 = this.txtNombre1.getText();
            String nombre2 = this.txtNombre2.getText();
            String apellido1 = this.txtApellido1.getText();
            String apellido2 = this.txtApellido2.getText();
            String direccion = this.txtDireccion.getText();
            String email = this.txtEmail.getText();
            String telefono = this.txtTelefono.getText();

            Cliente cl = new Cliente();
            //cl.insertar(nitCliente, nombre1, nombre2, apellido1, apellido2, direccion, email, telefono, idMunicipio, idDepartamento);
        }catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Intentalo de nuevo");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartamentoActionPerformed
        Cliente cl = new Cliente();
        int idDepartamento = 0;
        int index = cmbDepartamento.getSelectedIndex();

        idDepartamento = Integer.parseInt(datosdepartamento[index][0].toString());
        datosmunicipio = cl.consultar_municipio(idDepartamento);
        DefaultListModel modeloLista = (DefaultListModel) lstMunicipio.getModel();
        modeloLista.removeAllElements();
        for(int i = 0; i<datosmunicipio.length; i++){
            modeloLista.addElement(datosmunicipio[i][2]);
           
        }
    }//GEN-LAST:event_cmbDepartamentoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Cliente cl = new Cliente();
       datosdepartamento = cl.consultar_departamento("departamento");
       DefaultComboBoxModel modeloCombo = (DefaultComboBoxModel) cmbDepartamento.getModel();
       for(int i = 0; i <datosdepartamento.length; i ++){
           this.cmbDepartamento.addItem(datosdepartamento[i][1].toString());
       }
    }//GEN-LAST:event_formWindowOpened

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
       this.cmbDepartamento.setSelectedIndex((departamentoIndex-1));
       this.lstMunicipio.setSelectedIndex((municipioIndex-1));
       //this.cmbDepartamento.setSelectedItem(departamentoIndex2);
      
      
    }//GEN-LAST:event_formComponentResized

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteActualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbDepartamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstMunicipio;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNIT;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    public void set_datos(String NIT,String nombre1,String nombre2, String apellido1, 
            String apellido2,String direccion,String email, String telefono,String municipio, String departamento){
        this.txtNIT.setText(NIT);
        this.txtNombre1.setText(nombre1);
        this.txtNombre2.setText(nombre2);
        this.txtApellido1.setText(apellido1);
        this.txtApellido2.setText(apellido2);
        this.txtDireccion.setText(direccion);
        this.txtEmail.setText(email);
        this.txtTelefono.setText(telefono);
       
        this.jLabel12.setText(departamento);
        
        municipioIndex = Integer.parseInt(municipio);
        departamentoIndex  = Integer.parseInt(departamento);
        
       
    }
}