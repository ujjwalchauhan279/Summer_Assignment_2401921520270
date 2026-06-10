public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public int strStr(String h, String n) {
        int x = h.length();
        int y = n.length();

        for(int i=0; i<=x-y; i++){
            for(int j=0; j<y; j++){
                if(h.charAt(i+j) != n.charAt(j)){
                    break;
                }
            if(j == y-1) return i;
            }
        }
        return -1;
    }
}
