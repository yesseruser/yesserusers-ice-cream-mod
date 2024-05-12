package cz.yesseruser.quilt;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import cz.yesseruser.YesserusersIceCreamMod;

public final class ExampleModQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        // Run our common setup.
        YesserusersIceCreamMod.init();
    }
}
