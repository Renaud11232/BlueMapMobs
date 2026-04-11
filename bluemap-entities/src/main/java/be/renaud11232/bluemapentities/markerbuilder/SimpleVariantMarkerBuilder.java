package be.renaud11232.bluemapentities.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapentities.icon.Icon;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class SimpleVariantMarkerBuilder<T extends Entity, ICON_VARIANT, STYLE_CLASSES_VARIANT> extends SimpleMarkerBuilder<T> implements VariantMarkerBuilder<T, ICON_VARIANT, STYLE_CLASSES_VARIANT> {
    private final Map<ICON_VARIANT, Icon> icons;
    private final Map<STYLE_CLASSES_VARIANT, Collection<String>> styleClasses;

    public SimpleVariantMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        this.icons = new HashMap<>();
        this.styleClasses = new HashMap<>();
        registerVariantIcons();
        registerVariantStyleClasses();
    }

    @Override
    public void registerVariantIcon(ICON_VARIANT v, Icon icon) {
        icons.put(v, icon);
    }

    @Override
    public void registerVariantStyleClass(STYLE_CLASSES_VARIANT v, Collection<String> styleClasses) {
        this.styleClasses.put(v, styleClasses);
    }

    @Override
    public Icon getIcon(T entity) {
        return icons.get(getIconVariant(entity));
    }

    @Override
    public Collection<String> getStyleClasses(T entity) {
        return styleClasses.get(getStyleClassesVariant(entity));
    }
}
