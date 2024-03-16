import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gift;

    public Package(){
        gift = new ArrayList<>();
    }

    public void addGift(Gift gift){
        this.gift.add(gift);
    }

    public int totalWeight(){
        int sumWeight=0;
        for(Gift currentGift: gift){
            sumWeight += currentGift.getWeight();
        }
        return sumWeight;
    }
}
