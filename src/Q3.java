import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q3 {
    //Count frequency of characters in a sentence



    public static void main(String args[]){
        String sentence = "Dog hates cat";
        String str=sentence.replace(" ","");
        Map<Character,Long> map=str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        for(char ch : map.keySet()){
            System.out.println(ch + "-" + map.get(ch));
        }
    }
}
