// GameLogic.java
public class GameLogic {
    private int coins = 100;
    private int soldiers = 50;
    
    public void buildCompany() {
        if (coins >= 50) {
            coins -= 50;
            // هر 60 ثانیه 10 سکه اضافه شود
        }
    }
    
    public void recruitSoldiers(int count) {
        int cost = count * 2;
        if (coins >= cost) {
            soldiers += count;
            coins -= cost;
        }
    }
    
    public void attack(int enemySoldiers) {
        soldiers -= 12;
        enemySoldiers -= 10;
    }
}
