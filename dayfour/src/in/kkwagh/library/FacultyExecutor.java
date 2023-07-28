//program to demonstrate on access specifier
package in.kkwagh.library;
import in.metbkc.library.*;
//import in.metbkc.library.Library;


//Driver class
public class FacultyExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l= new Library();
		l.libraryName = "Bhujbal Library";
		l.displayPublic();
		
		/*UserId and displayPrivate method is private so we can't access into another package 
		 or class, only we can access inside the same class*/
		
		//l.userId=1234;
		//l.displayPrivate();
		
		/*booksName and displayDefault method is default we can't access into another package. 
		 * only we can access within the same package*/
		
		//l.booksName = "Java Programming";
		//l.displayDefault();
		
		

	}

}
