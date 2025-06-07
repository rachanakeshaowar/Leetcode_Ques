import java.util.*;
public class occurances1207 {
 
    public boolean uniqueOccurrences(int[] arr)
     {
         HashSet<Integer> set=new HashSet<>();
          HashMap<Integer,Integer> mp=new HashMap<>();
          for(int i=0;i<arr.length;i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }
            else{
                mp.put(arr[i],mp.get(arr[i])+1);
            }
          }
        for (int value : mp.values()) {
        if (!set.add(value)) {
        return false;
    }
   
}
  return true;
        
        }
        }

