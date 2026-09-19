class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        double dist=0;
        if(xCenter<x1 || xCenter>x2){
            dist+=Math.min((Math.pow(xCenter-x1,2)),(Math.pow(xCenter-x2,2)));
        }
        if(yCenter<y1 || yCenter>y2){
            dist+=Math.min((Math.pow(yCenter-y1,2)),(Math.pow(yCenter-y2,2)));
        }
        return dist<=radius*radius;
    }
}