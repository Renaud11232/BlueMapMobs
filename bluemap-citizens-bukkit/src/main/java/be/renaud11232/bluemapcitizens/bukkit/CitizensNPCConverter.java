package be.renaud11232.bluemapcitizens.bukkit;

import be.renaud11232.bluemapcitizens.bukkit.entity.CitizensNPC;
import be.renaud11232.bluemapentities.EntityConverter;
import net.citizensnpcs.api.npc.NPC;

public class CitizensNPCConverter implements EntityConverter<NPC, CitizensNPC> {
    @Override
    public CitizensNPC convert(NPC npc) {
        return new CitizensNPC(npc);
    }
}
