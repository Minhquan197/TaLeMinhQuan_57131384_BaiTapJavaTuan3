/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author ASUS
 */
public class ThanhToanOnline implements IThanhtoan{

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 100000)
            return tienHang - tienHang*5/100;
        else return tienHang - tienHang*7/100;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
