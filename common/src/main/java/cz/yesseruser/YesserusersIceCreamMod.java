package cz.yesseruser;

import cz.yesseruser.item.ModCreativeModeTabs;
import cz.yesseruser.item.ModItems;
import net.minecraft.util.Identifier;

public final class YesserusersIceCreamMod {
    public static final String MOD_ID = "yesserusers_ice_cream_mod";

    public static void init() {
        ModItems.ITEMS.register();
        ModCreativeModeTabs.TABS.register();
    }

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}
