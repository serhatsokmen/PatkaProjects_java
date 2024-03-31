import java.util.*;
public class Fighter {

    public String name;
    public int damage;
    public int health;
    public int weight;
    public int block;

    public Fighter(String name, int damage, int health, int weight, int block) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if(this.block >= 0 && this.block <= 100 ) {
            this.block = block;
        }
        else {
            this.block = 0;
        }
    }


    int punch(Fighter Enemy) {
        System.out.println(this.name+" -> "+Enemy.name+" "+this.damage+" hit damage!");
        if(Enemy.isBlock()) {
            System.out.println(Enemy.name+" nice block!");
            return Enemy.health;
        }
        if(Enemy.health - this.damage <= 0) {
            return 0;
        }
        return Enemy.health - this.damage;
    }


    boolean isBlock() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.block;
    }










}
