package net.crystal.mod.polisher;

import net.crystal.mod.CrystalMod;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.CompoundTag;

/* This allows our polishing block to have an invetory. */
public class PolisherBlockEntity extends BlockEntity {

    public int number = 7;

    public PolisherBlockEntity() {
        super(CrystalMod.POLISHER_BLOCK_ENTITY);
     }

     // Serialize the BlockEntity
    public CompoundTag toTag(CompoundTag tag) {
        super.toTag(tag);

        // Save the current value of the number to the tag
        tag.putInt("number", number);

        return tag;
    }

        // Deserialize the BlockEntity
    public void fromTag(CompoundTag tag) {
        super.fromTag(this.getCachedState(), tag);
        number = tag.getInt("number");
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}