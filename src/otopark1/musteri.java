/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otopark1;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hasan
 */
public class musteri extends javax.swing.JFrame {

    /**
     * Creates new form musteri
     */
    public musteri() {
        super("Otopark Ekranı");
        initComponents();
         Seticon();
        this.setLocationRelativeTo(null);

        
        try{
            
           Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st, st2, st3, st4, st5, st6, st7, st8, st9, st10, st11, st12, stb, stb2, stb3, stb4, stb5, stb6,
                    stb7, stb8, stb9, stb10, stb11, stb12, stc, stc2, stc3, stc4, stc5, stc6, stc7, stc8, stc9, stc10, 
                    stc11, stc12, std, std2, std3, std4, std5, std6, std7, std8, std9, std10, std11, std12 = null;
            ResultSet rs, rs2, rs3, rs4, rs5, rs6, rs7, rs8, rs9, rs10, rs11, rs12, rsb, rsb2, rsb3, rsb4, rsb5, rsb6,
                    rsb7, rsb8, rsb9, rsb10, rsb11, rsb12, rsc, rsc2, rsc3, rsc4, rsc5, rsc6, rsc7, rsc8, rsc9, rsc10,
                    rsc11, rsc12, rsd, rsd2, rsd3, rsd4, rsd5, rsd6, rsd7, rsd8, rsd9, rsd10, rsd11, rsd12 = null;

           con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();
            st2 = con.createStatement();
            st3 = con.createStatement();
            st4 = con.createStatement();
            st5 = con.createStatement();
            st6 = con.createStatement();
            st7 = con.createStatement();
            st8 = con.createStatement();
            st9 = con.createStatement();
            st10 = con.createStatement();
            st11 = con.createStatement();
            st12 = con.createStatement();

            stb = con.createStatement();
            stb2 = con.createStatement();
            stb3 = con.createStatement();
            stb4 = con.createStatement();
            stb5 = con.createStatement();
            stb6 = con.createStatement();
            stb7 = con.createStatement();
            stb8 = con.createStatement();
            stb9 = con.createStatement();
            stb10 = con.createStatement();
            stb11 = con.createStatement();
            stb12 = con.createStatement();

            stc = con.createStatement();
            stc2 = con.createStatement();
            stc3 = con.createStatement();
            stc4 = con.createStatement();
            stc5 = con.createStatement();
            stc6 = con.createStatement();
            stc7 = con.createStatement();
            stc8 = con.createStatement();
            stc9 = con.createStatement();
            stc10 = con.createStatement();
            stc11 = con.createStatement();
            stc12 = con.createStatement();

            std = con.createStatement();
            std2 = con.createStatement();
            std3 = con.createStatement();
            std4 = con.createStatement();
            std5 = con.createStatement();
            std6 = con.createStatement();
            std7 = con.createStatement();
            std8 = con.createStatement();
            std9 = con.createStatement();
            std10 = con.createStatement();
            std11 = con.createStatement();
            std12 = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 0 /A1' and giris_cikis='1'");
            rs.last();
            int kayitsayisi = rs.getRow();            
            if(kayitsayisi > 0){                
                btn_a1.setText("DOLU");
                btn_a1.setBackground(Color.RED);             
            }
            else {
                btn_a1.setText("BOŞ -KAT 0 /A1");
                btn_a1.setBackground(Color.YELLOW);
            }
            
            rs2 = st2.executeQuery("select * from araclar where yerler='KAT 0 /A2' and giris_cikis='1'");
            rs2.last();
            int kayitsayisi2 = rs2.getRow();            
            if(kayitsayisi2 > 0){                
                btn_a2.setText("DOLU");
                btn_a2.setBackground(Color.RED);                
            }
            else {
                btn_a2.setText("BOŞ - KAT 0 /A2");
                btn_a2.setBackground(Color.YELLOW);
            }
                
            
            rs3 = st3.executeQuery("select * from araclar where yerler='KAT 0 /A3' and giris_cikis='1'");
            rs3.last();
            int kayitsayisi3 = rs3.getRow();            
            if(kayitsayisi3 > 0){                
                btn_a3.setText("DOLU");
                btn_a3.setBackground(Color.RED);             
            }
            else {
                btn_a3.setText("BOŞ - KAT 0 /A3");
                btn_a3.setBackground(Color.YELLOW);
            }
            
            rs4 = st4.executeQuery("select * from araclar where yerler='KAT 0 /A4' and giris_cikis='1'");
            rs4.last();
            int kayitsayisi4 = rs4.getRow();            
            if(kayitsayisi4 > 0){                
                btn_a4.setText("DOLU");
                btn_a4.setBackground(Color.RED);             
            }
            else {
                btn_a4.setText("BOŞ-KAT 0 /A4");
                btn_a4.setBackground(Color.YELLOW);
            }
            
            rs5 = st5.executeQuery("select * from araclar where yerler='KAT 0 /A5' and giris_cikis='1'");
            rs5.last();
            int kayitsayisi5 = rs5.getRow();            
            if(kayitsayisi5 > 0){                
                btn_a5.setText("DOLU");
                btn_a5.setBackground(Color.RED);             
            }
            else {
                btn_a5.setText("BOŞ-KAT 0 /A5");
                btn_a5.setBackground(Color.YELLOW);
            }
            
            rs6 = st6.executeQuery("select * from araclar where yerler='KAT 0 /A6' and giris_cikis='1'");
            rs6.last();
            int kayitsayisi6 = rs6.getRow();            
            if(kayitsayisi6 > 0){                
                btn_a6.setText("DOLU");
                btn_a6.setBackground(Color.RED);             
            }
            else {
                btn_a6.setText("BOŞ-KAT 0 /A6");
                btn_a6.setBackground(Color.YELLOW);
            }
            
            rs7 = st7.executeQuery("select * from araclar where yerler='KAT 0 /A7' and giris_cikis='1'");
            rs7.last();
            int kayitsayisi7 = rs7.getRow();            
            if(kayitsayisi7 > 0){                
                btn_a7.setText("DOLU");
                btn_a7.setBackground(Color.RED);             
            }
            else {
                btn_a7.setText("BOŞ-KAT 0 /A7");
                btn_a7.setBackground(Color.YELLOW);
            }
            
            rs8 = st8.executeQuery("select * from araclar where yerler='KAT 0 /A8' and giris_cikis='1'");
            rs8.last();
            int kayitsayisi8 = rs8.getRow();            
            if(kayitsayisi8 > 0){                
                btn_a8.setText("DOLU");
                btn_a8.setBackground(Color.RED);             
            }
            else {
                btn_a8.setText("BOŞ-KAT 0 /A8");
                btn_a8.setBackground(Color.YELLOW);
            }
            
            rs9 = st9.executeQuery("select * from araclar where yerler='KAT 0 /A9' and giris_cikis='1'");
            rs9.last();
            int kayitsayisi9 = rs9.getRow();            
            if(kayitsayisi9 > 0){                
                btn_a9.setText("DOLU");
                btn_a9.setBackground(Color.RED);             
            }
            else {
                btn_a9.setText("BOŞ-KAT 0 /A9");
                btn_a9.setBackground(Color.YELLOW);
            }
            
            rs10 = st10.executeQuery("select * from araclar where yerler='KAT 0 /A10' and giris_cikis='1'");
            rs10.last();
            int kayitsayisi10 = rs10.getRow();            
            if(kayitsayisi10 > 0){                
                btn_a10.setText("DOLU");
                btn_a10.setBackground(Color.RED);             
            }
            else {
                btn_a10.setText("BOŞ-KAT 0 /A10");
                btn_a10.setBackground(Color.YELLOW);
            }
            
            rs11 = st11.executeQuery("select * from araclar where yerler='KAT 0 /A11' and giris_cikis='1'");
            rs11.last();
            int kayitsayisi11 = rs11.getRow();            
            if(kayitsayisi11 > 0){                
                btn_a11.setText("DOLU");
                btn_a11.setBackground(Color.RED);             
            }
            else {
                btn_a11.setText("BOŞ-KAT 0 /A11");
                btn_a11.setBackground(Color.YELLOW);
            }
            
            rs12 = st12.executeQuery("select * from araclar where yerler='KAT 0 /A12' and giris_cikis='1'");
            rs12.last();
            int kayitsayisi12 = rs12.getRow();            
            if(kayitsayisi12 > 0){                
                btn_a12.setText("DOLU");
                btn_a12.setBackground(Color.RED);             
            }
            else {
                btn_a12.setText("BOŞ-KAT 0 /A12");
                btn_a12.setBackground(Color.YELLOW);
            }
            
            
            
            //kat 0 son
            
              //KAT 0 SON
            // KAT 1 BASLANGİC
            rsb = stb.executeQuery("select * from araclar where yerler='KAT 1 /B1' and giris_cikis='1'");
            rsb.last();
            int kayitsayisib = rsb.getRow();
            if (kayitsayisib > 0) {
                btn_b1.setText("DOLU");
                btn_b1.setBackground(Color.RED);
            } else {
                btn_b1.setText("BOŞ - KAT 1 /B1");
                btn_b1.setBackground(Color.YELLOW);
            }

            rsb2 = stb2.executeQuery("select * from araclar where yerler='KAT 1 /B2' and giris_cikis='1'");
            rsb2.last();
            int kayitsayisib2 = rsb2.getRow();
            if (kayitsayisib2 > 0) {
                btn_b2.setText("DOLU");
                btn_b2.setBackground(Color.RED);
            } else {
                btn_b2.setText("BOŞ - KAT 1 /B2");
                btn_b2.setBackground(Color.YELLOW);
            }

            rsb3 = stb3.executeQuery("select * from araclar where yerler='KAT 1 /B3' and giris_cikis='1'");
            rsb3.last();
            int kayitsayisib3 = rsb3.getRow();
            if (kayitsayisib3 > 0) {
                btn_b3.setText("DOLU");
                btn_b3.setBackground(Color.RED);
            } else {
                btn_b3.setText("BOŞ - KAT 1 /B3");
                btn_b3.setBackground(Color.YELLOW);
            }

            rsb4 = stb4.executeQuery("select * from araclar where yerler='KAT 1 /B4' and giris_cikis='1'");
            rsb4.last();
            int kayitsayisib4 = rsb4.getRow();
            if (kayitsayisib4 > 0) {
                btn_a4.setText("DOLU");
                btn_a4.setBackground(Color.RED);
            } else {
                btn_b4.setText("BOŞ-KAT 1 /B4");
                btn_b4.setBackground(Color.YELLOW);
            }

            rsb5 = stb5.executeQuery("select * from araclar where yerler='KAT 1 /B5' and giris_cikis='1'");
            rs5.last();
            int kayitsayisib5 = rsb5.getRow();
            if (kayitsayisib5 > 0) {
                btn_b5.setText("DOLU");
                btn_b5.setBackground(Color.RED);
            } else {
                btn_b5.setText("BOŞ-KAT 1 /B5");
                btn_b5.setBackground(Color.YELLOW);
            }

            rsb6 = stb6.executeQuery("select * from araclar where yerler='KAT 1 /B6' and giris_cikis='1'");
            rsb6.last();
            int kayitsayisib6 = rsb6.getRow();
            if (kayitsayisib6 > 0) {
                btn_b6.setText("DOLU");
                btn_b6.setBackground(Color.RED);
            } else {
                btn_b6.setText("BOŞ-KAT 1 /B6");
                btn_b6.setBackground(Color.YELLOW);
            }

            rsb7 = stb7.executeQuery("select * from araclar where yerler='KAT 1 /B7' and giris_cikis='1'");
            rsb7.last();
            int kayitsayisib7 = rsb7.getRow();
            if (kayitsayisib7 > 0) {
                btn_b7.setText("DOLU");
                btn_b7.setBackground(Color.RED);
            } else {
                btn_b7.setText("BOŞ-KAT 1 /B7");
                btn_b7.setBackground(Color.YELLOW);
            }

            rsb8 = stb8.executeQuery("select * from araclar where yerler='KAT 1 /B8' and giris_cikis='1'");
            rsb8.last();
            int kayitsayisib8 = rsb8.getRow();
            if (kayitsayisib8 > 0) {
                btn_b8.setText("DOLU");
                btn_b8.setBackground(Color.RED);
            } else {
                btn_b8.setText("BOŞ-KAT 1 /B8");
                btn_b8.setBackground(Color.YELLOW);
            }

            rsb9 = stb9.executeQuery("select * from araclar where yerler='KAT 1 /B9' and giris_cikis='1'");
            rsb9.last();
            int kayitsayisib9 = rsb9.getRow();
            if (kayitsayisib9 > 0) {
                btn_b9.setText("DOLU");
                btn_b9.setBackground(Color.RED);
            } else {
                btn_b9.setText("BOŞ-KAT 1 /B9");
                btn_b9.setBackground(Color.YELLOW);
            }

            rsb10 = stb10.executeQuery("select * from araclar where yerler='KAT 1 /B10' and giris_cikis='1'");
            rsb10.last();
            int kayitsayisib10 = rsb10.getRow();
            if (kayitsayisib10 > 0) {
                btn_b10.setText("DOLU");
                btn_b10.setBackground(Color.RED);
            } else {
                btn_a10.setText("BOŞ-KAT 1 /B10");
                btn_a10.setBackground(Color.YELLOW);
            }

            rsb11 = stb11.executeQuery("select * from araclar where yerler='KAT 1 /B11' and giris_cikis='1'");
            rsb11.last();
            int kayitsayisib11 = rsb11.getRow();
            if (kayitsayisib11 > 0) {
                btn_b11.setText("DOLU");
                btn_b11.setBackground(Color.RED);
            } else {
                btn_b11.setText("BOŞ-KAT 1 /B11");
                btn_b11.setBackground(Color.YELLOW);
            }

            rsb12 = stb12.executeQuery("select * from araclar where yerler='KAT 1 /B12' and giris_cikis='1'");
            rsb12.last();
            int kayitsayisib12 = rsb12.getRow();
            if (kayitsayisib12 > 0) {
                btn_b12.setText("DOLU");
                btn_b12.setBackground(Color.RED);
            } else {
                btn_b12.setText("BOŞ-KAT 1 /B12");
                btn_b12.setBackground(Color.YELLOW);
            }
            //KAT 1 SON

            // KAT 2
            rsc = stc.executeQuery("select * from araclar where yerler='KAT 2 /C1' and giris_cikis='1'");
            rsc.last();
            int kayitsayisic = rsc.getRow();
            if (kayitsayisic > 0) {
                btn_c1.setText("DOLU");
                btn_c1.setBackground(Color.RED);
            } else {
                btn_c1.setText("BOŞ - KAT 2 /C1");
                btn_c1.setBackground(Color.YELLOW);
            }

            rsc2 = stc2.executeQuery("select * from araclar where yerler='KAT 2 /C2' and giris_cikis='1'");
            rsc2.last();
            int kayitsayisic2 = rsc2.getRow();
            if (kayitsayisic2 > 0) {
                btn_c2.setText("DOLU");
                btn_c2.setBackground(Color.RED);
            } else {
                btn_c2.setText("BOŞ - KAT 2 /C2");
                btn_c2.setBackground(Color.YELLOW);
            }

            rsc3 = stc3.executeQuery("select * from araclar where yerler='KAT 2 /C3' and giris_cikis='1'");
            rsc3.last();
            int kayitsayisic3 = rsc3.getRow();
            if (kayitsayisic3 > 0) {
                btn_c3.setText("DOLU");
                btn_c3.setBackground(Color.RED);
            } else {
                btn_c3.setText("BOŞ - KAT 2 /C3");
                btn_c3.setBackground(Color.YELLOW);
            }

            rsc4 = stc4.executeQuery("select * from araclar where yerler='KAT 2 /C4' and giris_cikis='1'");
            rsc4.last();
            int kayitsayisic4 = rsc4.getRow();
            if (kayitsayisic4 > 0) {
                btn_c4.setText("DOLU");
                btn_c4.setBackground(Color.RED);
            } else {
                btn_c4.setText("BOŞ-KAT 2 /C4");
                btn_c4.setBackground(Color.YELLOW);
            }

            rsc5 = stc5.executeQuery("select * from araclar where yerler='KAT 2 /C5' and giris_cikis='1'");
            rsc5.last();
            int kayitsayisic5 = rsc5.getRow();
            if (kayitsayisic5 > 0) {
                btn_c5.setText("DOLU");
                btn_c5.setBackground(Color.RED);
            } else {
                btn_c5.setText("BOŞ-KAT 2 /C5");
                btn_c5.setBackground(Color.YELLOW);
            }

            rsc6 = stc6.executeQuery("select * from araclar where yerler='KAT 2 /C6' and giris_cikis='1'");
            rsc6.last();
            int kayitsayisic6 = rsc6.getRow();
            if (kayitsayisic6 > 0) {
                btn_c6.setText("DOLU");
                btn_c6.setBackground(Color.RED);
            } else {
                btn_c6.setText("BOŞ-KAT 2 /C6");
                btn_c6.setBackground(Color.YELLOW);
            }
            rsc7 = stc7.executeQuery("select * from araclar where yerler='KAT 2 /C7' and giris_cikis='1'");
            rsc7.last();
            int kayitsayisic7 = rsc7.getRow();
            if (kayitsayisic7 > 0) {
                btn_c7.setText("DOLU");
                btn_c7.setBackground(Color.RED);
            } else {
                btn_c7.setText("BOŞ-KAT 2 /C7");
                btn_c7.setBackground(Color.YELLOW);
            }

            rsc8 = stc8.executeQuery("select * from araclar where yerler='KAT 2 /C8' and giris_cikis='1'");
            rsc8.last();
            int kayitsayisic8 = rsc8.getRow();
            if (kayitsayisic8 > 0) {
                btn_c8.setText("DOLU");
                btn_c8.setBackground(Color.RED);
            } else {
                btn_c8.setText("BOŞ-KAT 2 /C8");
                btn_c8.setBackground(Color.YELLOW);
            }

            rsc9 = stc9.executeQuery("select * from araclar where yerler='KAT 2 /C9' and giris_cikis='1'");
            rsc9.last();
            int kayitsayisic9 = rsc9.getRow();
            if (kayitsayisic9 > 0) {
                btn_c9.setText("DOLU");
                btn_c9.setBackground(Color.RED);
            } else {
                btn_c9.setText("BOŞ-KAT 2 /C9");
                btn_c9.setBackground(Color.YELLOW);
            }

            rsc10 = stc10.executeQuery("select * from araclar where yerler='KAT 2 /C10' and giris_cikis='1'");
            rsc10.last();
            int kayitsayisic10 = rsc10.getRow();
            if (kayitsayisic10 > 0) {
                btn_c10.setText("DOLU");
                btn_c10.setBackground(Color.RED);
            } else {
                btn_c10.setText("BOŞ-KAT 2 /C10");
                btn_c10.setBackground(Color.YELLOW);
            }

            rsc11 = stc11.executeQuery("select * from araclar where yerler='KAT 2 /C11' and giris_cikis='1'");
            rsc11.last();
            int kayitsayisic11 = rsc11.getRow();
            if (kayitsayisic11 > 0) {
                btn_c11.setText("DOLU");
                btn_c11.setBackground(Color.RED);
            } else {
                btn_c11.setText("BOŞ-KAT 2 /C11");
                btn_c11.setBackground(Color.YELLOW);
            }

            rsc12 = stc12.executeQuery("select * from araclar where yerler='KAT 2 /C12' and giris_cikis='1'");
            rsc12.last();
            int kayitsayisic12 = rsc12.getRow();
            if (kayitsayisic12 > 0) {
                btn_c12.setText("DOLU");
                btn_c12.setBackground(Color.RED);
            } else {
                btn_c12.setText("BOŞ-KAT 2 /C12");
                btn_c12.setBackground(Color.YELLOW);
            }

            //KAT 2 SON
            //KAT 3 BAŞLANGIC
            rsd = std.executeQuery("select * from araclar where yerler='KAT 3 /D1' and giris_cikis='1'");
            rsd.last();
            int kayitsayisid = rsd.getRow();
            if (kayitsayisid > 0) {
                btn_d1.setText("DOLU");
                btn_d1.setBackground(Color.RED);
            } else {
                btn_d1.setText("BOŞ - KAT 3 /D1");
                btn_d1.setBackground(Color.YELLOW);
            }

            rsd2 = std2.executeQuery("select * from araclar where yerler='KAT 3 /D2' and giris_cikis='1'");
            rsd2.last();
            int kayitsayisid2 = rsd2.getRow();
            if (kayitsayisid2 > 0) {
                btn_d2.setText("DOLU");
                btn_d2.setBackground(Color.RED);
            } else {
                btn_d2.setText("BOŞ - KAT 3 /D2");
                btn_d2.setBackground(Color.YELLOW);
            }

            rsd3 = std3.executeQuery("select * from araclar where yerler='KAT 3 /D3' and giris_cikis='1'");
            rsd3.last();
            int kayitsayisid3 = rsd3.getRow();
            if (kayitsayisid3 > 0) {
                btn_d3.setText("DOLU");
                btn_d3.setBackground(Color.RED);
            } else {
                btn_d3.setText("BOŞ - KAT 3 /D3");
                btn_d3.setBackground(Color.YELLOW);
            }

            rsd4 = std4.executeQuery("select * from araclar where yerler='KAT 3 /D4' and giris_cikis='1'");
            rsd4.last();
            int kayitsayisid4 = rsd4.getRow();
            if (kayitsayisid4 > 0) {
                btn_d4.setText("DOLU");
                btn_d4.setBackground(Color.RED);
            } else {
                btn_d4.setText("BOŞ-KAT 3 /D4");
                btn_d4.setBackground(Color.YELLOW);
            }

            rsd5 = std5.executeQuery("select * from araclar where yerler='KAT 3 /D5' and giris_cikis='1'");
            rsd5.last();
            int kayitsayisid5 = rsd5.getRow();
            if (kayitsayisid5 > 0) {
                btn_d5.setText("DOLU");
                btn_d5.setBackground(Color.RED);
            } else {
                btn_d5.setText("BOŞ-KAT 3 /D5");
                btn_d5.setBackground(Color.YELLOW);
            }

            rsd6 = std6.executeQuery("select * from araclar where yerler='KAT 3 /D6' and giris_cikis='1'");
            rsd6.last();
            int kayitsayisid6 = rsd6.getRow();
            if (kayitsayisid6 > 0) {
                btn_d6.setText("DOLU");
                btn_d6.setBackground(Color.RED);
            } else {
                btn_d6.setText("BOŞ-KAT 3 /D6");
                btn_d6.setBackground(Color.YELLOW);
            }

            rsd7 = std7.executeQuery("select * from araclar where yerler='KAT 3 /D7' and giris_cikis='1'");
            rsd7.last();
            int kayitsayisid7 = rsd7.getRow();
            if (kayitsayisid7 > 0) {
                btn_d7.setText("DOLU");
                btn_d7.setBackground(Color.RED);
            } else {
                btn_d7.setText("BOŞ-KAT 3 /D7");
                btn_d7.setBackground(Color.YELLOW);
            }

            rsd8 = std8.executeQuery("select * from araclar where yerler='KAT 3 /D8' and giris_cikis='1'");
            rsd8.last();
            int kayitsayisid8 = rsd8.getRow();
            if (kayitsayisid8 > 0) {
                btn_d8.setText("DOLU");
                btn_d8.setBackground(Color.RED);
            } else {
                btn_d8.setText("BOŞ-KAT 3 /D8");
                btn_d8.setBackground(Color.YELLOW);
            }

            rsd9 = std9.executeQuery("select * from araclar where yerler='KAT 3 /D9' and giris_cikis='1'");
            rsd9.last();
            int kayitsayisid9 = rsd9.getRow();
            if (kayitsayisid9 > 0) {
                btn_d9.setText("DOLU");
                btn_d9.setBackground(Color.RED);
            } else {
                btn_d9.setText("BOŞ-KAT 3 /D9");
                btn_d9.setBackground(Color.YELLOW);
            }

            rsd10 = std10.executeQuery("select * from araclar where yerler='KAT 3 /D10' and giris_cikis='1'");
            rsd10.last();
            int kayitsayisid10 = rsd10.getRow();
            if (kayitsayisid10 > 0) {
                btn_d10.setText("DOLU");
                btn_d10.setBackground(Color.RED);
            } else {
                btn_d10.setText("BOŞ-KAT 3 /D10");
                btn_d10.setBackground(Color.YELLOW);
            }

            rsd11 = std11.executeQuery("select * from araclar where yerler='KAT 3 /D11' and giris_cikis='1'");
            rsd11.last();
            int kayitsayisid11 = rsd11.getRow();
            if (kayitsayisid11 > 0) {
                btn_d11.setText("DOLU");
                btn_d11.setBackground(Color.RED);
            } else {
                btn_d11.setText("BOŞ-KAT 3 /D11");
                btn_d11.setBackground(Color.YELLOW);
            }

            rsd12 = std12.executeQuery("select * from araclar where yerler='KAT 3 /D12' and giris_cikis='1'");
            rsd12.last();
            int kayitsayisid12 = rsd12.getRow();
            if (kayitsayisid12 > 0) {
                btn_d12.setText("DOLU");
                btn_d12.setBackground(Color.RED);
            } else {
                btn_d12.setText("BOŞ-KAT 3 /D12");
                btn_d12.setBackground(Color.YELLOW);
            }

            //KAT 3 SON
            
            
            
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

        btn_a3 = new javax.swing.JButton();
        btn_a2 = new javax.swing.JButton();
        btn_a4 = new javax.swing.JButton();
        btn_a7 = new javax.swing.JButton();
        btn_a1 = new javax.swing.JButton();
        btn_a5 = new javax.swing.JButton();
        btn_a12 = new javax.swing.JButton();
        btn_a6 = new javax.swing.JButton();
        btn_a10 = new javax.swing.JButton();
        btn_a8 = new javax.swing.JButton();
        btn_a11 = new javax.swing.JButton();
        btn_a9 = new javax.swing.JButton();
        btn_b3 = new javax.swing.JButton();
        btn_b2 = new javax.swing.JButton();
        btn_b4 = new javax.swing.JButton();
        btn_b7 = new javax.swing.JButton();
        btn_b1 = new javax.swing.JButton();
        btn_b5 = new javax.swing.JButton();
        btn_b12 = new javax.swing.JButton();
        btn_b6 = new javax.swing.JButton();
        btn_b10 = new javax.swing.JButton();
        btn_b8 = new javax.swing.JButton();
        btn_b11 = new javax.swing.JButton();
        btn_b9 = new javax.swing.JButton();
        btn_c12 = new javax.swing.JButton();
        btn_d5 = new javax.swing.JButton();
        btn_c5 = new javax.swing.JButton();
        btn_d1 = new javax.swing.JButton();
        btn_d7 = new javax.swing.JButton();
        btn_c7 = new javax.swing.JButton();
        btn_d4 = new javax.swing.JButton();
        btn_c4 = new javax.swing.JButton();
        btn_d2 = new javax.swing.JButton();
        btn_c2 = new javax.swing.JButton();
        btn_d3 = new javax.swing.JButton();
        btn_d9 = new javax.swing.JButton();
        btn_c3 = new javax.swing.JButton();
        btn_c9 = new javax.swing.JButton();
        btn_d11 = new javax.swing.JButton();
        btn_c11 = new javax.swing.JButton();
        btn_d8 = new javax.swing.JButton();
        btn_c8 = new javax.swing.JButton();
        btn_d10 = new javax.swing.JButton();
        btn_c10 = new javax.swing.JButton();
        btn_d6 = new javax.swing.JButton();
        btn_c6 = new javax.swing.JButton();
        btn_d12 = new javax.swing.JButton();
        btn_c1 = new javax.swing.JButton();
        baslik = new javax.swing.JLabel();
        btn_Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Arayuz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_a3.setBackground(new java.awt.Color(0, 255, 255));
        btn_a3.setText("KAT 0 / A3");
        btn_a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 98, 168, 85));

