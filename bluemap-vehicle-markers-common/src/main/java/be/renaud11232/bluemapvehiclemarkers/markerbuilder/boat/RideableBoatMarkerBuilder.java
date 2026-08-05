package be.renaud11232.bluemapvehiclemarkers.markerbuilder.boat;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapvehiclemarkers.VehicleIcon;
import be.renaud11232.bluemapvehiclemarkers.entity.boat.RideableBoat;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class RideableBoatMarkerBuilder extends SimpleSingleVariantMarkerBuilder<RideableBoat, RideableBoat.Type> {
    public RideableBoatMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantIcon(RideableBoat.Type.ACACIA, VehicleIcon.ACACIA_BOAT);
        registerVariantIcon(RideableBoat.Type.BIRCH, VehicleIcon.BIRCH_BOAT);
        registerVariantIcon(RideableBoat.Type.CHERRY, VehicleIcon.CHERRY_BOAT);
        registerVariantIcon(RideableBoat.Type.DARK_OAK, VehicleIcon.DARK_OAK_BOAT);
        registerVariantIcon(RideableBoat.Type.JUNGLE, VehicleIcon.JUNGLE_BOAT);
        registerVariantIcon(RideableBoat.Type.MANGROVE, VehicleIcon.MANGROVE_BOAT);
        registerVariantIcon(RideableBoat.Type.OAK, VehicleIcon.OAK_BOAT);
        registerVariantIcon(RideableBoat.Type.PALE_OAK, VehicleIcon.PALE_OAK_BOAT);
        registerVariantIcon(RideableBoat.Type.SPRUCE, VehicleIcon.SPRUCE_BOAT);
    }

    @Override
    protected RideableBoat.Type getVariant(RideableBoat rideableBoat) {
        return rideableBoat.getType();
    }
}
