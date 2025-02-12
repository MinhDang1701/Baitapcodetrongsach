/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package this_keyword;

/**
 *
 * @author ThinkPad
 */
public class Student1 {
 
      int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1(111, "Karan");
        Student1 s2 = new Student1(321, "Aryan");
        s1.display();
        s2.display();
    }
}
