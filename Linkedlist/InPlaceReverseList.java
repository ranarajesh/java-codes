package Linkedlist;

public class InPlaceReverseList {
    public static void main(String[] args) {
        int[][] input = {{1, 2, 3, 4, 5},{1, 2, 3, 4, 5, 6},{3, 2, 1},{10},{1, 2}};
        for (int i = 0; i < input.length; i++) {
            LinkedList<Integer> list = new LinkedList<>();
            for (int j = 0; j < input[i].length; j++) {
                list.insertNodeAtTail(input[i][j]);
            }
            System.out.println();
            list.printList();
            reversList(list);
            list.printList();
        }
    }

    private static void reversList(LinkedList<Integer> list) {
       SinglyNode<Integer> prev = null;
       SinglyNode<Integer> curr = list.head;
       SinglyNode<Integer> next = null;
       while (curr != null) {
          next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
       }
       list.head = prev;       
    }
}
