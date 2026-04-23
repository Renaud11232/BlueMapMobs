package be.renaud11232.bluemapentities.icongenerator.converter.mob;

import be.renaud11232.bluemapentities.icongenerator.ImageOperations;
import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class SheepTextureConverter extends TextureConverter {
    private static final int WHITE = 0xE6E6E6;
    private static final int ORANGE = 0xBA6015;
    private static final int MAGENTA = 0x953A8D;
    private static final int LIGHT_BLUE = 0x2B86A3;
    private static final int YELLOW = 0xBEA22D;
    private static final int LIME = 0x609517;
    private static final int PINK = 0xB6687F;
    private static final int GRAY = 0x353B3D;
    private static final int LIGHT_GRAY = 0x757571;
    private static final int CYAN = 0x107575;
    private static final int PURPLE = 0x66258A;
    private static final int BLUE = 0x2D337F;
    private static final int BROWN = 0x623F25;
    private static final int GREEN = 0x465D10;
    private static final int RED = 0x84221C;
    private static final int BLACK = 0x151518;
    private static final List<Integer> COLORS = List.of(WHITE, ORANGE, MAGENTA, LIGHT_BLUE, YELLOW, LIME, PINK, GRAY, LIGHT_GRAY, CYAN, PURPLE, BLUE, BROWN, GREEN, RED, BLACK);

    public SheepTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(8, 8, 6, 6);
            icon.drawImage(head, 4, 4, head.getWidth() * 4, head.getHeight() * 4, null);

        });
        registerTexturesConversions((textures, icons) -> {
            BufferedImage head = textures.get(0).getSubimage(8, 8, 6, 6);
            BufferedImage wool = textures.get(1).getSubimage(6, 6, 6, 6);
            BufferedImage undercoat = textures.get(2).getSubimage(8, 8, 6, 6);
            BufferedImage faceAlpha = ImageOperations.alphaMask(head, ImageOperations.invertAlpha(undercoat));
            BufferedImage resizedFaceAlpha = ImageOperations.newImage(32, 32);
            Graphics2D resizedFaceAlphaGraphics = ImageOperations.createGraphics(resizedFaceAlpha);
            resizedFaceAlphaGraphics.drawImage(faceAlpha, 4, 4, faceAlpha.getWidth() * 4, faceAlpha.getHeight() * 4, null);
            resizedFaceAlphaGraphics.dispose();
            BufferedImage woolAlpha = ImageOperations.invertAlpha(resizedFaceAlpha);
            for (int i = 0; i < icons.size(); i++) {
                var icon = icons.get(i);
                var color = COLORS.get(i);
                var tintedUndercoat = undercoat;
                if (color != WHITE) {
                    tintedUndercoat = ImageOperations.tintRGB(undercoat, color);
                }
                var tintedWool = ImageOperations.tintRGB(wool, color);
                BufferedImage resizedWool = ImageOperations.newImage(32, 32);
                Graphics2D resizedWoolGraphics = ImageOperations.createGraphics(resizedWool);
                resizedWoolGraphics.drawImage(tintedWool, 2, 2, 28, 28, null);
                resizedWoolGraphics.drawImage(tintedUndercoat, 4, 4, tintedUndercoat.getWidth() * 4, tintedUndercoat.getHeight() * 4, null);
                resizedWoolGraphics.dispose();
                icon.drawImage(ImageOperations.alphaMask(resizedWool, woolAlpha), 2, 2, null);
            }
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(5, 5, 5, 5);
            icon.drawImage(head, 6, 6, head.getWidth() * 4, head.getHeight() * 4, null);
        });
        registerTextureConversions((texture, icons) -> {
            BufferedImage wool = texture.getSubimage(5, 5, 5, 5);
            for (int i = 0; i < icons.size(); i++) {
                var icon = icons.get(i);
                var color = COLORS.get(i);
                var tintedWool = ImageOperations.tintRGB(wool, color);
                icon.drawImage(tintedWool, 6, 6, tintedWool.getWidth() * 4, tintedWool.getHeight() * 4, null);
            }
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^sheep\\.png$")),
                        List.of("sheep.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^sheep\\.png$"), Pattern.compile("^sheep_wool\\.png$"), Pattern.compile("^sheep_wool_undercoat\\.png$")),
                        List.of("sheep_wool_white.png", "sheep_wool_orange.png", "sheep_wool_magenta.png", "sheep_wool_light_blue.png", "sheep_wool_yellow.png", "sheep_wool_lime.png", "sheep_wool_pink.png", "sheep_wool_gray.png", "sheep_wool_light_gray.png", "sheep_wool_cyan.png", "sheep_wool_purple.png", "sheep_wool_blue.png", "sheep_wool_brown.png", "sheep_wool_green.png", "sheep_wool_red.png", "sheep_wool_black.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^sheep_baby\\.png$")),
                        List.of("sheep_baby.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^sheep_wool_baby\\.png$")),
                        List.of("sheep_wool_white_baby.png", "sheep_wool_orange_baby.png", "sheep_wool_magenta_baby.png", "sheep_wool_light_blue_baby.png", "sheep_wool_yellow_baby.png", "sheep_wool_lime_baby.png", "sheep_wool_pink_baby.png", "sheep_wool_gray_baby.png", "sheep_wool_light_gray_baby.png", "sheep_wool_cyan_baby.png", "sheep_wool_purple_baby.png", "sheep_wool_blue_baby.png", "sheep_wool_brown_baby.png", "sheep_wool_green_baby.png", "sheep_wool_red_baby.png", "sheep_wool_black_baby.png")
                )
        );
    }
}
