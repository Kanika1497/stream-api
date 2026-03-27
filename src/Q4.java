import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q4 {
    //count words from list

    public static void main(String args[]){
        List<String> list= List.of("apple" , "banana" ,"apple");

        Map<String , Long> map =list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        for(String key : map.keySet()){
            System.out.println(key + " - "+map.get(key));
        }
    }
}
