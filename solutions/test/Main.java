package test;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
       int[] arr= {1,2,3,4,4,4,4,4,4,4,5};
       int[] arr2 = {1,1,2,2};
//        System.out.println(findMajor(arr));
//        System.out.println(findMajor(arr2));
        int target = -3;
        int[] test = { 1,2,3,4,4,5};

        int[] empty = {-2,2,0,-3,3};


        findsubArray(empty,target);

    }

    public static void findsubArray(int[] nums,int target){
        HashMap<Integer,Integer> sumMap = new HashMap<>();
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            if(sum == target){
                System.out.println("sub arr from 0 to "+i);
//                return;
            }

            if(sumMap.containsKey(sum-target)){
                System.out.println("start index "+ (sumMap.get(sum-target)+1) + "   - end indeex " + i);
//                return;
            }

            sumMap.put(sum,i);
        }
    }


    public static int findMajor(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int n = arr.length;
        int major = arr[n/2];

        int firstIndex =firstOcuur(arr,major);
        int lastIndex = firstIndex+n/2;
        if(lastIndex<n && major==arr[lastIndex]){
            return  major;
        }
        return -1;
    }

    public static int firstOcuur(int[] nums,int target){
        int low = 0,high = nums.length-1;
        while (low<high){
            int mid = low + (high-low)/2;
            if(nums[mid]<target){
                low = mid+1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }

}
