import java.util.*;
public class ModeInBst {
    // Leetcode - 501 -> https://leetcode.com/problems/find-mode-in-binary-search-tree/
    static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) { 
            this.val = val; 
            this.left = null;
            this.right = null;
        }
    }
    public static int[] findMode(Node root) {
        List<Integer> inorderr = new ArrayList<>();
        inorder(root, inorderr);

        Map<Integer, Integer> freq = new HashMap<>();
        int maxCount = 0;

        for (int val : inorderr) {
            freq.put(val, freq.getOrDefault(val, 0) + 1);
            maxCount = Math.max(maxCount, freq.get(val));
        }

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == maxCount) {
                result.add(entry.getKey());
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }

    public static void inorder(Node root, List<Integer> result) {
        if (root == null){
            return; 
        }
        result.add(root.val);
        inorder(root.left, result);
        inorder(root.right, result);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.right = new Node(2);

        int mode[] = findMode(root);
        for (int i : mode) {
            System.out.print(i+" ");
        }
    }
}
