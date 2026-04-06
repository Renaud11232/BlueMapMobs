package be.renaud11232.bluemapentities;

public interface EntityConverter<SOURCE, TARGET> {
    TARGET convert(SOURCE source);
}
