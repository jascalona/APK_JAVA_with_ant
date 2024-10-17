package phonebook;

import Conn_db.Conexion;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;



/**
 *
 * @author JEscalona
 */

public class Interface_I extends javax.swing.JFrame {

    //Instancia de conexion 
    Conexion cn =new Conexion();
    Connection Conn;
   // DefaultTableModel  modelo;
    
    
    /* PERTENECE A table_datos();
    // String [] Titulos = {"name", "surname", "GEO","phone", "extension"};
    // DefaultTableModel dtm_datos = new DefaultTableModel();
    // TableRowSorter<TableModel>trs;
    // String[][] M_datos;
    */
    
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    
 
    public Interface_I() {
        initComponents();
        setLocationRelativeTo(null);
        query();
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
        Pantalla = new javax.swing.JPanel();
        Footer = new javax.swing.JLabel();
        jBuscar = new javax.swing.JTextField();
        btn_log = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\JEscalona\\Documents\\NetBeansProjects\\APK\\src\\main\\java\\images\\table.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 610));

        Pantalla.setBackground(new java.awt.Color(51, 51, 51));

        Footer.setBackground(new java.awt.Color(204, 204, 204));
        Footer.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        Footer.setForeground(new java.awt.Color(204, 204, 204));
        Footer.setText("PhoneBook © Todos los derechos reservados. XDV | Designed by JE  ");

        jBuscar.setBackground(new java.awt.Color(102, 102, 102));
        jBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jBuscar.setForeground(new java.awt.Color(204, 204, 204));
        jBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });
        jBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jBuscarKeyTyped(evt);
            }
        });

        btn_log.setBackground(new java.awt.Color(0, 0, 51));
        btn_log.setIcon(new javax.swing.ImageIcon("C:\\Users\\JEscalona\\Documents\\NetBeansProjects\\APK\\src\\main\\java\\images\\log-in.png")); // NOI18N
        btn_log.setBorder(null);
        btn_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\JEscalona\\Documents\\NetBeansProjects\\APK\\src\\main\\java\\images\\user-circle.png")); // NOI18N

        Tabla.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PantallaLayout = new javax.swing.GroupLayout(Pantalla);
        Pantalla.setLayout(PantallaLayout);
        PantallaLayout.setHorizontalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallaLayout.createSequentialGroup()
                        .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_log, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Footer)))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallaLayout.createSequentialGroup()
                        .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        PantallaLayout.setVerticalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_log, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel1.add(Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 370, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logActionPerformed
        // btn_login
        Login Lg =new Login();
        Lg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_logActionPerformed

    /*
    public void datos_tabla(){
        int contador = 0;
        try {
            Statement st_cont = Conn.createStatement();
            ResultSet rs_cont = st_cont.executeQuery(" SELECT *FROM p_list_phone");
            
            int cont = 0;
            M_datos = new String[contador][5];
            while (rs.next()){
                M_datos[cont][0] = rs.getString("name");
                M_datos[cont][1] = rs.getString("surname");
                M_datos[cont][2] = rs.getString("GEO");
                M_datos[cont][3] = rs.getString("phone");
                M_datos[cont][4] = rs.getString("extension");
                cont = cont + 1;
                
            }
            
            
        } catch (Exception e) {
           // Logger.getLogger(vistal.class.getName()).log(Level.SERVERE,null, ex);
        }
        
    }*/
    
    
    private void jBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuscarKeyReleased
        // Busqueda en tiempo real
            if(jBuscar.getText().trim().equals("")); {
            query();
    }
            
    }//GEN-LAST:event_jBuscarKeyReleased

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        // seatch
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuscarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jBuscarKeyTyped

    private void jBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuscarKeyPressed
        // TODO add your handling code here:
        if(evt.getExtendedKeyCode()== KeyEvent.VK_ENTER ){
            query();
        }
        
    }//GEN-LAST:event_jBuscarKeyPressed

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
            java.util.logging.Logger.getLogger(Interface_I.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_I.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_I.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_I.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_I().setVisible(true);
            }
        });
    }
    
 
    //Metodo Vistas
    
    /*
   void query(){
       String sql = " SELECT *FROM p_list_phone ";
   
       try {
        Conn = cn.conectar();
        st = Conn.createStatement();
        rs = st.executeQuery(sql);
        Object[] arreglo = new Object[5];
        modelo = (DefaultTableModel) Tabla.getModel();
        while (rs.next()) {
            arreglo [0] = rs.getString("name");
            arreglo [1] = rs.getString("surname");
            arreglo [2] = rs.getString("GEO");
            arreglo [3] = rs.getString("phone");
            arreglo [4] = rs.getString("extension");
            
            modelo.addRow(arreglo);
        }
        Tabla.setModel(modelo);
        
       } catch (Exception e) {
       
       }
   }*/
   
   private void query (){
       String busqueda = jBuscar.getText();
       
       DefaultTableModel modelo = new DefaultTableModel();
       modelo.addColumn("Nombre");
       modelo.addColumn("Apellido");
       modelo.addColumn("GEO");
       modelo.addColumn("Phone");
       modelo.addColumn("Extension");
       
       Tabla.setModel(modelo);
       
       Tabla.getColumnModel().getColumn(0);
       Tabla.getColumnModel().getColumn(1);
       Tabla.getColumnModel().getColumn(2);
       Tabla.getColumnModel().getColumn(3);
       Tabla.getColumnModel().getColumn(4);
       
       String sql = "SELECT *FROM p_list_phone WHERE NAME LIKE '%"+busqueda+"%' OR SURNAME LIKE '%"+busqueda+"%' OR GEO LIKE '%"+busqueda+"%' OR PHONE LIKE '%"+busqueda+"%' OR EXTENSION LIKE '%"+busqueda+"%' ";
       
       String datos [] = new String[5];
       
       try {
            Conn = cn.conectar();
            st = Conn.createStatement();
            rs = st.executeQuery(sql);
           
           while (rs.next()){
               datos [0] = rs.getString("name");
               datos [1] = rs.getString("surname");
               datos [2] = rs.getString("GEO");
               datos [3] = rs.getString("phone");
               datos [4] = rs.getString("extension");
               
               modelo.addRow(datos);
           }
           
           Tabla.setModel(modelo);
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
       } /*finally {
           cn.desconectar();
       }*/
       
   }
   
   
    
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Footer;
    private javax.swing.JPanel Pantalla;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btn_log;
    private javax.swing.JTextField jBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
