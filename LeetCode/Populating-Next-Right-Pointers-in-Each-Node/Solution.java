1class Solution {
2    public Node connect(Node root) {
3        if (root == null) return null;
4
5        Node leftmost = root;
6
7        while (leftmost.left != null) {
8            Node current = leftmost;
9
10            while (current != null) {
11                current.left.next = current.right;
12
13                if (current.next != null) {
14                    current.right.next = current.next.left;
15                }
16
17                current = current.next;
18            }
19
20            leftmost = leftmost.left;
21        }
22
23        return root;
24    }
25}