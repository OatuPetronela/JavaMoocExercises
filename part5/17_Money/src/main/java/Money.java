
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;

        if (totalCents >= 100) {
            totalEuros += totalCents / 100;
            totalCents %= 100;
        }

        return new Money(totalEuros, totalCents);
    }
        public boolean lessThan(Money compared) {

            int thisAmount = this.euros * 100 + this.cents;
            int comparedAmount = compared.euros * 100 + compared.cents;

            return thisAmount < comparedAmount;
        }

        public Money minus(Money decreaser) {

            int difference = (this.euros * 100 + this.cents) - (decreaser.euros * 100 + decreaser.cents);

            if (difference < 0) {
                difference = 0;
            }
            int euros = difference / 100;
            int cents = difference % 100;

            return new Money(euros, cents);
        }



}
