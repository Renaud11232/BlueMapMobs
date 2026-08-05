package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.ImageOperations;
import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class ElderGuardianTextureConverter extends TextureConverter {
    public ElderGuardianTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(16, 16, 12, 12);
            BufferedImage bottomTop = texture.getSubimage(28, 52, 12, 2);
            BufferedImage left = texture.getSubimage(12, 40, 2, 12);
            BufferedImage right = ImageOperations.flop(left);
            BufferedImage eye = texture.getSubimage(9, 1, 2, 2);
            BufferedImage frontSpike = texture.getSubimage(2, 0, 2, 2);
            BufferedImage angledSpike = ImageOperations.scale(texture.getSubimage(2, 2, 2, 9), 2);
            BufferedImage topLeftSpike = ImageOperations.rotate(angledSpike, -45);
            BufferedImage topRightSpike = ImageOperations.rotate(angledSpike, 45);
            BufferedImage bottomLeftSpike = ImageOperations.rotate(angledSpike, -135);
            BufferedImage bottomRightSpike = ImageOperations.rotate(angledSpike, 135);
            icon.drawImage(topLeftSpike, 1, 1, topLeftSpike.getWidth(), topLeftSpike.getHeight(), null);
            icon.drawImage(topRightSpike, 31 - topRightSpike.getWidth(), 1, topRightSpike.getWidth(), topRightSpike.getHeight(), null);
            icon.drawImage(bottomLeftSpike, 1, 31 - bottomLeftSpike.getHeight(), bottomLeftSpike.getWidth(), bottomLeftSpike.getHeight(), null);
            icon.drawImage(bottomRightSpike, 31 - bottomRightSpike.getWidth(), 31 - bottomRightSpike.getHeight(), bottomRightSpike.getWidth(), bottomRightSpike.getHeight(), null);
            icon.drawImage(bottomTop, 4, 0, bottomTop.getWidth() * 2, bottomTop.getHeight() * 2, null);
            icon.drawImage(bottomTop, 4, 28, bottomTop.getWidth() * 2, bottomTop.getHeight() * 2, null);
            icon.drawImage(left, 0, 4, left.getWidth() * 2, left.getHeight() * 2, null);
            icon.drawImage(right, 28, 4, right.getWidth() * 2, right.getHeight() * 2, null);
            icon.drawImage(frontSpike, 14, 1, frontSpike.getWidth() * 2, frontSpike.getHeight() * 2, null);
            icon.drawImage(frontSpike, 1, 14, frontSpike.getWidth() * 2, frontSpike.getHeight() * 2, null);
            icon.drawImage(frontSpike, 14, 27, frontSpike.getWidth() * 2, frontSpike.getHeight() * 2, null);
            icon.drawImage(frontSpike, 27, 14, frontSpike.getWidth() * 2, frontSpike.getHeight() * 2, null);
            icon.drawImage(head, 4, 4, head.getWidth() * 2, head.getHeight() * 2, null);
            icon.drawImage(eye, 14, 14, eye.getWidth() * 2, eye.getHeight() * 2, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^guardian_elder\\.png$")),
                        List.of("elder_guardian.png")
                )
        );
    }
}
