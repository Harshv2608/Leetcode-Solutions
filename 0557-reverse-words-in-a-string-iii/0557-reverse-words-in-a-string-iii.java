class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            char[] sol=arr[i].toCharArray();
            int start=0;
            int end=sol.length -1;
            while(start<=end){
                char temp=sol[start];
                sol[start]=sol[end];
                sol[end]=temp;
                start++;
                end--;
            }
            arr[i]=new String(sol);
        }
        return String.join(" ",arr);
    }
}