/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;

/**
 *
 * @author Jon mark
 */
public class Activity2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Slark s=new Slark();
        Spectre k =new Spectre();
        Sniper p=new Sniper();
        Tusk t =new Tusk();
        Tidehunter ariel=new Tidehunter();
        t.attack(p);
        s.addSkill();
        s.attack(k,1);
        p.attack(k,1);
        p.addSkill();
        p.attack(k,2);
        p.attack(k,3);
        p.attack(k,4);
        ariel.attack(k);
    }
    
}
