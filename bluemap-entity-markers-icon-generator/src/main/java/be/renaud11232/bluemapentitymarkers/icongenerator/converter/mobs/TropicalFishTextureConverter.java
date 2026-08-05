package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.ImageOperations;
import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class TropicalFishTextureConverter extends TextureConverter {
    private static final int WHITE = 0xF9FFFE;
    private static final int ORANGE = 0xF9801D;
    private static final int MAGENTA = 0xC74EBD;
    private static final int LIGHT_BLUE = 0x3AB3DA;
    private static final int YELLOW = 0xFED83D;
    private static final int LIME = 0x80C71F;
    private static final int PINK = 0xF38BAA;
    private static final int GRAY = 0x474F52;
    private static final int LIGHT_GRAY = 0x9D9D97;
    private static final int CYAN = 0x169C9C;
    private static final int PURPLE = 0x8932B8;
    private static final int BLUE = 0x3C44AA;
    private static final int BROWN = 0x835432;
    private static final int GREEN = 0x5E7C16;
    private static final int RED = 0xB02E26;
    private static final int BLACK = 0x1D1D21;
    private static final List<Integer> COLORS = List.of(WHITE, ORANGE, MAGENTA, LIGHT_BLUE, YELLOW, LIME, PINK, GRAY, LIGHT_GRAY, CYAN, PURPLE, BLUE, BROWN, GREEN, RED, BLACK);

    public TropicalFishTextureConverter() {
        super();
        registerTextureConversions(this::convertSmallBody);
        registerTexturesConversions(this::convertSmallPattern);
        registerTexturesConversions(this::convertSmallPattern);
        registerTexturesConversions(this::convertSmallPattern);
        registerTexturesConversions(this::convertSmallPattern);
        registerTexturesConversions(this::convertSmallPattern);
        registerTexturesConversions(this::convertSmallPattern);
        registerTextureConversions(this::convertLargeBody);
        registerTexturesConversions(this::convertLargePattern);
        registerTexturesConversions(this::convertLargePattern);
        registerTexturesConversions(this::convertLargePattern);
        registerTexturesConversions(this::convertLargePattern);
        registerTexturesConversions(this::convertLargePattern);
        registerTexturesConversions(this::convertLargePattern);
    }

    private void convertSmallBody(BufferedImage texture, List<Graphics2D> icons) {
        BufferedImage body = texture.getSubimage(0, 6, 6, 3);
        BufferedImage tail = ImageOperations.flop(texture.getSubimage(28, 0, 4, 3));
        BufferedImage topFin = ImageOperations.flop(texture.getSubimage(17, 1, 5, 3));
        BufferedImage sideFin = ImageOperations.flop(texture.getSubimage(2, 12, 2, 2));
        for (int i = 0; i < icons.size(); i++) {
            var icon = icons.get(i);
            var color = COLORS.get(i);
            var tintedBody = ImageOperations.tintRGB(body, color);
            var tintedTail = ImageOperations.tintRGB(tail, color);
            var tintedTopFin = ImageOperations.tintRGB(topFin, color);
            var tintedSideFin = ImageOperations.tintRGB(sideFin, color);
            icon.drawImage(tintedBody, 13, 13, tintedBody.getWidth() * 3, tintedBody.getHeight() * 3, null);
            icon.drawImage(tintedTail, 1, 13, tintedTail.getWidth() * 3, tintedTail.getHeight() * 3, null);
            icon.drawImage(tintedTopFin, 13, 4, tintedTopFin.getWidth() * 3, tintedTopFin.getHeight() * 3, null);
            icon.drawImage(tintedSideFin, 16, 16, tintedSideFin.getWidth() * 3, tintedSideFin.getHeight() * 3, null);
        }
    }

    private void convertSmallPattern(List<BufferedImage> textures, List<Graphics2D> icons) {
        BufferedImage sideFinMask = ImageOperations.invertAlpha(ImageOperations.flop(textures.get(0).getSubimage(2, 12, 2, 2)));
        BufferedImage bodyOverlay = ImageOperations.alphaMask(textures.get(1).getSubimage(0, 6, 6, 3), 1, 1, sideFinMask);
        BufferedImage tailOverlay = ImageOperations.flop(textures.get(1).getSubimage(28, 0, 4, 3));
        BufferedImage topFinOverlay = ImageOperations.flop(textures.get(1).getSubimage(17, 1, 5, 3));
        BufferedImage sideFinOverlay = ImageOperations.flop(textures.get(1).getSubimage(2, 12, 2, 2));
        for (int i = 0; i < icons.size(); i++) {
            var icon = icons.get(i);
            var color = COLORS.get(i);
            var tintedBodyOverlay = ImageOperations.tintRGB(bodyOverlay, color);
            var tintedTailOverlay = ImageOperations.tintRGB(tailOverlay, color);
            var tintedTopFinOverlay = ImageOperations.tintRGB(topFinOverlay, color);
            var tintedSideFinOverlay = ImageOperations.tintRGB(sideFinOverlay, color);
            icon.drawImage(tintedBodyOverlay, 13, 13, tintedBodyOverlay.getWidth() * 3, tintedBodyOverlay.getHeight() * 3, null);
            icon.drawImage(tintedTailOverlay, 1, 13, tintedTailOverlay.getWidth() * 3, tintedTailOverlay.getHeight() * 3, null);
            icon.drawImage(tintedTopFinOverlay, 13, 4, tintedTopFinOverlay.getWidth() * 3, tintedTopFinOverlay.getHeight() * 3, null);
            icon.drawImage(tintedSideFinOverlay, 16, 16, tintedSideFinOverlay.getWidth() * 3, tintedSideFinOverlay.getHeight() * 3, null);
        }
    }

    private void convertLargeBody(BufferedImage texture, List<Graphics2D> icons) {
        BufferedImage body = texture.getSubimage(0, 26, 6, 6);
        BufferedImage tail = texture.getSubimage(21, 21, 5, 6);
        BufferedImage topFin = texture.getSubimage(20, 18, 5, 3);
        BufferedImage sideFin = texture.getSubimage(2, 16, 2, 2);
        BufferedImage bottomFin = texture.getSubimage(20, 27, 5, 3);
        for (int i = 0; i < icons.size(); i++) {
            var icon = icons.get(i);
            var color = COLORS.get(i);
            var tintedBody = ImageOperations.tintRGB(body, color);
            var tintedTail = ImageOperations.tintRGB(tail, color);
            var tintedTopFin = ImageOperations.tintRGB(topFin, color);
            var tintedSideFin = ImageOperations.tintRGB(sideFin, color);
            var tintedBottomFin = ImageOperations.tintRGB(bottomFin, color);
            icon.drawImage(tintedBody, 14, 7, tintedBody.getWidth() * 3, tintedBody.getHeight() * 3, null);
            icon.drawImage(tintedTail, -1, 7, tintedTail.getWidth() * 3, tintedTail.getHeight() * 3, null);
            icon.drawImage(tintedTopFin, 14, -2, tintedTopFin.getWidth() * 3, tintedTopFin.getHeight() * 3, null);
            icon.drawImage(tintedSideFin, 17, 19, tintedSideFin.getWidth() * 3, tintedSideFin.getHeight() * 3, null);
            icon.drawImage(tintedBottomFin, 14, 25, tintedBottomFin.getWidth() * 3, tintedBottomFin.getHeight() * 3, null);
        }
    }

    private void convertLargePattern(List<BufferedImage> textures, List<Graphics2D> icons) {
        BufferedImage sideFinMask = ImageOperations.invertAlpha(ImageOperations.flop(textures.get(0).getSubimage(2, 16, 2, 2)));
        BufferedImage bodyOverlay = ImageOperations.alphaMask(textures.get(1).getSubimage(0, 26, 6, 6), 1, 4, sideFinMask);
        BufferedImage tailOverlay = textures.get(1).getSubimage(21, 21, 5, 6);
        BufferedImage topFinOverlay = textures.get(1).getSubimage(20, 18, 5, 3);
        BufferedImage sideFinOverlay = textures.get(1).getSubimage(2, 16, 2, 2);
        BufferedImage bottomFinOverlay = textures.get(1).getSubimage(20, 27, 5, 3);
        for (int i = 0; i < icons.size(); i++) {
            var icon = icons.get(i);
            var color = COLORS.get(i);
            var tintedBodyOverlay = ImageOperations.tintRGB(bodyOverlay, color);
            var tintedTailOverlay = ImageOperations.tintRGB(tailOverlay, color);
            var tintedTopFinOverlay = ImageOperations.tintRGB(topFinOverlay, color);
            var tintedSideFinOverlay = ImageOperations.tintRGB(sideFinOverlay, color);
            var tintedBottomFinOverlay = ImageOperations.tintRGB(bottomFinOverlay, color);
            icon.drawImage(tintedBodyOverlay, 14, 7, tintedBodyOverlay.getWidth() * 3, tintedBodyOverlay.getHeight() * 3, null);
            icon.drawImage(tintedTailOverlay, -1, 7, tintedTailOverlay.getWidth() * 3, tintedTailOverlay.getHeight() * 3, null);
            icon.drawImage(tintedTopFinOverlay, 14, -2, tintedTopFinOverlay.getWidth() * 3, tintedTopFinOverlay.getHeight() * 3, null);
            icon.drawImage(tintedSideFinOverlay, 17, 19, tintedSideFinOverlay.getWidth() * 3, tintedSideFinOverlay.getHeight() * 3, null);
            icon.drawImage(tintedBottomFinOverlay, 14, 25, tintedBottomFinOverlay.getWidth() * 3, tintedBottomFinOverlay.getHeight() * 3, null);
        }
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^tropical_a\\.png$")),
                        List.of("tropical_fish_body_small_white.png", "tropical_fish_body_small_orange.png", "tropical_fish_body_small_magenta.png", "tropical_fish_body_small_light_blue.png", "tropical_fish_body_small_yellow.png", "tropical_fish_body_small_lime.png", "tropical_fish_body_small_pink.png", "tropical_fish_body_small_gray.png", "tropical_fish_body_small_light_gray.png", "tropical_fish_body_small_cyan.png", "tropical_fish_body_small_purple.png", "tropical_fish_body_small_blue.png", "tropical_fish_body_small_brown.png", "tropical_fish_body_small_green.png", "tropical_fish_body_small_red.png", "tropical_fish_body_small_black.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^tropical_a\\.png$"), Pattern.compile("^tropical_a_pattern_1\\.png$")),
                        List.of("tropical_fish_pattern_kob_white.png", "tropical_fish_pattern_kob_orange.png", "tropical_fish_pattern_kob_magenta.png", "tropical_fish_pattern_kob_light_blue.png", "tropical_fish_pattern_kob_yellow.png", "tropical_fish_pattern_kob_lime.png", "tropical_fish_pattern_kob_pink.png", "tropical_fish_pattern_kob_gray.png", "tropical_fish_pattern_kob_light_gray.png", "tropical_fish_pattern_kob_cyan.png", "tropical_fish_pattern_kob_purple.png", "tropical_fish_pattern_kob_blue.png", "tropical_fish_pattern_kob_brown.png", "tropical_fish_pattern_kob_green.png", "tropical_fish_pattern_kob_red.png", "tropical_fish_pattern_kob_black.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^tropical_a\\.png$"), Pattern.compile("^tropical_a_pattern_2\\.png$")),
                        List.of("tropical_fish_pattern_sunstreak_white.png", "tropical_fish_pattern_sunstreak_orange.png", "tropical_fish_pattern_sunstreak_magenta.png", "tropical_fish_pattern_sunstreak_light_blue.png", "tropical_fish_pattern_sunstreak_yellow.png", "tropical_fish_pattern_sunstreak_lime.png", "tropical_fish_pattern_sunstreak_pink.png", "tropical_fish_pattern_sunstreak_gray.png", "tropical_fish_pattern_sunstreak_light_gray.png", "tropical_fish_pattern_sunstreak_cyan.png", "tropical_fish_pattern_sunstreak_purple.png", "tropical_fish_pattern_sunstreak_blue.png", "tropical_fish_pattern_sunstreak_brown.png", "tropical_fish_pattern_sunstreak_green.png", "tropical_fish_pattern_sunstreak_red.png", "tropical_fish_pattern_sunstreak_black.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^tropical_a\\.png$"), Pattern.compile("^tropical_a_pattern_3\\.png$")),
                        List.of("tropical_fish_pattern_snooper_white.png", "tropical_fish_pattern_snooper_orange.png", "tropical_fish_pattern_snooper_magenta.png", "tropical_fish_pattern_snooper_light_blue.png", "tropical_fish_pattern_snooper_yellow.png", "tropical_fish_pattern_snooper_lime.png", "tropical_fish_pattern_snooper_pink.png", "tropical_fish_pattern_snooper_gray.png", "tropical_fish_pattern_snooper_light_gray.png", "tropical_fish_pattern_snooper_cyan.png", "tropical_fish_pattern_snooper_purple.png", "tropical_fish_pattern_snooper_blue.png", "tropical_fish_pattern_snooper_brown.png", "tropical_fish_pattern_snooper_green.png", "tropical_fish_pattern_snooper_red.png", "tropical_fish_pattern_snooper_black.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^tropical_a\\.png$"), Pattern.compile("^tropical_a_pattern_4\\.png$")),
                        List.of("tropical_fish_pattern_dasher_white.png", "tropical_fish_pattern_dasher_orange.png", "tropical_fish_pattern_dasher_magenta.png", "tropical_fish_pattern_dasher_light_blue.png", "tropical_fish_pattern_dasher_yellow.png", "tropical_fish_pattern_dasher_lime.png", "tropical_fish_pattern_dasher_pink.png", "tropical_fish_pattern_dasher_gray.png", "tropical_fish_pattern_dasher_light_gray.png", "tropical_fish_pattern_dasher_cyan.png", "tropical_fish_pattern_dasher_purple.png", "tropical_fish_pattern_dasher_blue.png", "tropical_fish_pattern_dasher_brown.png", "tropical_fish_pattern_dasher_green.png", "tropical_fish_pattern_dasher_red.png", "tropical_fish_pattern_dasher_black.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^tropical_a\\.png$"), Pattern.compile("^tropical_a_pattern_5\\.png$")),
                        List.of("tropical_fish_pattern_brinely_white.png", "tropical_fish_pattern_brinely_orange.png", "tropical_fish_pattern_brinely_magenta.png", "tropical_fish_pattern_brinely_light_blue.png", "tropical_fish_pattern_brinely_yellow.png", "tropical_fish_pattern_brinely_lime.png", "tropical_fish_pattern_brinely_pink.png", "tropical_fish_pattern_brinely_gray.png", "tropical_fish_pattern_brinely_light_gray.png", "tropical_fish_pattern_brinely_cyan.png", "tropical_fish_pattern_brinely_purple.png", "tropical_fish_pattern_brinely_blue.png", "tropical_fish_pattern_brinely_brown.png", "tropical_fish_pattern_brinely_green.png", "tropical_fish_pattern_brinely_red.png", "tropical_fish_pattern_brinely_black.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^tropical_a\\.png$"), Pattern.compile("^tropical_a_pattern_6\\.png$")),
                        List.of("tropical_fish_pattern_spotty_white.png", "tropical_fish_pattern_spotty_orange.png", "tropical_fish_pattern_spotty_magenta.png", "tropical_fish_pattern_spotty_light_blue.png", "tropical_fish_pattern_spotty_yellow.png", "tropical_fish_pattern_spotty_lime.png", "tropical_fish_pattern_spotty_pink.png", "tropical_fish_pattern_spotty_gray.png", "tropical_fish_pattern_spotty_light_gray.png", "tropical_fish_pattern_spotty_cyan.png", "tropical_fish_pattern_spotty_purple.png", "tropical_fish_pattern_spotty_blue.png", "tropical_fish_pattern_spotty_brown.png", "tropical_fish_pattern_spotty_green.png", "tropical_fish_pattern_spotty_red.png", "tropical_fish_pattern_spotty_black.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^tropical_b\\.png$")),
                        List.of("tropical_fish_body_large_white.png", "tropical_fish_body_large_orange.png", "tropical_fish_body_large_magenta.png", "tropical_fish_body_large_light_blue.png", "tropical_fish_body_large_yellow.png", "tropical_fish_body_large_lime.png", "tropical_fish_body_large_pink.png", "tropical_fish_body_large_gray.png", "tropical_fish_body_large_light_gray.png", "tropical_fish_body_large_cyan.png", "tropical_fish_body_large_purple.png", "tropical_fish_body_large_blue.png", "tropical_fish_body_large_brown.png", "tropical_fish_body_large_green.png", "tropical_fish_body_large_red.png", "tropical_fish_body_large_black.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^tropical_b\\.png$"), Pattern.compile("^tropical_b_pattern_1\\.png$")),
                        List.of("tropical_fish_pattern_flopper_white.png", "tropical_fish_pattern_flopper_orange.png", "tropical_fish_pattern_flopper_magenta.png", "tropical_fish_pattern_flopper_light_blue.png", "tropical_fish_pattern_flopper_yellow.png", "tropical_fish_pattern_flopper_lime.png", "tropical_fish_pattern_flopper_pink.png", "tropical_fish_pattern_flopper_gray.png", "tropical_fish_pattern_flopper_light_gray.png", "tropical_fish_pattern_flopper_cyan.png", "tropical_fish_pattern_flopper_purple.png", "tropical_fish_pattern_flopper_blue.png", "tropical_fish_pattern_flopper_brown.png", "tropical_fish_pattern_flopper_green.png", "tropical_fish_pattern_flopper_red.png", "tropical_fish_pattern_flopper_black.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^tropical_b\\.png$"), Pattern.compile("^tropical_b_pattern_2\\.png$")),
                        List.of("tropical_fish_pattern_stripey_white.png", "tropical_fish_pattern_stripey_orange.png", "tropical_fish_pattern_stripey_magenta.png", "tropical_fish_pattern_stripey_light_blue.png", "tropical_fish_pattern_stripey_yellow.png", "tropical_fish_pattern_stripey_lime.png", "tropical_fish_pattern_stripey_pink.png", "tropical_fish_pattern_stripey_gray.png", "tropical_fish_pattern_stripey_light_gray.png", "tropical_fish_pattern_stripey_cyan.png", "tropical_fish_pattern_stripey_purple.png", "tropical_fish_pattern_stripey_blue.png", "tropical_fish_pattern_stripey_brown.png", "tropical_fish_pattern_stripey_green.png", "tropical_fish_pattern_stripey_red.png", "tropical_fish_pattern_stripey_black.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^tropical_b\\.png$"), Pattern.compile("^tropical_b_pattern_3\\.png$")),
                        List.of("tropical_fish_pattern_glitter_white.png", "tropical_fish_pattern_glitter_orange.png", "tropical_fish_pattern_glitter_magenta.png", "tropical_fish_pattern_glitter_light_blue.png", "tropical_fish_pattern_glitter_yellow.png", "tropical_fish_pattern_glitter_lime.png", "tropical_fish_pattern_glitter_pink.png", "tropical_fish_pattern_glitter_gray.png", "tropical_fish_pattern_glitter_light_gray.png", "tropical_fish_pattern_glitter_cyan.png", "tropical_fish_pattern_glitter_purple.png", "tropical_fish_pattern_glitter_blue.png", "tropical_fish_pattern_glitter_brown.png", "tropical_fish_pattern_glitter_green.png", "tropical_fish_pattern_glitter_red.png", "tropical_fish_pattern_glitter_black.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^tropical_b\\.png$"), Pattern.compile("^tropical_b_pattern_4\\.png$")),
                        List.of("tropical_fish_pattern_blockfish_white.png", "tropical_fish_pattern_blockfish_orange.png", "tropical_fish_pattern_blockfish_magenta.png", "tropical_fish_pattern_blockfish_light_blue.png", "tropical_fish_pattern_blockfish_yellow.png", "tropical_fish_pattern_blockfish_lime.png", "tropical_fish_pattern_blockfish_pink.png", "tropical_fish_pattern_blockfish_gray.png", "tropical_fish_pattern_blockfish_light_gray.png", "tropical_fish_pattern_blockfish_cyan.png", "tropical_fish_pattern_blockfish_purple.png", "tropical_fish_pattern_blockfish_blue.png", "tropical_fish_pattern_blockfish_brown.png", "tropical_fish_pattern_blockfish_green.png", "tropical_fish_pattern_blockfish_red.png", "tropical_fish_pattern_blockfish_black.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^tropical_b\\.png$"), Pattern.compile("^tropical_b_pattern_5\\.png$")),
                        List.of("tropical_fish_pattern_betty_white.png", "tropical_fish_pattern_betty_orange.png", "tropical_fish_pattern_betty_magenta.png", "tropical_fish_pattern_betty_light_blue.png", "tropical_fish_pattern_betty_yellow.png", "tropical_fish_pattern_betty_lime.png", "tropical_fish_pattern_betty_pink.png", "tropical_fish_pattern_betty_gray.png", "tropical_fish_pattern_betty_light_gray.png", "tropical_fish_pattern_betty_cyan.png", "tropical_fish_pattern_betty_purple.png", "tropical_fish_pattern_betty_blue.png", "tropical_fish_pattern_betty_brown.png", "tropical_fish_pattern_betty_green.png", "tropical_fish_pattern_betty_red.png", "tropical_fish_pattern_betty_black.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^tropical_b\\.png$"), Pattern.compile("^tropical_b_pattern_6\\.png$")),
                        List.of("tropical_fish_pattern_clayfish_white.png", "tropical_fish_pattern_clayfish_orange.png", "tropical_fish_pattern_clayfish_magenta.png", "tropical_fish_pattern_clayfish_light_blue.png", "tropical_fish_pattern_clayfish_yellow.png", "tropical_fish_pattern_clayfish_lime.png", "tropical_fish_pattern_clayfish_pink.png", "tropical_fish_pattern_clayfish_gray.png", "tropical_fish_pattern_clayfish_light_gray.png", "tropical_fish_pattern_clayfish_cyan.png", "tropical_fish_pattern_clayfish_purple.png", "tropical_fish_pattern_clayfish_blue.png", "tropical_fish_pattern_clayfish_brown.png", "tropical_fish_pattern_clayfish_green.png", "tropical_fish_pattern_clayfish_red.png", "tropical_fish_pattern_clayfish_black.png")
                )
        );
    }
}
