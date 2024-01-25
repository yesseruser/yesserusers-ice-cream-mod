package cz.yesseruser.yesserusersicecreammod.item;

import cz.yesseruser.yesserusersicecreammod.YesserusersIceCreamMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, YesserusersIceCreamMod.MODID);

    public static final RegistryObject<Item> SWEET_BERRY_ICE_CREAM = ITEMS.register("sweet_berry_ice_cream",
            () -> new Item(new Item.Properties().food(ModFoods.SWEET_BERRY_ICE_CREAM)));

    public static final RegistryObject<Item> MILK_ICE_CREAM = ITEMS.register("milk_ice_cream",
            () -> new Item(new Item.Properties().food(ModFoods.MILK_ICE_CREAM)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
