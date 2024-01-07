public class CountWays_Problem_02{
    static  boolean isQueen(char bored[][],int row,int col){
        //vertical up

        for(int i=row-1;i>=0;i--){
            if(bored[i][col] == 'Q'){                 //No Change in Column
                return false;
            }
        }

        //Diagonal Left

        for(int i=row-1,  j=col-1;  i>=0&&j>=0;  i--,j--){
            if(bored[i][j] == 'Q'){
                return false;
            }

        }
        //Diagonal Right                                             where column increases



        for(int i=row-1,j=col+1 ; i>=0 && j< bored.length ; i-- ,j++){
            if(bored[i][j] == 'Q'){
                return false;
            }

        }
        return true;
    }

static  int count;
    static void Queen(char bored[][],int row){
        if(row == bored.length){
//            printall(bored);
            count++;
            return;
        }
        //column loop
        for(int j=0;j< bored.length;j++){
            if (isQueen(bored, row, j)) {
                bored[row][j]='Q';
                Queen(bored,row+1);
                bored[row][j]='X';
            }

        }

    }
    static void printall(char bored[][]){
        System.out.println("-------------------------------------------------------");
        for(int i=0;i< bored.length;i++){
            for(int j=0;j<bored.length;j++){
                System.out.print(bored[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=4;
        char bored[][] =new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                bored[i][j]='X';

            }
        }
        Queen(bored,0);

        System.out.println("The Number Ways TO assign The Queen Is "+ count);

    }
}
