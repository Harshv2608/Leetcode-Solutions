class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            if(digits[i]==0)continue;
            for(int j=0;j<n;j++){
                if(i==j)continue;
                for(int k=0;k<n;k++){
                    if(j==k || i==k)continue;
                    int num=digits[i]*100+digits[j]*10+digits[k];
                    if(num%2==0)st.add(num);
                }
            }
        }
        return st.size();
    }
}