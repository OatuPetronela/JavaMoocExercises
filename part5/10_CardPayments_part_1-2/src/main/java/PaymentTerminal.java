
public class PaymentTerminal {


    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this.money= 1000;
    }

    public double eatAffordably(double payment) {
        double affordableMealCost = 2.50;
        if (payment >= affordableMealCost) {
            money += affordableMealCost;
            affordableMeals++;
            return payment - affordableMealCost;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        double heartyMealCost = 4.30;
        if (payment >= heartyMealCost) {
            money += heartyMealCost;
            heartyMeals++;
            return payment - heartyMealCost;
        } else {
            return payment;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
