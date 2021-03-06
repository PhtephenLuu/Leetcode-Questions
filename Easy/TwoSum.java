package Easy;
import java.util.*;

//Problem: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//First we make a hashmap which stores mappings of two intgers where the key is equal to the value of the element at the index stored at by the value 
//input array. We do this because we realize that a + b = c is the same as saying c - b = a or c - a = b, so we check this property by
//checking whether or not the hashmap contains a value such that c - (value) = i. If so we return a new array that contains the indices of both elements. 

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> inds = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(inds.containsKey(target - nums[i])){
                return new int[] {i, inds.get(target - nums[i])};
            }
            else {
                inds.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args){
    
    }
}


