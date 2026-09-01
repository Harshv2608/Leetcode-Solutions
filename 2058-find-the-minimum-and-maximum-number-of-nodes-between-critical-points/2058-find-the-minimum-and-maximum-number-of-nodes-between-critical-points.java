/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode curr=head.next;
        ListNode prev=head;
        int min=Integer.MAX_VALUE;
        int index=1;
        int first=-1;
        int previ=-1;
        while(curr.next!=null){
            ListNode next=curr.next;
            boolean ismax=curr.val>next.val && curr.val>prev.val;
            boolean ismin=curr.val<next.val && curr.val<prev.val;
            if(ismax || ismin){
                if(first==-1){
                    first=index;
                }else{
                    min=Math.min(min,index-previ);
                }
                previ=index;
            }
            prev=curr;
            curr=next;
            index++;
        }
        if(previ==first){
            return new int[]{-1,-1};
        }
        return new int[]{min,previ-first};
    }
}