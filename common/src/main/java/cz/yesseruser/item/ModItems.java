package cz.yesseruser.item;

import cz.yesseruser.YesserusersIceCreamMod;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(YesserusersIceCreamMod.MOD_ID, RegistryKeys.ITEM);

    public static final RegistrySupplier<Item> SWEET_BERRY_ICE_CREAM = ITEMS.register("sweet_berry_ice_cream",
            () -> new Item(new Item.Settings()
                    .food(ModFoods.SWEET_BERRY_ICE_CREAM)
                    .arch$tab(ModCreativeModeTabs.ICE_CREAM_TAB)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                            YesserusersIceCreamMod.id("sweet_berry_ice_cream")))));
    public static final RegistrySupplier<Item> MILK_ICE_CREAM = ITEMS.register("milk_ice_cream",
            () -> new Item(new Item.Settings()
                    .food(ModFoods.MILK_ICE_CREAM, ModFoods.SLOWING_FOOD_CONSUMABLE_COMPONENT)
                    .arch$tab(ModCreativeModeTabs.ICE_CREAM_TAB)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                                 YesserusersIceCreamMod.id("milk_ice_cream")))));
    public static final RegistrySupplier<Item> COCOA_ICE_CREAM = ITEMS.register("cocoa_ice_cream",
            () -> new Item(new Item.Settings()
                    .food(ModFoods.COCOA_ICE_CREAM)
                    .arch$tab(ModCreativeModeTabs.ICE_CREAM_TAB)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM,
                            YesserusersIceCreamMod.id("cocoa_ice_cream")))));
}
