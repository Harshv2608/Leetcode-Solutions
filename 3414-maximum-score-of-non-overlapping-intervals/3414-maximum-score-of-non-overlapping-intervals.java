class Solution {
    class Pair{
        long score;
        List<Integer> index;
        Pair(long score,List<Integer> index){
            this.score=score;
            this.index=index;
        }
    }
    public int binarySearchNext(int i,int[][]a,int n){
        int left=i+1;
        int right=n;
        int curr=a[i][1];
        while(left<right){
            int mid=left+(right-left)/2;
            if(a[mid][0]>curr){
                right=mid;
            }else{
                left=mid+1;
            }
        }return left;
    }
    public Pair better(Pair skip,Pair take){
        if(skip.score>take.score)return skip;
        if(take.score>skip.score)return take;
        List<Integer> a=new ArrayList<>(skip.index);
        List<Integer> b=new ArrayList<>(take.index);
        
        for(int i=0;i<Math.min(a.size(),b.size());i++){
            if(a.get(i)!=b.get(i)){
                if(a.get(i)<b.get(i))return skip;
                else return take;
            }
        }
        if(a.size()<b.size())return skip;
        else return take;
    }
    public int[] maximumWeight(List<List<Integer>> intervals) {
        int n=intervals.size();
        int[][]a=new int[n][4];
        for(int i=0;i<n;i++){
            a[i][0]=intervals.get(i).get(0);
            a[i][1]=intervals.get(i).get(1);
            a[i][2]=intervals.get(i).get(2);
            a[i][3]=i;
        }
        Arrays.sort(a,(x,y)->{
            if(x[0]!=y[0]){
                return Integer.compare(x[0],y[0]);
            }
            return Integer.compare(x[3],y[3]);
        });
        int[] nextIdx=new int[n];
        for(int i=0;i<n;i++){
            nextIdx[i]=binarySearchNext(i,a,n);
        }
        Pair[][] dp=new Pair[5][n+1];
        Pair empty=new Pair(0,new ArrayList<>());
        for(int k=0;k<5;k++){
            dp[k][n]=empty;
        }
        for(int i=0;i<=n;i++){
            dp[0][i]=empty;
        }
        for(int k=1;k<5;k++){
            for(int i=n-1;i>=0;i--){
                Pair skip=dp[k][i+1];
                int nxt=nextIdx[i];
                Pair takenext=dp[k-1][nxt];
                List<Integer> takeindex=new ArrayList<>(takenext.index);
                takeindex.add(a[i][3]);
                Collections.sort(takeindex);
                Pair take=new Pair(a[i][2]+takenext.score,takeindex);
                dp[k][i]=better(skip,take);
            }
        }
        List<Integer> sol=dp[4][0].index;
        int[] result=new int[sol.size()];
        for(int i=0;i<sol.size();i++){
            result[i]=sol.get(i);
        }
        return result;
    }
}