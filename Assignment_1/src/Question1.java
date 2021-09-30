import java.util.HashMap;
import java.util.Map;

public class Question1 {
    public static void main(String[] args) {
        int[] array ={1, 1, 1, 1, 1};
            HashMap<Integer,Integer> m=new HashMap<>();
            for(int i : array){
                if(m.containsKey(i)){
                    m.put(i,m.get(i)+1);
                }else{
                    m.put(i,1);
                }
            }
            int sum=0;
            for(Map.Entry k : m.entrySet()){
                if((int)k.getValue()==1){
                    sum+=(int)k.getKey();
                }
            }
        System.out.println(sum);
        }
    }
