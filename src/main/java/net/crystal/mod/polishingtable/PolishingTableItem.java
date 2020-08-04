package net.crystal.mod.polishingtable;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class PolishingTableItem  extends Item {

    //private static final Text field_17362 = new TranslatableText("container.crafting", new Object[0]);

    public PolishingTableItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
   
        MinecraftClient.getInstance().openScreen(new PolisghingTableItemScreen(new PolishingTableGui()));

        return super.use(world, playerEntity, hand);

    }

   
}