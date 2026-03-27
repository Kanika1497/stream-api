import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args){
        //feature in java 8
        //llprocess collections of data in functional declarative manner
                //Simplfy Data processing
        //EMbrace functional programiing
        //Improve readability and Maintainbility
        //Enable  Easy Parallelism

        //what is stream
        //a seq of ele supporting functional and declarative programming
        //How to use Streams
        //Source,intermediate operation && terminal operation

        //creating stream
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> stream=list.stream();

        //from Array
        String [] arr={"a","b","c"};
        Stream<String> stream1= Arrays.stream(arr);

        //Using stream of
        Stream<String> stream2=Stream.of("a","b");

        //infinite stream
        Stream<Integer> generate=Stream.generate(()->1);

        Stream<Integer> st=Stream.iterate(1,x->x+1).limit(100);



    }
}
