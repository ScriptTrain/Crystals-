package net.crystal.mod.polishingtable;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PolishingTableItem  extends Item {

    private static final Text field_17362 = new TranslatableText("container.crafting", new Object[0]);

    public PolishingTableItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        if (!world.isClient()) {
            playerEntity.openHandledScreen(openHandledScreenHandler(world, playerEntity.getBlockPos()));
        }
        return new TypedActionResult<>(ActionResult.PASS, playerEntity.getStackInHand(hand));
    }

    private NamedScreenHandlerFactory openHandledScreenHandler(World world, BlockPos blockPos) {
        return new SimpleNamedScreenHandlerFactory(
                    (int_1, playerInventory_1, playerEntity_1) 
                -> 
                    new PolishingTableContainer(int_1, playerInventory_1,
                        ScreenHandlerContext.create(world, blockPos)),
                field_17362
        );
    }
}