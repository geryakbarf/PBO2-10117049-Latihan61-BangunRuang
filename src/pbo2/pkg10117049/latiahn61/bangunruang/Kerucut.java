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
public class Kerucut extends BangunRuang {
    private double t;// Tinggi
    private double r;//Jari - Jari

    

    public double getT() {
        return t;
    }

    public double getR() {
        return r;
    }

    public void setT(double t) {
        this.t = t;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    @Override
    public double hitungVolume() {
        return (3.14*(r*r))*1/3*t;   
    }
    
}
