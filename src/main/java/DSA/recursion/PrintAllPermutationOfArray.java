package DSA.recursion;

import java.util.*;

public class PrintAllPermutationOfArray {
    static List<List<Integer>> lists = new ArrayList<>();
    static void permutation(int arr[],List<Integer> result, int pickNoPick[],int selected){
        if(arr.length == result.size()){
            lists.add(new ArrayList<>(result));
            return;
        }
        for(int i=0 ;i<arr.length;i++){
            if(pickNoPick[i] !=1){
                pickNoPick[i]=1;
                result.add(arr[i]);
                permutation(arr,result,pickNoPick,i);
                if(!result.isEmpty())
                result.remove(result.size()-1);
                pickNoPick[i]=0;
            }

        }


    }

    public static void main(String[] args) {
        System.out.println("----"+0%2);
        int arr[] ={1,2,3};
        List<Integer> result = new ArrayList<>();

        int map[] = new int[3];
        permutation(arr,result,map,0);
        lists.sort(Comparator.comparing(lists->lists.toString()));
        List<Integer> input = new ArrayList<>();
        for(Integer i : arr){
            input.add(i);
        }

        int flag =0;
        for(List<Integer> list : lists){
            if(flag ==1)
            {
                System.out.println(list);
                return;
            }
            if(list.toString().equals(input.toString()))
                flag =1;
        }


    }
}
