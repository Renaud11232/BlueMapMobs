package be.renaud11232.bluemapentities.icongenerator.converter.mob;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class MuleTextureConverter extends TextureConverter {
    public MuleTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage ear = texture.getSubimage(0, 13, 1, 7);
            BufferedImage face = texture.getSubimage(0, 20, 7, 5);
            BufferedImage nose = texture.getSubimage(0, 30, 5, 5);
            BufferedImage neck = texture.getSubimage(0 , 42, 7, 12);
            icon.drawImage(ear, 6, 0, ear.getWidth() * 2, ear.getHeight() * 2, null);
            icon.drawImage(face, 4, 12, face.getWidth() * 2, face.getHeight() * 2, null);
            icon.drawImage(nose, 18, 12, nose.getWidth() * 2, nose.getHeight() * 2, null);
            icon.drawImage(neck, 4, 22,  neck.getWidth() * 2, neck.getHeight() * 2, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage ear = texture.getSubimage(25, 1, 1, 7);
            BufferedImage face = texture.getSubimage(0, 9, 9, 13);
            BufferedImage neck = texture.getSubimage(30 , 13, 4, 5);
            //FIXME: The ear seem to be at the wrong place, but the issue is also in vanilla Minecraft
            icon.drawImage(ear, 9, 2, ear.getWidth() * 2, ear.getHeight() * 2, null);
            icon.drawImage(face, 7, 12, face.getWidth() * 2, face.getHeight() * 2, null);
            icon.drawImage(neck, 7, 20,  neck.getWidth() * 2, neck.getHeight() * 2, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^mule\\.png$")),
                        List.of("mule.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^mule_baby\\.png$")),
                        List.of("mule_baby.png")
                )
        );
    }
}
