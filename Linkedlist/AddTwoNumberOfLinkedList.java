package Linkedlist;

/* You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
Input: l1 = [7,2,4,3], l2 = [5,6,4]
Output: [7,8,0,7]

Example 2:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [8,0,7]

Example 3: 
Input: l1 = [0], l2 = [0]
Output: [0]
Constraints:
The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class AddTwoNumberOfLinkedList {

    public static LinkedList<Integer> addTwoList(LinkedList<Integer> list1, LinkedList<Integer> list2){
        var newList = new LinkedList<Integer>();
        int list1Count = list1.countNodes();
        int list2Count = list2.countNodes();
        
        while (list1Count < list2Count) {
            list1.insertNodeAtHead(0);
            list1Count++;
        }
        while (list2Count < list1Count) {
            list2.insertNodeAtHead(0);
            list2Count++;
        }
       
        var list1Item = list1.head;
        var list2Item = list2.head;
        
        while (list1Item != null || list2Item != null) {
            var list1CurrData = list1Item.data;
            var list2CurrData = list2Item.data;

            var currListTotal = (list1CurrData + list2CurrData ) %10;
            var currItem1NextData = list1Item.next != null ? (int)list1Item.next.data : 0;
            var currItem2NextData = list2Item.next != null ? (int)list2Item.next.data : 0;
            int currItemNextDataCarry = (currItem1NextData + currItem2NextData)/10;
            newList.insertNodeAtTail(currItemNextDataCarry + currListTotal);
            list1Item = list1Item.next;
            list2Item = list2Item.next;
        }
        return  newList;
    }
    public static void main(String[] args) {
        //  [7,2,4,3], l2 = [5,6,4]
         int[][] input1 = {{7,2,4,3},{5,6,4},};
        // int[][] input1 ={{2,4,3}, {5,6,4}};
        //int[][] input1 ={{0}, {0}};

        var list1 = new LinkedList<Integer>();
        for (int i = 0; i < input1[0].length; i++){
            list1.insertNodeAtTail(input1[0][i]);
        }
        var list2 = new LinkedList<Integer>();
        for (int i = 0; i < input1[1].length; i++){
            list2.insertNodeAtTail(input1[1][i]);
        }
        System.out.print("List 1: ");
        list1.printList();
        System.out.println();
        System.out.print("List 2: ");
        list2.printList();
        System.out.println();
        System.out.print("List 3: ");
        var newList = addTwoList(list1, list2);
        newList.printList();
    }
}
