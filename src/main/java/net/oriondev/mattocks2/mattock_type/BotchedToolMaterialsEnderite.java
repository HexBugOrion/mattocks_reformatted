package net.oriondev.mattocks2.mattock_type;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.recipe.Ingredient;

public class BotchedToolMaterialsEnderite implements ToolMaterial {

    @Override
    public int getDurability() {
        return 4096;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10;
    }

    @Override
    public float getAttackDamage() {
        return 4;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 17;
    }

    @Override
    public Ingredient getRepairIngredient() {
        CompoundTag enderiteNBT = new CompoundTag();
        enderiteNBT.putString("id", "enderitemod:enderite_ingot");
        enderiteNBT.putByte("Count", (byte) 1);

        ItemStack enderiteIngot = ItemStack.fromTag(enderiteNBT);

        return Ingredient.ofStacks(enderiteIngot);
    }
}
