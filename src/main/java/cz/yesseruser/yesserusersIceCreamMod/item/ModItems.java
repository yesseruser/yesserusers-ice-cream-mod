package cz.yesseruser.yesserusersIceCreamMod.item;

import cz.yesseruser.yesserusersIceCreamMod.YesserusersIceCreamMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static void initialize() {}

    public static <T extends Item> T register(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings) {
        // Create the item key.
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(YesserusersIceCreamMod.MOD_ID, name));

        // Create the item instance.
        T item = itemFactory.apply(settings.setId(itemKey));

        // Register the item.
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static final Item SWEET_BERRY_ICE_CREAM = register("sweet_berry_ice_cream",
            Item::new, new Item.Properties()
                    .food(ModFoods.SWEET_BERRY_ICE_CREAM));
    public static final Item MILK_ICE_CREAM = register("milk_ice_cream",
            Item::new, new Item.Properties()
                    .food(ModFoods.MILK_ICE_CREAM, ModFoods.SLOWING_FOOD_CONSUMABLE_COMPONENT));
    public static final Item COCOA_ICE_CREAM = register("cocoa_ice_cream",
            Item::new, new Item.Properties()
                    .food(ModFoods.COCOA_ICE_CREAM));
}
