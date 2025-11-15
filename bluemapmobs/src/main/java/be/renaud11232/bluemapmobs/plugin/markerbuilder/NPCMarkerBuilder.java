package be.renaud11232.bluemapmobs.plugin.markerbuilder;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractNPCMarkerBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.trait.SkinTrait;
import org.bukkit.configuration.file.FileConfiguration;

import java.io.IOException;

public class NPCMarkerBuilder extends AbstractNPCMarkerBuilder {
    public NPCMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Icon getIcon(NPC npc) {
        SkinTrait skinTrait = npc.getTraitNullable(SkinTrait.class);
        if (skinTrait == null || skinTrait.getTexture() == null) {
            return switch(Math.floorMod(npc.getMinecraftUniqueId().hashCode(), 9)) {
                case 0 -> BlueMapMobsIcon.NPC.ALEX;
                case 1 -> BlueMapMobsIcon.NPC.ARI;
                case 2 -> BlueMapMobsIcon.NPC.EFE;
                case 3 -> BlueMapMobsIcon.NPC.KAI;
                case 4 -> BlueMapMobsIcon.NPC.MAKENA;
                case 5 -> BlueMapMobsIcon.NPC.NOOR;
                case 6 -> BlueMapMobsIcon.NPC.STEVE;
                case 7 -> BlueMapMobsIcon.NPC.SUNNY;
                default -> BlueMapMobsIcon.NPC.ZURI;
            };
        } else {
            try {
                return BlueMapMobsIcon.NPC.head(skinTrait.getTexture(), getAPI().getWebApp().getWebRoot());
            } catch (IOException e) {
                return null;
            }
        }
    }
}
