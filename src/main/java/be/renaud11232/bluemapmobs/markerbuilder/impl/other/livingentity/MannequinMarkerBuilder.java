package be.renaud11232.bluemapmobs.markerbuilder.impl.other.livingentity;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractOtherEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Mannequin;
import org.bukkit.profile.PlayerProfile;

public class MannequinMarkerBuilder extends AbstractOtherEntityMarkerBuilder<Mannequin> {
    public MannequinMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Others.Markers.Types.MANNEQUIN;
    }

    @Override
    public Icon getDefaultIcon() {
        return super.getDefaultIcon();//TODO
    }

    @Override
    public Icon getIcon(Mannequin mannequin) {
        PlayerProfile profile = mannequin.getPlayerProfile();
        if (profile == null) {
            return null;
        }
        System.out.println(profile);
        return super.getIcon(mannequin);//TODO
    }
}
