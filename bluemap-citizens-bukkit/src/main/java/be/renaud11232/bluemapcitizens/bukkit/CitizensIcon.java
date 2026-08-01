package be.renaud11232.bluemapcitizens.bukkit;

import be.renaud11232.bluemapcitizens.bukkit.icon.CitizensTextureIcon;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.icon.SimpleIcon;
import com.flowpowered.math.vector.Vector2i;

import java.io.IOException;
import java.nio.file.Path;

public class CitizensIcon {
    public static final Icon ALEX = new SimpleIcon("assets/bluemap-citizens/img/alex.png", new Vector2i(12, 12));
    public static final Icon ARI = new SimpleIcon("assets/bluemap-citizens/img/ari.png", new Vector2i(12, 12));
    public static final Icon EFE = new SimpleIcon("assets/bluemap-citizens/img/efe.png", new Vector2i(12, 12));
    public static final Icon KAI = new SimpleIcon("assets/bluemap-citizens/img/kai.png", new Vector2i(12, 12));
    public static final Icon MAKENA = new SimpleIcon("assets/bluemap-citizens/img/makena.png", new Vector2i(12, 12));
    public static final Icon NOOR = new SimpleIcon("assets/bluemap-citizens/img/noor.png", new Vector2i(12, 12));
    public static final Icon STEVE = new SimpleIcon("assets/bluemap-citizens/img/steve.png", new Vector2i(12, 12));
    public static final Icon SUNNY = new SimpleIcon("assets/bluemap-citizens/img/sunny.png", new Vector2i(12, 12));
    public static final Icon ZURI = new SimpleIcon("assets/bluemap-citizens/img/zuri.png", new Vector2i(12, 12));
    public static Icon head(Path webroot, String texture) throws IOException {
        return new CitizensTextureIcon(webroot, texture, "assets/bluemap-citizens/img/texture/{id}.png", new Vector2i(12, 12));
    }
}
