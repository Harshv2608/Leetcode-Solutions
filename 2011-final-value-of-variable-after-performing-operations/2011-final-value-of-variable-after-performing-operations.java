class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int min=0;
        int max=0;
        for(int i=0;i<operations.length;i++){
            char[] x=operations[i].toCharArray();
            if(x[1]=='-'){
                min++;
            }else{max++;}
        }return max-min;
    }
}