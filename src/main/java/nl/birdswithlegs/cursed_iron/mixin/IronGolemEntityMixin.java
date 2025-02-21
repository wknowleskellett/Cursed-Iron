package nl.birdswithlegs.cursed_iron.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import nl.birdswithlegs.cursed_iron.CursedIronMod;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

@Mixin(IronGolemEntity.class)
public class IronGolemEntityMixin {

    @Inject(at = @At("HEAD"), method = "interactMob(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/util/Hand;)Lnet/minecraft/util/ActionResult;", cancellable = true, locals = LocalCapture.CAPTURE_FAILHARD)
    protected void interactMob(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResult> ci) {
        CursedIronMod.LOGGER.info("BING BONG");

        ItemStack itemStack = player.getStackInHand(hand);
        if (!itemStack.isOf(CursedIronMod.CURSED_IRON_INGOT)) {
            return;
        }
        IronGolemEntity that = (IronGolemEntity) (Object) this;
        // float health = that.getHealth();
        that.heal(25.0F);
        // if (that.getHealth() == health) {
        //     return;
        // }
        that.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, -1));
        that.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, -1));

        float g = 1.0F + (that.getRandom().nextFloat() - that.getRandom().nextFloat()) * 0.2F;
        that.playSound(SoundEvents.ENTITY_IRON_GOLEM_REPAIR, 1.0F, g);
        if (!player.getAbilities().creativeMode) {
            that.setAttacker(player);
            itemStack.decrement(1);
        }

        ci.setReturnValue(ActionResult.success(that.world.isClient));
    }
}
