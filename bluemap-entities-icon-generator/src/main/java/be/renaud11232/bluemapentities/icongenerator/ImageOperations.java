package be.renaud11232.bluemapentities.icongenerator;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class ImageOperations {
    public static BufferedImage newImage(int w, int h) {
        return new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
    }

    public static Graphics2D createGraphics(BufferedImage image) {
        Graphics2D g2d = image.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
        return g2d;
    }

    public static BufferedImage rotate(BufferedImage image, double angle) {
        double radians = Math.toRadians(angle);

        double sin = Math.abs(Math.sin(radians));
        double cos = Math.abs(Math.cos(radians));
        int w = image.getWidth();
        int h = image.getHeight();
        int newW = (int) Math.floor(w * cos + h * sin);
        int newH = (int) Math.floor(h * cos + w * sin);

        BufferedImage rotated = newImage(newW, newH);
        Graphics2D g2d = createGraphics(rotated);
        AffineTransform at = new AffineTransform();
        at.translate((newW - w) / 2.0, (newH - h) / 2.0);
        at.rotate(radians, w / 2.0, h / 2.0);
        g2d.setTransform(at);
        g2d.drawImage(image, 0, 0, null);
        g2d.dispose();
        return rotated;
    }

    public static BufferedImage flip(BufferedImage image) {
        return mirror(image, 0, image.getHeight(), 1, -1);
    }

    public static BufferedImage flop(BufferedImage image) {
        return mirror(image, image.getWidth(), 0, -1, 1);
    }

    private static BufferedImage mirror(BufferedImage image, double tx, double ty, double sx, double sy) {
        int w = image.getWidth();
        int h = image.getHeight();

        BufferedImage mirrored = newImage(w, h);
        Graphics2D g2d = createGraphics(mirrored);
        AffineTransform at = new AffineTransform();
        at.translate(tx, ty);
        at.scale(sx, sy);
        g2d.setTransform(at);
        g2d.drawImage(image, 0, 0, null);
        g2d.dispose();

        return mirrored;
    }

    public static BufferedImage tintRGB(BufferedImage image, int tint) {
        BufferedImage tinted = newImage(image.getWidth(), image.getHeight());
        var tintR = (tint >> 16) & 0xFF;
        var tintG = (tint >> 8) & 0xFF;
        var tintB = tint & 0xFF;
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int argb = image.getRGB(x, y);
                int a = (argb >> 24) & 0xFF;
                int r = (argb >> 16) & 0xFF;
                int g = (argb >> 8) & 0xFF;
                int b = argb & 0xFF;

                r = (r * tintR) / 255;
                g = (g * tintG) / 255;
                b = (b * tintB) / 255;

                tinted.setRGB(x, y, (a << 24) | (r << 16) | (g << 8) | b);
            }
        }
        return tinted;
    }

    public static BufferedImage alphaMask(BufferedImage image, BufferedImage mask) {
        if (image.getWidth() != mask.getWidth() || image.getHeight() != mask.getHeight()) {
            throw new IllegalArgumentException("The image and mask must have the same dimensions");
        }
        var output = newImage(image.getWidth(), image.getHeight());
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int maskArgb = mask.getRGB(x, y);
                int maskAlpha = (maskArgb >> 24) & 0xFF;

                int argb = image.getRGB(x, y);
                int a = (argb >> 24) & 0xFF;
                int r = (argb >> 16) & 0xFF;
                int g = (argb >> 8) & 0xFF;
                int b = argb & 0xFF;
                a = (a * maskAlpha) / 255;
                output.setRGB(x, y, (a << 24) | (r << 16) | (g << 8) | b);
            }
        }
        return output;
    }

    public static BufferedImage invertAlpha(BufferedImage image) {
        var output = newImage(image.getWidth(), image.getHeight());
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int argb = image.getRGB(x, y);
                int a = (argb >> 24) & 0xFF;
                int r = (argb >> 16) & 0xFF;
                int g = (argb >> 8) & 0xFF;
                int b = argb & 0xFF;
                a = 255 - a;
                output.setRGB(x, y, (a << 24) | (r << 16) | (g << 8) | b);
            }
        }
        return output;
    }
}
