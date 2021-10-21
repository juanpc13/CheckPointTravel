/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Cliente;
import entidades.Empleado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import utilidad.Conexion;
import utilidad.CustomTableModel;

/**
 *
 * @author jcpleitez
 */
public class MenuPrincipal extends javax.swing.JFrame {

    // Empleado logeado
    private Empleado empleado;
    // Vistas que administra
    private AdministrarEmpleados ae;
    private AdministrarViajes av;
    private AdministrarClientes ac;

    private List<Cliente> clientes;

    public MenuPrincipal() {
        initComponents();
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
        btnEmpleados.setEnabled(empleado.getAdmin());
    }
    
    public void updateTable(){
        tablaResultados.setModel(new CustomTableModel(clientes, Cliente.columnNames){
            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                Cliente cliente = (Cliente) super.getLi().get(rowIndex);
                return cliente.columnValue(columnIndex);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEmpleados = new javax.swing.JButton();
        btnViajes = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaResultados = new javax.swing.JTable();
        inputIdViaje = new javax.swing.JTextField();
        inputNombreCliente = new javax.swing.JTextField();
        inputFechaViaje = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inputIdCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        btnEmpleados.setText("Administrar Empleados");
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });

        btnViajes.setText("Administrar Viajes");
        btnViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViajesActionPerformed(evt);
            }
        });

        btnClientes.setText("Administrar Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        jLabel1.setText("Operaciones:");

        jLabel2.setText("Buscar Viajes:");

        btnBuscar.setText("Buscar Viajes");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("ID Viaje:");

        jLabel4.setText("Nombre Cliente:");

        jLabel5.setText("Fecha del Viaje:");

        tablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Encabezados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaResultados);
        if (tablaResultados.getColumnModel().getColumnCount() > 0) {
            tablaResultados.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel6.setText("ID Cliente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(btnEmpleados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViajes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClientes))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(inputNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(inputFechaViaje, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(inputIdViaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(inputIdCliente, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(147, 147, 147)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmpleados)
                    .addComponent(btnViajes)
                    .addComponent(btnClientes)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(inputIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(inputIdViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(inputNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(inputFechaViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        // Si no se encuentra instanciado crearlo
        if (ae == null) {
            ae = new AdministrarEmpleados();
        }
        // Mostrarlo
        ae.setVisible(true);
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViajesActionPerformed
        // Si no se encuentra instanciado crearlo
        if (av == null) {
            av = new AdministrarViajes();
        }
        // Se actualiza la cache de la conexion
        Conexion.getInstance().clearCache();
        // Mostrarlo
        av.setVisible(true);
    }//GEN-LAST:event_btnViajesActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // Si no se encuentra instanciado crearlo
        if (ac == null) {
            ac = new AdministrarClientes();
        }
        // Se actualiza la cache de la conexion
        Conexion.getInstance().clearCache();
        // Mostrarlo
        ac.setVisible(true);
        ac.updateTable();
        ac.updateLista();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // Se valida que alguno tenga algun filtro con texto
        if(inputIdCliente.getText().isEmpty() && inputIdViaje.getText().isEmpty() && 
                inputNombreCliente.getText().isEmpty() && inputFechaViaje.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor completar algun metodo de busqueda");
            return;
        }
        // Query en texto plano se construye
        String txtQuery = "SELECT c FROM Cliente c WHERE TRUE = TRUE ";
        if (!inputIdCliente.getText().isEmpty()) {
            txtQuery += " AND ";
            txtQuery += "c.idCliente = " + inputIdCliente.getText();
        }
        if(!inputIdViaje.getText().isEmpty()){
            txtQuery += " AND ";
            txtQuery += "c.idViaje.idViaje = " + inputIdViaje.getText();
        }
        if(!inputNombreCliente.getText().isEmpty()){
            txtQuery += " AND ";
            txtQuery += "CONCAT(LOWER(c.nombres), ' ', LOWER(c.apellidos)) LIKE CONCAT('%', LOWER(:txtFullName), '%')";
        }
        if (!inputFechaViaje.getText().isEmpty()) {
            txtQuery += " AND ";
            txtQuery += "c.idViaje.fechaViaje BETWEEN :fechaInicio AND :fechaFinal";
        }
        txtQuery += " ORDER BY c.idViaje.fechaViaje ASC";
        
        // Se crea la consulta con la conexion
        TypedQuery<Cliente> q = Conexion.getInstance().getEntityManager().createQuery(txtQuery, Cliente.class);
        
        // Se completan los parametros
        if(!inputNombreCliente.getText().isEmpty()){
            q.setParameter("txtFullName", inputNombreCliente.getText());
        }
        if (!inputFechaViaje.getText().isEmpty()) {
            try {
                Calendar calendar = Calendar.getInstance();
                Date fechaViaje = new SimpleDateFormat("dd/MM/yyyy").parse(inputFechaViaje.getText());
                calendar.setTime(fechaViaje);
                // Inicio desde las 12AM
                calendar.set(Calendar.HOUR_OF_DAY, 0);calendar.set(Calendar.MINUTE, 0);
                calendar.set(Calendar.SECOND, 0);calendar.set(Calendar.MILLISECOND, 0);
                q.setParameter("fechaInicio", calendar.getTime());
                // Fin hasta las 11:59:59.999PM
                calendar.set(Calendar.HOUR_OF_DAY, 23);calendar.set(Calendar.MINUTE, 59);
                calendar.set(Calendar.SECOND, 59);calendar.set(Calendar.MILLISECOND, 999);
                q.setParameter("fechaFinal", calendar.getTime());
            } catch (ParseException ex) {
                //Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Formato de fecha es: dd/MM/yyyy\n Ejemplo: 31/12/2021");            
            }
        }
        
        q.setMaxResults(50);
        clientes = q.getResultList();
        updateTable();
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnViajes;
    private javax.swing.JTextField inputFechaViaje;
    private javax.swing.JTextField inputIdCliente;
    private javax.swing.JTextField inputIdViaje;
    private javax.swing.JTextField inputNombreCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tablaResultados;
    // End of variables declaration//GEN-END:variables
}
