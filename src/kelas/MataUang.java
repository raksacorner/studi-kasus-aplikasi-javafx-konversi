/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas;

/**
 *
 * @author rdh.tobing
 */
public class MataUang extends Konversi{
    @Override
    public String konversiNilai(float nilai, String syarat) {
        String hasilKonversi = "";
        
        switch(syarat){
            case "USD/IDR" : hasilKonversi = (nilai * 14000)+""; break;
            case "KRW/IDR" : hasilKonversi = (nilai * 12.11)+""; break;
        }
        
        return hasilKonversi;
    }    
}
