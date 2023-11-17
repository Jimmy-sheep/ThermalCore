package cofh.thermal.core.client.gui.device;

import cofh.thermal.core.client.gui.ThermalGuiHelper;
import cofh.thermal.core.inventory.container.device.DevicePotionDiffuserContainer;
import cofh.thermal.lib.client.gui.AugmentableTileScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

import static cofh.core.util.helpers.GuiHelper.*;
import static cofh.lib.util.constants.ModIds.ID_THERMAL;

public class DevicePotionDiffuserScreen extends AugmentableTileScreen<DevicePotionDiffuserContainer> {

    public static final String TEX_PATH = ID_THERMAL + ":textures/gui/container/potion_diffuser.png";
    public static final ResourceLocation TEXTURE = new ResourceLocation(TEX_PATH);

    public DevicePotionDiffuserScreen(DevicePotionDiffuserContainer container, Inventory inv, Component titleIn) {

        super(container, inv, container.tile, titleIn);
        texture = TEXTURE;
        info = generatePanelInfo("info.thermal.device_potion_diffuser");
    }

    @Override
    public void init() {

        super.init();

        addElement(setClearable(createMediumFluidStorage(this, 116, 22, tile.getTank(0)), tile, 0));
        addElement(ThermalGuiHelper.createDefaultDuration(this, 80, 35, SCALE_ALCHEMY, tile));
    }

}
