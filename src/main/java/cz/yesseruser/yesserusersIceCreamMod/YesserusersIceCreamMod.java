package cz.yesseruser.yesserusersIceCreamMod;

import cz.yesseruser.yesserusersIceCreamMod.item.ModCreativeModeTabs;
import cz.yesseruser.yesserusersIceCreamMod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;

public class YesserusersIceCreamMod implements ModInitializer {
    public static final String MOD_ID = "yesserusers_ice_cream_mod";

    @Override
    public void onInitialize() {
        ModItems.initialize();
        ModCreativeModeTabs.initialize();
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
