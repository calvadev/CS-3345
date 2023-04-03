package application;

//Java program for insertion in AVL Tree
class Node {
	int key, height;
	Node left, right;

	Node(int d) {
		key = d;
		height = 1;
	}
}

class AVLTree {

	//Declare the root node.

	private AVLNode root;

	//Define the constructor.

	public AVLTree()

	{

	//Set the root node.

	root = null;

	}

	//Define the method to insert the node.

	public void insert(String isbn, Book book)

	{

	//Call the helper function to insert the node.

	root = insert(isbn, book, root);

	}

	//Define the method to compute the height.

	private int height(AVLNode t)

	{

	//Return -1 if the tree is empty.

	if (t == null)

	{

	return -1;

	}

	//Otherwise, return the height of the node.

	else

	{

	return t.height;

	}

	}

	//Define the helper function to compute

	// the maximum value.

	private int max(int left, int right)

	{

	//Compare and return the maximum value.

	if (left > right)

	{

	return left;

	}

	else

	{

	return right;

	}

	}

	//Define a helper function to compare the

	// isbn of 2 books.

	private int compare(String s1, String s2)

	{

	//Start the loop to traverse the string.

	for(int i=0;i<s1.length();i++)

	{

	//Check if the current character is not a '-'.

	if(s1.charAt(i)!='-')

	{

	//Return 1 if the first string is greater

	// than the second string.

	if(s1.charAt(i) > s2.charAt(i))

	{

	return 1;

	}

	//Return 0 if the second string is greater

	// than the first string.

	else if (s2.charAt(i) > s1.charAt(i))

	{

	return 0;

	}

	}

	}

	return 0;

	}

	//Define the helper function to insert a node in the tree.

	private AVLNode insert(String isbn, Book book, AVLNode top)

	{

	//Create a new node if the tree is empty.

	if (top == null)

	{

	top = new AVLNode(isbn, book);

	}

	//Check if the isbn is less than the key value or not.

	// else if (Integer.parseInt(isbn) < Integer.parseInt(top.key))

	else if (compare(top.key, isbn) == 1)

	{

	//Call the method again with the left subtree.

	top.leftPtr = insert(isbn, book, top.leftPtr);

	//Check for imbalance and show the error message.

	if (height(top.leftPtr) - height(top.rightPtr) == 2)

	{

	System.out.print("Imbalance occurred at inserting ISBN " + isbn);

	//Compare the key value to check the imbalance.

	//if (Integer.parseInt(isbn) < Integer.parseInt(top.leftPtr.key))

	if (compare(top.leftPtr.key, isbn) == 1)

	{

	//Display the message and fix the imbalance.

	System.out.println("; fixed in left Rotation");

	top = rotateWithLeftChild(top );

	}

	else

	{

	//Display the message and fix the imbalance.

	System.out.println("; fixed in RightLeft Rotation");

	top = doubleWithLeftChild(top);

	}

	}

	}

	//Check if the isbn is greater than the key value or not.

	//else if (Integer.parseInt(isbn) > Integer.parseInt(top.key))

	else if (compare(top.key, isbn) == 0)

	{

	//Call the method again with the right subtree.

	top.rightPtr = insert(isbn, book, top.rightPtr);

	//Check for imbalance and show the error message.

	if (height(top.rightPtr) - height(top.leftPtr) == 2)

	{

	System.out.print("Imbalance occurred at inserting ISBN " + isbn);

	//Compare the key value to check the imbalance.

	//if (Integer.parseInt(isbn) > Integer.parseInt(top.rightPtr.key))

	if (compare(top.rightPtr.key, isbn) == 0)

	{

	//Display the message and fix the imbalance.

	System.out.println("; fixed in Right Rotation");

	top = rotateWithRightChild(top);

	}

	else

	{

	//Display the message and fix the imbalance.

	System.out.println("; fixed in LeftRight Rotation");

	top = doubleWithRightChild(top);

	}

	}

	}

	//Compute the height of the node.

	top.height = max(height(top.leftPtr), height(top.rightPtr)) + 1;

	//Return the node.

	return top;

	}

	//Define the method to rotate with left sub tree.

	private AVLNode rotateWithLeftChild(AVLNode k2)

	{

	//Rotate the tree with the given node.

	AVLNode k1 = k2.leftPtr;

	k2.leftPtr = k1.rightPtr;

	k1.rightPtr = k2;

	//Compute the height of the modified nodes.

	k2.height = max(height(k2.leftPtr), height(k2.rightPtr)) + 1;

	k1.height = max(height(k1.leftPtr), k2.height) + 1;

	//Return the modified node.

	return k1;

	}

	//Define the method to rotate with right sub tree.

	private AVLNode rotateWithRightChild(AVLNode k1)

	{

	//Rotate the tree with the given node.

	AVLNode k2 = k1.rightPtr;

	k1.rightPtr = k2.leftPtr;

	k2.leftPtr = k1;

	//Compute the height of the modified nodes.

	k1.height = max(height(k1.leftPtr), height(k1.rightPtr)) + 1;

	k2.height = max(height(k2.rightPtr), k1.height) + 1;

	//Return the modified node.

	return k2;

	}

	//Define the method doubleWithLeftChild().

	private AVLNode doubleWithLeftChild(AVLNode k3)

	{

	//Call the rotate right method with the

	// left subtree.

	k3.leftPtr = rotateWithRightChild(k3.leftPtr);

	//Return the result of the rotateWithLeftChild() method.

	return rotateWithLeftChild(k3);

	}

	//Define the method doubleWithRightChild().

	private AVLNode doubleWithRightChild(AVLNode k1)

	{

	//Call the rotate left method with the

	// right subtree.

	k1.rightPtr = rotateWithLeftChild(k1.rightPtr);

	//Return the result of the rotateWithRightChild() method.

	return rotateWithRightChild(k1);

	}

	//Define the method inorder().

	public void inorder()

	{

	//Call the method inorder() to print

	// the nodes of the tree.

	inorder(root);

	}

	//Define the helper method inorder().

	private void inorder(AVLNode r)

	{

	//Check if the node is empty or not.

	if (r != null)

	{

	//Call the method with the left sub tree.

	inorder(r.leftPtr);

	//Print the key value.

	System.out.print(r.key + " ");

	//Call the method with the right sub tree.

	inorder(r.rightPtr);

	}

	}


}
//This code has been contributed by Mayank Jaiswal
