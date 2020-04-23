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
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HangHoa hh1 = new HangHoa("Trung", 25000, "Trung ga");
        HangHoa hh2 = new HangHoa("Thit", 190000, "Thit heo");
        HangHoa hh3 = new HangHoa("Sua", 35000, "Sua bo");
        
        GioHang gh1 = new GioHang();
        
        gh1.dSachHH.add(hh1);
        gh1.dSachHH.add(hh2);
        gh1.dSachHH.add(hh2);
        gh1.dSachHH.add(hh3);
        gh1.dSachHH.add(hh3);
        
        gh1.setHinhThucTT(new ThanhToanOnline());
        
        System.out.println("Danh sach hang hoa: ");
        for(int i = 0; i<gh1.dSachHH.size(); i++){
            System.out.println(gh1.dSachHH.get(i));
        }
        
        int tongTienHang = 0;
        for(int i = 0; i<gh1.dSachHH.size(); i++){
            tongTienHang = tongTienHang + gh1.dSachHH.get(i).getGia();  
        }
        System.out.println("Tien hang: ");
        System.out.println(tongTienHang);
        System.out.println("So tien khach tra:");
        System.out.println(gh1.thanhToan(tongTienHang));
        //
        GioHang gh2 = new GioHang();
        
        gh2.dSachHH.add(hh1);
        gh2.dSachHH.add(hh3);
        gh2.dSachHH.add(hh2);
        gh2.dSachHH.add(hh3);
        gh2.dSachHH.add(hh3);
        
        gh2.setHinhThucTT(new ThanhToanCOD());
        
        System.out.println("Danh sach hang hoa: ");
        for(int i = 0; i<gh2.dSachHH.size(); i++){
            System.out.println(gh2.dSachHH.get(i).toString());
        }
        
        int tongTienHang2 = 0;
        for(int i = 0; i<gh2.dSachHH.size(); i++){
            tongTienHang2 = tongTienHang2 + gh2.dSachHH.get(i).getGia();  
        }
        System.out.println("Tien hang: ");
        System.out.println(tongTienHang2);
        System.out.println("So tien khach tra:");
        System.out.println(gh2.thanhToan(tongTienHang2));
            
                
    }
    
}
