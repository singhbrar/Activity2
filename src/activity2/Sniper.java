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
public class Sniper extends Hero{
        private String type="agility";

       private Skills[]attackskill=new Skills[4];
    private int skillcount=1;
          public Sniper()
    {
        attackskill[0]=new Skills("headshot","attack",100);
        attackskill[1]=new Skills("shrapnel","attack",100);
        attackskill[2]=new Skills("take aim","attack",100);
        attackskill[3]=new Skills("assasinate","attack",100);
        attackskill[0].openSkill();
 
    }
          public String getType(){return this.type;}
           public void addSkill()
    {
        if(skillcount<4)
        attackskill[skillcount++].openSkill();
    }
    public Skills getSkill(int skillnumber)
    {
        return attackskill[skillnumber];
    }
      public void skillupgrade(int skillnumber)
    {
        attackskill[skillnumber].upgrade();
    }
    public String getName()
    {
        return "Sniper";
    }

    public void attack(Hero target) {
      attack(target,1);
        
    }
    public void attack(Hero target,int number)
    {
        if(getSkill(number-1).Opened()==true){
        System.out.println("Sniper used "+getSkill(number-1).getName()+" against "+target.getName());
        target.takedamage(getSkill(number-1).getdamage());
        System.out.println(target.getName()+"'s hp was reduced to"+target.showHp());}
        else
        {
            System.out.println("Skill not avaiable");
        }

    }
}
