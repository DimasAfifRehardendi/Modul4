/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Asus
 */
public class bujurSangkar extends bangunDatar{
    private double sisi;
    
    public bujurSangkar(double sisi){
        this.sisi = sisi;
    }
    public double hitungkeliling(){
        return 4 * sisi;
    }
    
    public double hitungluas(){
        return sisi * sisi;
    }
}
