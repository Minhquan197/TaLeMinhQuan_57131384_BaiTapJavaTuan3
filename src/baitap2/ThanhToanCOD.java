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
public class ThanhToanCOD implements IThanhtoan{

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang > 200000)
            return tienHang - tienHang*2/100;
        else return tienHang - 0;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
