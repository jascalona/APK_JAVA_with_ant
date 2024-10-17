package phonebook;

//conections
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
public class Interface_II extends javax.swing.JFrame {

    //Creation Instancia
    Conexion cn = new Conexion();
    Connection  Conn;
    
    //VAR
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    
    
    public Interface_II() {
        initComponents();
        setLocationRelativeTo(null);
        query();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Pantalla = new javax.swing.JPanel();
        jBuscar = new javax.swing.JTextField();
        btn_log_out = new javax.swing.JButton();
        btn_drop = new javax.swing.JButton();
        btn_agg = new javax.swing.JButton();
        btn_cog = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Title = new javax.swing.JLabel();
        Footer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\JEscalona\\Documents\\NetBeansProjects\\APK\\src\\main\\java\\images\\table.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 610));

        Pantalla.setBackground(new java.awt.Color(51, 51, 51));

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
        });

        btn_log_out.setBackground(new java.awt.Color(0, 0, 51));
        btn_log_out.setIcon(new javax.swing.ImageIcon("C:\\Users\\JEscalona\\Documents\\NetBeansProjects\\APK\\src\\main\\java\\images\\log-out.png")); // NOI18N
        btn_log_out.setBorder(null);
        btn_log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_log_outActionPerformed(evt);
            }
        });

        btn_drop.setBackground(new java.awt.Color(0, 0, 51));
        btn_drop.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_drop.setForeground(new java.awt.Color(204, 204, 204));
        btn_drop.setIcon(new javax.swing.ImageIcon("C:\\Users\\JEscalona\\Documents\\NetBeansProjects\\APK\\src\\main\\java\\images\\trash.png")); // NOI18N
        btn_drop.setBorder(null);
        btn_drop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dropActionPerformed(evt);
            }
        });

        btn_agg.setBackground(new java.awt.Color(0, 0, 51));
        btn_agg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_agg.setForeground(new java.awt.Color(204, 204, 204));
        btn_agg.setIcon(new javax.swing.ImageIcon("C:\\Users\\JEscalona\\Documents\\NetBeansProjects\\APK\\src\\main\\java\\images\\Agguser.png")); // NOI18N
        btn_agg.setBorder(null);
        btn_agg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aggActionPerformed(evt);
            }
        });

        btn_cog.setBackground(new java.awt.Color(0, 0, 51));
        btn_cog.setIcon(new javax.swing.ImageIcon("C:\\Users\\JEscalona\\Documents\\NetBeansProjects\\APK\\src\\main\\java\\images\\cog.png")); // NOI18N
        btn_cog.setBorder(null);
        btn_cog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cogActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

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
            .addGap(0, 329, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)))
        );

        Title.setBackground(new java.awt.Color(204, 204, 204));
        Title.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(204, 204, 204));
        Title.setText("Administrator Views");

        Footer.setBackground(new java.awt.Color(204, 204, 204));
        Footer.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        Footer.setForeground(new java.awt.Color(204, 204, 204));
        Footer.setText("PhoneBook © Todos los derechos reservados. XDV | Designed by JE  ");

        javax.swing.GroupLayout PantallaLayout = new javax.swing.GroupLayout(Pantalla);
        Pantalla.setLayout(PantallaLayout);
        PantallaLayout.setHorizontalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Footer)
                        .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PantallaLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(PantallaLayout.createSequentialGroup()
                                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PantallaLayout.createSequentialGroup()
                                        .addComponent(btn_log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(265, 265, 265))
                                    .addComponent(btn_cog, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)))
                        .addGroup(PantallaLayout.createSequentialGroup()
                            .addGap(285, 285, 285)
                            .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_agg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_drop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallaLayout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallaLayout.createSequentialGroup()
                        .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        PantallaLayout.setVerticalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addComponent(btn_agg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_drop, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addComponent(btn_log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cog, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
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

    private void btn_log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_log_outActionPerformed
        // btn_volver
        Login Lg =new Login();
        Lg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_log_outActionPerformed

    private void btn_dropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dropActionPerformed
        // btn_drop
        dropDt();
    }//GEN-LAST:event_btn_dropActionPerformed

    private void btn_aggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aggActionPerformed
        // btn_agg
        Uloap_register UpR =new Uloap_register();
        UpR.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_aggActionPerformed

    private void btn_cogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cogActionPerformed
        // btn_setting_su
        Interface_III InterIII =new Interface_III();
        InterIII.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_cogActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuscarKeyPressed
        if(evt.getExtendedKeyCode() == KeyEvent.VK_ENTER){
            query();
        }
    }//GEN-LAST:event_jBuscarKeyPressed

    private void jBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuscarKeyReleased
        // Busqueda en tiempo real
        if(jBuscar.getText().trim().equals(""));{
            query();
        }
    }//GEN-LAST:event_jBuscarKeyReleased

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
            java.util.logging.Logger.getLogger(Interface_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Interface_II().setVisible(true);
            }
        });
    }
    
    //Metodo Query
   private void query (){
       String busqueda = jBuscar.getText();
       
       DefaultTableModel modelo = new DefaultTableModel();
       modelo.addColumn("ID");
       modelo.addColumn("Nombre");
       modelo.addColumn("Apellido");
       modelo.addColumn("GEO");
       modelo.addColumn("Phone");
       modelo.addColumn("Extension");
       
       Tabla.setModel(modelo);
       
       Tabla.getColumnModel().getColumn(0).setPreferredWidth(35);
       Tabla.getColumnModel().getColumn(1);
       Tabla.getColumnModel().getColumn(2);
       Tabla.getColumnModel().getColumn(3);
       Tabla.getColumnModel().getColumn(4);
       Tabla.getColumnModel().getColumn(5);
       
       String sql = "SELECT *FROM p_list_phone WHERE NAME LIKE '%"+busqueda+"%' OR SURNAME LIKE '%"+busqueda+"%' OR GEO LIKE '%"+busqueda+"%' OR PHONE LIKE '%"+busqueda+"%' OR EXTENSION LIKE '%"+busqueda+"%' ";
       
       String datos [] = new String[6];
       
       try {
            Conn = cn.conectar();
            st = Conn.createStatement();
            rs = st.executeQuery(sql);
           
           while (rs.next()){
               datos [0] = rs.getString("id");
               datos [1] = rs.getString("name");
               datos [2] = rs.getString("surname");
               datos [3] = rs.getString("GEO");
               datos [4] = rs.getString("phone");
               datos [5] = rs.getString("extension");
               
               modelo.addRow(datos);
           }
           
           Tabla.setModel(modelo);
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
       } /*finally {
           cn.desconectar();
       }*/
       
   }
   
   //Metodo DropR
    public void dropDt(){
        
        try{
            int fila = Tabla.getSelectedRow();
            
            String sql = " delete from p_list_phone where  id =" +Tabla.getValueAt(fila,0);
            
            Statement st= Conn.createStatement();
            
            int n=st.executeUpdate(sql);
            
            if (n>=0){
                JOptionPane.showMessageDialog(null, "Un Usuario ha sido Eliminado!");
                Interface_II interII = new Interface_II();
                interII.setVisible(true);
                this.setVisible(false);
            } 
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ha Ocurrido un Error, debe selecionar almenos un registro!" +e.getMessage());

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Footer;
    private javax.swing.JPanel Pantalla;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btn_agg;
    private javax.swing.JButton btn_cog;
    private javax.swing.JButton btn_drop;
    private javax.swing.JButton btn_log_out;
    private javax.swing.JTextField jBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
