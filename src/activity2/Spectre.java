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
public class Spectre extends Hero {
     private String type="int";
       private Skills[]attackskill=new Skills[4];
    private int skillcount=1;
      public Spectre()
    {
        attackskill[0]=new Skills("specral dagger","attack",100);
        attackskill[1]=new Skills("dispersion","attack",100);
        attackskill[2]=new Skills("desolate","attack",100);
        attackskill[3]=new Skills("haunt","attack",100);
        attackskill[0].openSkill();
        
    }
                public String getType(){return this.type;}

       public void addSkill(String name)
    {
        attackskill[skillcount]=new Skills(name,"attack",100);
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
        return "Spectre";
    }

    public void attack(Hero target) {
      attack(target,1);
        
    }
    public void attack(Hero target,int number)
    {
                if(getSkill(number-1).Opened()==true){
        System.out.println("Spectre used "+getSkill(number-1).getName()+" against "+target.getName());
        target.takedamage(getSkill(number-1).getdamage());
        System.out.println(target.getName()+"'s hp was reduced to"+target.showHp());}
          else
        {
            System.out.println("Skill not avaiable");
        }

    }
}
