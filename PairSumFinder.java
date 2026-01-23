//Define Problem
//Use hashset
//Check complement
//Collect pairs

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairSumFinder{
    public static List<int[]> findPairsWithSum(int[] arr, int targetSum) {
        List<int[]> pairs=new ArrayList<>();
        Set<Integer> visitedNumbers=new HashSet<>();

        for(int num:arr) {
            int complement=targetSum-num;
            if(visitedNumbers.contains(complement)) {
                pairs.add(new int[]{complement,num});
            }
            visitedNumbers.add(num);
        }
        return pairs;
    }
    public static void main(String[] args){
        int[] numbers={3,5,2,5,6,-1,5,6,9};
        int target=5;

        List<int[]> pairs=findPairsWithSum(numbers,target);
        System.out.println("Pairs with sum" + target + ":");
        for(int[] pair:pairs){
            System.out.println("(" + pair[0] + "," + pair[1] + ")");
            }
         }
}