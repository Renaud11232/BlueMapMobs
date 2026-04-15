package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.entity.Ageable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class AgeableVariantMarkerBuilder<T extends Ageable, ICON_VARIANT, STYLE_CLASSES_VARIANT> extends AgeableMarkerBuilder<T> {
    private final Map<ICON_VARIANT, Icon> adultIcons;
    private final Map<ICON_VARIANT, Icon> babyIcons;
    private final Map<STYLE_CLASSES_VARIANT, Collection<String>> adultStyleClasses;
    private final Map<STYLE_CLASSES_VARIANT, Collection<String>> babyStyleClasses;

    public AgeableVariantMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        this.adultIcons = new HashMap<>();
        this.babyIcons = new HashMap<>();
        this.adultStyleClasses = new HashMap<>();
        this.babyStyleClasses = new HashMap<>();
    }

    protected abstract ICON_VARIANT getIconVariant(T entity);

    protected void registerVariantAdultIcon(ICON_VARIANT v, Icon icon) {
        adultIcons.put(v, icon);
    }

    protected void registerVariantBabyIcon(ICON_VARIANT v, Icon icon) {
        babyIcons.put(v, icon);
    }

    protected abstract STYLE_CLASSES_VARIANT getStyleClassesVariant(T entity);

    protected void registerVariantAdultStyleClasses(STYLE_CLASSES_VARIANT v, Collection<String> styleClasses) {
        adultStyleClasses.put(v, styleClasses);
    }

    protected void registerVariantBabyStyleClasses(STYLE_CLASSES_VARIANT v, Collection<String> styleClasses) {
        babyStyleClasses.put(v, styleClasses);
    }

    @Override
    protected Icon getAdultIcon(T entity) {
        return adultIcons.get(getIconVariant(entity));
    }

    @Override
    protected Icon getBabyIcon(T entity) {
        return babyIcons.get(getIconVariant(entity));
    }

    @Override
    protected Collection<String> getAdultStyleClasses(T entity) {
        return adultStyleClasses.get(getStyleClassesVariant(entity));
    }

    @Override
    protected Collection<String> getBabyStyleClasses(T entity) {
        return babyStyleClasses.get(getStyleClassesVariant(entity));
    }
}
