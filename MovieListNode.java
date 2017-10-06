/**
 * 
 */

/**
 * @author 
 *
 */
public class MovieListNode<t> {
	
	public t info;
	public MovieListNode<t> next;
	public MovieListNode<t> prev;
	
	public MovieListNode(t info){
		this.info = info;
		this.next = null;
		this.prev = null;
	}
	
	public MovieListNode(t info, MovieListNode<t> prev, MovieListNode<t> next){
		this.info = info;
		this.prev = prev;
		this.next = next;
	}
	
	public String toString(){
		return info.toString();
	}
	
	
	
}
