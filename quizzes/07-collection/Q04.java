import java.util.ArrayList;
import java.util.List;

public class Q04{
    public static void main(String[] args){
        List<String> list = new ArrayList<>(); 
        list.add("Monday"); 
        list.add("Monday"); 
        list.add("Tuesday"); 
        list.remove(0); 
        System.out.println(list.get(0)); 
    }
}
