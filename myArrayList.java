import java.util.Arrays;

public class myArrayList<T> {
	private static final int INITIAL_CAPACITY = 50;
	private static final double GROWTH_FACTOR = 1.2;

	private Object[] elements;
	int size;
	int index;
  
	public myArrayList() {
		elements = new Object[INITIAL_CAPACITY];
		size = 0;
	}

  // Josh Thyng (Boolean Contains)
  public boolean contains(Fraction input) {
      for (int i = 0; i < size; i++) {
          if (elements[i] != null && elements[i] instanceof Fraction) {
              Fraction fraction = (Fraction) elements[i];
              if (fraction.equals(input)) {
                  return true;
              }
          }
      }
      return false;
  }

	/*
	 * Jonah
	 */
	public Fraction remove(int index) {

		Fraction removedElement = (Fraction) elements[index];
		for (int i = index; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
		elements[size - 1] = null;
		return removedElement;
	}

	/**
	 * @author Ellis Fitzgerald
	 * @version September 18th 2023 add - A method to add to the end of our custom
	 *          array list
	 * @param input - What is intended to be added to the array list
	 * @return Returns to show the function passed
	 */
	public boolean add(Fraction input, int index) {
		if (elements.length == size) {
			grow();
		}
		elements[index] = input;
		size++;
		return true;

	}

	/**
	 * @author Ellis Fitzgerald
	 * @version September 18th 2023 grow - A method to be called when the last index
	 *          passes the current elements length, forcing the array to grow by
	 *          {@codeGROWTH_FACTOR}
	 * @return newElements - the new elements
	 */
	private Object[] grow() {
		Object[] newElements = Arrays.copyOf(elements, (int) (elements.length * GROWTH_FACTOR));
		elements = newElements;
		return newElements;

	}

	/**
	 * @return The size of the myArrayList
	 */
	public int size() {
		return size;
	}

	public T get(int i) {
		return (T) elements[i];
	}

	/*
	 * Jonah
	 */
	public void set(int index, Fraction element) {
		elements[index] = element;
	}