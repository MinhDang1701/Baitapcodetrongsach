/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package this_keyword;

/**
 *
 * @author ThinkPad
 */
public class Baitaptrongsach {


    void m(){
        System.out.println("method is invoked");
    }
    void n(){
        this.m();
    }
    void p(){
        n();
    }
    public static void main(String[] args) {
        Baitaptrongsach s1=new Baitaptrongsach();
        s1.p();
    }
}
  
    

