package cz.yesseruser.neoforge;

import net.neoforged.fml.common.Mod;

import cz.yesseruser.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
