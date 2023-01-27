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
public class persegipanjang {
    
    int panjang, lebar;
    
     public persegipanjang(){
        this.panjang=panjang;
        this.lebar=lebar;
    }
    
    public void luas() {
        int luas = panjang*lebar;
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang "+luas);
    }
    
    public void keliling (int panjang, int lebar){
        int keliling = 2*(panjang+lebar);
        JOptionPane.showMessageDialog(null, "Keliling Persegi Panjang "+keliling);
    }
    
    public static void main(String[] args) {
        persegipanjang perpa =  new persegipanjang();
        perpa.panjang=Integer.parseInt(JOptionPane.showInputDialog("Panjang :"));
        perpa. lebar =Integer.parseInt(JOptionPane.showInputDialog("Lebar: "));
        perpa. luas();
        perpa.keliling(perpa.panjang, perpa.lebar);
    }
}
