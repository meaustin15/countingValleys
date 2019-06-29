public class Counting_Valleys {

    public static void main(String[] args){

        String s = "UDDDUDUU";
        int n = 8;

        System.out.print(countingValleys(n,s));
    }

    static int countingValleys(int n, String s){
        char[] alt = s.toCharArray();
        int valleys=0;
        int level = 0;
         for(int y=0; y < alt.length; y++ ){
             if(alt[y] == 'D'){
                level++;
             }else{
                 level--;
             }

             if(level == 0 && alt[y]=='U'){
                 valleys++;
             }
         }



        return valleys;
    }

}
