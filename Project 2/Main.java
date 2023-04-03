package application;
import java.util.*;
import java.io.*;

public class Main {
	static class Node{

		int key;

		Node left,right;

		public Node(int key){

		this.key = key;

		left = null;

		right = null;

		}

		}

		  

		public static void insert(Node root,int key){

		Random rand = new Random();

		int num = rand.nextInt(2);

		if (num==0){ //insert in left sub tree with 0.5 probability

		if (root.left!=null){

		insert(root.left,key);

		return;

		}

		else{

		Node temp = new Node(key);

		root.left = temp;

		return;

		}

		  

		}

		else{ //insert in right sub tree with 0.5 probability

		if (root.right!=null){

		insert(root.right,key);

		return;

		}

		else{

		Node temp = new Node(key);

		root.right = temp;

		return;

		}

		}

		}

		/*Check if max key in left subtree is less than current key and min key in right subtree is greater than current key*/

		static boolean checkBSTOrder(Node root) {

		return isBST(root, Integer.MIN_VALUE,

		Integer.MAX_VALUE);

		}

		/* Returns true if the given tree is a BST*/

		static boolean isBST(Node node, int min, int max)

		{

		/* an empty tree is BST */

		if (node == null)

		return true;

		/* false if this node violates the min/max constraints */

		if (node.key < min || node.key > max)

		return false;

		/* otherwise check the subtrees recursively

		tightening the min/max constraints */

		// Allow only distinct values

		return (isBST(node.left, min, node.key-1) &&

		isBST(node.right, node.key+1, max));

		}

		static class Height{

		int height=0;

		}

		static int height(Node node)

		{

		/* base case tree is empty */

		if (node == null)

		return 0;

		/* If tree is not empty then height = 1 + max of left

		height and right heights */

		return 1 + Math.max(height(node.left), height(node.right));

		}

		static boolean checkAVLProperty(Node root,Height height){

		/* If tree is empty then return true */

		if (root == null)

		{

		height.height = 0;

		return true;

		}

		/* Get heights of left and right sub trees */

		Height lheight = new Height();

		Height rheight = new Height();

		boolean l = checkAVLProperty(root.left, lheight);

		boolean r = checkAVLProperty(root.right, rheight);

		int lh = lheight.height;

		int rh = rheight.height;

		/* Height of current node is max of heights of

		left and right subtrees plus 1*/

		height.height = (lh > rh? lh: rh) + 1;

		/* If difference between heights of left and right

		subtrees is more than 2 then this node is not balanced

		so return 0 */

		if (Math.abs(lh - rh)>=2)

		return false;

		/* If this node is balanced and left and right subtrees

		are balanced then return true */

		else

		return l && r;

		}

		  

		public static void main(String[] args) {

		Random rand = new Random();

		int num = rand.nextInt(50);

		Node root = new Node(num);

		int array[] = new int[50]; //make an array of length 50 to check whether the random number generated is unique or has been generated earlier

		array[num]=1;

		for (int i=0;i<10;i++){ //insert 10 more keys in the BST

		while (true){ //generate a random number that has not been geerated earlier

		num = rand.nextInt(50);

		if (array[num]==0){

		array[num] = 1; //mark that this number is generated now

		break;

		}

		}

		insert(root,num);

		}

		if (checkBSTOrder(root)){

		System.out.println("It is following BST order property.");

		}

		else{

		System.out.println("It is not following BST order property.");

		}

		Height height = new Height();

		if (checkAVLProperty(root,height)){

		System.out.println("It is following AVL balance condition.");

		}

		else{

		System.out.println("It is not following AVL balance condition.");

		}

		}
}
