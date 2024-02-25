
public class HealthStation {
    private int countWeighings;

    public HealthStation(){
        this.countWeighings=0;
    }
    public int weigh(Person person) {
        countWeighings++;
        return person.getWeight();
    }

    public void feed(Person person){
        int currentWeight = person.getWeight();
        person.setWeight(currentWeight + 1);

    }
    public int weighings(){
        return this.countWeighings;
    }

}
