package cz.yesseruser.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class ModFoods {
    public static final FoodComponent SWEET_BERRY_ICE_CREAM = new FoodComponent.Builder()
            .nutrition(6).saturationModifier(0.2f).build();
    public static final FoodComponent COCOA_ICE_CREAM = new FoodComponent.Builder()
            .nutrition(6).saturationModifier(0.3f).build();
    public static final FoodComponent MILK_ICE_CREAM = new FoodComponent.Builder()
            .nutrition(8).saturationModifier(0.4f).build();
    public static final ConsumableComponent SLOWING_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(
                    new StatusEffectInstance(StatusEffects.SLOWNESS, 5*20), 0.4f)).build();
}
