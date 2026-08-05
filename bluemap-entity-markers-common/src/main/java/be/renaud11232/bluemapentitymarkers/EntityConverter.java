package be.renaud11232.bluemapentitymarkers;

public interface EntityConverter<SOURCE, TARGET> {
    TARGET convert(SOURCE source);
}
