public class GridWays {
    static int gridWays(int i,int j,int n,int m){
        if (i == n-1 && j == m-1){      // Condition For Last Call
            return 1;
        } else if (i == n || j == n) {   //Boundary Cross Condition
            return 0;
            
        }

        int w1 = gridWays(i+1,j,n,m);//This For Down
        int w2 = gridWays(i,j+1,n,m);
        return  w1+w2;
    }

    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(gridWays(0 ,0,n,m));
    }
}
