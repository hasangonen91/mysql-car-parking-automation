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
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hasan
 */
public class Kontrol_Paneli extends javax.swing.JFrame {

    /**
     * Creates new form Kontrol_Paneli
     */
    public Kontrol_Paneli() {
        super("Gün Sonu Hesaplaması");
        initComponents();
         Seticon();
        this.setLocationRelativeTo(null);

      String baslik[] = new String[]{"Ad Soyad", "Plaka", "Marka", "yas", "cep_no", "giris_cikis", "tarihi", "saati", "türü", "ucret", "toplam_ucret", "yerler" };  

        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();
            
            String sorgu21 = "select * from araclar order by id desc";
            
            st = con.createStatement();
            rs = st.executeQuery(sorgu21);
            
            rs.last();
            int kayitsayisi = rs.getRow();
            
            rs.beforeFirst();

            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{  
                    
                    rs.getString("ad_soyad"),
                    rs.getString("plaka"),
                    rs.getString("marka"),
                    rs.getString("yas"),
                    rs.getString("cep_no"),  
                    rs.getString("giris_cikis"),
                    rs.getString("tarihi"),
                    rs.getString("saati"),                    
                    rs.getString("türü"),  
                    rs.getString("ucret"),
                    rs.getString("toplam_ucret"),
                    rs.getString("yerler"),
                };
                i++;
            }
           
            table_araclar.setModel(new DefaultTableModel(data, baslik));
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
        
        /*******************************/
        
