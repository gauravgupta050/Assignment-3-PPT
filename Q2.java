import java.util.*;

public class Q2 {

    public static List<List<Integer>> findQuadruple(int[] arr, int target){
        Arrays.sort(arr);

        List<List<Integer>> allQuadruple = new ArrayList<>();

        for(int i=0;i<arr.length-3;i++){
            for(int j=0;j<arr.length-2;j++){
                int sum = target - arr[i] - arr[j];
                int lo= j+1; 
                int hi = arr.length-1;

                while(lo<hi){
                    int temp = arr[lo] + arr[hi];
                    if(temp == sum){
                        allQuadruple.add(Arrays.asList(arr[lo], arr[hi] , arr[i], arr[j]));
                        lo++;
                        hi--;
                    }
                    else if(temp>sum){
                        hi--;
                    }
                    else{
                        lo++;
                    }
                }
            }
        }
        return allQuadruple;
 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target valiue:");
        int target = sc.nextInt();

        System.out.println(Q2.findQuadruple(arr, target));

    }
    
}
