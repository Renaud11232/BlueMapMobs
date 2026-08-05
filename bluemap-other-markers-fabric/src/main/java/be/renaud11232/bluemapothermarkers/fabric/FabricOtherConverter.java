package be.renaud11232.bluemapothermarkers.fabric;

import be.renaud11232.bluemapentitymarkers.EntityConverter;
import be.renaud11232.bluemapothermarkers.fabric.entity.FabricArmorStand;
import be.renaud11232.bluemapothermarkers.fabric.entity.FabricMannequin;
import be.renaud11232.bluemapothermarkers.fabric.entity.FabricUnknownEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.decoration.Mannequin;

public class FabricOtherConverter implements EntityConverter<Entity, be.renaud11232.bluemapentitymarkers.entity.Entity> {
    @Override
    public be.renaud11232.bluemapentitymarkers.entity.Entity convert(Entity entity) {
        return switch (entity) {
            case ArmorStand armorStand -> new FabricArmorStand(armorStand);
            case Mannequin mannequin -> new FabricMannequin(mannequin);
            default -> new FabricUnknownEntity(entity);
        };
    }
}
