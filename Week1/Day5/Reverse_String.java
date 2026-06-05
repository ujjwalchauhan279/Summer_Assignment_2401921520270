package Week1.Day5;

public class Reverse_String {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length-1;

        while(l<=r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
