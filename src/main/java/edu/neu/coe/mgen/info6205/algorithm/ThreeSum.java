package edu.neu.coe.mgen.info6205.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
//    private final List<Integer> num;

    public ThreeSum() {

    }

    public ArrayList<ArrayList<Integer>> threeSum(List<Integer> num){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Collections.sort(num);
        for(int i = 0;i < num.size()-2;i++){
            if(i!=0 && num.get(i) == num.get(i-1)) continue;
            int left = i+1, right = num.size()-1, sum = -num.get(i);
            while(left < right){
                if(num.get(left) + num.get(right) == sum){
                    ArrayList<Integer> triple = new ArrayList<>();
                    triple.add(num.get(i));
                    triple.add(num.get(left));
                    triple.add(num.get(right));
                    result.add(triple);
                    left++;
                    right--;
                    while(left < right && num.get(left) == num.get(left-1))
                        left++;
                    while(left < right && num.get(right) == num.get(right+1))
                        right--;
                }
                else if(num.get(left) + num.get(right) < sum)
                    left++;
                else
                    right--;
            }
        }
        return result;
    }
}
