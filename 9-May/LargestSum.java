public class LargestSum {

    static int find(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum = sum+arr[j];
                if(max<sum){
                    max = sum;
                }
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[] = {1,2,-8,0,19,2,-10,29};

        int maxSum = find(arr);
        System.out.println(maxSum);
    }
    
}
