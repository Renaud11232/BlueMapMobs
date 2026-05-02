package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class SlimeTextureConverter extends TextureConverter {
    public SlimeTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage core = texture.getSubimage(6, 22, 6, 6);
            BufferedImage leftEye =  texture.getSubimage(34, 2, 2, 2);
            BufferedImage rightEye =  texture.getSubimage(34, 6, 2, 2);
            BufferedImage mouth =  texture.getSubimage(33, 9, 1, 1);
            BufferedImage skin = texture.getSubimage(8, 8, 8, 8);
            icon.drawImage(core, 4, 4, core.getWidth() * 4, core.getHeight() * 4, null);
            icon.drawImage(leftEye, 3, 8, leftEye.getWidth() * 4, leftEye.getHeight() * 4, null);
            icon.drawImage(rightEye, 21, 8, rightEye.getWidth() * 4, rightEye.getHeight() * 4, null);
            icon.drawImage(mouth, 16, 20, mouth.getWidth() * 4, mouth.getHeight() * 4, null);
            icon.drawImage(skin, 0, 0, skin.getWidth() * 4, skin.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^slime\\.png$")),
                        List.of("slime.png")
                )
        );
    }
}
