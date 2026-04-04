package be.renaud11232.bluemapentities;

public abstract class WrappedEntity<T> implements Entity {
    protected final T wrapped;

    public WrappedEntity(T wrapped) {
        this.wrapped = wrapped;
    }
}
