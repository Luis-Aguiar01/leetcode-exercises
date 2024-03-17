package algorithms.exercise;

public class InsertGreatestCommonDivisorsInLinkedList_2807 {

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode currentList = head;

        while (currentList != null && currentList.next != null) {
            int value1 = currentList.val;
            int value2 = currentList.next.val;
            int result = 0;

            while (value2 != 0) {
                int temp = value2;
                value2 = value1 % value2;
                value1 = temp;
            }

            result = value1;

            ListNode newNode = new ListNode(result);
            newNode.next = currentList.next;
            currentList.next = newNode;

            currentList = currentList.next.next;
        }

        return head;
    }
}