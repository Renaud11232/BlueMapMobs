package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PandaTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage ear = texture.getSubimage(53, 26, 5, 4);
        BufferedImage face = texture.getSubimage(9, 15, 13, 10);
        BufferedImage nose = texture.getSubimage(47, 18, 7, 45);
        icon.drawImage(ear, 0, 3, ear.getWidth() * 2, ear.getHeight() * 2, null);
        icon.drawImage(ear, 22, 3, ear.getWidth() * 2, ear.getHeight() * 2, null);
        icon.drawImage(face, 3, 9, face.getWidth() * 2, face.getHeight() * 2, null);
        icon.drawImage(nose, 9, 19, nose.getWidth() * 2, nose.getHeight() * 2, null);
    }
}
