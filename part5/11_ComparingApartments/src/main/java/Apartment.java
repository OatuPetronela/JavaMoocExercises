
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if(this.squares >compared.squares){
            return true;

        }else{
            return false;
        }
    };

    public int priceDifference(Apartment compared){
        int priceCurrent = this.squares * this.princePerSquare;

        int priceCompared = compared.squares * compared.princePerSquare;

        int difference= Math.abs(priceCurrent - priceCompared);

        return difference;
    }

    public boolean moreExpensiveThan(Apartment compared){
        int priceCurrent = this.squares * this.princePerSquare;

        int priceCompared = compared.squares * compared.princePerSquare;

        return priceCurrent > priceCompared;

    }

}
