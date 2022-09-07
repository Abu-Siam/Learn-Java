package org.example;

import java.util.Stack;

public class tree {
    public static class node{
        Integer val;
        node left;
        node right;
        public node(int val){
            this.val = val;

        }
    }
//    public static node insert(node n,int val){
//        if (n == null ){
//            n = new node(val);
//
//        }
//        else if(n.val<val){
//          insert(n.right,val);
//        }
//        else if(n.val>val){
//            insert(n.right,val);
//
//        }
//        return n;
//    }
    public static void dfs(node root){
        Stack<node> s = new Stack<>();
        s.push(root);
        while(s.size()>0){
            node current = s.pop();
            System.out.print(current.val+" ");

            if (current.right!=null){
                s.push(current.right);
            }
            if(current.left!=null){
                s.push(current.left);
            }
        }
    }

    static void printPostorder(node n)
    {
        if (n == null)
            return;

        // first recur on left subtree
        printPostorder(n.left);

        // then recur on right subtree
        printPostorder(n.right);

        // now deal with the node
        System.out.print(n.val + " ");
    }
    static void printPreorder(node n)
    {
        if (n == null)
            return;
        System.out.print(n.val + " ");

        // first recur on left subtree
        printPreorder(n.left);

        // then recur on right subtree
        printPreorder(n.right);

        // now deal with the node
    }
    static void printinorder(node n)
    {
        if (n == null)
            return;

        // first recur on left subtree
        printinorder(n.left);
        System.out.print(n.val + " ");

        // then recur on right subtree
        printinorder(n.right);

        // now deal with the node
    }

    public static void insert(node n, int value)
    {
        if (value < n.val)
        {
            if (n.left != null)
            {
                insert(n.left, value);
            } else
            {
                System.out.println("  Inserted " + value + " to left of Node " + n.val);
                n.left = new node(value);
            }
        }
        else if (value > n.val)
        {
            if (n.right != null)
            {
                insert(n.right, value);
            } else
            {
                System.out.println("  Inserted " + value + " to right of Node " + n.val);
                n.right = new node(value);
            }
        }
    }
    public static node insert2(node n, int value)
    {
        if (n == null){
            n = new node(value);
            return n;
        }
        if (value < n.val)
        {

                insert2(n.left, value);

        }
        else if (value > n.val)
        {

                insert2(n.right, value);

        }
        return n;
    }

    public Integer test(vari v){
        v.x+=1;
        return v.x;

    }
    public static class vari{
        Integer x;
        public vari(){
            this.x = 12;
        }
    }

}

