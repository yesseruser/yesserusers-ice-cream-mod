package cz.yesseruser;

import cz.yesseruser.item.ModCreativeModeTabs;
import cz.yesseruser.item.ModItems;

public final class YesserusersIceCreamMod {
    public static final String MOD_ID = "yesserusers_ice_cream_mod";

    public static void init() {
        ModItems.ITEMS.register();
        ModCreativeModeTabs.TABS.register();
    }
}