        try{
            
            SimpleDateFormat bicim3=new SimpleDateFormat("hh.mm");
            GregorianCalendar gcalender=new GregorianCalendar();
            
            String saati=bicim3.format(gcalender.getTime());
            
            String[] Aylar = { "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran",
            "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
 
        
            Calendar takvim = Calendar.getInstance();
            String tarih = takvim.get(Calendar.DATE) + " " + Aylar[takvim.get(Calendar.MONTH)]
                    + " " + takvim.get(Calendar.YEAR);
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3,st4 = null;
            ResultSet rs,rs2,rs3,rs4 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();
            st2 = con.createStatement();
            st3 = con.createStatement();
            st4 = con.createStatement();
            
            rs = st.executeQuery("select sum(toplam_ucret) as sonuc from araclar where giris_cikis='0'");
            rs2 = st2.executeQuery("select count(türü) as toplam_otomobil from araclar where türü='Otomobil'");
            rs3 = st3.executeQuery("select count(türü) as toplam_kamyon from araclar where türü='Kamyon'");
            rs4 = st4.executeQuery("select count(türü) as toplam_motor from araclar where türü='Motor'");
            
            rs.next();
            rs2.next();
            rs3.next();
            rs4.next();
            

            int toplam_ucret = Integer.parseInt(rs.getString("sonuc"));

            txt_tarih.setText(String.valueOf(tarih));
            txt_ucret.setText(String.valueOf(toplam_ucret) + " TL");
            txt_otomobil.setText(rs2.getString("toplam_otomobil"));
            txt_kamyon.setText(rs3.getString("toplam_kamyon"));
             txt_motor.setText(rs4.getString("toplam_motor"));
            
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());    
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_tarih = new javax.swing.JTextField();
        txt_kamyon = new javax.swing.JTextField();
        txt_otomobil = new javax.swing.JTextField();
        txt_ucret = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_araclar = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        uye_btn = new javax.swing.JButton();
        park_btn = new javax.swing.JButton();
        yeniarac_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_Back = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_motor = new javax.swing.JTextField();
        Arayuz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Giren Kamyon Sayısı");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 135, 160, 16));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tarih");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 71, 70, 16));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Toplam Ücret");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 215, 140, 16));

        txt_tarih.setBackground(new java.awt.Color(255, 204, 102));
        getContentPane().add(txt_tarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 61, 130, 30));

        txt_kamyon.setBackground(new java.awt.Color(255, 204, 102));
        txt_kamyon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kamyonActionPerformed(evt);
            }
        });
        getContentPane().add(txt_kamyon, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 135, 130, 30));

        txt_otomobil.setBackground(new java.awt.Color(255, 204, 102));
        txt_otomobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_otomobilActionPerformed(evt);
            }
        });
        getContentPane().add(txt_otomobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 175, 130, 30));

        txt_ucret.setEditable(false);
        txt_ucret.setBackground(new java.awt.Color(255, 204, 102));
        txt_ucret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ucretActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ucret, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 215, 130, 30));

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setText("KAPAT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 165, 110, -1));

        table_araclar.setBackground(new java.awt.Color(255, 204, 0));
        table_araclar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SAHİBİ", "PLAKA", "MARKA/MODEL", "CEPTELEFONU", "GİRİŞ/ÇIKIŞ", "TARİH", "SAAT", "TÜRÜ", "ÜCRET", "TOPLAM ÜCRET", "PARK YERİ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_araclar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 255, 1028, 290));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Giren Otomobil Sayısı");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 175, 160, 16));

        uye_btn.setBackground(new java.awt.Color(255, 204, 0));
        uye_btn.setText("ÜYE EKLE");
        uye_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_btnActionPerformed(evt);
            }
        });
        getContentPane().add(uye_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 98, 110, -1));

        park_btn.setBackground(new java.awt.Color(255, 204, 0));
        park_btn.setText("PARK EKRANI");
        park_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                park_btnActionPerformed(evt);
            }
        });
        getContentPane().add(park_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 98, 150, -1));

        yeniarac_btn.setBackground(new java.awt.Color(255, 204, 0));
        yeniarac_btn.setText("YENİ ARAÇ EKLE");
        yeniarac_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniarac_btnActionPerformed(evt);
            }
        });
        getContentPane().add(yeniarac_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 165, 150, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 8, 30, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("-");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 8, 20, 40));

        btn_Back.setBackground(new java.awt.Color(255, 255, 255));
        btn_Back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Back.setText("<--");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 8, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Toplam Ücret");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 215, 140, 16));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Tarih");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 71, 70, 16));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Tarih");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 71, 70, 16));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("YÖNETİCİ PANELİ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 8, 320, 40));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Giren Motor Sayısı");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 98, 160, 16));

        txt_motor.setBackground(new java.awt.Color(255, 204, 102));
        txt_motor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_motorActionPerformed(evt);
            }
        });
        getContentPane().add(txt_motor, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 98, 130, 30));

        Arayuz.setIcon(new javax.swing.ImageIcon("C:\\Users\\hasan\\Desktop\\icon\\q.1.jpg")); // NOI18N
        getContentPane().add(Arayuz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1050, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_kamyonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kamyonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kamyonActionPerformed

    private void txt_otomobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_otomobilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_otomobilActionPerformed

    private void txt_ucretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ucretActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ucretActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Kontrol_Paneli ac = new Kontrol_Paneli();
        ac.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void uye_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_btnActionPerformed
        String mudur = "Müdür";
        Kayit ac = new Kayit(mudur);
        ac.setVisible(true);
    }//GEN-LAST:event_uye_btnActionPerformed

    private void park_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_park_btnActionPerformed
        Parket_Cikar ac = new Parket_Cikar();
        ac.setVisible(true);
    }//GEN-LAST:event_park_btnActionPerformed

    private void yeniarac_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniarac_btnActionPerformed
        araclar ac = new araclar();
        ac.setVisible(true);
    }//GEN-LAST:event_yeniarac_btnActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
      this.setVisible(false);
        dispose();
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        this.setVisible(false);  // register ekranını kapatıyoruz
        new Giris().setVisible(true);// login ekranını tekrar açıyoruz.
    }//GEN-LAST:event_btn_BackActionPerformed

    private void txt_motorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_motorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_motorActionPerformed

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
            java.util.logging.Logger.getLogger(Kontrol_Paneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kontrol_Paneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kontrol_Paneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kontrol_Paneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kontrol_Paneli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Arayuz;
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton park_btn;
    private javax.swing.JTable table_araclar;
    private javax.swing.JTextField txt_kamyon;
    private javax.swing.JTextField txt_motor;
    private javax.swing.JTextField txt_otomobil;
    private javax.swing.JTextField txt_tarih;
    private javax.swing.JTextField txt_ucret;
    private javax.swing.JButton uye_btn;
    private javax.swing.JButton yeniarac_btn;
    // End of variables declaration//GEN-END:variables
private void Seticon() {
          setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("91siyah.png")));   
    }

}
