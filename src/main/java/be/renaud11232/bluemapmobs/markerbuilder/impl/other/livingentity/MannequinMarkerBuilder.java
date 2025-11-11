package be.renaud11232.bluemapmobs.markerbuilder.impl.other.livingentity;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractOtherEntityMarkerBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Mannequin;

public class MannequinMarkerBuilder extends AbstractOtherEntityMarkerBuilder<Mannequin> {
    public MannequinMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Others.Markers.Types.MANNEQUIN;
    }

    @Override
    public Icon getIcon(Mannequin mannequin) {
        //TODO
        return BlueMapMobsIcon.Other.DEFAULT_MANNEQUIN;
        /*PlayerProfile profile = mannequin.getPlayerProfile();
        if (profile == null) {
            return BlueMapMobsIcon.Other.DEFAULT_MANNEQUIN;
        }
        PlayerSkinPatch skinPatch = profile.getSkinPatch();
        if (skinPatch.getTexturePatch() != null) {
            return BlueMapMobsIcon.Other.DEFAULT_MANNEQUIN;
        }
        UUID profileId = profile.getUniqueId();
        if (profileId != null) {
            try {
                return BlueMapMobsIcon.Other.profileHead(profileId, getAPI().getWebApp().getWebRoot());
            } catch (IOException e) {
                return null;
            }
        }
        return BlueMapMobsIcon.Other.DEFAULT_MANNEQUIN;*/
    }
}
