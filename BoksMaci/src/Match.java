import java.util.*;
public class Match {

    Fighter Scorpion;
    Fighter Sub_Zero;
    public int minWeight;
    public int maxWeight;


    public Match(Fighter Scorpion, Fighter Sub_Zero, int minWeight, int maxWeight) {
        this.Scorpion = Scorpion;
        this.Sub_Zero = Sub_Zero;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    public boolean Control() {
        return (Scorpion.weight >= minWeight && Scorpion.weight <= maxWeight) && (Sub_Zero.weight >= minWeight && Sub_Zero.weight <= maxWeight);
    }


    void run() {
        if(Control()) {
            while(this.Scorpion.health > 0 && this.Sub_Zero.health > 0) {
                System.out.println("******NEXT ROUND******");
            if(chanceToStart() == true) {
                this.Sub_Zero.health = this.Scorpion.punch(this.Sub_Zero);
                System.out.println(this.Sub_Zero.name+" health : "+this.Sub_Zero.health);
                System.out.println(this.Scorpion.name+" health : "+this.Scorpion.health);
                if(isWin()) {
                    break;
                }
            }
            else {
                this.Scorpion.health = this.Sub_Zero.punch(Scorpion);
                System.out.println(this.Scorpion.name+" health : "+this.Scorpion.health);
                System.out.println(this.Sub_Zero.name+" health : "+this.Sub_Zero.health);
                if(isWin()) {
                    break;
                }
            }


            }
        }
        else {
            System.out.println("fighters' weights don't match!");
        }
    }


    boolean isWin() {
        if(this.Scorpion.health == 0) {
            System.out.println("FANTALITY! "+this.Sub_Zero.name+" Wins!");
            return true;
        }
        if(this.Sub_Zero.health == 0) {
            System.out.println("FANTALITY! "+this.Scorpion.name+" Wins");
            return true;
        }
        return false;
    }


    public boolean chanceToStart() {
        double randomNumber = Math.random() * 100;
        if(randomNumber <= 50) {
            return true;
        }
        return false;
    }



}
