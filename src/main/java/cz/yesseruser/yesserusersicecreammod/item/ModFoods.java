package cz.yesseruser.yesserusersicecreammod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SWEET_BERRY_ICE_CREAM = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.2f).build();

    public static final FoodProperties COCOA_ICE_CREAM = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.3f).build();

    public static final FoodProperties MILK_ICE_CREAM = new FoodProperties.Builder()
            .nutrition(8).saturationMod(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5*20), 0.4f).build();
}
