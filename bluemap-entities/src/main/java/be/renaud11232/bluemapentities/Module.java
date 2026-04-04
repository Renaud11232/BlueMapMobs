package be.renaud11232.bluemapentities;

import java.util.Collection;

public interface Module {
    Collection<? extends Entity> getEntities(Object world);
    void update(Object world);
}
