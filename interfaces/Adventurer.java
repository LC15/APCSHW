import java.util.Random;
public abstract class Adventurer{
    private String name;
    private int HP, DEX, INT,STR;
    private Random r= new Random();
    
    public Adventurer(String n,int startHP, int dx, int intel, int strength){
	name = n;
	HP = startHP;
        DEX=dx;
	INT=intel;
	STR=strength;
	this.setName(n);
	this.setHP(startHP);
	this.setSTR(strength);
	this.setDEX(dx);
	this.setINT(intel);
    }
    
    public Adventurer(){
	this("Lester",30,15,5,20);
    }
    public Adventurer(String n){
	this(n,30,15,5,20);}

    public String toString(){
	return getName();
    }

    public String getName(){
	return name;
    }

    public void setName(String n){
	name = n;
    }

    public int getHP(){
	return HP;
    }
      public void setHP(int HP){
	  this.HP = HP;}

    public int getDEX(){
	return  DEX;}

    public void setDEX(int x){
	this.DEX=x;}

    public int getINT(){
	return INT;}

    public void setINT(int intel){
	this.INT=intel;}

    public int getSTR(){
	return STR;}

    public void setSTR(int strength){
	this.STR=strength;}
    
    
   
    public void attack(Adventurer other){
	System.out.println("You messed up abstract attack");}

 public void specialAttack(Adventurer other){
     System.out.println("You messed up abstract special attack");
	}
}
