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
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author hasan
 */
public class Parket_Cikar extends javax.swing.JFrame {

    /**
     * Creates new form Parket_Cikar
     */
    public Parket_Cikar() {
        initComponents();
       Seticon();
        this.setLocationRelativeTo(null);

        try{
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3,st4,st5,st6,st7,st8,st9,st10,st11,st12,stb,stb2,stb3,stb4,stb5,stb6,stb7,stb8,stb9,stb10,stb11,stb12
                   ,stc,stc2,stc3,stc4,stc5,stc6,stc7,stc8,stc9,stc10,stc11,stc12,std,std2,std3,std4,std5,std6,std7,std8,std9,std10,std11,std12 = null;
            ResultSet rs,rs2,rs3,rs4,rs5,rs6,rs7,rs8,rs9,rs10,rs11,rs12,rsb,rsb2,rsb3,rsb4,rsb5,rsb6,rsb7,rsb8,rsb9,rsb10,rsb11,rsb12
                   ,rsc,rsc2,rsc3,rsc4,rsc5,rsc6,rsc7,rsc8,rsc9,rsc10,rsc11,rsc12,rsd,rsd2,rsd3,rsd4,rsd5,rsd6,rsd7,rsd8,rsd9,rsd10,rsd11,rsd12 = null;


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
                btn_a1.setText(rs.getString("plaka"));
                btn_a1.setBackground(Color.RED);             
            }
            else {
                btn_a1.setBackground(Color.YELLOW);
            }
            
            rs2 = st2.executeQuery("select * from araclar where yerler='KAT 0 /A2' and giris_cikis='1'");
            rs2.last();
            int kayitsayisi2 = rs2.getRow();            
            if(kayitsayisi2 > 0){                
                btn_a2.setText(rs2.getString("plaka"));
                btn_a2.setBackground(Color.RED);                
            }
            else {
                btn_a2.setBackground(Color.YELLOW);
            }
                
            
            rs3 = st3.executeQuery("select * from araclar where yerler='KAT 0 /A3' and giris_cikis='1'");
            rs3.last();
            int kayitsayisi3 = rs3.getRow();            
            if(kayitsayisi3 > 0){                
                btn_a3.setText(rs3.getString("plaka"));
                btn_a3.setBackground(Color.RED);             
            }
            else {
                btn_a3.setBackground(Color.YELLOW);
            }
            
            rs4 = st4.executeQuery("select * from araclar where yerler='KAT 0 /A4' and giris_cikis='1'");
            rs4.last();
            int kayitsayisi4 = rs4.getRow();            
            if(kayitsayisi4 > 0){                
                btn_a4.setText(rs4.getString("plaka"));
                btn_a4.setBackground(Color.RED);             
            }
            else {
                btn_a4.setBackground(Color.YELLOW);
            }
            
            rs5 = st5.executeQuery("select * from araclar where yerler='KAT 0 /A5' and giris_cikis='1'");
            rs5.last();
            int kayitsayisi5 = rs5.getRow();            
            if(kayitsayisi5 > 0){                
                btn_a5.setText(rs5.getString("plaka"));
                btn_a5.setBackground(Color.RED);             
            }
            else {
                btn_a5.setBackground(Color.YELLOW);
            }
            
            rs6 = st6.executeQuery("select * from araclar where yerler='KAT 0 /A6' and giris_cikis='1'");
            rs6.last();
            int kayitsayisi6 = rs6.getRow();            
            if(kayitsayisi6 > 0){                
                btn_a6.setText(rs6.getString("plaka"));
                btn_a6.setBackground(Color.RED);             
            }
            else {
                btn_a6.setBackground(Color.YELLOW);
            }
            
            rs7 = st7.executeQuery("select * from araclar where yerler='KAT 0 /A7' and giris_cikis='1'");
            rs7.last();
            int kayitsayisi7 = rs7.getRow();            
            if(kayitsayisi7 > 0){                
                btn_a7.setText(rs7.getString("plaka"));
                btn_a7.setBackground(Color.RED);             
            }
            else {
                btn_a7.setBackground(Color.YELLOW);
            }
            
            rs8 = st8.executeQuery("select * from araclar where yerler='KAT 0 /A8' and giris_cikis='1'");
            rs8.last();
            int kayitsayisi8 = rs8.getRow();            
            if(kayitsayisi8 > 0){                
                btn_a8.setText(rs8.getString("plaka"));
                btn_a8.setBackground(Color.RED);             
            }
            else {
                btn_a8.setBackground(Color.YELLOW);
            }
            
            rs9 = st9.executeQuery("select * from araclar where yerler='KAT 0 /A9' and giris_cikis='1'");
            rs9.last();
            int kayitsayisi9 = rs9.getRow();            
            if(kayitsayisi9 > 0){                
                btn_a9.setText(rs9.getString("plaka"));
                btn_a9.setBackground(Color.RED);             
            }
            else {
                btn_a9.setBackground(Color.YELLOW);
            }
            
            rs10 = st10.executeQuery("select * from araclar where yerler='KAT 0 /A10' and giris_cikis='1'");
            rs10.last();
            int kayitsayisi10 = rs10.getRow();            
            if(kayitsayisi10 > 0){                
                btn_a10.setText(rs10.getString("plaka"));
                btn_a10.setBackground(Color.RED);             
            }
            else {
                btn_a10.setBackground(Color.YELLOW);
            }
            
            rs11 = st11.executeQuery("select * from araclar where yerler='KAT 0 /A11' and giris_cikis='1'");
            rs11.last();
            int kayitsayisi11 = rs11.getRow();            
            if(kayitsayisi11 > 0){                
                btn_a11.setText(rs11.getString("plaka"));
                btn_a11.setBackground(Color.RED);             
            }
            else {
                btn_a11.setBackground(Color.YELLOW);
            }
            
            rs12 = st12.executeQuery("select * from araclar where yerler='KAT 0 /A12' and giris_cikis='1'");
            rs12.last();
            int kayitsayisi12 = rs12.getRow();            
            if(kayitsayisi12 > 0){                
                btn_a12.setText(rs12.getString("plaka"));
                btn_a12.setBackground(Color.RED);             
            }
            else {
                btn_a12.setBackground(Color.YELLOW);
            }
            
            
            
            //KAT 0 SON
            
            
            
                  
            rsb = stb.executeQuery("select * from araclar where yerler='KAT 1 /B1' and giris_cikis='1'");
            rsb.last();
            int kayitsayisib = rsb.getRow();            
            if(kayitsayisib > 0){                
                btn_b1.setText(rsb.getString("plaka"));
                btn_b1.setBackground(Color.RED);             
            }
            else {
                btn_b1.setBackground(Color.YELLOW);
            }
            
            rsb2 = stb2.executeQuery("select * from araclar where yerler='KAT 1 /B2' and giris_cikis='1'");
            rsb2.last();
            int kayitsayisib2 = rsb2.getRow();            
            if(kayitsayisib2 > 0){                
                btn_b2.setText(rsb2.getString("plaka"));
                btn_b2.setBackground(Color.RED);                
            }
            else {
                btn_b2.setBackground(Color.YELLOW);
            }
                
            
            rsb3 = stb3.executeQuery("select * from araclar where yerler='KAT 1 /B3' and giris_cikis='1'");
            rsb3.last();
            int kayitsayisib3 = rsb3.getRow();            
            if(kayitsayisib3 > 0){                
                btn_b3.setText(rsb3.getString("plaka"));
                btn_b3.setBackground(Color.RED);             
            }
            else {
                btn_b3.setBackground(Color.YELLOW);
            }
            
            rsb4 = stb4.executeQuery("select * from araclar where yerler='KAT 1 /B4' and giris_cikis='1'");
            rsb4.last();
            int kayitsayisib4 = rsb4.getRow();            
            if(kayitsayisib4 > 0){                
                btn_b4.setText(rsb4.getString("plaka"));
                btn_b4.setBackground(Color.RED);             
            }
            else {
                btn_b4.setBackground(Color.YELLOW);
            }
            
            rsb5 = stb5.executeQuery("select * from araclar where yerler='KAT 1 /B5' and giris_cikis='1'");
            rsb5.last();
            int kayitsayisib5 = rsb5.getRow();            
            if(kayitsayisib5 > 0){                
                btn_a5.setText(rsb5.getString("plaka"));
                btn_a5.setBackground(Color.RED);             
            }
            else {
                btn_a5.setBackground(Color.YELLOW);
            }
            
            rsb6 = stb6.executeQuery("select * from araclar where yerler='KAT 1 /B6' and giris_cikis='1'");
            rsb6.last();
            int kayitsayisib6 = rsb6.getRow();            
            if(kayitsayisib6 > 0){                
                btn_b6.setText(rsb6.getString("plaka"));
                btn_b6.setBackground(Color.RED);             
            }
            else {
                btn_b6.setBackground(Color.YELLOW);
            }
            
            rsb7 = stb7.executeQuery("select * from araclar where yerler='KAT 1 /B7' and giris_cikis='1'");
            rsb7.last();
            int kayitsayisib7 = rsb7.getRow();            
            if(kayitsayisib7 > 0){                
                btn_b7.setText(rsb7.getString("plaka"));
                btn_b7.setBackground(Color.RED);             
            }
            else {
                btn_b7.setBackground(Color.YELLOW);
            }
            
            rsb8 = stb8.executeQuery("select * from araclar where yerler='KAT 1 /B8' and giris_cikis='1'");
            rsb8.last();
            int kayitsayisib8 = rsb8.getRow();            
            if(kayitsayisib8 > 0){                
                btn_b8.setText(rsb8.getString("plaka"));
                btn_b8.setBackground(Color.RED);             
            }
            else {
                btn_b8.setBackground(Color.YELLOW);
            }
            
            rsb9 = stb9.executeQuery("select * from araclar where yerler='KAT 1 /B9' and giris_cikis='1'");
            rsb9.last();
            int kayitsayisib9 = rsb9.getRow();            
            if(kayitsayisib9 > 0){                
                btn_a9.setText(rsb9.getString("plaka"));
                btn_a9.setBackground(Color.RED);             
            }
            else {
                btn_a9.setBackground(Color.YELLOW);
            }
            
            rsb10 = stb10.executeQuery("select * from araclar where yerler='KAT 1 /B10' and giris_cikis='1'");
            rsb10.last();
            int kayitsayisib10 = rsb10.getRow();            
            if(kayitsayisib10 > 0){                
                btn_b10.setText(rsb10.getString("plaka"));
                btn_b10.setBackground(Color.RED);             
            }
            else {
                btn_b10.setBackground(Color.YELLOW);
            }
            
            rsb11 = stb11.executeQuery("select * from araclar where yerler='KAT 1 /B11' and giris_cikis='1'");
            rsb11.last();
            int kayitsayisib11 = rsb11.getRow();            
            if(kayitsayisib11 > 0){                
                btn_b11.setText(rsb11.getString("plaka"));
                btn_b11.setBackground(Color.RED);             
            }
            else {
                btn_b11.setBackground(Color.YELLOW);
            }
            
            rsb12 = stb12.executeQuery("select * from araclar where yerler='KAT 1 /B12' and giris_cikis='1'");
            rsb12.last();
            int kayitsayisib12 = rsb12.getRow();            
            if(kayitsayisib12 > 0){                
                btn_b12.setText(rsb12.getString("plaka"));
                btn_b12.setBackground(Color.RED);             
            }
            else {
                btn_b12.setBackground(Color.YELLOW);
            }
            
            //kat 1 son
            
              
            rsc = stc.executeQuery("select * from araclar where yerler='KAT 2 /C1' and giris_cikis='1'");
            rsc.last();
            int kayitsayisic = rsc.getRow();            
            if(kayitsayisic > 0){                
                btn_c1.setText(rsc.getString("plaka"));
                btn_c1.setBackground(Color.RED);             
            }
            else {
                btn_c1.setBackground(Color.YELLOW);
            }
            
            rsc2 = stc2.executeQuery("select * from araclar where yerler='KAT 2 /C2' and giris_cikis='1'");
            rsc2.last();
            int kayitsayisic2 = rsc2.getRow();            
            if(kayitsayisic2 > 0){                
                btn_c2.setText(rsc2.getString("plaka"));
                btn_c2.setBackground(Color.RED);                
            }
            else {
                btn_c2.setBackground(Color.YELLOW);
            }
                
            
            rsc3 = stc3.executeQuery("select * from araclar where yerler='KAT 2 /C3' and giris_cikis='1'");
            rsc3.last();
            int kayitsayisic3 = rsc3.getRow();            
            if(kayitsayisic3 > 0){                
                btn_c3.setText(rsc3.getString("plaka"));
                btn_c3.setBackground(Color.RED);             
            }
            else {
                btn_c3.setBackground(Color.YELLOW);
            }
            
            rsc4 = stc4.executeQuery("select * from araclar where yerler='KAT 2 /C4' and giris_cikis='1'");
            rsc4.last();
            int kayitsayisic4 = rsc4.getRow();            
            if(kayitsayisic4 > 0){                
                btn_c4.setText(rsc4.getString("plaka"));
                btn_c4.setBackground(Color.RED);             
            }
            else {
                btn_c4.setBackground(Color.YELLOW);
            }
            
            rsc5 = stc5.executeQuery("select * from araclar where yerler='KAT 2 /C5' and giris_cikis='1'");
            rsc5.last();
            int kayitsayisic5 = rsc5.getRow();            
            if(kayitsayisic5 > 0){                
                btn_c5.setText(rsc5.getString("plaka"));
                btn_c5.setBackground(Color.RED);             
            }
            else {
                btn_c5.setBackground(Color.YELLOW);
            }
            
            rsc6 = stc6.executeQuery("select * from araclar where yerler='KAT 2 /C6' and giris_cikis='1'");
            rsc6.last();
            int kayitsayisic6 = rsc6.getRow();            
            if(kayitsayisic6 > 0){                
                btn_c6.setText(rsc6.getString("plaka"));
                btn_c6.setBackground(Color.RED);             
            }
            else {
                btn_c6.setBackground(Color.YELLOW);
            }
            
            rsc7 = stc7.executeQuery("select * from araclar where yerler='KAT 2 /C7' and giris_cikis='1'");
            rsc7.last();
            int kayitsayisic7 = rsc7.getRow();            
            if(kayitsayisic7 > 0){                
                btn_c7.setText(rsc7.getString("plaka"));
                btn_c7.setBackground(Color.RED);             
            }
            else {
                btn_c7.setBackground(Color.YELLOW);
            }
            
            rsc8 = stc8.executeQuery("select * from araclar where yerler='KAT 2 /C8' and giris_cikis='1'");
            rsc8.last();
            int kayitsayisic8 = rsc8.getRow();            
            if(kayitsayisic8 > 0){                
                btn_c8.setText(rsc8.getString("plaka"));
                btn_c8.setBackground(Color.RED);             
            }
            else {
                btn_c8.setBackground(Color.YELLOW);
            }
            
            rsc9 = stc9.executeQuery("select * from araclar where yerler='KAT 2 /C9' and giris_cikis='1'");
            rsc9.last();
            int kayitsayisic9 = rsc9.getRow();            
            if(kayitsayisic9 > 0){                
                btn_c9.setText(rsc9.getString("plaka"));
                btn_c9.setBackground(Color.RED);             
            }
            else {
                btn_c9.setBackground(Color.YELLOW);
            }
            
            rsc10 = stc10.executeQuery("select * from araclar where yerler='KAT 2 /C10' and giris_cikis='1'");
            rsc10.last();
            int kayitsayisic10 = rsc10.getRow();            
            if(kayitsayisic10 > 0){                
                btn_c10.setText(rsc10.getString("plaka"));
                btn_c10.setBackground(Color.RED);             
            }
            else {
                btn_c10.setBackground(Color.YELLOW);
            }
            
            rsc11 = stc11.executeQuery("select * from araclar where yerler='KAT 2 /C11' and giris_cikis='1'");
            rsc11.last();
            int kayitsayisic11 = rsc11.getRow();            
            if(kayitsayisic11 > 0){                
                btn_c11.setText(rsc11.getString("plaka"));
                btn_c11.setBackground(Color.RED);             
            }
            else {
                btn_c11.setBackground(Color.YELLOW);
            }
            
            rsc12 = stc12.executeQuery("select * from araclar where yerler='KAT 2 /C12' and giris_cikis='1'");
            rsc12.last();
            int kayitsayisic12 = rsc12.getRow();            
            if(kayitsayisic12 > 0){                
                btn_c12.setText(rsc12.getString("plaka"));
                btn_c12.setBackground(Color.RED);             
            }
            else {
                btn_c12.setBackground(Color.YELLOW);
            }
            
            
            //kat 2 son 
            
            
            
            
            
            //kat 3 baslangic
            
            
            
            rsd = std.executeQuery("select * from araclar where yerler='KAT 3 /D1' and giris_cikis='1'");
            rsd.last();
            int kayitsayisid = rsd.getRow();            
            if(kayitsayisid > 0){                
                btn_d1.setText(rsd.getString("plaka"));
                btn_d1.setBackground(Color.RED);             
            }
            else {
                btn_d1.setBackground(Color.YELLOW);
            }
            
            rsd2 = std2.executeQuery("select * from araclar where yerler='KAT 3 /D2' and giris_cikis='1'");
            rsd2.last();
            int kayitsayisid2 = rsd2.getRow();            
            if(kayitsayisid2 > 0){                
                btn_d2.setText(rsd2.getString("plaka"));
                btn_d2.setBackground(Color.RED);                
            }
            else {
                btn_d2.setBackground(Color.YELLOW);
            }
                
            
            rsd3 = std3.executeQuery("select * from araclar where yerler='KAT 3 /D3' and giris_cikis='1'");
            rsd3.last();
            int kayitsayisid3 = rsd3.getRow();            
            if(kayitsayisid3 > 0){                
                btn_d3.setText(rsd3.getString("plaka"));
                btn_d3.setBackground(Color.RED);             
            }
            else {
                btn_d3.setBackground(Color.YELLOW);
            }
            
            rsd4 = std4.executeQuery("select * from araclar where yerler='KAT 3 /D4' and giris_cikis='1'");
            rsd4.last();
            int kayitsayisid4 = rsd4.getRow();            
            if(kayitsayisid4 > 0){                
                btn_d4.setText(rsd4.getString("plaka"));
                btn_d4.setBackground(Color.RED);             
            }
            else {
                btn_d4.setBackground(Color.YELLOW);
            }
            
            rsd5 = std5.executeQuery("select * from araclar where yerler='KAT 3 /D5' and giris_cikis='1'");
            rsd5.last();
            int kayitsayisid5 = rsd5.getRow();            
            if(kayitsayisid5 > 0){                
                btn_d5.setText(rsd5.getString("plaka"));
                btn_d5.setBackground(Color.RED);             
            }
            else {
                btn_d5.setBackground(Color.YELLOW);
            }
            
            rsd6 = std6.executeQuery("select * from araclar where yerler='KAT 3 /D6' and giris_cikis='1'");
            rsd6.last();
            int kayitsayisid6 = rsd6.getRow();            
            if(kayitsayisid6 > 0){                
                btn_d6.setText(rsd6.getString("plaka"));
                btn_d6.setBackground(Color.RED);             
            }
            else {
                btn_d6.setBackground(Color.YELLOW);
            }
            
            rsd7 = std7.executeQuery("select * from araclar where yerler='KAT 3 /D7' and giris_cikis='1'");
            rsd7.last();
            int kayitsayisid7 = rsd7.getRow();            
            if(kayitsayisid7 > 0){                
                btn_d7.setText(rsd7.getString("plaka"));
                btn_d7.setBackground(Color.RED);             
            }
            else {
                btn_d7.setBackground(Color.YELLOW);
            }
            
            rsd8 = std8.executeQuery("select * from araclar where yerler='KAT 3 /D8' and giris_cikis='1'");
            rsd8.last();
            int kayitsayisid8 = rsd8.getRow();            
            if(kayitsayisid8 > 0){                
                btn_d8.setText(rsd8.getString("plaka"));
                btn_d8.setBackground(Color.RED);             
            }
            else {
                btn_d8.setBackground(Color.YELLOW);
            }
            
            rsd9 = std9.executeQuery("select * from araclar where yerler='KAT 3 /D9' and giris_cikis='1'");
            rsd9.last();
            int kayitsayisid9 = rsd9.getRow();            
            if(kayitsayisid9 > 0){                
                btn_d9.setText(rsd9.getString("plaka"));
                btn_d9.setBackground(Color.RED);             
            }
            else {
                btn_d9.setBackground(Color.YELLOW);
            }
            
            rsd10 = std10.executeQuery("select * from araclar where yerler='KAT 3 /D10' and giris_cikis='1'");
            rsd10.last();
            int kayitsayisid10 = rsd10.getRow();            
            if(kayitsayisid10 > 0){                
                btn_d10.setText(rsd10.getString("plaka"));
                btn_d10.setBackground(Color.RED);             
            }
            else {
                btn_d10.setBackground(Color.YELLOW);
            }
            
            rsd11 = std11.executeQuery("select * from araclar where yerler='KAT 3 /D11' and giris_cikis='1'");
            rsd11.last();
            int kayitsayisid11 = rsd11.getRow();            
            if(kayitsayisid11 > 0){                
                btn_d11.setText(rsd11.getString("plaka"));
                btn_d11.setBackground(Color.RED);             
            }
            else {
                btn_d11.setBackground(Color.YELLOW);
            }
            
            rsd12 = std12.executeQuery("select * from araclar where yerler='KAT 3 /D12' and giris_cikis='1'");
            rsd12.last();
            int kayitsayisid12 = rsd12.getRow();            
            if(kayitsayisid12 > 0){                
                btn_d12.setText(rsd12.getString("plaka"));
                btn_d12.setBackground(Color.RED);             
            }
            else {
                btn_d12.setBackground(Color.YELLOW);
            }
            
            
            //kat 3 son 
            
            
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

        btn_a1 = new javax.swing.JButton();
        btn_a2 = new javax.swing.JButton();
        btn_a3 = new javax.swing.JButton();
        btn_a4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_a5 = new javax.swing.JButton();
        btn_a6 = new javax.swing.JButton();
        btn_a7 = new javax.swing.JButton();
        btn_a8 = new javax.swing.JButton();
        btn_a9 = new javax.swing.JButton();
        btn_a10 = new javax.swing.JButton();
        btn_a11 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_a12 = new javax.swing.JButton();
        txt_plaka = new javax.swing.JTextField();
        txt_adi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_cep_no = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_ucret = new javax.swing.JTextField();
        txt_yeri = new javax.swing.JTextField();
        txt_türü = new javax.swing.JTextField();
        txt_saat = new javax.swing.JTextField();
        txt_tarih = new javax.swing.JTextField();
        txt_marka = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_arac_id = new javax.swing.JTextField();
        txt_yas = new javax.swing.JTextField();
        btn_b5 = new javax.swing.JButton();
        btn_b1 = new javax.swing.JButton();
        btn_b7 = new javax.swing.JButton();
        btn_b4 = new javax.swing.JButton();
        btn_b2 = new javax.swing.JButton();
        btn_b3 = new javax.swing.JButton();
        btn_d7 = new javax.swing.JButton();
        btn_d1 = new javax.swing.JButton();
        btn_d5 = new javax.swing.JButton();
        btn_b9 = new javax.swing.JButton();
        btn_b11 = new javax.swing.JButton();
        btn_b8 = new javax.swing.JButton();
        btn_b10 = new javax.swing.JButton();
        btn_b6 = new javax.swing.JButton();
        btn_b12 = new javax.swing.JButton();
        btn_d11 = new javax.swing.JButton();
        btn_d9 = new javax.swing.JButton();
        btn_d3 = new javax.swing.JButton();
        btn_d2 = new javax.swing.JButton();
        btn_d4 = new javax.swing.JButton();
        btn_d12 = new javax.swing.JButton();
        btn_d6 = new javax.swing.JButton();
        btn_d10 = new javax.swing.JButton();
        btn_d8 = new javax.swing.JButton();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btn_c5 = new javax.swing.JButton();
        btn_c12 = new javax.swing.JButton();
        btn_c11 = new javax.swing.JButton();
        btn_c9 = new javax.swing.JButton();
        btn_c3 = new javax.swing.JButton();
        btn_c2 = new javax.swing.JButton();
        btn_c4 = new javax.swing.JButton();
        btn_c7 = new javax.swing.JButton();
        btn_c1 = new javax.swing.JButton();
        btn_c6 = new javax.swing.JButton();
        btn_c10 = new javax.swing.JButton();
        btn_c8 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        Arayuz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_a1.setBackground(new java.awt.Color(0, 255, 255));
        btn_a1.setText("KAT 0 /A1");
        btn_a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 43, 104, 85));

        btn_a2.setBackground(new java.awt.Color(0, 255, 255));
        btn_a2.setText("KAT 0 /A2");
        btn_a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 43, 104, 85));

        btn_a3.setBackground(new java.awt.Color(0, 255, 255));
        btn_a3.setText("KAT 0 /A3");
        btn_a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 43, 104, 85));

        btn_a4.setBackground(new java.awt.Color(0, 255, 255));
        btn_a4.setText("KAT 0 /A4");
        btn_a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 43, 104, 85));

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setText("KAPAT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 779, 182, 45));

        btn_a5.setBackground(new java.awt.Color(0, 255, 255));
        btn_a5.setText("KAT 0 /A5");
        btn_a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 135, 104, 85));

        btn_a6.setBackground(new java.awt.Color(0, 255, 255));
        btn_a6.setText("KAT 0 /A6");
        btn_a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 135, 104, 85));

        btn_a7.setBackground(new java.awt.Color(0, 255, 255));
        btn_a7.setText("KAT 0 /A7");
        btn_a7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a7, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 135, 104, 85));

        btn_a8.setBackground(new java.awt.Color(0, 255, 255));
        btn_a8.setText("KAT 0 /A8");
        btn_a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a8, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 135, 104, 85));

        btn_a9.setBackground(new java.awt.Color(0, 255, 255));
        btn_a9.setText("KAT 0 /A9");
        btn_a9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 227, 104, 85));

        btn_a10.setBackground(new java.awt.Color(0, 255, 255));
        btn_a10.setText("KAT 0 /A10");
        btn_a10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a10, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 227, 104, 85));

        btn_a11.setBackground(new java.awt.Color(0, 255, 255));
        btn_a11.setText("KAT 0 /A11");
        btn_a11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a11, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 227, 104, 85));

        jButton2.setText("ARAÇ ÇIKIŞI YAP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 848, 182, 46));

        btn_a12.setBackground(new java.awt.Color(0, 255, 255));
        btn_a12.setText("KAT 0 /A12");
        btn_a12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_a12, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 227, 104, 85));
        getContentPane().add(txt_plaka, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 710, 240, -1));
        getContentPane().add(txt_adi, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 670, 240, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Yeri :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 832, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Ücret :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 872, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Araç Türü :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 779, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Giriş Saati :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 740, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Giriş Tarihi  :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 700, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Cep Telefonu : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 882, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Marka Ve Model :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 750, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Plaka :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 710, -1, -1));
        getContentPane().add(txt_cep_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 882, 240, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Müşteri Adı Soyadı :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 670, -1, -1));
        getContentPane().add(txt_ucret, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 832, 234, -1));
        getContentPane().add(txt_yeri, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 872, 234, -1));
        getContentPane().add(txt_türü, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 790, 234, -1));
        getContentPane().add(txt_saat, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 740, 234, -1));
        getContentPane().add(txt_tarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 700, 234, -1));
        getContentPane().add(txt_marka, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 750, 240, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel19.setText("Araç id : ");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 789, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel20.setText("Araç yaşı : ");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 842, -1, -1));
        getContentPane().add(txt_arac_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 789, 240, -1));
        getContentPane().add(txt_yas, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 842, 240, -1));

        btn_b5.setBackground(new java.awt.Color(255, 255, 0));
        btn_b5.setText("KAT 1 / B5");
        btn_b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 104, 85));

        btn_b1.setBackground(new java.awt.Color(255, 255, 0));
        btn_b1.setText("KAT 1 / B1");
        btn_b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 104, 85));

        btn_b7.setBackground(new java.awt.Color(255, 255, 0));
        btn_b7.setText("KAT 1 / B7");
        btn_b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 104, 85));

        btn_b4.setBackground(new java.awt.Color(255, 255, 0));
        btn_b4.setText("KAT 1 / B4");
        btn_b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 104, 85));

        btn_b2.setBackground(new java.awt.Color(255, 255, 0));
        btn_b2.setText("KAT 1 / B2");
        btn_b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 104, 85));

        btn_b3.setBackground(new java.awt.Color(255, 255, 0));
        btn_b3.setText("KAT 1 / B3");
        btn_b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 104, 85));

        btn_d7.setBackground(new java.awt.Color(0, 255, 255));
        btn_d7.setText("KAT 3 / D7");
        btn_d7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, 104, 85));

        btn_d1.setBackground(new java.awt.Color(0, 255, 255));
        btn_d1.setText("KAT 3 / D1");
        btn_d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 104, 85));

        btn_d5.setBackground(new java.awt.Color(0, 255, 255));
        btn_d5.setText("KAT 3 / D5");
        btn_d5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 104, 85));

        btn_b9.setBackground(new java.awt.Color(255, 255, 0));
        btn_b9.setText("KAT 1 / B9");
        btn_b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 104, 85));

        btn_b11.setBackground(new java.awt.Color(255, 255, 0));
        btn_b11.setText("KAT 1 / B11");
        btn_b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 104, 85));

        btn_b8.setBackground(new java.awt.Color(255, 255, 0));
        btn_b8.setText("KAT 1 / B8");
        btn_b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, 104, 85));

        btn_b10.setBackground(new java.awt.Color(255, 255, 0));
        btn_b10.setText("KAT 1 / B10");
        btn_b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 104, 85));

        btn_b6.setBackground(new java.awt.Color(255, 255, 0));
        btn_b6.setText("KAT 1 / B6");
        btn_b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 104, 85));

        btn_b12.setBackground(new java.awt.Color(255, 255, 0));
        btn_b12.setText("KAT 1 / B12");
        btn_b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 220, 104, 85));

        btn_d11.setBackground(new java.awt.Color(0, 255, 255));
        btn_d11.setText("KAT 3 / D11");
        btn_d11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, 104, 85));

        btn_d9.setBackground(new java.awt.Color(0, 255, 255));
        btn_d9.setText("KAT 3 / D9");
        btn_d9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, 104, 85));

        btn_d3.setBackground(new java.awt.Color(0, 255, 255));
        btn_d3.setText("KAT 3 / D3");
        btn_d3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, 104, 85));

        btn_d2.setBackground(new java.awt.Color(0, 255, 255));
        btn_d2.setText("KAT 3 / D2");
        btn_d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 104, 85));

        btn_d4.setBackground(new java.awt.Color(0, 255, 255));
        btn_d4.setText("KAT 3 / D4");
        btn_d4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 380, 104, 85));

        btn_d12.setBackground(new java.awt.Color(0, 255, 255));
        btn_d12.setText("KAT 3 / D12");
        btn_d12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d12, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 580, 104, 85));

        btn_d6.setBackground(new java.awt.Color(0, 255, 255));
        btn_d6.setText("KAT 3 / D6");
        btn_d6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 104, 85));

        btn_d10.setBackground(new java.awt.Color(0, 255, 255));
        btn_d10.setText("KAT 3 / D10");
        btn_d10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 104, 85));

        btn_d8.setBackground(new java.awt.Color(0, 255, 255));
        btn_d8.setText("KAT 3 / D8");
        btn_d8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_d8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_d8, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 480, 104, 85));

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
        getContentPane().add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, -1, -1));

        jLabelMin2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelMin2.setText("-");
        jLabelMin2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMin2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelMin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, -1, 27));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("91");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("O");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 90, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("T");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 150, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("O");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 220, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("P");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 290, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("A");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 350, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("R");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 420, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("K");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 490, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("KAT 1 B BLOK PARK ALANI ");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 360, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("KAT 3 D BLOK PARK ALANI ");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 464, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("KAT 0 A BLOK PARK ALANI ");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 460, -1));

        btn_c5.setBackground(new java.awt.Color(255, 0, 255));
        btn_c5.setText("KAT 2 / C5");
        btn_c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 104, 85));

        btn_c12.setBackground(new java.awt.Color(255, 0, 255));
        btn_c12.setText("KAT 2 / C12");
        btn_c12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 104, 85));

        btn_c11.setBackground(new java.awt.Color(255, 0, 255));
        btn_c11.setText("KAT 2 / C11");
        btn_c11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 104, 85));

        btn_c9.setBackground(new java.awt.Color(255, 0, 255));
        btn_c9.setText("KAT 2 / C9");
        btn_c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 104, 85));

        btn_c3.setBackground(new java.awt.Color(255, 0, 255));
        btn_c3.setText("KAT 2 / C3");
        btn_c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 104, 85));

        btn_c2.setBackground(new java.awt.Color(255, 0, 255));
        btn_c2.setText("KAT 2 / C2");
        btn_c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 104, 85));

        btn_c4.setBackground(new java.awt.Color(255, 0, 255));
        btn_c4.setText("KAT 2 / C4");
        btn_c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 104, 85));

        btn_c7.setBackground(new java.awt.Color(255, 0, 255));
        btn_c7.setText("KAT 2 / C7");
        btn_c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 104, 85));

        btn_c1.setBackground(new java.awt.Color(255, 0, 255));
        btn_c1.setText("KAT 2 / C1");
        btn_c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 104, 85));

        btn_c6.setBackground(new java.awt.Color(255, 0, 255));
        btn_c6.setText("KAT 2 / C6");
        btn_c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 104, 85));

        btn_c10.setBackground(new java.awt.Color(255, 0, 255));
        btn_c10.setText("KAT 2 / C10");
        btn_c10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 104, 85));

        btn_c8.setBackground(new java.awt.Color(255, 0, 255));
        btn_c8.setText("KAT 2 / C8");
        btn_c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 104, 85));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("KAT 2 C BLOK PARK ALANI ");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 455, -1));

        Arayuz.setIcon(new javax.swing.ImageIcon("C:\\Users\\hasan\\Desktop\\icon\\denz.1.jpg")); // NOI18N
        getContentPane().add(Arayuz, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1130, 940));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a1ActionPerformed

        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 0 /A1' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                  txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }
            //int toplam_ucret = Integer.parseInt(rs.getString("toplam_ucret")) * 5;

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this," Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }

    }//GEN-LAST:event_btn_a1ActionPerformed

    private void btn_a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a2ActionPerformed

        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 0 /A2' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                 txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }
            //int toplam_ucret = Integer.parseInt(rs.getString("toplam_ucret")) * 5;

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }

    }//GEN-LAST:event_btn_a2ActionPerformed

    private void btn_a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a3ActionPerformed

        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 0 /A3' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                   txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }

    }//GEN-LAST:event_btn_a3ActionPerformed

    private void btn_a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a4ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 0 /A4' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                  txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));            }
            //int toplam_ucret = Integer.parseInt(rs.getString("toplam_ucret")) * 5;

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_a4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Parket_Cikar ac = new Parket_Cikar();
        ac.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a5ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 0 /A5' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }
            //int toplam_ucret = Integer.parseInt(rs.getString("toplam_ucret")) * 5;

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_a5ActionPerformed

    private void btn_a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a6ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 0 /A6' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                  txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }
            //int toplam_ucret = Integer.parseInt(rs.getString("toplam_ucret")) * 5;

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_a6ActionPerformed

    private void btn_a7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a7ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 0 /A7' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
               txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }
            //int toplam_ucret = Integer.parseInt(rs.getString("toplam_ucret")) * 5;

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_a7ActionPerformed

    private void btn_a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a8ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 0 /A8' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
               txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }
            //int toplam_ucret = Integer.parseInt(rs.getString("toplam_ucret")) * 5;

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_a8ActionPerformed

    private void btn_a9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a9ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 0 /A9' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
             txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }
            //int toplam_ucret = Integer.parseInt(rs.getString("toplam_ucret")) * 5;

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_a9ActionPerformed

    private void btn_a10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a10ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 0 /A10' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                  txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }
            //int toplam_ucret = Integer.parseInt(rs.getString("toplam_ucret")) * 5;

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_a10ActionPerformed

    private void btn_a11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a11ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 0 /A11' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }
            //int toplam_ucret = Integer.parseInt(rs.getString("toplam_ucret")) * 5;

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_a11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        hesap ac = new hesap(txt_plaka.getText());
        ac.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_a12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a12ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 0 /A12' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                  txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }
            //int toplam_ucret = Integer.parseInt(rs.getString("toplam_ucret")) * 5;

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_a12ActionPerformed

    private void btn_b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b5ActionPerformed
        try{
            // BÜTÜN BUTONLARDA SORUN VAR
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 1 /B5' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_b5ActionPerformed

    private void btn_b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b1ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 1 /B1' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_b1ActionPerformed

    private void btn_b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b7ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 1 /B7' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_b7ActionPerformed

    private void btn_b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b4ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 1 /B4' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_b4ActionPerformed

    private void btn_b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b2ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 1 /B2' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_b2ActionPerformed

    private void btn_b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b3ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 1 /B3' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_b3ActionPerformed

    private void btn_d7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d7ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();
            rs = st.executeQuery("select * from araclar where yerler='KAT 3 /D7' and giris_cikis='1'");
            rs.next();
            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){
                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_d7ActionPerformed

    private void btn_d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d1ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 3 /D1' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_d1ActionPerformed

    private void btn_d5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d5ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();
            rs = st.executeQuery("select * from araclar where yerler='KAT 3 /D5' and giris_cikis='1'");
            rs.next();
            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){
                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_d5ActionPerformed

    private void btn_b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b9ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 1 /B9' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_b9ActionPerformed

    private void btn_b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b11ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 1 /B11' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_b11ActionPerformed

    private void btn_b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b8ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 1 /B8' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_b8ActionPerformed

    private void btn_b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b10ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 1 /B10' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));

            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_b10ActionPerformed

    private void btn_b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b6ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 1 /B6'  and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                //merkezi kod
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));

            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_b6ActionPerformed

    private void btn_b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b12ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 1 /B12' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_b12ActionPerformed

    private void btn_d11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d11ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 3 /D11' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_d11ActionPerformed

    private void btn_d9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d9ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 3 /D9' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_d9ActionPerformed

    private void btn_d3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d3ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 3 /D3' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_d3ActionPerformed

    private void btn_d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d2ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 3/D2' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_d2ActionPerformed

    private void btn_d4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d4ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 3 /D4' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_d4ActionPerformed

    private void btn_d12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d12ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 3 /D12' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_d12ActionPerformed

    private void btn_d6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d6ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 3 /D6' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_d6ActionPerformed

    private void btn_d10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d10ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 3 /D10' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_d10ActionPerformed

    private void btn_d8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_d8ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 3 /D8' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_d8ActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin2MouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin2MouseClicked

    private void btn_c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c5ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 2 /C5' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_c5ActionPerformed

    private void btn_c12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c12ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 2 /C12' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_c12ActionPerformed

    private void btn_c11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c11ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 2 /C11' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_c11ActionPerformed

    private void btn_c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c9ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 2 /C9'  and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_c9ActionPerformed

    private void btn_c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c3ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 2 /C3'  and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_c3ActionPerformed

    private void btn_c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c2ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 2 /C2' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_c2ActionPerformed

    private void btn_c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c4ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 2/C4'  and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_c4ActionPerformed

    private void btn_c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c7ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 2/C7' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_c7ActionPerformed

    private void btn_c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c1ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 2 /C1' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_c1ActionPerformed

    private void btn_c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c6ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 2 /C6' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_c6ActionPerformed

    private void btn_c10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c10ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 2 /C10' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_c10ActionPerformed

    private void btn_c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c8ActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
            Statement st,st2,st3 = null;
            ResultSet rs,rs2,rs3 = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost/otopark?useUnicode=true&characterEncoding=UTF-8", "root", "");
            st = con.createStatement();

            rs = st.executeQuery("select * from araclar where yerler='KAT 2 /C8' and giris_cikis='1'");
            rs.next();

            int kayitsayisi = rs.getRow();
            if(kayitsayisi < 1){

                araclar ac = new araclar();
                ac.setVisible(true);
            }
            else{
                txt_adi.setText(rs.getString("ad_soyad"));
                txt_plaka.setText(rs.getString("plaka"));
                txt_marka.setText(rs.getString("marka"));
                txt_arac_id.setText(rs.getString("id"));
                txt_yas.setText(rs.getString("yas"));
                txt_cep_no.setText(rs.getString("cep_no"));
                txt_tarih.setText(rs.getString("tarihi"));
                txt_saat.setText(rs.getString("saati"));
                txt_türü.setText(rs.getString("türü"));
                txt_yeri.setText(rs.getString("ucret"));
                txt_ucret.setText(rs.getString("yerler"));
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
    }//GEN-LAST:event_btn_c8ActionPerformed

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
            java.util.logging.Logger.getLogger(Parket_Cikar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parket_Cikar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parket_Cikar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parket_Cikar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parket_Cikar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Arayuz;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin2;
    private javax.swing.JTextField txt_adi;
    private javax.swing.JTextField txt_arac_id;
    private javax.swing.JTextField txt_cep_no;
    private javax.swing.JTextField txt_marka;
    private javax.swing.JTextField txt_plaka;
    private javax.swing.JTextField txt_saat;
    private javax.swing.JTextField txt_tarih;
    private javax.swing.JTextField txt_türü;
    private javax.swing.JTextField txt_ucret;
    private javax.swing.JTextField txt_yas;
    private javax.swing.JTextField txt_yeri;
    // End of variables declaration//GEN-END:variables
private void Seticon() {
          setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("91siyah.png")));   
    }

}
