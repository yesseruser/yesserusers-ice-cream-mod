package cz.yesseruser.item;

import cz.yesseruser.YesserusersIceCreamMod;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;

public class ModCreativeModeTabs {
    public static final DeferredRegister<ItemGroup> TABS =
            DeferredRegister.create(YesserusersIceCreamMod.MOD_ID, RegistryKeys.ITEM_GROUP);

    public static final RegistrySupplier<ItemGroup> ICE_CREAM_TAB =
            TABS.register("ice_cream_tab", () -> CreativeTabRegistry.create(
                    Text.translatable("creativetab.ice_cream_tab"),
                    () -> new ItemStack(ModItems.SWEET_BERRY_ICE_CREAM.get())
            ));
}
