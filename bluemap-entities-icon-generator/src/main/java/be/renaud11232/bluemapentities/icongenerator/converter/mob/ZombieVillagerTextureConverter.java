package be.renaud11232.bluemapentities.icongenerator.converter.mob;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class ZombieVillagerTextureConverter extends TextureConverter {
    public ZombieVillagerTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(8, 8, 8, 10);
            BufferedImage nose = texture.getSubimage(26, 2, 2, 4);
            BufferedImage outerLayer = texture.getSubimage(40, 8, 8, 10);
            icon.drawImage(head, 0, -8, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(nose, 12, 20, nose.getWidth() * 4, nose.getHeight() * 4, null);
            icon.drawImage(outerLayer, 0, -8, outerLayer.getWidth() * 4, outerLayer.getHeight() * 4, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(7, 7, 8, 8);
            BufferedImage nose = texture.getSubimage(24, 1, 2, 2);
            BufferedImage outerLayer = texture.getSubimage(7, 38, 8, 8);
            icon.drawImage(head, 0, 0, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(nose, 12, 24, nose.getWidth() * 4, nose.getHeight() * 4, null);
            icon.drawImage(outerLayer, 0, 0, outerLayer.getWidth() * 4, outerLayer.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^zombie_villager((?:_(?:desert|jungle|plains|savanna|snow|swamp|taiga))?)\\.png$")),
                        List.of("zombie_villager$1.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^zombie_villager((?:_(?:desert|jungle|plains|savanna|snow|swamp|taiga))?)_baby\\.png$")),
                        List.of("zombie_villager$1_baby.png")
                )
        );
    }
}
