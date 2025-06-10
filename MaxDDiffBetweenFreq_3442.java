import java.util.*;
public class MaxDDiffBetweenFreq_3442 {
 
    public int maxDifference(String s) {
      HashMap<Character,Integer> mp =new HashMap<>();
      for(char ch:s.toCharArray()){
        if(!mp.containsKey(ch)){
            mp.put(ch,1);
        }
        else{
            mp.put(ch,mp.get(ch)+1);
        }
        
      }
      int maxFreq=0;
       int minFreq=Integer.MAX_VALUE;
   
      for(var e :mp.entrySet()){
        int freq =e.getValue();
        if( (freq%2)!=0){
            maxFreq = Math.max(maxFreq, freq);
            
        }
         if( (freq%2)==0){
            minFreq=Math.min(minFreq,freq);
          
        }

      }
      return (maxFreq-minFreq);
   
    }}


