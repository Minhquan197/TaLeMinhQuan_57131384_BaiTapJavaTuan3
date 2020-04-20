/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author ASUS
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Context c1 = new Context();
        c1.setTinhToan(new Cong());
        System.out.println("75+12="+c1.tinh(75, 12));
        
        Context c2 = new Context();
        c2.setTinhToan(new Tru());
        System.out.println("54-78="+c2.tinh(54, 78));
    }
    
}
