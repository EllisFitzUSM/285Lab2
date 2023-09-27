import java.util.ListIterator;
import java.util.NoSuchElementException;

public class MyArrayListIterator implements ListIterator<Fraction> {
	// Jonah: we definitely need some type of pointer or int for lastReturned, and possibly
	// some booleans for next and prev.
	private myArrayList<Fraction> data;
	private int current;

  // Jonah
	public MyArrayListIterator() {
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Fraction previous() {
		if (hasPrevious()) {
			current--;
			return Data.get(current);
		} else {
			throw new NoSuchElementException("no element before");
		}
	}

	/**
	 * @author Ellis Fitzgerald
	 * @version September 25 2023
	 * nextIndex - returns the integer that would represent next index. If the index is less than 0 or greater than size, returns size.
	 * @return integer representing
	 */
	@Override
	public int nextIndex() {
		if(current < Data.size() - 1) {
		    return current++;
		}
		else {
		    return Data.size();
		}
	}

	/** 
	 * @author Ellis Fitzgerald
	 * @version September 25 2023
	 * previousIndex - returns the integer that would represent the previous index. If the current index is below 0, returns -1
	 * @return integer representing
	 */
	@Override
	public int previousIndex() {
		if(current > 0) {
		    return current--;
		}
		else {
		    return -1;
		}
	}

	/**
	 * Remove checks whether a call to next or prev has been made, removes item last
	 * returned, then shifts the pointer
	 * 
	 * @author Jonah
	 */
	@Override
	public void remove() {
		data.remove(current - 1);
		current--;
	}

	/**
	 * set() attempts to check if last operation was next() or previous() then sets
	 * the element
	 * 
	 * @Author Jonah
	 * @param e Fraction object to be set
	 */
	@Override
	public void set(Fraction e) {
		data.set(current - 1, e);
	}

	/**
	 * next() returns the object at the current pointer and moves the iterator
	 * forwards
	 * 
	 * @Author Jonah
	 * @return Fraction object
	 */
	@Override
	public Fraction next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}

		return data.get(current++);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(Fraction e) {
		// TODO Auto-generated method stub

	}

}
