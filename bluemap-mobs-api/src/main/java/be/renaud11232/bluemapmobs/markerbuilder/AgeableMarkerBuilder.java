package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapmobs.entity.Ageable;

import java.util.Collection;

public abstract class AgeableMarkerBuilder<T extends Ageable> extends SimpleMarkerBuilder<T> {
    public AgeableMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    protected Icon getAdultIcon(T entity) {
        return null;
    }

    protected Icon getBabyIcon(T entity) {
        return null;
    }

    protected Icon getDefaultAdultIcon() {
        return null;
    }

    protected Icon getDefaultBabyIcon() {
        return null;
    }

    @Override
    protected Icon getIcon(T entity) {
        Icon icon;
        if (entity.isAdult()) {
            icon = getAdultIcon(entity);
            if (icon == null) {
                icon = getDefaultAdultIcon();
            }
        } else {
            icon = getBabyIcon(entity);
            if (icon == null) {
                icon = getDefaultBabyIcon();
            }
        }
        return icon;
    }

    protected Collection<String> getAdultStyleClasses(T entity) {
        return null;
    }

    protected Collection<String> getBabyStyleClasses(T entity) {
        return null;
    }

    protected Collection<String> getDefaultAdultStyleClasses() {
        return null;
    }

    protected Collection<String> getDefaultBabyStyleClasses() {
        return null;
    }

    @Override
    protected Collection<String> getStyleClasses(T entity) {
        Collection<String> styleClasses;
        if (entity.isAdult()) {
            styleClasses = getAdultStyleClasses(entity);
            if (styleClasses == null) {
                styleClasses = getDefaultAdultStyleClasses();
            }
        } else {
            styleClasses = getBabyStyleClasses(entity);
            if (styleClasses == null) {
                styleClasses = getDefaultBabyStyleClasses();
            }
        }
        return styleClasses;
    }
}
