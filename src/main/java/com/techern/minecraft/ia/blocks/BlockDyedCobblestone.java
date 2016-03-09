package com.techern.minecraft.ia.blocks;

import net.minecraft.block.BlockColored;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * A block representing a colored cobblestone {@link net.minecraft.block.Block}
 *
 * @since 0.0.1
 */
public class BlockDyedCobblestone extends BlockColored {

    /**
     * Creates a new {@link BlockDyedCobblestone}
     *
     * @since 0.0.1
     */
    public BlockDyedCobblestone() {
        super(Material.rock);

        this.setHardness(2.0F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabs.tabDecorations); //TODO: Add to Coloured Blocks tab
        this.setUnlocalizedName("dyed_cobblestone");
        this.setHarvestLevel("pickaxe", 0);
    }

}