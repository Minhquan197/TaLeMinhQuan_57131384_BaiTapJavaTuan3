/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ASUS
 */
public class QLSV {
    ArrayList<SinhVien> dSSV = new ArrayList<>();
    ISoSanh<SinhVien> soSanh;

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
    
    
    public void sapXep(){
        for(int i = 0; i < dSSV.size(); i++){
            for( int j = 1; j < i+1; j++){
                if(soSanh.soSanh(dSSV.get(i), dSSV.get(j)) > 0)
                    Collections.swap(dSSV, i, j);                        
            }
                
        }
    }
    
    public void inDS(){
        for(int i = 0; i < dSSV.size(); i++){
            dSSV.get(i).toString();
        }
    }
}