        btn_a2.setBackground(new java.awt.Color(0, 255, 255));
        btn_a2.setText("KAT 0 / A2");
        btn_a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 98, 168, 85));

        btn_a4.setBackground(new java.awt.Color(0, 255, 255));
        btn_a4.setText("KAT 0 / A4");
        btn_a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 98, 168, 85));

        btn_a7.setBackground(new java.awt.Color(0, 255, 255));
        btn_a7.setText("KAT 0 / A7");
        btn_a7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 196, 168, 85));

        btn_a1.setBackground(new java.awt.Color(0, 255, 255));
        btn_a1.setText("KAT 0 /A1");
        btn_a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 98, 168, 85));

        btn_a5.setBackground(new java.awt.Color(0, 255, 255));
        btn_a5.setText("KAT 0 / A5");
        btn_a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 201, 168, 85));

        btn_a12.setBackground(new java.awt.Color(0, 255, 255));
        btn_a12.setText("KAT 0 / A12");
        btn_a12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 299, 168, 85));

        btn_a6.setBackground(new java.awt.Color(0, 255, 255));
        btn_a6.setText("KAT 0 / A6");
        btn_a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 196, 168, 85));

        btn_a10.setBackground(new java.awt.Color(0, 255, 255));
        btn_a10.setText("KAT 0 / A10");
        btn_a10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a10, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 299, 168, 85));

        btn_a8.setBackground(new java.awt.Color(0, 255, 255));
        btn_a8.setText("KAT 0 / A8");
        btn_a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 201, 168, 85));

        btn_a11.setBackground(new java.awt.Color(0, 255, 255));
        btn_a11.setText("KAT 0 / A11");
        btn_a11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 299, 168, 85));

        btn_a9.setBackground(new java.awt.Color(0, 255, 255));
        btn_a9.setText("KAT 0 / A9");
        btn_a9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 299, 168, 85));

        btn_b3.setBackground(new java.awt.Color(255, 255, 0));
        btn_b3.setText("KAT 1 / B3");
        btn_b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 98, 168, 85));

        btn_b2.setBackground(new java.awt.Color(255, 255, 0));
        btn_b2.setText("KAT 1 / B2");
        btn_b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 98, 168, 85));

        btn_b4.setBackground(new java.awt.Color(255, 255, 0));
        btn_b4.setText("KAT 1 / B4");
        btn_b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1283, 98, 168, 85));

        btn_b7.setBackground(new java.awt.Color(255, 255, 0));
        btn_b7.setText("KAT 1 / B7");
        btn_b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 201, 168, 85));

        btn_b1.setBackground(new java.awt.Color(255, 255, 0));
        btn_b1.setText("KAT 1 / B1");
        btn_b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 98, 168, 85));

        btn_b5.setBackground(new java.awt.Color(255, 255, 0));
        btn_b5.setText("KAT 1 / B5");
        btn_b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 201, 168, 85));

        btn_b12.setBackground(new java.awt.Color(255, 255, 0));
        btn_b12.setText("KAT 1 / B12");
        btn_b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1283, 299, 168, 85));

        btn_b6.setBackground(new java.awt.Color(255, 255, 0));
        btn_b6.setText("KAT 1 / B6");
        btn_b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 201, 168, 85));

        btn_b10.setBackground(new java.awt.Color(255, 255, 0));
        btn_b10.setText("KAT 1 / B10");
        btn_b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 299, 168, 85));

        btn_b8.setBackground(new java.awt.Color(255, 255, 0));
        btn_b8.setText("KAT 1 / B8");
        btn_b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1283, 201, 168, 85));

        btn_b11.setBackground(new java.awt.Color(255, 255, 0));
        btn_b11.setText("KAT 1 / B11");
        btn_b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 299, 168, 85));

        btn_b9.setBackground(new java.awt.Color(255, 255, 0));
        btn_b9.setText("KAT 1 / B9");
        btn_b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 299, 168, 85));

        btn_c12.setBackground(new java.awt.Color(255, 0, 255));
        btn_c12.setText("KAT 2 / C12");
        btn_c12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c12, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 665, 173, 85));

        btn_d5.setBackground(new java.awt.Color(204, 204, 204));
        btn_d5.setText("KAT 3 / D5");
        btn_d5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d5, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 567, 168, 85));

        btn_c5.setBackground(new java.awt.Color(255, 0, 255));
        btn_c5.setText("KAT 2 / C5");
        btn_c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 567, 168, 85));

        btn_d1.setBackground(new java.awt.Color(204, 204, 204));
        btn_d1.setText("KAT 3 / D1");
        btn_d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 464, 168, 85));

        btn_d7.setBackground(new java.awt.Color(204, 204, 204));
        btn_d7.setText("KAT 3 / D7");
        btn_d7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 567, 168, 85));

        btn_c7.setBackground(new java.awt.Color(255, 0, 255));
        btn_c7.setText("KAT 2 / C7");
        btn_c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 567, 168, 85));

        btn_d4.setBackground(new java.awt.Color(204, 204, 204));
        btn_d4.setText("KAT 3 / D4");
        btn_d4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1288, 464, 163, 85));

        btn_c4.setBackground(new java.awt.Color(255, 0, 255));
        btn_c4.setText("KAT 2 / C4");
        btn_c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 464, 173, 85));

        btn_d2.setBackground(new java.awt.Color(204, 204, 204));
        btn_d2.setText("KAT 3 / D2");
        btn_d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 464, 168, 85));

        btn_c2.setBackground(new java.awt.Color(255, 0, 255));
        btn_c2.setText("KAT 2 / C2");
        btn_c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 464, 168, 85));

        btn_d3.setBackground(new java.awt.Color(204, 204, 204));
        btn_d3.setText("KAT 3 / D3");
        btn_d3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 464, 168, 85));

        btn_d9.setBackground(new java.awt.Color(204, 204, 204));
        btn_d9.setText("KAT 3 / D9");
        btn_d9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d9, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 665, 168, 85));

        btn_c3.setBackground(new java.awt.Color(255, 0, 255));
        btn_c3.setText("KAT 2 / C3");
        btn_c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 464, 168, 85));

        btn_c9.setBackground(new java.awt.Color(255, 0, 255));
        btn_c9.setText("KAT 2 / C9");
        btn_c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 665, 168, 85));

        btn_d11.setBackground(new java.awt.Color(204, 204, 204));
        btn_d11.setText("KAT 3 / D11");
        btn_d11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 660, 168, 85));

        btn_c11.setBackground(new java.awt.Color(255, 0, 255));
        btn_c11.setText("KAT 2 / C11");
        btn_c11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 665, 168, 85));

        btn_d8.setBackground(new java.awt.Color(204, 204, 204));
        btn_d8.setText("KAT 3 / D8");
        btn_d8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1288, 567, 163, 85));

        btn_c8.setBackground(new java.awt.Color(255, 0, 255));
        btn_c8.setText("KAT 2 / C8");
        btn_c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 567, 173, 85));

        btn_d10.setBackground(new java.awt.Color(204, 204, 204));
        btn_d10.setText("KAT 3 / D10");
        btn_d10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d10, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 665, 168, 85));

        btn_c10.setBackground(new java.awt.Color(255, 0, 255));
        btn_c10.setText("KAT 2 / C10");
        btn_c10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c10, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 665, 168, 85));

        btn_d6.setBackground(new java.awt.Color(204, 204, 204));
        btn_d6.setText("KAT 3 / D6");
        btn_d6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d6, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 567, 168, 85));

        btn_c6.setBackground(new java.awt.Color(255, 0, 255));
        btn_c6.setText("KAT 2 / C6");
        btn_c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 567, 168, 85));

        btn_d12.setBackground(new java.awt.Color(204, 204, 204));
        btn_d12.setText("KAT 3 / D12");
        btn_d12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 660, 163, 85));

        btn_c1.setBackground(new java.awt.Color(255, 0, 255));
        btn_c1.setText("KAT 2 / C1");
        btn_c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 464, 168, 85));

        baslik.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        baslik.setText("91 OTOPARK ");
        getContentPane().add(baslik, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 0, -1, 37));

        btn_Back.setBackground(new java.awt.Color(255, 255, 255));
        btn_Back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Back.setText("<--");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("KAT 0 A BLOK PARK ALANI ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 464, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("KAT 1 B BLOK PARK ALANI ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 58, 464, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("KAT 3 D BLOK PARK ALANI ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 424, 464, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("KAT 2 C BLOK PARK ALANI ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 424, 464, -1));

        Arayuz.setIcon(new javax.swing.ImageIcon("C:\\Users\\hasan\\Desktop\\icon\\denz.1.jpg")); // NOI18N
        getContentPane().add(Arayuz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1460, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a3ActionPerformed

    }//GEN-LAST:event_btn_a3ActionPerformed

    private void btn_a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a2ActionPerformed

    }//GEN-LAST:event_btn_a2ActionPerformed

    private void btn_a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a4ActionPerformed

    }//GEN-LAST:event_btn_a4ActionPerformed

    private void btn_a7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a7ActionPerformed

    }//GEN-LAST:event_btn_a7ActionPerformed

    private void btn_a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a1ActionPerformed

    }//GEN-LAST:event_btn_a1ActionPerformed

    private void btn_a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a5ActionPerformed

    }//GEN-LAST:event_btn_a5ActionPerformed

    private void btn_a12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a12ActionPerformed

    }//GEN-LAST:event_btn_a12ActionPerformed

    private void btn_a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a6ActionPerformed

    }//GEN-LAST:event_btn_a6ActionPerformed

    private void btn_a10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a10ActionPerformed

    }//GEN-LAST:event_btn_a10ActionPerformed

    private void btn_a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a8ActionPerformed

    }//GEN-LAST:event_btn_a8ActionPerformed

    private void btn_a11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a11ActionPerformed

    }//GEN-LAST:event_btn_a11ActionPerformed

    private void btn_a9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a9ActionPerformed

    }//GEN-LAST:event_btn_a9ActionPerformed

    private void btn_b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b3ActionPerformed

    }//GEN-LAST:event_btn_b3ActionPerformed

    private void btn_b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b2ActionPerformed

    }//GEN-LAST:event_btn_b2ActionPerformed

    private void btn_b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b4ActionPerformed

    }//GEN-LAST:event_btn_b4ActionPerformed

    private void btn_b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b7ActionPerformed

    }//GEN-LAST:event_btn_b7ActionPerformed

    private void btn_b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b1ActionPerformed

    }//GEN-LAST:event_btn_b1ActionPerformed

    private void btn_b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b5ActionPerformed

    }//GEN-LAST:event_btn_b5ActionPerformed

    private void btn_b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b12ActionPerformed

    }//GEN-LAST:event_btn_b12ActionPerformed

    private void btn_b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b6ActionPerformed

    }//GEN-LAST:event_btn_b6ActionPerformed

    private void btn_b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b10ActionPerformed

    }//GEN-LAST:event_btn_b10ActionPerformed

    private void btn_b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b8ActionPerformed

    }//GEN-LAST:event_btn_b8ActionPerformed

    private void btn_b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b11ActionPerformed

    }//GEN-LAST:event_btn_b11ActionPerformed

    private void btn_b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b9ActionPerformed

    }//GEN-LAST:event_btn_b9ActionPerformed

    private void btn_c12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c12ActionPerformed

    }//GEN-LAST:event_btn_c12ActionPerformed

    private void btn_d5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d5ActionPerformed

    }//GEN-LAST:event_btn_d5ActionPerformed

    private void btn_c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c5ActionPerformed

    }//GEN-LAST:event_btn_c5ActionPerformed

    private void btn_d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d1ActionPerformed

    }//GEN-LAST:event_btn_d1ActionPerformed

    private void btn_d7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d7ActionPerformed

    }//GEN-LAST:event_btn_d7ActionPerformed

    private void btn_c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c7ActionPerformed

    }//GEN-LAST:event_btn_c7ActionPerformed

    private void btn_d4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d4ActionPerformed

    }//GEN-LAST:event_btn_d4ActionPerformed

    private void btn_c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c4ActionPerformed

    }//GEN-LAST:event_btn_c4ActionPerformed

    private void btn_d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d2ActionPerformed

    }//GEN-LAST:event_btn_d2ActionPerformed

    private void btn_c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c2ActionPerformed

    }//GEN-LAST:event_btn_c2ActionPerformed

    private void btn_d3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d3ActionPerformed

    }//GEN-LAST:event_btn_d3ActionPerformed

    private void btn_d9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d9ActionPerformed

    }//GEN-LAST:event_btn_d9ActionPerformed

    private void btn_c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c3ActionPerformed

    }//GEN-LAST:event_btn_c3ActionPerformed

    private void btn_c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c9ActionPerformed

    }//GEN-LAST:event_btn_c9ActionPerformed

    private void btn_d11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d11ActionPerformed

    }//GEN-LAST:event_btn_d11ActionPerformed

    private void btn_c11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c11ActionPerformed

    }//GEN-LAST:event_btn_c11ActionPerformed

    private void btn_d8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d8ActionPerformed

    }//GEN-LAST:event_btn_d8ActionPerformed

    private void btn_c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c8ActionPerformed

    }//GEN-LAST:event_btn_c8ActionPerformed

    private void btn_d10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d10ActionPerformed

    }//GEN-LAST:event_btn_d10ActionPerformed

    private void btn_c10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c10ActionPerformed

    }//GEN-LAST:event_btn_c10ActionPerformed

    private void btn_d6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d6ActionPerformed

    }//GEN-LAST:event_btn_d6ActionPerformed

    private void btn_c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c6ActionPerformed

    }//GEN-LAST:event_btn_c6ActionPerformed

    private void btn_d12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d12ActionPerformed

    }//GEN-LAST:event_btn_d12ActionPerformed

    private void btn_c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c1ActionPerformed

    }//GEN-LAST:event_btn_c1ActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        this.setVisible(false);  // register ekranını kapatıyoruz
        new Giris().setVisible(true);// login ekranını tekrar açıyoruz.
    }//GEN-LAST:event_btn_BackActionPerformed

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
            java.util.logging.Logger.getLogger(musteri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(musteri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(musteri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(musteri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new musteri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Arayuz;
    private javax.swing.JLabel baslik;
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_a1;
    private javax.swing.JButton btn_a10;
    private javax.swing.JButton btn_a11;
    private javax.swing.JButton btn_a12;
    private javax.swing.JButton btn_a2;
    private javax.swing.JButton btn_a3;
    private javax.swing.JButton btn_a4;
    private javax.swing.JButton btn_a5;
    private javax.swing.JButton btn_a6;
    private javax.swing.JButton btn_a7;
    private javax.swing.JButton btn_a8;
    private javax.swing.JButton btn_a9;
    private javax.swing.JButton btn_b1;
    private javax.swing.JButton btn_b10;
    private javax.swing.JButton btn_b11;
    private javax.swing.JButton btn_b12;
    private javax.swing.JButton btn_b2;
    private javax.swing.JButton btn_b3;
    private javax.swing.JButton btn_b4;
    private javax.swing.JButton btn_b5;
    private javax.swing.JButton btn_b6;
    private javax.swing.JButton btn_b7;
    private javax.swing.JButton btn_b8;
    private javax.swing.JButton btn_b9;
    private javax.swing.JButton btn_c1;
    private javax.swing.JButton btn_c10;
    private javax.swing.JButton btn_c11;
    private javax.swing.JButton btn_c12;
    private javax.swing.JButton btn_c2;
    private javax.swing.JButton btn_c3;
    private javax.swing.JButton btn_c4;
    private javax.swing.JButton btn_c5;
    private javax.swing.JButton btn_c6;
    private javax.swing.JButton btn_c7;
    private javax.swing.JButton btn_c8;
    private javax.swing.JButton btn_c9;
    private javax.swing.JButton btn_d1;
    private javax.swing.JButton btn_d10;
    private javax.swing.JButton btn_d11;
    private javax.swing.JButton btn_d12;
    private javax.swing.JButton btn_d2;
    private javax.swing.JButton btn_d3;
    private javax.swing.JButton btn_d4;
    private javax.swing.JButton btn_d5;
    private javax.swing.JButton btn_d6;
    private javax.swing.JButton btn_d7;
    private javax.swing.JButton btn_d8;
    private javax.swing.JButton btn_d9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
private void Seticon() {
          setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("91siyah.png")));   
    }
}
