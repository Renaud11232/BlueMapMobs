package be.renaud11232.bluemapmobs.markersetbuilder.impl;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.markersetbuilder.AbstractMarkerSetBuilder;
import de.bluecolored.bluemap.api.markers.MarkerSet;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.configuration.file.FileConfiguration;

public class NPCMarkerSetBuilder extends AbstractMarkerSetBuilder<NPC> {
    public NPCMarkerSetBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public MarkerSet build() {
        return MarkerSet.builder()
                .label(BlueMapMobsConfiguration.MarkerSets.NPCs.LABEL.get(getConfig(), getDefaultConfig()))
                .toggleable(BlueMapMobsConfiguration.MarkerSets.NPCs.TOGGLEABLE.get(getConfig(), getDefaultConfig()))
                .defaultHidden(BlueMapMobsConfiguration.MarkerSets.NPCs.DEFAULT_HIDDEN.get(getConfig(), getDefaultConfig()))
                .build();
    }

    @Override
    public String getKey() {
        return BlueMapMobsConfiguration.MarkerSets.NPCs.KEY.get(getConfig(), getDefaultConfig());
    }
}
