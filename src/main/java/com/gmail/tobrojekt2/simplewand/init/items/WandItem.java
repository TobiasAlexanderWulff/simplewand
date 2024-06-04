package com.gmail.tobrojekt2.simplewand.init.items;

import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

public class WandItem extends Item {
    public WandItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(@Nonnull Level world, @Nonnull Player player, @Nonnull InteractionHand hand) {

        BlockHitResult ray = getPlayerPOVHitResult(world, player, ClipContext.Fluid.NONE);
        BlockPos lookPos = ray.getBlockPos().relative(ray.getDirection());

        player.setPos(lookPos.getX(), lookPos.getY(), lookPos.getZ());
        player.getCooldowns().addCooldown(this, 20);
        player.fallDistance = 0.0F;
        world.playSound(
            null, 
            player.getX(), player.getY(), player.getZ(), 
            SoundEvents.ENDERMAN_TELEPORT,
            SoundSource.PLAYERS,  
            1.0F, // volume
            1.0F // pitch
        );

        return super.use(world, player, hand);
    }

    @Override
    public void appendHoverText(@Nonnull ItemStack stack, @Nullable Level worldIn, @Nonnull List<Component> tooltip, @Nonnull TooltipFlag flagIn) {
        tooltip.add(Component.literal("teleports you where you're looking"));

        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
    
}
