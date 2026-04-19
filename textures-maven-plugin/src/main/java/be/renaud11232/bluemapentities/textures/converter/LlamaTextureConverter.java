package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class LlamaTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage ear = texture.getSubimage(19, 2, 3, 3);
        BufferedImage face = texture.getSubimage(6, 20, 8, 6);
        BufferedImage nose = texture.getSubimage(9, 9, 4, 4);
        icon.drawImage(ear, 0, -2, ear.getWidth() * 4, ear.getHeight() * 4, null);
        icon.drawImage(ear, 20, -2, ear.getWidth() * 4, ear.getHeight() * 4, null);
        icon.drawImage(face, 0, 8, face.getWidth() * 4, face.getHeight() * 4, null);
        icon.drawImage(nose, 8, 16, nose.getWidth() * 4, nose.getHeight() * 4, null);
    }
}
