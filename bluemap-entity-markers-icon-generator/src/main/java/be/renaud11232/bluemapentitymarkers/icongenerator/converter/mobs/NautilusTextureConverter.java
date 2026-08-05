package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class NautilusTextureConverter extends TextureConverter {
    public NautilusTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(25, 68, 10, 8);
            BufferedImage upperShell = texture.getSubimage(30, 16, 16, 10);
            BufferedImage lowerShell = texture.getSubimage(34, 46, 20, 8);
            BufferedImage upperTentacles = texture.getSubimage(68, 58, 4, 4);
            BufferedImage lowerTentacles = texture.getSubimage(68, 66, 4, 4);
            icon.drawImage(face, 6, 16, face.getWidth() * 2, face.getHeight() * 2, null);
            icon.drawImage(upperShell, -18, -4, upperShell.getWidth() * 2, upperShell.getHeight() * 2, null);
            icon.drawImage(lowerShell, -18, 16, lowerShell.getWidth() * 2, lowerShell.getHeight() * 2, null);
            icon.drawImage(upperTentacles, 24, 16, upperTentacles.getWidth() * 2, upperTentacles.getHeight() * 2, null);
            icon.drawImage(lowerTentacles, 24, 24, lowerTentacles.getWidth() * 2, lowerTentacles.getHeight() * 2, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(12, 31, 5, 4);
            BufferedImage upperShell = texture.getSubimage(14, 7, 7, 4);
            BufferedImage lowerShell = texture.getSubimage(16, 20, 9, 4);
            BufferedImage upperTentacles = texture.getSubimage(31, 26, 2, 2);
            BufferedImage lowerTentacles = texture.getSubimage(31, 30, 2, 2);
            icon.drawImage(face, 14, 16, face.getWidth() * 2, face.getHeight() * 2, null);
            icon.drawImage(upperShell, 4, 8, upperShell.getWidth() * 2, upperShell.getHeight() * 2, null);
            icon.drawImage(lowerShell, 4, 16, lowerShell.getWidth() * 2, lowerShell.getHeight() * 2, null);
            icon.drawImage(upperTentacles, 24, 16, upperTentacles.getWidth() * 2, upperTentacles.getHeight() * 2, null);
            icon.drawImage(lowerTentacles, 24, 20, lowerTentacles.getWidth() * 2, lowerTentacles.getHeight() * 2, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^nautilus\\.png$")),
                        List.of("nautilus.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^nautilus_baby\\.png$")),
                        List.of("nautilus_baby.png")
                )
        );
    }
}
