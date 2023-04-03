package application;
import java.io.*;
import java.util.Scanner;

public class AVLTreeDriver {

	//Define the main() method.

	  public static void main(String[] args) throws IOException

	  {

	    //Open the file in read node.

	    BufferedReader reader = new BufferedReader(new FileReader("Books.txt"));

	    //Create an object of the AVLTree class.

	    AVLTree tree = new AVLTree();

	    String line = reader.readLine();

	    //Start the loop to read the file.

	    while (line != null)

	    {

	      //Split the values in the line by spaces.

	      String values[] = line.split(" ");

	      //Create an object of the book class

	      // and store the values.

	      Book book = new Book(values[1],values[2]);

	      //Insert the node in the tree.

	      tree.insert(values[0], book);

	    }

	    //Close the buffered reader.

	    reader.close();

	    

	    //Print the inorder traversal of the tree.

	    System.out.println("\nIn order traversal: ");

	    tree.inorder();

	  }



}
