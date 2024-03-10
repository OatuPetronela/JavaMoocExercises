import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stackList;

    public Stack(){
        stackList= new ArrayList<>();
    }

    public boolean isEmpty(){
        return this.stackList.isEmpty();
    }

    public void add(String value){
        this.stackList.add(value);
    }

    public ArrayList<String> values(){
        return this.stackList;
    }

    public String take(){
        if(!isEmpty()){
            String topValue= stackList.get(stackList.size() -1);
            stackList.remove(stackList.size() -1);
            return topValue;
        }else{
            return null;
        }
    }

}
