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
public class persegi {

    int sisi;
    
    public persegi(){
        this.sisi=sisi;
    }
    
    public void luas(){
        int luas = sisi*sisi;
        JOptionPane.showMessageDialog(null, "Luas Persegi "+luas);
    }
    
    public void keliling(int sisi){
        int keliling = 4*sisi;
        JOptionPane.showMessageDialog(null, "Keliling Persegi "+keliling);
    }
    
    public static void main(String[] args) {
        persegi prsg =  new persegi();
        prsg.sisi=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Sisi :"));
        prsg.luas();
        prsg.keliling(prsg.sisi);
    }
}
