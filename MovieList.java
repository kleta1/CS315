/**
 * 
 */

/**
 * @author 
 *
 */
public class MovieList<t> {
	 public MovieListNode<t> head;
	 public MovieListNode<t> tail;
	 int size;
	 
	 public MovieList(){
		 head = null;
		 tail = null;
		 size = 0;
	 }
	 
	 public void printAll(){
		 MovieListNode<t> cur = head;
		 System.out.println(cur);
		 while(cur != null){
			 System.out.println(cur);
			 cur = cur.next;
		 }
	 }
	 
	 public void printAllReversed(){
		 MovieListNode<t> cur = tail;
		 while(cur != null){
			 System.out.println(cur);
			 cur = cur.prev;
		 }
	 }
	 
	 public void printAllYear(){

	 }
	 
	 public void printTitle(){
		 
	 }
	 
	 public void addTitle(t value,int location ){
		 //Check if empty
	        if (head == null) {

	            head = tail = new MovieListNode<>(value);
	            size++;

	            return;
	        }

	        //Add to head
	        if (location <= 0) {

	            head = new MovieListNode<>(value, null, head);

	            (head.next).prev = head;

	            size++;

	            return;

	        }

	        //Add to end (past end of list)

	        if (location >= size) {

	            tail = new MovieListNode<>(value, tail, null);

	            (tail.prev).next = tail;

	            size++;

	            return;

	        }

	        //Otherwise, add to the middle

	        MovieListNode<t> cur = head;

	        int i = 0;

	        while (i != location) {

	            cur = cur.next;

	            i++;

	        }

	        //Insert shifts the node currently at the location to the right

	        (cur.prev).next = new MovieListNode<>(value, cur.prev, cur);

	        cur.prev = (cur.prev).next;

	        size++;

	        return;

	    }

	 
	 public void deleteMovie(){
		 
		 
	 }
	 
	 public void printAllStock(){
		 
	 }
}
