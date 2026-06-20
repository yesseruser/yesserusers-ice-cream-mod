package cz.yesseruser.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoods {
    public static final FoodComponent SWEET_BERRY_ICE_CREAM = new FoodComponent.Builder()
            .hunger(6).saturationModifier(0.2f).build();
    public static final FoodComponent COCOA_ICE_CREAM = new FoodComponent.Builder()
            .hunger(6).saturationModifier(0.3f).build();
    public static final FoodComponent MILK_ICE_CREAM = new FoodComponent.Builder()
            .hunger(8).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 5*20), 0.4f).build();
}
