
class Element{
	int value;
	Element next;
	public Element(int value){
		this.value = value;
		this.next = null;
	}
}

public class LinkedList{
	Element head;
	int size;
	public LinkedList(Element head){
		this.head = head;
	}

	public void append(Element new_element){
		// Your code goes here
		if(head == null){
			head = new_element;
			size++;
		}
		Element current = head;
	    while(current != null){
	         if(current.next == null){
	             current.next = new_element;
	             size++;
	             break;
	         }
	         current = current.next;
	    }
	    
	}

	public Element get_position(int position){
		// Get an element from a particular position.
        // Assume the first position is "1".
        // Return null if position is not in the list
		// Your code goes here
		Element current = head;
        int track = 0;
		while(current!= null){
			track = track+1;
			if(track == position){
			    System.out.println(current.value);
				return current;
			}
			current = current.next;
		}
		
		return null;
	}

	public void insert(Element new_element, int position){
	   // """Insert a new node at the given position.
       // Assume the first position is "1".
       // Inserting at position 3 means between
       // the 2nd and 3rd elements."""
		// Your code goes here
	 if(position == 1){
		 new_element.next  = head;
		 head = new_element;
		 size++;
	 }
	 Element prev = head;
	 Element current = prev.next;
	 int count = 1;
	 while(current != null){
		 count = count+1;
		 if(count == position){
			 prev.next = new_element;
			 new_element.next = current;
			 size++;
			 break;
		 }
       prev = current;
		 current = current.next;
	 }

	}

	public void delete(int value){
		// Delete the first node with a given value.
		// Your code goes here
		if(head.value == value){
			head = head.next;
			size--;
		}
		Element prev = head;
		Element current = prev.next;
		while(current != null){
			if(current.value == value){
			  prev.next = current.next;
			  size++;
			  break;
			}
			prev = current;
			current =current.next;
		}
	}
}

