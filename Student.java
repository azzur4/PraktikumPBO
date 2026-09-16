/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LOQ
 */
public class Student {
   String name;
   double score;
   boolean passed;
   
    Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    // Method untuk mengecek kelulusan
    void checkPassed() {
        passed = score >= 70;
    }
}