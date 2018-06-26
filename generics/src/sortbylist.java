import java.util.*;

public class sortbylist {
    public static void main(String[] args) {
       List<Integer> alist = new ArrayList<>();
       alist.add(34);
       alist.add(34);
        alist.add(4);
        alist.add(4);
       alist.add(23);
       alist.add(12);
       alist.add(1);
        //System.out.println(alist);
        //Collections.sort(alist);
       // System.out.println(alist);
        Set<Integer> aset=new TreeSet<>(alist);
        System.out.println(aset);
        for(int n:aset)
        {
            System.out.println(n+"   ");
        }



    }
}
