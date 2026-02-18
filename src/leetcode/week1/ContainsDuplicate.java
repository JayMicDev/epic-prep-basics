package leetcode.week1;
import java.util.HashSet;

public class ContainsDuplicate {

    // Brute Force Solution to Contains Duplicate
    public boolean containsDuplicateBruteForce(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // Faster Solution to Contains Duplicate using HashSet
    public boolean containsDuplicateHashSet(int[] nums){
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
