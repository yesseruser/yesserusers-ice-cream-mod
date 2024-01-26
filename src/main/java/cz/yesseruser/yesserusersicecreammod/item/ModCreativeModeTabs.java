package cz.yesseruser.yesserusersicecreammod.item;

import cz.yesseruser.yesserusersicecreammod.YesserusersIceCreamMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, YesserusersIceCreamMod.MODID);

    public static final RegistryObject<CreativeModeTab> ICE_CREAM_TAB =
            CREATIVE_MODE_TABS.register("ice_cream_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.SWEET_BERRY_ICE_CREAM.get()))
                    .title(Component.translatable("creativetab.ice_cream_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SWEET_BERRY_ICE_CREAM.get());
                        pOutput.accept(ModItems.MILK_ICE_CREAM.get());
                        pOutput.accept(ModItems.COCOA_ICE_CREAM.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
