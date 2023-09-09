package net.colorizedblock.jev.item.custom;

import net.colorizedblock.jev.JustEnoughVanilla;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import java.util.Random;

public class FluteItem extends Item {
    public FluteItem(Settings settings) {
        super(settings);
    }
    int max = 2;
    int randomNum;
    Random rand = new Random();
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient) {
            randomNum = rand.nextInt(max);
            if(randomNum == 0) {
                user.sendMessage(Text.of("flute 1"));
                world.playSound(null, user.getBlockPos(), JustEnoughVanilla.FLUTE_1, SoundCategory.RECORDS, 1f, 1f);
            }
            if(randomNum == 1) {
                user.sendMessage(Text.of("flute 2"));
                world.playSound(null, user.getBlockPos(), JustEnoughVanilla.FLUTE_2, SoundCategory.RECORDS, 1f, 1f);
            }
            user.getItemCooldownManager().set(user.getStackInHand(hand).getItem(), 120);
        }
        return super.use(world, user, hand);
    }
}
