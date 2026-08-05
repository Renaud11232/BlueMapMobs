package be.renaud11232.bluemapentitymarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.entity.Entity;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import de.bluecolored.bluemap.api.BlueMapAPI;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class SimpleVariantMarkerBuilder<T extends Entity, ICON_VARIANT, STYLE_CLASSES_VARIANT> extends SimpleMarkerBuilder<T> {
    private final Map<ICON_VARIANT, Icon> icons;
    private final Map<STYLE_CLASSES_VARIANT, Collection<String>> styleClasses;

    public SimpleVariantMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        this.icons = new HashMap<>();
        this.styleClasses = new HashMap<>();
    }

    protected abstract ICON_VARIANT getIconVariant(T entity);

    protected void registerVariantIcon(ICON_VARIANT v, Icon icon) {
        icons.put(v, icon);
    }

    protected abstract STYLE_CLASSES_VARIANT getStyleClassesVariant(T entity);

    protected void registerVariantStyleClasses(STYLE_CLASSES_VARIANT v, Collection<String> styleClasses) {
        this.styleClasses.put(v, styleClasses);
    }

    @Override
    protected Icon getIcon(T entity) {
        return icons.get(getIconVariant(entity));
    }

    @Override
    protected Collection<String> getStyleClasses(T entity) {
        return styleClasses.get(getStyleClassesVariant(entity));
    }
}
