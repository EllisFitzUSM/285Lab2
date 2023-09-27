import java.util.ListIterator;
import java.util.NoSuchElementException;

public class MyArrayListIterator implements ListIterator<Fraction> {

	public myArrayList<Fraction> Data;

	public int previous;
	public int current;
	public int next;

	public MyArrayListIterator(myArrayList<Fraction> Data) {
		this.Data = Data;
		this.current = 0;
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

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

	@Override
	public void set(Fraction e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(Fraction e) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Fraction next() {
		// TODO Auto-generated method stub
		return null;
	}

}
