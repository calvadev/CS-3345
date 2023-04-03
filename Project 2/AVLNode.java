package application;

public class AVLNode {
	  //Define the data members.

	  String key;

	  Book value;

	  int height;

	  AVLNode leftPtr, rightPtr;

	//Define the constructor.

	  public AVLNode(String isbn, Book book)

	  {

	   //Set the values.

	    key = isbn;

	    leftPtr = null;

	    rightPtr = null;

	    value = book;

	    height = 0;

	  }
}
