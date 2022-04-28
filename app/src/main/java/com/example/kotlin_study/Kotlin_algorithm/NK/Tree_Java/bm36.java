package com.example.kotlin_study.Kotlin_algorithm.NK.Tree_Java;



public class bm36 {

    Boolean isBalance = true;

    public boolean IsBalanced_Solution(TreeNode root) {
        judge(root);
        return isBalance;
    }

    private int judge(TreeNode root){

        if (root == null)return 0;

        int left = judge(root.left);
        if (!isBalance)return left;
        int right = judge(root.right);
        if (!isBalance)return right;
        if (Math.abs(left - right) > 1){
            isBalance = false;
            return left;
        }else return left > right ? left+1 : right + 1;

    }

}
