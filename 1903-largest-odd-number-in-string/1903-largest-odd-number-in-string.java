class Solution {
    public String largestOddNumber(String num) {
        int i=num.length()-1;
        while(i>=0){
            if(num.charAt(i)=='1' || num.charAt(i)=='3' || num.charAt(i)=='5' || num.charAt(i)=='7' || num.charAt(i)=='9'){
                break;
            }else{
                i--;
            }    
        }
        return num.substring(0,i+1);
    }
}