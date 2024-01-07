public class Problem_01 {
    static void bt(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");

            }
            else{
                System.out.println(ans);
            }
     return;   }
        bt(str,ans+str.charAt(i),i+1);
        bt(str, ans, i+1);

    }

    public static void main(String[] args) {
        String yashu="abc";
        bt(yashu,"",0);
    }
}
