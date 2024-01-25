package cz.yesseruser.yesserusersicecreammod.item;

import cz.yesseruser.yesserusersicecreammod.YesserusersIceCreamMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, YesserusersIceCreamMod.MODID);

    //public static final RegistryObject<CreativeModeTab> ICE_CREAM_TAB =
    //        CREATIVE_MODE_TABS.register("ice_cream_tab"), () -> CreativeModeTab

}
