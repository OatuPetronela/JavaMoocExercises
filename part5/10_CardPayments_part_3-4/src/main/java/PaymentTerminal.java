public class PaymentTerminal {

    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public boolean eatAffordably(PaymentCard card) {
        double affordableMealCost = 2.50;
        if (card.balance() >= affordableMealCost) {
            card.takeMoney(affordableMealCost);
            affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        double heartyMealCost = 4.30;
        if (card.balance() >= heartyMealCost) {
            card.takeMoney(heartyMealCost);
            heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
