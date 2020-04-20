/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class GioHang {
    IThanhtoan hinhThucTT;
    ArrayList<HangHoa> dSachHH = new ArrayList<>();
    
    public void setHinhThucTT(IThanhtoan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
        
    double thanhToan(int tienHang){
        int tongTienHang = 0;
        for(int i = 0; i<dSachHH.size(); i++){
            tongTienHang = tongTienHang + dSachHH.get(i).getGia();
            
        }
        return hinhThucTT.thanhToan(tongTienHang);
    }
    
}
