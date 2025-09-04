import java.util.HashMap;
import java.util.Map;

public class twoSum{
    public int[] twoSum(int []nums, int target){
         Map<Integer, Integer> map = new HashMap<>();
         for(int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment), i};
            }else{
                    map.put(nums[i], i);
                }
            
         }
       throw new IllegalArgumentException("No match");

        }
    
    public static void main(String[] args) {
       twoSum Solution = new twoSum();

       int []nums = {3,2,4};
       int target = 6;


       try {
           int []result = Solution.twoSum(nums, target);
           System.out.println("Indices: [" + result[0] + " , " + result[1] + "]");
       } catch (Exception e) {
        System.out.println(e.getMessage());
       }
    }
}
