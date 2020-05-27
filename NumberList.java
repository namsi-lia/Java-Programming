public class NumberList<T> implements IList<T>{
    private T[] datastore;
    private int size;
    private int pos;

    public NumberList(int  numElements){
        size=numElements;
        pos=0;
        datastore=(T[]) new Object[size];
    }

    @Override
    public void add(T element) {
   datastore[pos] =element;
   ++pos;
    }

    @Override
    public T get(int n) {
        return datastore[n];
    }
}
