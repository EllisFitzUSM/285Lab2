import java.util.ListIterator;

public class myArrayListIterator implements ListIterator<Fraction> {

    public myArrayList<Fraction> Data;
    
    public int previous;
    public int current;
    public int next;

    public myArrayListIterator(myArrayList<Fraction> Data) {
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

    //Gabrielle Akers
    @Override
    public int previousIndex() {
        int index = 0;
        for (int i = 0; i < size - 1; i++) {
            if (i - 1 == -1) {
                return -1;
            }
            else {
                return (i - 1);
            }
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
    
    //Gabrielle Akers
    @Override
    public boolean hasNext() {
        int i = 0;
        while (i < size) {
            return true;
        }
        return false;
    }

    @Override
    public Fraction next() {
        // TODO Auto-generated method stub
        return null;
    }
    

}
