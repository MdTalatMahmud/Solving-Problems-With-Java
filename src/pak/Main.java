package pak;

abstract class Sequence<S> {
    public abstract S getHead() ;
    public abstract Sequence<S> getTail() ;
    public abstract boolean isEmpty() ;

    public static final <T> Sequence<T> cons(T head, Sequence<T> tail) {
        return new Cons<T>(head,tail) ;
    }

    public static final <T> Sequence<T> nil() {
        return new Nil<T>() ;
    }
}

final class Cons<S> extends Sequence<S> {
    private final S head ;
    private final Sequence<S> tail ;

    public S getHead() {
        return this.head ;
    }

    public Sequence<S> getTail() {
        return this.tail ;
    }

    public boolean isEmpty() {
        return false ;
    }

    public Cons(S head, Sequence<S> tail) {
        this.head = head ;
        this.tail = tail ;
    }
}

final class Nil<S> extends Sequence<S> {
    public S getHead() {
        throw new EmptySequenceException() ;
    }

    public Sequence<S> getTail() {
        throw new EmptySequenceException() ;
    }

    public boolean isEmpty() {
        return true ;
    }

    public Nil() {  }
}

class EmptySequenceException extends RuntimeException {
}

public class Main {
    public static void main(String[] args) {
        Sequence<Integer> end = Sequence.nil() ;

        Sequence<Integer> si =
                Sequence.cons(3, end) ;
    }
}
