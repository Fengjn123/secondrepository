class last {
    public static int lengthOfLastWord(String s) {
        int n=s.length();
        int cout=0;
        int flag=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=' '){cout++;flag=cout++;}
            if(s.charAt(i)==' ')cout=0;
        }
        if(cout==0)return flag;
        return cout;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}