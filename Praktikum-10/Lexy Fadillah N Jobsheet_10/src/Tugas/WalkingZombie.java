/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author asus
 */
public class WalkingZombie extends Zombie{
    public WalkingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    @Override
    public void heal(){
        switch(this.level){
            case 1:
                this.health += this.health * 0.3;
                break;
            case 2:
                this.health += this.health * 0.4;
                break;
            case 3:
                this.health += this.health * 0.5;
                break;
        }
    }
    @Override
    public void destroyed(){
        this.health -= this.health * 20 / 100;
    }
    @Override
    public String getZombieInfo(){
        return "Walking Zombie data = \n" + super.getZombieInfo();
    }
}
