/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otopark1;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author hasan
 */
public class hesap extends javax.swing.JFrame {

    /**
     * Creates new form hesap
     */
      public hesap(String plaka_al) {
        initComponents();
         Seticon();
        this.setLocationRelativeTo(null);

        try{ 
            SimpleDateFormat bicim3=new SimpleDateFormat("kk.mm");
            GregorianCalendar gcalender=new GregorianCalendar();
            
            txt_plaka.setText(plaka_al);
            String sure=txt_sure.getText();
            String ucret=txt_ucret.getText();
            String saati=bicim3.format(gcalender.getTime());
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();
           
            rs = st.executeQuery("select * from araclar where plaka='"+plaka_al+"'");
            rs.next();
             
            //Float.parseFloat(bicim3.format(gcalender.getTime()).substring(0,4)
            float giris_Saati = Float.parseFloat(rs.getString("saati"));
            float sistem_saati = Float.parseFloat(bicim3.format(gcalender.getTime()).substring(0,4));
            
            if(giris_Saati <= sistem_saati){
                
                float saati_farki =  sistem_saati - giris_Saati;
                float toplam_ucret = Integer.parseInt(rs.getString("ucret")) * saati_farki;
                String degisken = String.valueOf(toplam_ucret);

                txt_sure.setText(String.valueOf(saati_farki));
                txt_ucret.setText(String.valueOf(degisken.substring(0,4)) + " TL");
            }
            else{
               
                float saati_farki =  giris_Saati - sistem_saati;
                
                //JOptionPane.showMessageDialog(null,saati_farki);
                float toplam_ucret = Integer.parseInt(rs.getString("ucret")) * saati_farki;
                String degisken = String.valueOf(toplam_ucret);
                //String sure1 = String.valueOf(saati_farki);

                txt_sure.setText(String.valueOf(saati_farki));
                txt_ucret.setText(String.valueOf(degisken.substring(0,4)) + " TL");
               
                
            }
            
            
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
        
    }

    private hesap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_sure = new javax.swing.JTextField();
        txt_ucret = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_plaka = new javax.swing.JTextField();
        arac_ara = new javax.swing.JButton();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin2 = new javax.swing.JLabel();
        txt_tür = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_marka = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_Back = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_verilen_ucret = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        verilen_para = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        para_ustu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 153, 255));
        jButton2.setText("ÇIKIŞ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 133, 31));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Geçen Süre :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Toplam Ücret :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));
        getContentPane().add(txt_sure, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 133, -1));

        txt_ucret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ucretActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ucret, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 133, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setText("Araç Çıkışı Yap");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 133, 31));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Plaka Girin :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 106, 125, -1));

        txt_plaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_plakaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_plaka, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 106, 133, -1));

        arac_ara.setBackground(new java.awt.Color(255, 153, 255));
        arac_ara.setText("SORGULA");
        arac_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arac_araActionPerformed(evt);
            }
        });
        getContentPane().add(arac_ara, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 210, 133, 30));

        jLabelClose.setBackground(new java.awt.Color(255, 0, 0));
        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 0, 0));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 0, -1, -1));

        jLabelMin2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelMin2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin2.setText("-");
        jLabelMin2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMin2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelMin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 0, -1, 27));
        getContentPane().add(txt_tür, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 170, 133, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Araç Türü  :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 168, -1, -1));
        getContentPane().add(txt_marka, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 139, 133, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Araç Marka / Model :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 137, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(" HESAP SORGU EKRANI ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 3, -1, -1));

        btn_Back.setBackground(new java.awt.Color(255, 255, 255));
        btn_Back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Back.setText("<--");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Saatlik Ücret :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        txt_verilen_ucret.setText("5 TL");
        txt_verilen_ucret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_verilen_ucretActionPerformed(evt);
            }
        });
        getContentPane().add(txt_verilen_ucret, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 133, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Verilen Miktar :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        verilen_para.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                verilen_paraİnputMethodTextChanged(evt);
            }
        });
        verilen_para.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verilen_paraActionPerformed(evt);
            }
        });
        verilen_para.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verilen_paraKeyTyped(evt);
            }
        });
        getContentPane().add(verilen_para, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 130, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Para Üstü :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        para_ustu.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                para_ustuİnputMethodTextChanged(evt);
            }
        });
        para_ustu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                para_ustuActionPerformed(evt);
            }
        });
        getContentPane().add(para_ustu, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 130, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\hasan\\Desktop\\icon\\red.jpg")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 750, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_ucretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ucretActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ucretActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{

            SimpleDateFormat bicim3=new SimpleDateFormat("kk.mm");
            GregorianCalendar gcalender=new GregorianCalendar();

            String plaka=txt_plaka.getText();
            String sure=txt_sure.getText();
            String ucret=txt_ucret.getText();
            String saati=bicim3.format(gcalender.getTime());
            //float sistem_saati = Float.parseFloat(saati);

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st, st2 = null;
            ResultSet rs, rs2 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();
            st2 = con.createStatement();

            rs2 = st2.executeQuery("select * from araclar where plaka='"+plaka+"'");
            rs2.next();

            float giris_Saati = Float.parseFloat(rs2.getString("saati"));
            float sistem_saati = Float.parseFloat(bicim3.format(gcalender.getTime()).substring(0,4));

            if(giris_Saati <= sistem_saati){

                float saati_farki =  sistem_saati - giris_Saati;
                float toplam_ucret = Integer.parseInt(rs2.getString("ucret")) * saati_farki;
                String degisken = String.valueOf(toplam_ucret);

                txt_sure.setText(String.valueOf(saati_farki));
                txt_ucret.setText(String.valueOf(degisken.substring(0,3)) + " TL");

                String sql1 = "update araclar set giris_cikis='0',toplam_ucret='"+degisken+"' where plaka='"+plaka+"'";
                st.executeUpdate(sql1);

                JOptionPane.showMessageDialog(this, plaka + " <- Plakalı Aracın Çıkışı Yapılmıştır.");
            }
            else{

                float saati_farki =  giris_Saati - sistem_saati;
                float toplam_ucret = Float.parseFloat(rs2.getString("ucret")) * saati_farki;
                String degisken = String.valueOf(toplam_ucret);
                String sure1 = String.valueOf(saati_farki);

                String sql1 = "update araclar set giris_cikis='0',toplam_ucret='"+toplam_ucret+"' where plaka='"+plaka+"'";
                st.executeUpdate(sql1);

                JOptionPane.showMessageDialog(this, plaka + " <- Plakalı Aracın Çıkışı Yapılmıştır.");
            }

        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_plakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_plakaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_plakaActionPerformed

    private void arac_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arac_araActionPerformed

        /*       String plaka=txt_plaka.getText();

        String sql="select * from araclar where plaka='"+plaka+"'";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, txt_plaka.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("marka");
                txt_marka.setText(add1);
                String add2=rs.getString("türü");
                txt_tür.setText(add2);

                rs.close();
                pst.close();
            }
            else{
                JOptionPane.showMessageDialog(null, "ARAÇ MEVCUT DEĞİLDİR");
            }
        }catch(Exception e){

            // JOptionPane.showMessageDialog(null, "ARAÇ GARAJDA"+ e.toString());
        } finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){

            }
        }

        // ufak bir sorun :D

        */
    }//GEN-LAST:event_arac_araActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin2MouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin2MouseClicked

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        this.setVisible(false);  // register ekranını kapatıyoruz
        new Giris().setVisible(true);// login ekranını tekrar açıyoruz.
    }//GEN-LAST:event_btn_BackActionPerformed

    private void txt_verilen_ucretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_verilen_ucretActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_verilen_ucretActionPerformed

    private void verilen_paraİnputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_verilen_paraİnputMethodTextChanged

    }//GEN-LAST:event_verilen_paraİnputMethodTextChanged

    private void verilen_paraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verilen_paraActionPerformed

    }//GEN-LAST:event_verilen_paraActionPerformed

    private void verilen_paraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verilen_paraKeyTyped
        try{
            double vPara = Double.valueOf(verilen_para.getText() + evt.getKeyChar());
            double tumPara = Double.valueOf(txt_ucret.getText().replace(" TL", ""));
            double paraUstu = vPara - tumPara;
            para_ustu.setText(String.format("%.2f", paraUstu));
            if(paraUstu < 0){
                // JOptionPane.showMessageDialog(null," EKSİK PARA GİRDİNİZ LÜTFEN YETERLİ MİKTARDA ÜCRET GİRİN: ");
                //Eksik Para
            }
        } catch(Throwable t){

        }
    }//GEN-LAST:event_verilen_paraKeyTyped

    private void para_ustuİnputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_para_ustuİnputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_para_ustuİnputMethodTextChanged

    private void para_ustuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_para_ustuActionPerformed

    }//GEN-LAST:event_para_ustuActionPerformed

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
            java.util.logging.Logger.getLogger(hesap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hesap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hesap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hesap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hesap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arac_ara;
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin2;
    private javax.swing.JTextField para_ustu;
    private javax.swing.JTextField txt_marka;
    private javax.swing.JTextField txt_plaka;
    private javax.swing.JTextField txt_sure;
    private javax.swing.JTextField txt_tür;
    private javax.swing.JTextField txt_ucret;
    private javax.swing.JTextField txt_verilen_ucret;
    private javax.swing.JTextField verilen_para;
    // End of variables declaration//GEN-END:variables
private void Seticon() {
          setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("91siyah.png")));   
    }
}
