/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class belahketupat {
    
    double d1, d2;
    int sisi;
    
    public belahketupat(){
        this.d1=d1;
        this.d2=d2;
        this.sisi=sisi;
    }
   
    public void luas(){
        double luas = 0.5*d1*d2;
        JOptionPane.showMessageDialog(null, "Luas Belah Ketupat : "+luas);
    }
    public void keliling(int sisi){
        int keliling = 4*sisi;
        JOptionPane.showMessageDialog(null, "Keliling Belah Ketupat : "+keliling);
    }
    public static void main(String[] args) {
        belahketupat beltu =  new belahketupat();
        beltu.d1=Integer.parseInt(JOptionPane.showInputDialog("Diagonal 1 : "));
        beltu.d2=Integer.parseInt(JOptionPane.showInputDialog("Diagonal 2 : "));
        beltu.sisi=Integer.parseInt(JOptionPane.showInputDialog("sisi : "));
        beltu.luas();
        beltu.keliling(beltu.sisi);
}
}
