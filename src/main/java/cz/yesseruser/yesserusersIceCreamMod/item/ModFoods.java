package cz.yesseruser.yesserusersIceCreamMod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModFoods {
    public static final FoodProperties SWEET_BERRY_ICE_CREAM = new FoodProperties.Builder()
            .nutrition(6).saturationModifier(0.2f).build();
    public static final FoodProperties COCOA_ICE_CREAM = new FoodProperties.Builder()
            .nutrition(6).saturationModifier(0.3f).build();
    public static final FoodProperties MILK_ICE_CREAM = new FoodProperties.Builder()
            .nutrition(8).saturationModifier(0.4f).build();
    public static final Consumable SLOWING_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    new MobEffectInstance(MobEffects.SLOWNESS, 5*20), 0.4f)).build();
}
