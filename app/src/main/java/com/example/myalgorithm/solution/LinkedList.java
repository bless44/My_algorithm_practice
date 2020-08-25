package com.example.myalgorithm.solution;
//链表题
//1.链表表尾为 null;
//2.大部分题可以使用预先节点，现节点,临时节点和下一节点
// ListNode prev;
// ListNode curr;
// ListNode temp;
// ListNode next;
public class LinkedList {
    public LinkedList() {

    }

    //q2两链表值之和
    public ListNode addTwoNumber(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(list1.val + list2.val);
        return null;
    }

    //q206反转链表
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static ListNode createLinkedList(int size) {
        ListNode linkedList = new ListNode(0);
        for(int i = 0; i < size; i++) {
            linkedList.next = new ListNode(i);
        }
        return linkedList;
    }
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        ListNode List = createLinkedList(4);
        ListNode reverseList =  linkedList.reverseList(List);
        System.out.println("result:");
        while (reverseList != null) {
            System.out.println(reverseList.val);
            reverseList= reverseList.next;
        }
    }
}
