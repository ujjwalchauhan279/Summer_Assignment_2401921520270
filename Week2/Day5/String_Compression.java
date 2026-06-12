package Week2.Day5;

public class String_Compression {
    public int compress(char[] chars) {
        int i = 0;
        int index = 0;
        while(i<chars.length){
            char currChar = chars[i];
            int count = 0;

            while(i<chars.length && currChar == chars[i]){
                count++;
                i++;
            }

            chars[index] = currChar;
            index++;

            if(count>1){
                String c = String.valueOf(count);
                for(int j=0; j<c.length(); j++){
                    chars[index++] = c.charAt(j);
                }
            }
        }
        return index;
    }
}
