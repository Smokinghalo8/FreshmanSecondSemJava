package extra;

public class character {
    String name;
    int hp; int atk;
    public character(){
    }

    public character(String name){
        this.name=name;
    }

    public character(String name, int hp, int atk){
        this.name=name;
        this.hp=hp;
        this.atk=atk;
    }

    public String getName(){
        return name;
    }
    public int getHp(){
        return hp;
    }
    public int getAtk(){
        return atk;
    }
    public double lvlLocator(int hp){
        return 0.0;
    }

    public double lvlLocator(int hp, int atk){      //finds out how good u are
        return hp*atk;
    }
}
