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
public class segitiga {
    
    int alas, tinggi,sisi;
    
    public segitiga(){
        this.alas=alas;
        this.tinggi=tinggi;
        this.sisi=sisi;
    }
    public void luas(){
        int luas = alas*tinggi/2;
        JOptionPane.showMessageDialog(null, "Luas Segitiga : " +luas);
    }
    public void keliling(int alas, int tinggi, int sisi){
        int keliling = alas+tinggi+sisi;
        JOptionPane.showMessageDialog(null, "Keliling Segitiga : "+keliling);
    }
    public static void main(String[] args) {
       segitiga sgtg =  new segitiga();
       sgtg.alas=Integer.parseInt(JOptionPane.showInputDialog("Panjang:"));
       sgtg.tinggi =Integer.parseInt(JOptionPane.showInputDialog("Lebar: "));
       sgtg.sisi = Integer.parseInt(JOptionPane.showInputDialog("Sisi: "));
       sgtg.luas();
       sgtg.keliling(sgtg.alas, sgtg.tinggi, sgtg.sisi);
}
}
