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
  public ListNode oddEvenList(ListNode head) {
      if (head == null || head.next == null) return head;
      
      ListNode dummy1 = new ListNode(0, head);
      ListNode temp1 = head;
      ListNode temp2 = head.next;
      ListNode dummy2 = new ListNode(0, temp2);
      if (temp2.next == null) return head;
      while (temp1 != null && temp2 != null && temp1.next != null && temp2.next != null) {
          temp1.next = temp2.next;
          temp2.next = temp2.next.next;
          if (temp1 != null)
              temp1 = temp1.next;
          if (temp2 != null)
              temp2 = temp2.next;
      }
      temp1.next = dummy2.next;
      return dummy1.next;
  }
}