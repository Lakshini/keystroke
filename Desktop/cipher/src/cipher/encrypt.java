/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Madushi
 */
public class encrypt extends javax.swing.JFrame {
    private ArrayList<String> enText;
    private String txt="";
    String FileName="";
    String text="";
    /**
     * Creates new form encrypt
     */
    public encrypt() {
        initComponents();
        this.enText = new ArrayList<>();
    }
substitution sb=new substitution();


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblKey = new javax.swing.JLabel();
        txtkey = new javax.swing.JTextField();
        lblText1 = new javax.swing.JLabel();
        txtText1 = new javax.swing.JTextField();
        btnencrypt = new javax.swing.JButton();
        btnfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        lblKey.setBackground(new java.awt.Color(255, 255, 255));
        lblKey.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblKey.setForeground(new java.awt.Color(51, 51, 51));
        lblKey.setText("Key");

        txtkey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkeyActionPerformed(evt);
            }
        });

        lblText1.setBackground(new java.awt.Color(255, 255, 255));
        lblText1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblText1.setForeground(new java.awt.Color(51, 51, 51));
        lblText1.setText("Text");

        txtText1.setDragEnabled(true);
        txtText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtText1ActionPerformed(evt);
            }
        });

        btnencrypt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnencrypt.setText("Encrypt");
        btnencrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnencryptActionPerformed(evt);
            }
        });

        btnfile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnfile.setText("Choose File");
        btnfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblKey, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtkey, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnencrypt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblText1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtText1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnfile)))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblText1)
                    .addComponent(txtText1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfile))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkey, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKey)
                    .addComponent(btnencrypt))
                .addContainerGap(109, Short.MAX_VALUE))
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

    private void btnencryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnencryptActionPerformed
        String text=this.text;
        txtText1.setText(txt);
        String key=txtkey.getText();
        String enText1=sb.permutation( sb.substitution(key,text));
        txt=enText1;
        System.out.println(txt);
        decrypt dp=new decrypt(txt);
        dp.setVisible(true);
        
       
        
        
    }//GEN-LAST:event_btnencryptActionPerformed

    private void txtkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkeyActionPerformed
        
    }//GEN-LAST:event_txtkeyActionPerformed

    private void txtText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtText1ActionPerformed

    private void btnfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfileActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        FileName=f.getAbsolutePath();
        try {
            readText();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(encrypt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(encrypt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnfileActionPerformed
    public void readText() throws FileNotFoundException, IOException{
        String lineText=null;
        FileReader freader=new FileReader(FileName);
        
        BufferedReader bf=new BufferedReader(freader);
        text="";
        while((lineText=bf.readLine())!=null){
            text+=lineText;
        }
        txtText1.setText(text);
        bf.close();
        
    }
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
            java.util.logging.Logger.getLogger(encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new encrypt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnencrypt;
    private javax.swing.JButton btnfile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblKey;
    private javax.swing.JLabel lblText1;
    private javax.swing.JTextField txtText1;
    private javax.swing.JTextField txtkey;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the enText
     */
    public ArrayList<String> getEnText() {
        return enText;
    }

    /**
     * @param enText the enText to set
     */
    public void setEnText(ArrayList<String> enText) {
        this.enText = enText;
    }

    
    public String getTxt() {
        return txt;
    }

    
    public void setTxt(String txt) {
        this.txt = txt;
    }
}
