package Nero.Punch4Wool;

import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Punch4Wool.MODID)
public class SheepWoolEvent {

    @SubscribeEvent
    public static void onSheepHurtEvent(LivingHurtEvent event) {

        if (event.getEntity() instanceof Sheep sheep && event.getSource().getEntity() instanceof Player player) {
            if (!sheep.isSheared() && ! sheep.isBaby()) {
                Level wrld = sheep.level();
                DyeColor sheepColor = sheep.getColor();
                int count = wrld.random.nextInt(3) + 1;
                ItemStack wool = new ItemStack(Items.WHITE_WOOL);
                switch (sheepColor) {
                    case WHITE:
                        wool = new ItemStack(Items.WHITE_WOOL);
                        break;
                    case ORANGE:
                        wool = new ItemStack(Items.ORANGE_WOOL);
                        break;
                    case MAGENTA:
                        wool = new ItemStack(Items.MAGENTA_WOOL);
                        break;
                    case LIGHT_BLUE:
                        wool = new ItemStack(Items.LIGHT_BLUE_WOOL);
                        break;
                    case YELLOW:
                        wool = new ItemStack(Items.YELLOW_WOOL);
                        break;
                    case LIME:
                        wool = new ItemStack(Items.LIME_WOOL);
                        break;
                    case PINK:
                        wool = new ItemStack(Items.PINK_WOOL);
                        break;
                    case GRAY:
                        wool = new ItemStack(Items.GRAY_WOOL);
                        break;
                    case LIGHT_GRAY:
                        wool = new ItemStack(Items.LIGHT_GRAY_WOOL);
                        break;
                    case CYAN:
                        wool = new ItemStack(Items.CYAN_WOOL);
                        break;
                    case PURPLE:
                        wool = new ItemStack(Items.PURPLE_WOOL);
                        break;
                    case BLUE:
                        wool = new ItemStack(Items.BLUE_WOOL);
                        break;
                    case BROWN:
                        wool = new ItemStack(Items.BROWN_WOOL);
                        break;
                    case GREEN:
                        wool = new ItemStack(Items.GREEN_WOOL);
                        break;
                    case RED:
                        wool = new ItemStack(Items.RED_WOOL);
                        break;
                    case BLACK:
                        wool = new ItemStack(Items.BLACK_WOOL);
                        break;
                }

                for (int i = 0; i <= count; ++i)
                    sheep.spawnAtLocation(wool);
                sheep.setSheared(true);

            }
        }


    }

}
