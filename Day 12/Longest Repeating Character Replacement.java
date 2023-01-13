class Solution {
    public int characterReplacement(String s, int k) {
        int start=0, count=0, ans=0;
        int c[]=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            c[s.charAt(i)-'A']++;
            count=Math.max(count, c[s.charAt(i)-'A']);
            while(i-start-count>k-1){
                c[s.charAt(start++)-'A']--;
            }
            ans=Math.max(ans, i-start+1);
        }
        return ans;
    }
}
