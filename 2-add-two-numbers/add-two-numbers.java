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
    // public static void print(ListNode res)
    // {
    //     while(res!=null)
    //     {
    //         System.out.print(res.val+"->");
    //         res=res.next;
    //     }
    //     System.out.println("null");
    // }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode finalans=new ListNode();
        ListNode ans=finalans;
        int carry = 0;
        while((l1!=null) && (l2!=null)){
            int temp = l1.val+l2.val+carry;
            ans.next= new ListNode(temp%10);
            carry = temp/10;
            ans = ans.next;l1 = l1.next;l2 = l2.next;
        }
        while(l1!=null){
            int temp = l1.val+carry;
            ans.next= new ListNode(temp%10);
            carry = temp/10;
            ans = ans.next;l1 = l1.next;

        }while(l2!=null){
            int temp = l2.val+carry;
            ans.next = new ListNode(temp%10);
            carry = temp/10;
            ans = ans.next;l2 = l2.next;
        }
        // print(ans);
        // print(finalans);
        if(carry>0)
        {
            ans.next=new ListNode(carry);
            ans=ans.next;
        }
        return finalans.next;
    }
}