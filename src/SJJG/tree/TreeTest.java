package SJJG.tree;

import java.util.Arrays;
import java.util.LinkedList;

public class TreeTest {
    public static void main(String[] args) {
               LinkedList linkListTest=new LinkedList<Integer>(Arrays.asList(new Integer[]{
                       3,2,9,null,null,10,null,null,8,null,4
               }));
               TreeNode treeNode=createBinaryTree(linkListTest);
                System.out.print("前序遍历");
                preOrderTraveral(treeNode);
                System.out.print("中序遍历");
                inOrderTraveral(treeNode);
                System.out.print("后序遍历");
                postOrderTraveral(treeNode);
    }

    /*
    构建二叉树
     */
    public static TreeNode createBinaryTree(LinkedList<Integer> inputList) {
        TreeNode treeNode = null;
        if (inputList == null || inputList.isEmpty()) {
            return null;
        }
        Integer data = inputList.removeFirst();
        if (data != null) {
            treeNode = new TreeNode(data);
            treeNode.leftChild = createBinaryTree(inputList);
            treeNode.rightChild = createBinaryTree(inputList);
        }
        return treeNode;
    }

    /*
      前序遍历
     */
    public static void preOrderTraveral(TreeNode treeNode){
        if(treeNode ==null){
            return;
        }
        System.out.print(treeNode.data);
        preOrderTraveral(treeNode.leftChild);
        preOrderTraveral(treeNode.rightChild);
    }

    /*
    中序遍历
     */
    public static void inOrderTraveral(TreeNode treeNode){
        if(treeNode ==null){
            return;
        }
        inOrderTraveral(treeNode.leftChild);
        System.out.print(treeNode.data);
        inOrderTraveral(treeNode.rightChild);
    }

    public static void postOrderTraveral(TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        postOrderTraveral(treeNode.leftChild);
        postOrderTraveral(treeNode.rightChild);
        System.out.print(treeNode.data);
    }

    private static class TreeNode{
        int data;
        TreeNode leftChild;
        TreeNode rightChild;

        public TreeNode(int data){
            this.data=data;
        }
        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public TreeNode getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(TreeNode leftChild) {
            this.leftChild = leftChild;
        }

        public TreeNode getRightChild() {
            return rightChild;
        }

        public void setRightChild(TreeNode rightChild) {
            this.rightChild = rightChild;
        }
    }
}
