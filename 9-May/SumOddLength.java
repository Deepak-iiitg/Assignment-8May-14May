public class SumOddLength {

    static void oddSum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int j=i;
          
            for(j=i;j<arr.length;j=j+2){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum = sum+arr[k];
                }
                System.out.println(sum);
            }
            //System.out.println(sum);
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        oddSum(arr);
    }
    
}
