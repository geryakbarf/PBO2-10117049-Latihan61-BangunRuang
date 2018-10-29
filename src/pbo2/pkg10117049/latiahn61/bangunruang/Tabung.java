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
public class Tabung extends BangunRuang{
    private double h;//Tinggu Tabung
    private double r;//Jari Jari Tabung

    @Override
    public double hitungVolume() {
        return 3.14*(r*r)*h;
    }

    public double getH() {
        return h;
    }

    public double getR() {
        return r;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setR(double r) {
        this.r = r;
    }
    
}
