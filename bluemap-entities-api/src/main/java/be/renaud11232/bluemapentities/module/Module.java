package be.renaud11232.bluemapentities.module;

public interface Module {
    String getAssetDirectoryName();
    String getAssetSourcePath();
    void update(Object world);
}
