import java.util.*;

public class sortbyvalue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("ten", 10);
        map.put("nine", 9);
        map.put("eight", 8);
        map.put("seven", 6);
        map.put("five", 5);

        sortt(map);
    }
        //Set<Map.Entry<String,Integer>> amap=
        private static void sortt(Map<String,Integer> map)

        {
            Set<Map.Entry<String,Integer>> amap= map.entrySet();
            System.out.println("before and aftewr");
            for(Map.Entry<String,Integer>entry:amap)
            {
                System.out.println(entry.getValue()+"   "+entry.getKey());
            }
            List<Map.Entry<String,Integer>> alist=new LinkedList<Map.Entry<String, Integer>>(amap);
            Collections.sort(alist, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });
            Map<String,Integer>map2=new LinkedHashMap<>();
            for(Map.Entry<String,Integer>entry:alist)
            {
                map2.put(entry.getKey(),entry.getValue());
            }
            System.out.println("value"+"     "+"key");
            for(Map.Entry<String,Integer>entry:map2.entrySet())
            {
                System.out.println(entry.getValue()+"   "+entry.getKey());
            }
        }

    }

