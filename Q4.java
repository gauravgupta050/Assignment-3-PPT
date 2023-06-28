import java.util.Scanner;


public class Q4 {
    public static int find(int[] nums, int target){
        
        int lo = 0;
        int hi = nums.length-1;
        
        

        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            
            if(nums[mid] == target){
                
                return mid;
            }
            else if(target >nums[mid])
            {
                lo++;
            }
            else{
                hi++;
            }
        }
        
        return lo;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of array in sorted order");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value to target");
        int target = sc.nextInt();
        
        int result = find(nums, target);
        /*if(count == 1){
            System.out.println("The place where the target value exist would be "+result);
        }
        else{
            System.out.println("The index of target value is "+result);
        }*/
        System.out.println("Index is "+ result);
    }
    
}
