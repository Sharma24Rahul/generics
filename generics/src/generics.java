import java.util.HashSet;
import java.util.Set;

public class generics {
    public static void main(String[] args) {
        Set<Integer>abc=new HashSet();
        abc.add(2);
        abc.add(4);
        System.out.println(abc);
        abc.remove(0);
        System.out.println(abc);
    }
}
