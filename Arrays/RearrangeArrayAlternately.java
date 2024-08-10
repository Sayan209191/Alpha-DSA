public class RearrangeArrayAlternately {
    // given an sorted array
    public static void rearrangeArray(int arr[]) {
        int n=arr.length;
        int max_indx=n-1; 
        int min_indx=0;
        int max_ele=arr[n-1]+1;  // 
        for(int i=0;i<n;i++){
            // even index put maximum value
            if(i%2==0){
                arr[i]+=((arr[max_indx]%max_ele)*max_ele);
                max_indx--;  // update maximum value index
            }
            // Odd index put minimum value
            else{
                arr[i]+=((arr[min_indx]%max_ele)*max_ele);
                min_indx++; // update minimum value index
            }
        }
        for(int i=0;i<n;i++){
            // divide every element by maimum value to calculate orginal value
            arr[i]/=max_ele;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[]={10,20,30,40,50,60,70,80};
        rearrangeArray(numbers);
        
    }
}
