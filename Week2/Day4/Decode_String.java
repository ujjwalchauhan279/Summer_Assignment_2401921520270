package Week2.Day4;

import java.util.Stack;

public class Decode_String {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        Stack<Integer> numSt = new Stack<>();

        String currStr = "";
        String prevStr = "";
        int currNum = 0;
        int prevNum = 0;

        for(Character c: s.toCharArray()){
            if(Character.isDigit(c)){
                currNum = currNum*10 + (c-'0');
            }
            else{
                if(c=='['){
                    st.push(currStr);
                    numSt.push(currNum);
                    currStr="";
                    currNum=0;
                }
                else if(c==']'){
                    prevNum = numSt.pop();
                    prevStr = st.pop();
                    String str = "";
                    while(prevNum!=0){
                        str+=currStr;
                        prevNum--;
                    }
                    currStr = prevStr + str;
                }
                else{
                    currStr += c;
                }
            }
        }

        return currStr;
    }
}
