import java.lang.reflect.Array;
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> person;

    public Room(){
        this.person= new ArrayList<>();
    }
    public void add(Person person){
        this.person.add(person);
    }

    public boolean isEmpty(){
        if(this.person.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<Person> getPersons(){
        return person;
    }

    public Person shortest(){
        if(this.person.isEmpty()){
            return null;
        }

        Person shortestPerson = this.person.get(0);

        for(Person persons : person){
            if(shortestPerson.getHeight() > persons.getHeight()){
                shortestPerson =persons;
            }
        }
        return shortestPerson;
    }

    public Person take(){
        if(this.person.isEmpty()){
            return null;
        }

        Person shoertestPerson = shortest();

        person.remove(shoertestPerson);

        return shoertestPerson;

    }



}
