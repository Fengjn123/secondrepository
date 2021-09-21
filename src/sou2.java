public class sou2 {
    public static void main(String[] args) {
//        int chalk[]={5,4,1,12};
//        System.out.println(chalkReplacer(chalk,100000000));
        System.out.println(find("abpcplaaa","abpcplea"));

    }
    public static int chalkReplacer(int[] chalk, int k) {
            for(int i=0;i<chalk.length;i++){

                if(chalk[i]>k){
                    return i;
                }
                if(chalk[i]<=k) {

                    k-=2;
                }
                if(i==chalk.length-1){
                    // return 5;
                    return  chalkReplacer(chalk,k);
                }
            }
            return 0;
        }
    public static boolean find(String s,String s1){
        int b=0;

        for(int i=0;i<s.length();i++){
            for(int j=b;j<s1.length();j++){
                if(s1.length()-j<s.length()){
                    return false;
                }
                if(s.charAt(i)==s1.charAt(j)){

                    b=j+1;
                    break;
                }
                if(j==s1.length()-1){
                    return false;
                }

            }

        }
        return true;
    }
}
