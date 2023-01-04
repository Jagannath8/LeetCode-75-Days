class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode output = null;
        while(head!=null){
            ListNode temp = head.next;
            head.next = output;
            output = head;
            head = temp;
        }
        return output;
    }
}
