import java.util.*;

public class Q7 {
    public static List<String> findRange(int[] nums, int lower, int upper){
        ArrayList<String> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(lower<nums[i]){
                if(nums[i] - lower == 1){
                    res.add(lower + "");
                }
                else{
                    res.add(lower + "->" + (nums[i] - 1));
                }
            }
            if(nums[i] == Integer.MAX_VALUE){
                return res;
            }
            lower = nums[i] + 1;
        }
        if(lower < upper){
            res.add(lower + "->" + upper);
        }
        else if(lower == upper){
            res.add(lower + "");
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the lower range");
        int lower = sc.nextInt();
        System.out.println("Enter the upper range");
        int upper = sc.nextInt();

        System.out.println("The ArrayList is "+findRange(nums,lower,upper));

    }

}
