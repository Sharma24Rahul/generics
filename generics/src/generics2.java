import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class generics2 {
    public static void main(String[] args) {
        Map<Integer,String> abc1=new HashMap<>();
        abc1.put(1,"es");
        abc1.put(2,"r");
        abc1.put(3,"rt");
        for(Map.Entry<Integer,String> e:abc1.entrySet())
        {
            System.out.println(e.getKey()+"     "+e.getValue());//right way
        }
        //Set<Integer>ab2=abc1.keySet();
       // for(Integer key:ab2)//wrong way        for iterating through the map use entry set
        //{
          //  System.out.println(key+"     "+abc1.get(key));
        //}
    }
}
