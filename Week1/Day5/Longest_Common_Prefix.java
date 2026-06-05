package Week1.Day5;

public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] str) {
        String ans = str[0];

        for(int i=1; i<str.length; i++){
            int j=0;
            while(j<ans.length() && j<str[i].length()){
                if(ans.charAt(j) != str[i].charAt(j)) break;
                j++;
            }
            ans = ans.substring(0, j);
        }
        return ans;
    }
}
