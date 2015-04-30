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
public abstract class Hero {
    private int hp=1000;
    private Skills block=new Skills("block","defense",50);

    public abstract String getName();
    public abstract void attack(Hero target);
    public int block(int damage){
        System.out.println(block.getdamage()+" damage was blocked!");
        return damage-=block.getdamage();}
    public void takedamage(int damage){hp-=block(damage);}
   // public abstract void damage(Skills skill);
  
    public String showHp()
    {
        return " "+this.hp;
    }
}
