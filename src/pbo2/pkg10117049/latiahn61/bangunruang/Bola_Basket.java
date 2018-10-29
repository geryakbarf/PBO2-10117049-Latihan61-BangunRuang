/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latiahn61.bangunruang;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk menghitung volume Bangun
 * Datar
 */
public class Bola_Basket extends BangunRuang {
     private double r;//Jari - Jari Bola

    @Override
    public double hitungVolume() {
        return 4*r*r*r*3.14/3;
        
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
}
