public class BackTrack {
    public static  void printChan(int arr[],int i,int val){
        int n=arr.length;
        if(i == n) {
            printall(arr);
            return;
        }
      arr[i] = val;
        printChan(arr,i+1,val+1);
        arr[i] =arr[i] -2;                     //This BackTracking
    }

    static  void printall(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int yashu[]=new int[5];
        printChan(yashu,0,1);
        printall(yashu);
    }
}
