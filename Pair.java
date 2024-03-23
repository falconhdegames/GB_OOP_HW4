package HW_4;

public class Pair<T, U> {
    public T first;
    public U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T element) {
        this.first = element;
    }

    public void setSecond(U element) {
        this.second = element;
    }
}
