/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
           if (head == null) return head;
        dfs(head);
        return head;
    }


    Node dfs(Node node){
        Node curr = node;
        Node last = null;

        while(curr != null){
            Node next = curr.next;

            if(curr.child != null){
                Node childHead = curr.child;
                Node childTail = dfs(childHead);

                curr.next = childHead;
                childHead.prev = curr;

                if(next != null){
                      childTail.next = next;
                    next.prev = childTail;
                }

                curr.child = null;
                last = childTail;
                curr = childTail;
            }else last = curr;
            curr = curr.next;
        }

        return last;
    }
}