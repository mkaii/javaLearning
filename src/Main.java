import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello java");



        /*Scanner sc = new Scanner(System.in);

        for(int i = 0;i<5; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int element : arr)
        {
            System.out.print(element + " ");
        }
        System.out.println("\n");
        Arrays.sort(arr);

        for(int element : arr)
        {
            System.out.print(element + " ");
        }*/

        int [] nums = new int[]{3,2,4};
        int[] sol = new int[2];
        int target = 6;

        Map<Integer,Integer> m = new HashMap<>();
        //HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();//Creating HashMap
        int counterpart;
        for(int i = 0 ; i<nums.length ; i++)
        {
            m.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++)
        {
            int element = nums[i];
            counterpart = target - element;


            if(m.containsKey(counterpart) && m.get(counterpart)!=i)
            {
                sol[0] = i;
                sol[1] = m.get(counterpart);
                break;
            }
        }

        System.out.println("Pair is: \n" + sol[0] + " " + sol[1]);
    }
}
