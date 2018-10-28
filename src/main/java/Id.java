public final class Id<T> {
    private T t;

    Id(T t) {
        this.t = t;
    }

    public <V> Id<V> copy(V v) {
        return new Id(v);
    }

    @Override
    public String toString() {
        return "ID(" + t.toString() + ")";
    }
}