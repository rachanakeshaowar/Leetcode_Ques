import java.util.*;
public class TwoSum_1 {
  public int[] twoSum(int[] nums,int target){
        int n =nums.length;
        int[] ans={-1};
        //value,index
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int partner=target-nums[i];
            if(mp.containsKey(partner)){
                ans=new int[]{i,mp.get(partner)};
                return ans;
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        TwoSum_1 obj = new TwoSum_1();
        int[] ans = obj.twoSum(nums, target);

     
        if (ans.length == 1 && ans[0] == -1) {
            System.out.println("No valid pair found.");
        } else {
            System.out.println("Indices of pair: " + ans[0] + " and " + ans[1]);
        }

        sc.close();
    }
}


