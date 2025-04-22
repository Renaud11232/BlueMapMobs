package be.renaud11232.bluemapmobs.markerbuilder.impl;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractNPCMarkerBuilder;
import com.google.gson.JsonParser;
import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.trait.SkinTrait;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.Base64;

public class NPCMarkerBuilder extends AbstractNPCMarkerBuilder {
    public NPCMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Icon getIcon(NPC npc) {
        return npc.getTraitOptional(SkinTrait.class)
                .toJavaUtil()
                .map(SkinTrait::getTexture)
                .map(texture -> {
                    try {
                        String url = JsonParser.parseString(new String(Base64.getDecoder().decode(texture)))
                                .getAsJsonObject()
                                .get("textures")
                                .getAsJsonObject()
                                .get("SKIN")
                                .getAsJsonObject()
                                .get("url")
                                .getAsString();
                        String[] segments = url.split("/");
                        String textureId = segments[segments.length - 1];
                        return BlueMapMobsIcon.NPC.head(textureId);
                    } catch (Exception e) {
                        return null;
                    }
                }).orElse(null);
    }
}
