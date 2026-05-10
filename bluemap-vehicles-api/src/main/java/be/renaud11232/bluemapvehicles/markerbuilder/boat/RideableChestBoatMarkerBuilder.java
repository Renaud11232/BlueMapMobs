package be.renaud11232.bluemapvehicles.markerbuilder.boat;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapvehicles.VehiclesIcon;
import be.renaud11232.bluemapvehicles.entity.boat.RideableBoat;
import be.renaud11232.bluemapvehicles.entity.boat.RideableChestBoat;

public class RideableChestBoatMarkerBuilder extends SimpleSingleVariantMarkerBuilder<RideableChestBoat, RideableBoat.Type> {
    public RideableChestBoatMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantIcon(RideableBoat.Type.ACACIA, VehiclesIcon.ACACIA_CHEST_BOAT);
        registerVariantIcon(RideableBoat.Type.BIRCH, VehiclesIcon.BIRCH_CHEST_BOAT);
        registerVariantIcon(RideableBoat.Type.CHERRY, VehiclesIcon.CHERRY_CHEST_BOAT);
        registerVariantIcon(RideableBoat.Type.DARK_OAK, VehiclesIcon.DARK_OAK_CHEST_BOAT);
        registerVariantIcon(RideableBoat.Type.JUNGLE, VehiclesIcon.JUNGLE_CHEST_BOAT);
        registerVariantIcon(RideableBoat.Type.MANGROVE, VehiclesIcon.MANGROVE_CHEST_BOAT);
        registerVariantIcon(RideableBoat.Type.OAK, VehiclesIcon.OAK_CHEST_BOAT);
        registerVariantIcon(RideableBoat.Type.PALE_OAK, VehiclesIcon.PALE_OAK_CHEST_BOAT);
        registerVariantIcon(RideableBoat.Type.SPRUCE, VehiclesIcon.SPRUCE_CHEST_BOAT);
    }

    @Override
    protected RideableBoat.Type getVariant(RideableChestBoat rideableChestBoat) {
        return rideableChestBoat.getType();
    }
}
