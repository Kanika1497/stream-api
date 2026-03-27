import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

// stream api was for redundant code and functional programing
public class Main {
    public static void main(String[] args) {
       // java 8 --> minimal code ,functional programming
        //java 8 --> lambda expression ,Streams, Date & Time API

        //lambda expresion
        //lambda expression is an anonymous function(no name , no return type ,no access modifier)

        // Predicate --> Functional interface (Boolean valued function)

        Predicate<Integer> isEven=x-> x%2==0;
        System.out.println(isEven.test(4));

        Predicate<String> isWordStartingWithA=x-> x.startsWith("A");
        System.out.println(isWordStartingWithA.test("Ahh"));
        Predicate<String> endWithK=x->x.endsWith("k");
        Predicate<String> and=isWordStartingWithA.and(endWithK);
        System.out.println(and.test("Akinak"));


        //Function--> work for you
        Function<Integer,Integer> doubleIt= x->x*2;
        Function<Integer,Integer> tripleIt=x->x*3;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(tripleIt.compose(doubleIt).apply(20));
        Function<Integer,Integer> identity=Function.identity();
        Integer res2=identity.apply(5);
        System.out.println(res2);


        //Consumer
        Consumer<Integer> print=(x)-> System.out.println(x);
        print.accept(50);

        List<Integer> list= Arrays.asList(1,2,3);
        Consumer<List<Integer>> printList=x->{
            for(int i:x){
                System.out.println(i);
            }
        };
        printList.accept(list);


        //Supplier

        Supplier<String> giveHelloWorld=()-> "Hello World";
        System.out.println(giveHelloWorld.get());

        //Combined

        Predicate<Integer> predicate=x-> x % 2==0;
        Function<Integer,Integer> function=x-> x*x;
        Consumer<Integer> consumer =x-> System.out.println(x);
        Supplier<Integer> supplier =()-> 100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        //Bipredicate , BiConsumer ,Bifunction

        BiPredicate<Integer,Integer> isSumEven=(x,y)-> (x+y)%2==0;
        System.out.println(isSumEven.test(5,5));

        BiConsumer<String,Integer> biConsumer=(x,y)->{
            System.out.println(x);
            System.out.println(y);

        };
        biConsumer.accept("Kanika",28);

        BiFunction<String,String,Integer> biFunction=(x,y)-> (x+y).length();
        biFunction.apply("Kanika","Kanika");

        //Function<Integer,Integer>
        UnaryOperator<Integer> a=x-> x*2;

        //BiFunction<Integer,Integer,Integer>
        BinaryOperator<Integer> bi=(x,y)->x+y;


        //Method Reference--> use method without invoking & in place
        List<String> names=Arrays.asList("Kans","Kanika","Kani");
        names.forEach(x-> System.out.println(x));
        names.forEach(System.out::println);


        //Constructor Reference
        List<String> n=Arrays.asList("A","B","C");
        List<Mobilephone> phones=n.stream().map(Mobilephone::new).toList();



    }
}

class Mobilephone{
    String name;
    public Mobilephone(String name){
        this.name=name;
    }
}