/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package src;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class lingkaran {
    
    double r;
    
    public lingkaran(){
        this.r=r;
    }
    
    public void luas(){
        double luas = 3.14*r*r;
        JOptionPane.showMessageDialog(null, "luas lingkaran : " +luas);
    }
    
    public void keliling(double r){
        double keliling = 3.14*(r*2);
        JOptionPane.showMessageDialog(null, "keliling lingkaran: " +keliling);
    }
    
        public static void main(String[] args) {
        lingkaran ling =  new lingkaran();
        ling.r=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jari-jari:"));
        ling.luas();
        ling.keliling(ling.r);
}

}

