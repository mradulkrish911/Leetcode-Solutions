class Solution {
    public int findTheWinner(int n, int k) {
        CircularLinkedList li = new CircularLinkedList();

        for(int i = 1; i <= n; i++){
            li.insert(i);
        }

        if(k == 1){
            return n;
        }
        
        Node temp = li.head;

        while(temp.next != temp){
            for(int i = 1; i < k - 1; i++){
                temp = temp.next;
            }

            temp.next = temp.next.next;
            temp = temp.next;
        }

        return temp.data;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    class CircularLinkedList {
        Node head;
        Node tail;

        void insert(int data) {
            Node newNode = new Node(data);

            if(head == null) {
                head = newNode;
                tail = newNode;
                tail.next = head;
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
        }
    }
}