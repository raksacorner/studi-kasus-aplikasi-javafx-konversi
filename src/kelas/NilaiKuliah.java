package kelas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rdh.tobing
 */
public class NilaiKuliah extends Konversi {
    @Override
    public String konversiNilai(float nilai, String syarat) {
        String grade = "";
        if (nilai < 34) {
            grade = "E";
        } else {
            if (nilai < 49.5) {
                grade = "D";
            } else {
                if (nilai < 57) {
                    grade = "C";
                } else {
                    if (nilai < 64.5) {
                        grade = "BC";
                    } else {
                        if (nilai < 72) {
                            grade = "B";
                        } else {
                            if (nilai < 79.5) {
                                grade = "AB";
                            } else {
                                grade = "A";
                            }
                        }
                    }
                }
            }
        }

        return grade;
    }
    
    public float konversiGrade(String grade){
        float nilai = 0;
        switch(grade){
            case "A": nilai = 4; break;
            case "AB": nilai = 3.5f; break;
            case "B": nilai = 3; break;
            case "BC": nilai = 2.5f; break;
            case "C": nilai = 2; break;
            case "D": nilai = 1; break;
            default: return 0;
        }
        
        return nilai;
    }
}
