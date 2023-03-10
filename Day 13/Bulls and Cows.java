class Solution {
    public String getHint(String secret, String guess) {
        int bulls=0, cows=0;
        int num[]=new int[10];
        for(int i=0;i<secret.length();i++){
            int s=secret.charAt(i)-'0';
            int g=guess.charAt(i)-'0';
            if(s==g)
                bulls++;
            else{
                if(num[s]++<0)
                    cows++;
                if(num[g]-->0)
                    cows++;
            }
        }

        return bulls+"A"+cows+"B";
    }
}
