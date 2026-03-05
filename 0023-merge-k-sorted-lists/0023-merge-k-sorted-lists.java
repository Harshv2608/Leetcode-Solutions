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
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        List<Integer> ans=new ArrayList<>();
        for(ListNode node: lists){
            while(node!=null){
                ans.add(node.val);
                node=node.next;
            }
        }
        Collections.sort(ans);
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int val : ans){
            curr.next=new ListNode(val);
            curr=curr.next;
        }
        return dummy.next;
    }
}