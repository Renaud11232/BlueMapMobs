package be.renaud11232.bluemapvehicles.markerbuilder.boat;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapvehicles.VehiclesIcon;
import be.renaud11232.bluemapvehicles.entity.boat.RideableBoat;

public class RideableBoatMarkerBuilder extends SimpleSingleVariantMarkerBuilder<RideableBoat, RideableBoat.Type> {
    public RideableBoatMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantIcon(RideableBoat.Type.ACACIA, VehiclesIcon.ACACIA_BOAT);
        registerVariantIcon(RideableBoat.Type.BIRCH, VehiclesIcon.BIRCH_BOAT);
        registerVariantIcon(RideableBoat.Type.CHERRY, VehiclesIcon.CHERRY_BOAT);
        registerVariantIcon(RideableBoat.Type.DARK_OAK, VehiclesIcon.DARK_OAK_BOAT);
        registerVariantIcon(RideableBoat.Type.JUNGLE, VehiclesIcon.JUNGLE_BOAT);
        registerVariantIcon(RideableBoat.Type.MANGROVE, VehiclesIcon.MANGROVE_BOAT);
        registerVariantIcon(RideableBoat.Type.OAK, VehiclesIcon.OAK_BOAT);
        registerVariantIcon(RideableBoat.Type.PALE_OAK, VehiclesIcon.PALE_OAK_BOAT);
        registerVariantIcon(RideableBoat.Type.SPRUCE, VehiclesIcon.SPRUCE_BOAT);
    }

    @Override
    protected RideableBoat.Type getVariant(RideableBoat rideableBoat) {
        return rideableBoat.getType();
    }
}
