class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq=new int[10];
        for(int i:digits){
            freq[i]++;
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=100;i<999;i=i+2){
            int[] dfreq=new int[10];
            int num=i;
            while(num>0){
                int d=num%10;
                dfreq[d]++;
                num/=10;
            }
            boolean flag=true;
            for(int j=0;j<10;j++){
                if(dfreq[j]>freq[j]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                ans.add(i);
            }
        }
        int[] sol=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            sol[i]=ans.get(i);
        }
        return sol;
    }
}