package be.renaud11232.bluemapvehiclemarkers.markerbuilder.boat;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapvehiclemarkers.VehicleIcon;
import be.renaud11232.bluemapvehiclemarkers.entity.boat.RideableBoat;
import be.renaud11232.bluemapvehiclemarkers.entity.boat.RideableChestBoat;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class RideableChestBoatMarkerBuilder extends SimpleSingleVariantMarkerBuilder<RideableChestBoat, RideableBoat.Type> {
    public RideableChestBoatMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantIcon(RideableBoat.Type.ACACIA, VehicleIcon.ACACIA_CHEST_BOAT);
        registerVariantIcon(RideableBoat.Type.BIRCH, VehicleIcon.BIRCH_CHEST_BOAT);
        registerVariantIcon(RideableBoat.Type.CHERRY, VehicleIcon.CHERRY_CHEST_BOAT);
        registerVariantIcon(RideableBoat.Type.DARK_OAK, VehicleIcon.DARK_OAK_CHEST_BOAT);
        registerVariantIcon(RideableBoat.Type.JUNGLE, VehicleIcon.JUNGLE_CHEST_BOAT);
        registerVariantIcon(RideableBoat.Type.MANGROVE, VehicleIcon.MANGROVE_CHEST_BOAT);
        registerVariantIcon(RideableBoat.Type.OAK, VehicleIcon.OAK_CHEST_BOAT);
        registerVariantIcon(RideableBoat.Type.PALE_OAK, VehicleIcon.PALE_OAK_CHEST_BOAT);
        registerVariantIcon(RideableBoat.Type.SPRUCE, VehicleIcon.SPRUCE_CHEST_BOAT);
    }

    @Override
    protected RideableBoat.Type getVariant(RideableChestBoat rideableChestBoat) {
        return rideableChestBoat.getType();
    }
}
