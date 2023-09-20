import java.util.ListIterator;

public class MyArrayListIterator implements ListIterator<Fraction> {

	public myArrayList<Fraction> Data;
	
	public int previous;
	public int current;
	public int next;

	public MyArrayListIterator(myArrayList<Fraction> Data) {
		this.Data = Data;
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
