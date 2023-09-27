import java.util.ListIterator;
import java.util.NoSuchElementException;

public class MyArrayListIterator implements ListIterator<Fraction> {
	// we definitely need some type of pointer or int for lastReturned, and possibly
	// some booleans for next and prev.
	private myArrayList<Fraction> data;
	private int current;

	public MyArrayListIterator() {

	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Fraction previous() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int nextIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int previousIndex() {
		// TODO Auto-generated method stub
		return 0;
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
