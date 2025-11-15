package be.renaud11232.bluemapmobs.plugin.updater;

import be.renaud11232.bluemapmobs.plugin.BlueMapMobs;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.OtherMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markersetbuilder.OtherMarkerSetBuilder;
import be.renaud11232.bluemapmobs.updater.AbstractWorldEntityMarkerUpdater;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mannequin;

import java.util.Collection;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.function.Predicate.not;

public class WorldOtherEntityMarkerUpdater extends AbstractWorldEntityMarkerUpdater<Entity> {
    public WorldOtherEntityMarkerUpdater(BlueMapMobs plugin, BlueMapAPI api) {
        super(plugin, api, new OtherMarkerSetBuilder(plugin.getConfig(), plugin.getDefaultConfig()), new OtherMarkerBuilder(api, plugin.getConfig(), plugin.getDefaultConfig()));
    }

    @Override
    public Collection<Entity> getElements(World world) {
        return Stream.of(
                        world.getEntitiesByClass(ArmorStand.class)
                                .stream()
                                .filter(ArmorStand::isVisible)
                                .map(armorStand -> (Entity) armorStand),
                        world.getEntitiesByClass(Mannequin.class)
                                .stream()
                                .filter(not(LivingEntity::isInvisible))
                                .map(mannequin -> (Entity) mannequin)
                )
                .flatMap(identity())
                .toList();
    }
}
