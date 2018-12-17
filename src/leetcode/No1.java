
/**
* @Title: 弄.java
* @Package leetcode
* @Description: TODO
* @author wuwendi
* @date 2018年12月14日
* @version V1.0
*/
package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
* @Title: No1.java
* @Package leetcode
* @Description: 给定一个整数数组 nums 和一个目标值 target，
* 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
* @author wuwendi
* @date 2018年12月14日
* @version V1.0
*/
public class No1 {
	
	public static void main(String[] args) {
		int nums[] = {2, 7, 11, 15}; 
		int target = 9;
		int result[] = twoSum2(nums,target);
		for(int temp : result)
			System.out.println(temp);
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		int temp = 0;
        A:for(int i = 0 ; i < nums.length ; i++) {
        	for(int j = i + 1 ; j < nums.length ; j++) {
        		temp = nums[i] + nums[j];
        		if(temp == target) {
        			result[0] = i;
        			result[1] = j;
        			 break A;
        		}
        	}
        }
		return result;
    }
	
	public static int[] twoSum2(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i < nums.length ; i++) {
			map.put(nums[i], i);
		}
		for(int i = 0 ; i < nums.length ; i++) {
			int complete = target - nums[i];
			if(map.containsKey(complete) && (map.get(complete) != i)) {
				System.out.println(map.get(complete) +" " +i);
				return new int[] {map.get(complete) ,i};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
    }
	
}
