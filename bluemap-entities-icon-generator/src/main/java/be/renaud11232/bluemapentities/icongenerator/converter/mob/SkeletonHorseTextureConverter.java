package be.renaud11232.bluemapentities.icongenerator.converter.mob;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class SkeletonHorseTextureConverter extends TextureConverter {
    public SkeletonHorseTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage ear = texture.getSubimage(19, 17, 1, 3);
            BufferedImage face = texture.getSubimage(0, 20, 7, 5);
            BufferedImage nose = texture.getSubimage(0, 30, 5, 5);
            BufferedImage neck = texture.getSubimage(0 , 42, 7, 12);
            BufferedImage mane = texture.getSubimage(56 , 38, 2, 16);
            icon.drawImage(ear, 6, 8, ear.getWidth() * 2, ear.getHeight() * 2, null);
            icon.drawImage(face, 6, 12, face.getWidth() * 2, face.getHeight() * 2, null);
            icon.drawImage(nose, 20, 12, nose.getWidth() * 2, nose.getHeight() * 2, null);
            icon.drawImage(neck, 6, 22,  neck.getWidth() * 2, neck.getHeight() * 2, null);
            icon.drawImage(mane, 2, 12,  mane.getWidth() * 2, mane.getHeight() * 2, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage ear = texture.getSubimage(0, 1, 1, 3);
            BufferedImage face = texture.getSubimage(0, 9, 9, 4);
            BufferedImage neck = texture.getSubimage(30 , 4, 4, 5);
            icon.drawImage(ear, 7, 6, ear.getWidth() * 2, ear.getHeight() * 2, null);
            icon.drawImage(face, 7, 12, face.getWidth() * 2, face.getHeight() * 2, null);
            icon.drawImage(neck, 7, 20,  neck.getWidth() * 2, neck.getHeight() * 2, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^skeleton_horse\\.png$")),
                        List.of("skeleton_horse.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^skeleton_horse_baby\\.png$")),
                        List.of("skeleton_horse_baby.png")
                )
        );
    }
}
