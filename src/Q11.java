import java.util.List;
import java.util.stream.Collectors;

public class Q11 {
    //Count string containg char 'a'

    public static void main(String args[]){
        List<String> list= List.of("Kanika","njhkjhk","ahhh","kjnkjh");

        Long li=list.stream().filter(a-> a.contains("a")).count();

       // for(String s: li){
            System.out.println(li);
        //}

    }
}
