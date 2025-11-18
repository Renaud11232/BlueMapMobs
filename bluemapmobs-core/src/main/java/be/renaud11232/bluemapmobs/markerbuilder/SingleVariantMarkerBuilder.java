package be.renaud11232.bluemapmobs.markerbuilder;

public interface SingleVariantMarkerBuilder<T, V> extends VariantMarkerBuilder<T, V, V> {
    @Override
    default V getIconVariant(T element) {
        return getVariant(element);
    }

    @Override
    default V getStyleClassesVariant(T element) {
        return getVariant(element);
    }

    V getVariant(T element);
}
