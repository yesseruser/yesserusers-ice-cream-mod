package cz.yesseruser.yesserusersIceCreamMod.item;

import cz.yesseruser.yesserusersIceCreamMod.YesserusersIceCreamMod;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static void initialize() {}

    public static final CreativeModeTab ICE_CREAM_TAB = register(
            "ice_cream_tab",
            FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.SWEET_BERRY_ICE_CREAM))
                    .title(Component.translatable("creativetab.ice_cream_tab"))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.SWEET_BERRY_ICE_CREAM);
                        output.accept(ModItems.MILK_ICE_CREAM);
                        output.accept(ModItems.COCOA_ICE_CREAM);
                    }));

    public static CreativeModeTab register(String name, CreativeModeTab.Builder builder) {
        var key = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), YesserusersIceCreamMod.id(name));
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, key, builder.build());
    }
}
