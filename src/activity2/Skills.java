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
public class Skills {
    private boolean open=false;
    public Skills(String name,String type)
    {
        this.type=type;
        this.name=name;
    }
        public Skills(String name,String type,int damage)
    {
        this.type=type;
        this.name=name;
        this.damage=damage;
    }
    private int damage;
    private String type;
    private String name;
    public int getdamage(){
        return this.damage;
    }
    public void upgrade(){
        this.damage+=100;
    }
    public String getName()
    {
        return this.name;
    }
    public void openSkill()
    {
        this.open=true;
    }
    public boolean Opened()
    {
        return this.open;
    }
}
