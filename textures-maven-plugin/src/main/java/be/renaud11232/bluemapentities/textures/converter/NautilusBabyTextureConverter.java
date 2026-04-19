package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class NautilusBabyTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
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
    }
}
