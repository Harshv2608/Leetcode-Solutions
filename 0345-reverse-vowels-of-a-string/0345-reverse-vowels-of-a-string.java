class Solution {
    public boolean isvowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
    public String reverseVowels(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        char[] arr=s.toCharArray();
        while(i<j){
            while(i<j && !isvowel(s.charAt(i))){
                i++;
            }
            while(i<j && !isvowel(s.charAt(j))){
                j--;
            }
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String res=new String(arr);
        return res;
    }
}