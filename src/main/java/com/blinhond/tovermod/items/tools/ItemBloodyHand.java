package com.blinhond.tovermod.items.tools;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemBloodyHand extends ItemSword {
    public ItemBloodyHand() {
        super(ToolMaterial.DIAMOND);
        setRegistryName(Reference.ToverModItems.BLOODYHAND.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.BLOODYHAND.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        canRepair = false;
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        attacker.heal(getAttackDamage());

        return true;
    }
}
