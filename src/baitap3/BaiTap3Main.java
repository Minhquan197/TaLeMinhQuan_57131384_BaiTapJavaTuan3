/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author ASUS
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        SinhVien sv1 = new SinhVien("Quan", new SimpleDateFormat("dd/MM/yy").parse("26/11/97"), 6);
        SinhVien sv2 = new SinhVien("Quang", new SimpleDateFormat("dd/MM/yy").parse("01/10/97"), 8);
        SinhVien sv3 = new SinhVien("Nhan", new SimpleDateFormat("dd/MM/yy").parse("10/05/96"), 5);
        
        QLSV qlsv = new QLSV();
        
        qlsv.dSSV.add(sv1);
        qlsv.dSSV.add(sv2);
        qlsv.dSSV.add(sv3);
        
//        qlsv.setSoSanh(new SoSanhTheoTen());
//        qlsv.sapXep();
        System.out.println("Danh sach sinh vien: " );
        System.out.println(qlsv.dSSV.toString());
        
        // TODO code application logic here
    }
    
}
