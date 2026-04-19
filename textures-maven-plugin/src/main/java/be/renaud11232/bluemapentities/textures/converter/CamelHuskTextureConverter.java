package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

import static be.renaud11232.bluemapentities.textures.ImageOperations.flop;
import static be.renaud11232.bluemapentities.textures.ImageOperations.rotate;

public class CamelHuskTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage face = texture.getSubimage(21, 7, 7, 14);
        BufferedImage nose = texture.getSubimage(50, 6, 6, 5);
        BufferedImage ear = flop(rotate(texture.getSubimage(72, 0, 3, 2), 90));
        icon.drawImage(face, 4, 4, face.getWidth() * 2, face.getHeight() * 2, null);
        icon.drawImage(nose, 18, 4, nose.getWidth() * 2, nose.getHeight() * 2, null);
        icon.drawImage(ear, 5, 0, ear.getWidth() * 2, ear.getHeight() * 2, null);
    }
}
