/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author Asus
 */
public class Person {
    private String nama;
    private int usia;
    
    //Kontruktor
    public Person(String nama, int usia){
        this.nama = nama;
        this.usia = usia; 
    }
    
    // Method
      public void info(){
          System.out.println("Nama : " + this.nama);
          System.out.println("Usia : " + this.usia);
      }      
}
