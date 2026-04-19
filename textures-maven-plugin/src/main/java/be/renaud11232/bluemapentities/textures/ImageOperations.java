package be.renaud11232.bluemapentities.textures;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class ImageOperations {
    public static BufferedImage rotate(BufferedImage image, double angle) {
        double radians = Math.toRadians(angle);

        double sin = Math.abs(Math.sin(radians));
        double cos = Math.abs(Math.cos(radians));
        int w = image.getWidth();
        int h = image.getHeight();
        int newW = (int) Math.floor(w * cos + h * sin);
        int newH = (int) Math.floor(h * cos + w * sin);

        BufferedImage rotated = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = rotated.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
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

        BufferedImage mirrored = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = mirrored.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
        AffineTransform at = new AffineTransform();
        at.translate(tx, ty);
        at.scale(sx, sy);
        g2d.setTransform(at);
        g2d.drawImage(image, 0, 0, null);
        g2d.dispose();

        return mirrored;
    }
}
