package be.renaud11232.bluemapmobs.plugin.markerbuilder;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantNPCMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.trait.SkinTrait;
import org.bukkit.configuration.file.FileConfiguration;

import java.io.IOException;

public class NPCMarkerBuilder extends AbstractSingleVariantNPCMarkerBuilder<Integer> {
    public NPCMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Integer getVariant(NPC npc) {
        return Math.floorMod(npc.getMinecraftUniqueId().hashCode(), 9);
    }

    @Override
    public void registerVariantIcons(Registry<Integer, Icon> registry) {
        registry.register(0, BlueMapMobsIcon.NPC.ALEX);
        registry.register(1, BlueMapMobsIcon.NPC.ARI);
        registry.register(2, BlueMapMobsIcon.NPC.EFE);
        registry.register(3, BlueMapMobsIcon.NPC.KAI);
        registry.register(4, BlueMapMobsIcon.NPC.MAKENA);
        registry.register(5, BlueMapMobsIcon.NPC.NOOR);
        registry.register(6, BlueMapMobsIcon.NPC.STEVE);
        registry.register(7, BlueMapMobsIcon.NPC.SUNNY);
        registry.register(8, BlueMapMobsIcon.NPC.ZURI);
    }

    @Override
    public Icon getIcon(NPC npc) {
        SkinTrait skinTrait = npc.getTraitNullable(SkinTrait.class);
        if (skinTrait == null || skinTrait.getTexture() == null) {
            return super.getIcon(npc);
        } else {
            try {
                return BlueMapMobsIcon.NPC.head(getAPI().getWebApp().getWebRoot(), skinTrait.getTexture());
            } catch (IOException e) {
                return super.getIcon(npc);
            }
        }
    }
}
