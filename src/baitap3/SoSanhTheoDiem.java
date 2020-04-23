/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author ASUS
 */
public class SoSanhTheoDiem implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien sv1, SinhVien sv2) {
        if(sv1.diemTB == sv2.diemTB)
            return 0;
        else
            if(sv2.diemTB <= sv2.diemTB)
                return -1;
            else return 1;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
