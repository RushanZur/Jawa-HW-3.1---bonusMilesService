public class BonusMilesService {
    public int calculate(int price) {
        int balance = 300;
        int bonus;

        bonus = price > 1000 ? price / 100 : 0;
        balance += bonus + price;
        return bonus;
    }
}
