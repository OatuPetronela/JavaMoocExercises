
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }


    public String toString() {

        String result = "The collection " + name + " ";
        if (elements.isEmpty()) {
            return result + "is empty.";
        } else {
            return result + "has " + elements.size() + " element" + (elements.size() > 1 ? "s" : "") + ":\n" + String.join("\n", elements);
        }
    }
    
}
