import java.util.List;

public class Q8 {

    public static void main(String args[]){
        List<Integer> list= List.of(1,2,3,4,5,6,7,8,9);
       int sum= list.stream().mapToInt(a->a).sum();
       int product=list.stream().reduce(1,(a,b)-> a*b);

       System.out.println("Sum " + sum);
        System.out.println("Product " + product);
    }
}
