package com.example.myalgorithm.solution;

//链表题
//1.单链表表尾为 null;
//2.大部分题可以使用预先节点，现节点,临时节点和下一节点
// ListNode prev;
// ListNode curr;
// ListNode temp;
// ListNode next;
// ListNode dummy; //虚拟节点
//3.list.next 为指向作用
// list.next = list.next.next; //跳过下一节点，即删除某节点，Java具有垃圾回收机制
public class LinkedList {
    public LinkedList() {

    }
    public static ListNode createLinkedList(int size) {
        ListNode linkedList = new ListNode(0);
        ListNode temp = linkedList;
        for (int i = 1; i < size; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        temp.next = null;
        ListNode printList = temp;
//        System.out.println("Create linkedList:");
//        while (printList != null) {
//            System.out.println(printList);
//            printList = printList.next;
//        }
        return linkedList;
    }
    //q2 两链表值之和
    public static ListNode addTwoNumber(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(list1.val + list2.val);
        return null;
    }

    //q206 反转链表
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

    //q19 删除倒数第N个节点
    //两次遍历 单指针
    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (first != null) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }
    //一次遍历 双指针
    public static ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for (int i = 0; i < n + 1; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    //旋转链表

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        ListNode list = createLinkedList(6);
        System.out.println("result:");
        //反转链表
//        ListNode resultList = reverseList(list);
        ListNode resultList = removeNthFromEnd1(list, 2);
        while (resultList != null) {
            System.out.println(resultList.val);
            resultList = resultList.next;
        }
    }
}
