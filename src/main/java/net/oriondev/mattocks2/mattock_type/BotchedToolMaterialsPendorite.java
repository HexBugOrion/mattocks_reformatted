package net.oriondev.mattocks2.mattock_type;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.recipe.Ingredient;

public class BotchedToolMaterialsPendorite implements ToolMaterial {

    @Override public int getDurability() {
        return 2500;
    }

    @Override public float getMiningSpeedMultiplier() {
        return 9.5F;
    }

    @Override public float getAttackDamage() {
        return 4.0F;
    }

    @Override public int getMiningLevel() {
        return 5;
    }

    @Override public int getEnchantability() {
        return 15;
    }

    public Ingredient getRepairIngredient() {
        CompoundTag pendoriteNBT = new CompoundTag();
        pendoriteNBT.putString("id", "byg:pendorite_scraps");
        pendoriteNBT.putByte("Count", (byte) 1);

        ItemStack pendoriteScraps = ItemStack.fromTag(pendoriteNBT);

        return Ingredient.ofStacks(pendoriteScraps);
    }
}
