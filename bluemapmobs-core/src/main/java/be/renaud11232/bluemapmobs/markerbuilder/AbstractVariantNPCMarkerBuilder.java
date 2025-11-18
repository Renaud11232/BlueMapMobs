package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.registry.Registry;
import be.renaud11232.bluemapmobs.registry.SimpleRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.Collection;

public abstract class AbstractVariantNPCMarkerBuilder<ICON_VARIANT, STYLE_CLASSES_VARIANT> extends AbstractNPCMarkerBuilder implements VariantMarkerBuilder<NPC, ICON_VARIANT, STYLE_CLASSES_VARIANT> {
    private final Registry<ICON_VARIANT, Icon> icons;
    private final Registry<STYLE_CLASSES_VARIANT, Collection<String>> styleClasses;

    public AbstractVariantNPCMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
        icons = new SimpleRegistry<>();
        styleClasses = new SimpleRegistry<>();
        registerVariantIcons(icons);
        registerVariantStyleClasses(styleClasses);
    }

    @Override
    public Icon getIcon(NPC npc) {
        return icons.get(getIconVariant(npc));
    }

    @Override
    public Collection<String> getStyleClasses(NPC npc) {
        return styleClasses.get(getStyleClassesVariant(npc));
    }
}
