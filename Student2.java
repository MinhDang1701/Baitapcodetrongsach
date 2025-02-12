/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package this_keyword;

/**
 *
 * @author ThinkPad
 */
public class Student2 {
    int id;
    String name;
    Student2(){System.out.println("default constructor is invoked");}
    Student2(int id,String name){
        this();
        this.id=id;
        this.name=name;
    }
    void display(){System.out.println(id+" "+name);}
    public static void main(String[] args) {
        Student2 e1=new Student2(111,"karan");
        Student2 e2=new Student2(222,"Aryan");
        e1.display();
        e2.display();
    }
}

