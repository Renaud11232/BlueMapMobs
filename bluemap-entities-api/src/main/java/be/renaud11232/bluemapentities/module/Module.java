package be.renaud11232.bluemapentities.module;

public interface Module {
    String getAssetDirectoryName();
    String getModuleIdentifier();
    void update(Object world);
}
