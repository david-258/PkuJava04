public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] tempArr = s.split(" ");
        StringBuffer tempStr = new StringBuffer();
        for(int i=tempArr.length-1;i>=0;i--){
            if(tempArr[i].length() != 0){
                tempStr.append(tempArr[i]);
                if(i<=tempArr.length-1 && i>0){
                    tempStr.append(" ");
                }
            }
        }
        
        String newStr = tempStr.toString();
        //newStr = newStr.trim();
        return newStr;
    }
}
