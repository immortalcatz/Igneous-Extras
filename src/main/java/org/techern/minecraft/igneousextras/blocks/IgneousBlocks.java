package org.techern.minecraft.igneousextras.blocks;

import mcp.MethodsReturnNonnullByDefault;
import org.techern.minecraft.IgneousExtrasMod;
import org.techern.minecraft.igneousextras.blocks.redstone.BlockBasicLever;
import org.techern.minecraft.igneousextras.ConfigHandler;
import org.techern.minecraft.igneousextras.blocks.redstone.BlockBasicPressurePlate;
import org.techern.minecraft.igneousextras.blocks.stairs.BaseBlockStairs;
import org.techern.minecraft.igneousextras.blocks.stairs.ColoredBlockStairs;
import org.techern.minecraft.igneousextras.items.ItemColoredBlock;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * A class that contains every {@link net.minecraft.block.Block} added by the {@link IgneousExtrasMod}
 *
 * @since 0.0.1
 */
public class IgneousBlocks {

    /**
     * The {@link CreativeTabs} for dyed blocks
     *
     * @since 0.0.1
     */
    public static CreativeTabs DYED_BLOCKS_TAB = new CreativeTabs("dyed_blocks") {
        @Override
        @MethodsReturnNonnullByDefault
        public Item getTabIconItem() {
            return Item.getItemFromBlock(DYED_COBBLESTONE);
        }
    };

    /**
     * The {@link CreativeTabs} for igneous stairs
     *
     * @since 0.0.1
     */
    public static CreativeTabs STAIRS_TAB = new CreativeTabs("igneous_stairs") {
        @Override
        @MethodsReturnNonnullByDefault
        public Item getTabIconItem() {
            return Item.getItemFromBlock(GRANITE_STAIRS);
        }
    };

    /**
     * The {@link CreativeTabs} for dyed igneous stirs
     *
     * @since 0.0.1
     */
    public static CreativeTabs DYED_STAIRS_TAB = new CreativeTabs("dyed_igneous_stairs") {
        @Override
        @MethodsReturnNonnullByDefault
        public Item getTabIconItem() {
            return Item.getItemFromBlock(WHITE_DYED_COBBLESTONE_STAIRS);
        }
    };

    /**
     * The {@link CreativeTabs} for levers
     *
     * @since 0.0.2
     */
    public static CreativeTabs IGNEOUS_LEVER_TAB = new CreativeTabs("igneous_levers") {
        @Override
        @MethodsReturnNonnullByDefault
        public Item getTabIconItem() {
            return Item.getItemFromBlock(MOSSY_STONE_BRICK_LEVER);
        }
    };

    /**
     * The {@link CreativeTabs} for pressure plates
     *
     * @since 0.0.2
     */
    public static CreativeTabs IGNEOUS_PRESSURE_PLATES_TAB = new CreativeTabs("igneous_pressure_plates") {
        @Override
        @MethodsReturnNonnullByDefault
        public Item getTabIconItem() {
            return Item.getItemFromBlock(GRANITE_PRESSURE_PLATE);
        }
    };

    /**
     * A {@link BlockColored} defining a {@link BlockDyedCobblestone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_COBBLESTONE = new BlockDyedCobblestone();

    /**
     * A {@link BlockColored} defining a mossy cobblestone {@link BlockDyedStone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_MOSSY_COBBLESTONE = new BlockDyedStone("dyed_mossy_cobblestone");

    /**
     * A {@link BlockColored} defining a {@link BlockDyedStone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_STONE = new BlockDyedStone("dyed_stone");

    /**
     * A {@link BlockColored} defining a granite {@link BlockDyedStone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_GRANITE = new BlockDyedStone("dyed_granite");

    /**
     * A {@link BlockColored} defining a smooth granite {@link BlockDyedStone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_SMOOTH_GRANITE = new BlockDyedStone("dyed_smooth_granite");

    /**
     * A {@link BlockColored} defining a diorite {@link BlockDyedStone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_DIORITE = new BlockDyedStone("dyed_diorite");

    /**
     * A {@link BlockColored} defining a smooth diorite {@link BlockDyedStone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_SMOOTH_DIORITE = new BlockDyedStone("dyed_smooth_diorite");

    /**
     * A {@link BlockColored} defining an andesite {@link BlockDyedStone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_ANDESITE = new BlockDyedStone("dyed_andesite");

    /**
     * A {@link BlockColored} defining a smooth andesite {@link BlockDyedStone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_SMOOTH_ANDESITE = new BlockDyedStone("dyed_smooth_andesite");

    /**
     * A {@link BlockStairs} defining stone stairs
     *
     * @since 0.0.1
     */
    public static BlockStairs STONE_STAIRS = new BaseBlockStairs(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.STONE), "stone_stairs");

    /**
     * A {@link BlockStairs} defining mossy cobblestone stairs
     *
     * @since 0.0.1
     */
    public static BlockStairs MOSSY_COBBLESTONE_STAIRS = new BaseBlockStairs(Blocks.MOSSY_COBBLESTONE.getDefaultState(), "mossy_cobblestone_stairs");

    /**
     * A {@link BlockStairs} defining granite stairs
     *
     * @since 0.0.1
     */
    public static BlockStairs GRANITE_STAIRS = new BaseBlockStairs(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.GRANITE), "granite_stairs");

    /**
     * A {@link BlockStairs} defining polished granite stairs
     *
     * @since 0.0.1
     */
    public static BlockStairs POLISHED_GRANITE_STAIRS = new BaseBlockStairs(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.GRANITE_SMOOTH), "polished_granite_stairs");

    /**
     * A {@link BlockStairs} defining diorite stairs
     *
     * @since 0.0.1
     */
    public static BlockStairs DIORITE_STAIRS = new BaseBlockStairs(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.DIORITE), "diorite_stairs");

    /**
     * A {@link BlockStairs} defining polished diorite stairs
     *
     * @since 0.0.1
     */
    public static BlockStairs POLISHED_DIORITE_STAIRS = new BaseBlockStairs(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.DIORITE_SMOOTH), "polished_diorite_stairs");

    /**
     * A {@link BlockStairs} defining andesite stairs
     *
     * @since 0.0.1
     */
    public static BlockStairs ANDESITE_STAIRS = new BaseBlockStairs(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.ANDESITE), "andesite_stairs");

    /**
     * A {@link BlockStairs} defining polished andesite stairs
     *
     * @since 0.0.1
     */
    public static BlockStairs POLISHED_ANDESITE_STAIRS = new BaseBlockStairs(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.ANDESITE_SMOOTH), "polished_andesite_stairs");

    /**
     * Lime coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIME_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.LIME), "lime_dyed_cobblestone_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.BLACK), "black_dyed_cobblestone_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.BLUE), "blue_dyed_cobblestone_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.BROWN), "brown_dyed_cobblestone_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_cobblestone_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.GRAY), "gray_dyed_cobblestone_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.GREEN), "green_dyed_cobblestone_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_cobblestone_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_cobblestone_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_cobblestone_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.PINK), "pink_dyed_cobblestone_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_cobblestone_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.RED), "red_dyed_cobblestone_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.SILVER), "silver_dyed_cobblestone_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.WHITE), "white_dyed_cobblestone_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_cobblestone_stairs");


    /**
     * Lime coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIME_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.LIME), "lime_dyed_mossy_cobblestone_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.BLACK), "black_dyed_mossy_cobblestone_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.BLUE), "blue_dyed_mossy_cobblestone_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.BROWN), "brown_dyed_mossy_cobblestone_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_mossy_cobblestone_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.GRAY), "gray_dyed_mossy_cobblestone_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.GREEN), "green_dyed_mossy_cobblestone_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_mossy_cobblestone_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_mossy_cobblestone_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_mossy_cobblestone_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.PINK), "pink_dyed_mossy_cobblestone_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_mossy_cobblestone_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.RED), "red_dyed_mossy_cobblestone_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.SILVER), "silver_dyed_mossy_cobblestone_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.WHITE), "white_dyed_mossy_cobblestone_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_mossy_cobblestone_stairs");


    /**
     * Lime coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIME_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIME), "lime_dyed_stone_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLACK), "black_dyed_stone_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLUE), "blue_dyed_stone_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BROWN), "brown_dyed_stone_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_stone_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GRAY), "gray_dyed_stone_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GREEN), "green_dyed_stone_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_stone_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_stone_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_stone_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PINK), "pink_dyed_stone_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_stone_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.RED), "red_dyed_stone_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.SILVER), "silver_dyed_stone_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.WHITE), "white_dyed_stone_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_stone_stairs");

    /**
     * Lime coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIME_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIME), "lime_dyed_andesite_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLACK), "black_dyed_andesite_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLUE), "blue_dyed_andesite_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BROWN), "brown_dyed_andesite_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_andesite_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GRAY), "gray_dyed_andesite_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GREEN), "green_dyed_andesite_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_andesite_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_andesite_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_andesite_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PINK), "pink_dyed_andesite_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_andesite_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.RED), "red_dyed_andesite_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.SILVER), "silver_dyed_andesite_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.WHITE), "white_dyed_andesite_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_andesite_stairs");

    /**
     * Lime coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIME_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIME), "lime_dyed_diorite_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLACK), "black_dyed_diorite_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLUE), "blue_dyed_diorite_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BROWN), "brown_dyed_diorite_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_diorite_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GRAY), "gray_dyed_diorite_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GREEN), "green_dyed_diorite_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_diorite_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_diorite_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_diorite_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PINK), "pink_dyed_diorite_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_diorite_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.RED), "red_dyed_diorite_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.SILVER), "silver_dyed_diorite_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.WHITE), "white_dyed_diorite_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_diorite_stairs");

    /**
     * Lime coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIME_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIME), "lime_dyed_granite_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLACK), "black_dyed_granite_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLUE), "blue_dyed_granite_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BROWN), "brown_dyed_granite_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_granite_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GRAY), "gray_dyed_granite_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GREEN), "green_dyed_granite_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_granite_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_granite_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_granite_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PINK), "pink_dyed_granite_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_granite_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.RED), "red_dyed_granite_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.SILVER), "silver_dyed_granite_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.WHITE), "white_dyed_granite_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_granite_stairs");


    /**
     * Lime coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIME_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIME), "lime_dyed_polished_andesite_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLACK), "black_dyed_polished_andesite_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLUE), "blue_dyed_polished_andesite_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BROWN), "brown_dyed_polished_andesite_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_polished_andesite_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GRAY), "gray_dyed_polished_andesite_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GREEN), "green_dyed_polished_andesite_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_polished_andesite_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_polished_andesite_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_polished_andesite_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PINK), "pink_dyed_polished_andesite_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_polished_andesite_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.RED), "red_dyed_polished_andesite_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.SILVER), "silver_dyed_polished_andesite_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.WHITE), "white_dyed_polished_andesite_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_polished_andesite_stairs");

    /**
     * Lime coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIME_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIME), "lime_dyed_polished_diorite_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLACK), "black_dyed_polished_diorite_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLUE), "blue_dyed_polished_diorite_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BROWN), "brown_dyed_polished_diorite_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_polished_diorite_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GRAY), "gray_dyed_polished_diorite_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GREEN), "green_dyed_polished_diorite_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_polished_diorite_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_polished_diorite_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_polished_diorite_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PINK), "pink_dyed_polished_diorite_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_polished_diorite_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.RED), "red_dyed_polished_diorite_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.SILVER), "silver_dyed_polished_diorite_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.WHITE), "white_dyed_polished_diorite_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_polished_diorite_stairs");

    /**
     * Lime coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIME_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIME), "lime_dyed_polished_granite_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLACK), "black_dyed_polished_granite_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLUE), "blue_dyed_polished_granite_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BROWN), "brown_dyed_polished_granite_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_polished_granite_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GRAY), "gray_dyed_polished_granite_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GREEN), "green_dyed_polished_granite_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_polished_granite_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_polished_granite_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_polished_granite_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PINK), "pink_dyed_polished_granite_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_polished_granite_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.RED), "red_dyed_polished_granite_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.SILVER), "silver_dyed_polished_granite_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.WHITE), "white_dyed_polished_granite_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_polished_granite_stairs");

    /**
     * A granite {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "granite_pressure_plate");

    /**
     * A polished granite {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block POLISHED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "polished_granite_pressure_plate");

    /**
     * A diorite {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "diorite_pressure_plate");

    /**
     * A polished diorite {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block POLISHED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "polished_diorite_pressure_plate");

    /**
     * A andesite {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "andesite_pressure_plate");

    /**
     * A polished andesite {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block POLISHED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "polished_andesite_pressure_plate");

    /**
     * A cobblestone {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "cobblestone_pressure_plate");

    /**
     * A mossy cobblestone {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block MOSSY_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "mossy_cobblestone_pressure_plate");

    /**
     * A stone brick {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block STONE_BRICK_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "stone_brick_pressure_plate");

    /**
     * A cracked stone brick {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block CRACKED_STONE_BRICK_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "cracked_stone_brick_pressure_plate");

    /**
     * A chiseled stone brick {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block CHISELED_STONE_BRICK_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "chiseled_stone_brick_pressure_plate");

    /**
     * A mossy stone brick {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block MOSSY_STONE_BRICK_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "mossy_stone_brick_pressure_plate");

    /**
     * A granite {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block GRANITE_LEVER = new BlockBasicLever("granite_lever");

    /**
     * A polished granite {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block POLISHED_GRANITE_LEVER = new BlockBasicLever("polished_granite_lever");
    
    /**
     * A diorite {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block DIORITE_LEVER = new BlockBasicLever("diorite_lever");

    /**
     * A polished diorite {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block POLISHED_DIORITE_LEVER = new BlockBasicLever("polished_diorite_lever");

    /**
     * A andesite {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block ANDESITE_LEVER = new BlockBasicLever("andesite_lever");

    /**
     * A polished andesite {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block POLISHED_ANDESITE_LEVER = new BlockBasicLever("polished_andesite_lever");

    /**
     * A mossy cobblestone {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block MOSSY_COBBLESTONE_LEVER = new BlockBasicLever("mossy_cobblestone_lever");

    /**
     * A stone {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block STONE_LEVER = new BlockBasicLever("stone_lever");

    /**
     * A stone brick {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block STONE_BRICK_LEVER = new BlockBasicLever("stone_brick_lever");

    /**
     * A chiseled stone brick {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block CHISELED_STONE_BRICK_LEVER = new BlockBasicLever("chiseled_stone_brick_lever");

    /**
     * A cracked stone brick {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block CRACKED_STONE_BRICK_LEVER = new BlockBasicLever("cracked_stone_brick_lever");

    /**
     * A mossy stone brick {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block MOSSY_STONE_BRICK_LEVER = new BlockBasicLever("mossy_stone_brick_lever");


    /**
     * Lime coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate LIME_DYED_STONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "lime_dyed_stone_pressure_plate");

    /**
     * Black coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BLACK_DYED_STONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "black_dyed_stone_pressure_plate");

    /**
     * Blue coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BLUE_DYED_STONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "blue_dyed_stone_pressure_plate");

    /**
     * Brown coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BROWN_DYED_STONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "brown_dyed_stone_pressure_plate");

    /**
     * Cyan coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate CYAN_DYED_STONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "cyan_dyed_stone_pressure_plate");

    /**
     * Gray coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate GRAY_DYED_STONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "gray_dyed_stone_pressure_plate");

    /**
     * Green coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate GREEN_DYED_STONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "green_dyed_stone_pressure_plate");

    /**
     * Light blue coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate LIGHT_BLUE_DYED_STONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "light_blue_dyed_stone_pressure_plate");

    /**
     * Magenta coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate MAGENTA_DYED_STONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "magenta_dyed_stone_pressure_plate");

    /**
     * Orange coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate ORANGE_DYED_STONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "orange_dyed_stone_pressure_plate");

    /**
     * Pink coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate PINK_DYED_STONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "pink_dyed_stone_pressure_plate");

    /**
     * Purple coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate PURPLE_DYED_STONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "purple_dyed_stone_pressure_plate");

    /**
     * Red coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate RED_DYED_STONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "red_dyed_stone_pressure_plate");

    /**
     * Silver coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate SILVER_DYED_STONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "silver_dyed_stone_pressure_plate");

    /**
     * White coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate WHITE_DYED_STONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "white_dyed_stone_pressure_plate");

    /**
     * Yellow coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate YELLOW_DYED_STONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "yellow_dyed_stone_pressure_plate");


    /**
     * Lime coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate LIME_DYED_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "lime_dyed_cobblestone_pressure_plate");

    /**
     * Black coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BLACK_DYED_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "black_dyed_cobblestone_pressure_plate");

    /**
     * Blue coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BLUE_DYED_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "blue_dyed_cobblestone_pressure_plate");

    /**
     * Brown coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BROWN_DYED_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "brown_dyed_cobblestone_pressure_plate");

    /**
     * Cyan coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate CYAN_DYED_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "cyan_dyed_cobblestone_pressure_plate");

    /**
     * Gray coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate GRAY_DYED_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "gray_dyed_cobblestone_pressure_plate");

    /**
     * Green coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate GREEN_DYED_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "green_dyed_cobblestone_pressure_plate");

    /**
     * Light blue coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate LIGHT_BLUE_DYED_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "light_blue_dyed_cobblestone_pressure_plate");

    /**
     * Magenta coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate MAGENTA_DYED_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "magenta_dyed_cobblestone_pressure_plate");

    /**
     * Orange coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate ORANGE_DYED_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "orange_dyed_cobblestone_pressure_plate");

    /**
     * Pink coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate PINK_DYED_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "pink_dyed_cobblestone_pressure_plate");

    /**
     * Purple coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate PURPLE_DYED_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "purple_dyed_cobblestone_pressure_plate");

    /**
     * Red coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate RED_DYED_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "red_dyed_cobblestone_pressure_plate");

    /**
     * Silver coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate SILVER_DYED_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "silver_dyed_cobblestone_pressure_plate");

    /**
     * White coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate WHITE_DYED_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "white_dyed_cobblestone_pressure_plate");

    /**
     * Yellow coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate YELLOW_DYED_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "yellow_dyed_cobblestone_pressure_plate");


    /**
     * Lime coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate LIME_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "lime_dyed_mossy_cobblestone_pressure_plate");

    /**
     * Black coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BLACK_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "black_dyed_mossy_cobblestone_pressure_plate");

    /**
     * Blue coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BLUE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "blue_dyed_mossy_cobblestone_pressure_plate");

    /**
     * Brown coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BROWN_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "brown_dyed_mossy_cobblestone_pressure_plate");

    /**
     * Cyan coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate CYAN_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "cyan_dyed_mossy_cobblestone_pressure_plate");

    /**
     * Gray coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate GRAY_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "gray_dyed_mossy_cobblestone_pressure_plate");

    /**
     * Green coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate GREEN_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "green_dyed_mossy_cobblestone_pressure_plate");

    /**
     * Light blue coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate LIGHT_BLUE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "light_blue_dyed_mossy_cobblestone_pressure_plate");

    /**
     * Magenta coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate MAGENTA_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "magenta_dyed_mossy_cobblestone_pressure_plate");

    /**
     * Orange coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate ORANGE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "orange_dyed_mossy_cobblestone_pressure_plate");

    /**
     * Pink coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate PINK_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "pink_dyed_mossy_cobblestone_pressure_plate");

    /**
     * Purple coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate PURPLE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "purple_dyed_mossy_cobblestone_pressure_plate");

    /**
     * Red coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate RED_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "red_dyed_mossy_cobblestone_pressure_plate");

    /**
     * Silver coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate SILVER_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "silver_dyed_mossy_cobblestone_pressure_plate");

    /**
     * White coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate WHITE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "white_dyed_mossy_cobblestone_pressure_plate");

    /**
     * Yellow coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate YELLOW_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "yellow_dyed_mossy_cobblestone_pressure_plate");



    /**
     * Lime coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate LIME_DYED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "lime_dyed_granite_pressure_plate");

    /**
     * Black coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BLACK_DYED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "black_dyed_granite_pressure_plate");

    /**
     * Blue coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BLUE_DYED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "blue_dyed_granite_pressure_plate");

    /**
     * Brown coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BROWN_DYED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "brown_dyed_granite_pressure_plate");

    /**
     * Cyan coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate CYAN_DYED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "cyan_dyed_granite_pressure_plate");

    /**
     * Gray coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate GRAY_DYED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "gray_dyed_granite_pressure_plate");

    /**
     * Green coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate GREEN_DYED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "green_dyed_granite_pressure_plate");

    /**
     * Light blue coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate LIGHT_BLUE_DYED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "light_blue_dyed_granite_pressure_plate");

    /**
     * Magenta coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate MAGENTA_DYED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "magenta_dyed_granite_pressure_plate");

    /**
     * Orange coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate ORANGE_DYED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "orange_dyed_granite_pressure_plate");

    /**
     * Pink coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate PINK_DYED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "pink_dyed_granite_pressure_plate");

    /**
     * Purple coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate PURPLE_DYED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "purple_dyed_granite_pressure_plate");

    /**
     * Red coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate RED_DYED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "red_dyed_granite_pressure_plate");

    /**
     * Silver coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate SILVER_DYED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "silver_dyed_granite_pressure_plate");

    /**
     * White coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate WHITE_DYED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "white_dyed_granite_pressure_plate");

    /**
     * Yellow coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate YELLOW_DYED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "yellow_dyed_granite_pressure_plate");


    /**
     * Lime coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate LIME_DYED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "lime_dyed_diorite_pressure_plate");

    /**
     * Black coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BLACK_DYED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "black_dyed_diorite_pressure_plate");

    /**
     * Blue coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BLUE_DYED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "blue_dyed_diorite_pressure_plate");

    /**
     * Brown coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BROWN_DYED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "brown_dyed_diorite_pressure_plate");

    /**
     * Cyan coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate CYAN_DYED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "cyan_dyed_diorite_pressure_plate");

    /**
     * Gray coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate GRAY_DYED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "gray_dyed_diorite_pressure_plate");

    /**
     * Green coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate GREEN_DYED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "green_dyed_diorite_pressure_plate");

    /**
     * Light blue coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate LIGHT_BLUE_DYED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "light_blue_dyed_diorite_pressure_plate");

    /**
     * Magenta coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate MAGENTA_DYED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "magenta_dyed_diorite_pressure_plate");

    /**
     * Orange coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate ORANGE_DYED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "orange_dyed_diorite_pressure_plate");

    /**
     * Pink coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate PINK_DYED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "pink_dyed_diorite_pressure_plate");

    /**
     * Purple coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate PURPLE_DYED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "purple_dyed_diorite_pressure_plate");

    /**
     * Red coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate RED_DYED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "red_dyed_diorite_pressure_plate");

    /**
     * Silver coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate SILVER_DYED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "silver_dyed_diorite_pressure_plate");

    /**
     * White coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate WHITE_DYED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "white_dyed_diorite_pressure_plate");

    /**
     * Yellow coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate YELLOW_DYED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "yellow_dyed_diorite_pressure_plate");

    /**
     * Lime coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate LIME_DYED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "lime_dyed_andesite_pressure_plate");

    /**
     * Black coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BLACK_DYED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "black_dyed_andesite_pressure_plate");

    /**
     * Blue coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BLUE_DYED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "blue_dyed_andesite_pressure_plate");

    /**
     * Brown coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BROWN_DYED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "brown_dyed_andesite_pressure_plate");

    /**
     * Cyan coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate CYAN_DYED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "cyan_dyed_andesite_pressure_plate");

    /**
     * Gray coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate GRAY_DYED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "gray_dyed_andesite_pressure_plate");

    /**
     * Green coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate GREEN_DYED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "green_dyed_andesite_pressure_plate");

    /**
     * Light blue coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate LIGHT_BLUE_DYED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "light_blue_dyed_andesite_pressure_plate");

    /**
     * Magenta coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate MAGENTA_DYED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "magenta_dyed_andesite_pressure_plate");

    /**
     * Orange coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate ORANGE_DYED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "orange_dyed_andesite_pressure_plate");

    /**
     * Pink coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate PINK_DYED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "pink_dyed_andesite_pressure_plate");

    /**
     * Purple coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate PURPLE_DYED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "purple_dyed_andesite_pressure_plate");

    /**
     * Red coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate RED_DYED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "red_dyed_andesite_pressure_plate");

    /**
     * Silver coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate SILVER_DYED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "silver_dyed_andesite_pressure_plate");

    /**
     * White coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate WHITE_DYED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "white_dyed_andesite_pressure_plate");

    /**
     * Yellow coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate YELLOW_DYED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "yellow_dyed_andesite_pressure_plate");


    /**
     * Lime coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate LIME_DYED_POLISHED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "lime_dyed_polished_granite_pressure_plate");

    /**
     * Black coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BLACK_DYED_POLISHED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "black_dyed_polished_granite_pressure_plate");

    /**
     * Blue coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BLUE_DYED_POLISHED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "blue_dyed_polished_granite_pressure_plate");

    /**
     * Brown coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BROWN_DYED_POLISHED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "brown_dyed_polished_granite_pressure_plate");

    /**
     * Cyan coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate CYAN_DYED_POLISHED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "cyan_dyed_polished_granite_pressure_plate");

    /**
     * Gray coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate GRAY_DYED_POLISHED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "gray_dyed_polished_granite_pressure_plate");

    /**
     * Green coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate GREEN_DYED_POLISHED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "green_dyed_polished_granite_pressure_plate");

    /**
     * Light blue coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate LIGHT_BLUE_DYED_POLISHED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "light_blue_dyed_polished_granite_pressure_plate");

    /**
     * Magenta coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate MAGENTA_DYED_POLISHED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "magenta_dyed_polished_granite_pressure_plate");

    /**
     * Orange coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate ORANGE_DYED_POLISHED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "orange_dyed_polished_granite_pressure_plate");

    /**
     * Pink coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate PINK_DYED_POLISHED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "pink_dyed_polished_granite_pressure_plate");

    /**
     * Purple coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate PURPLE_DYED_POLISHED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "purple_dyed_polished_granite_pressure_plate");

    /**
     * Red coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate RED_DYED_POLISHED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "red_dyed_polished_granite_pressure_plate");

    /**
     * Silver coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate SILVER_DYED_POLISHED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "silver_dyed_polished_granite_pressure_plate");

    /**
     * White coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate WHITE_DYED_POLISHED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "white_dyed_polished_granite_pressure_plate");

    /**
     * Yellow coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate YELLOW_DYED_POLISHED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "yellow_dyed_polished_granite_pressure_plate");


    /**
     * Lime coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate LIME_DYED_POLISHED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "lime_dyed_polished_diorite_pressure_plate");

    /**
     * Black coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BLACK_DYED_POLISHED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "black_dyed_polished_diorite_pressure_plate");

    /**
     * Blue coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BLUE_DYED_POLISHED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "blue_dyed_polished_diorite_pressure_plate");

    /**
     * Brown coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BROWN_DYED_POLISHED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "brown_dyed_polished_diorite_pressure_plate");

    /**
     * Cyan coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate CYAN_DYED_POLISHED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "cyan_dyed_polished_diorite_pressure_plate");

    /**
     * Gray coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate GRAY_DYED_POLISHED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "gray_dyed_polished_diorite_pressure_plate");

    /**
     * Green coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate GREEN_DYED_POLISHED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "green_dyed_polished_diorite_pressure_plate");

    /**
     * Light blue coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate LIGHT_BLUE_DYED_POLISHED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "light_blue_dyed_polished_diorite_pressure_plate");

    /**
     * Magenta coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate MAGENTA_DYED_POLISHED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "magenta_dyed_polished_diorite_pressure_plate");

    /**
     * Orange coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate ORANGE_DYED_POLISHED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "orange_dyed_polished_diorite_pressure_plate");

    /**
     * Pink coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate PINK_DYED_POLISHED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "pink_dyed_polished_diorite_pressure_plate");

    /**
     * Purple coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate PURPLE_DYED_POLISHED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "purple_dyed_polished_diorite_pressure_plate");

    /**
     * Red coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate RED_DYED_POLISHED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "red_dyed_polished_diorite_pressure_plate");

    /**
     * Silver coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate SILVER_DYED_POLISHED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "silver_dyed_polished_diorite_pressure_plate");

    /**
     * White coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate WHITE_DYED_POLISHED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "white_dyed_polished_diorite_pressure_plate");

    /**
     * Yellow coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate YELLOW_DYED_POLISHED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "yellow_dyed_polished_diorite_pressure_plate");

    /**
     * Lime coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate LIME_DYED_POLISHED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "lime_dyed_polished_andesite_pressure_plate");

    /**
     * Black coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BLACK_DYED_POLISHED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "black_dyed_polished_andesite_pressure_plate");

    /**
     * Blue coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BLUE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "blue_dyed_polished_andesite_pressure_plate");

    /**
     * Brown coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate BROWN_DYED_POLISHED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "brown_dyed_polished_andesite_pressure_plate");

    /**
     * Cyan coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate CYAN_DYED_POLISHED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "cyan_dyed_polished_andesite_pressure_plate");

    /**
     * Gray coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate GRAY_DYED_POLISHED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "gray_dyed_polished_andesite_pressure_plate");

    /**
     * Green coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate GREEN_DYED_POLISHED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "green_dyed_polished_andesite_pressure_plate");

    /**
     * Light blue coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate LIGHT_BLUE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "light_blue_dyed_polished_andesite_pressure_plate");

    /**
     * Magenta coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate MAGENTA_DYED_POLISHED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "magenta_dyed_polished_andesite_pressure_plate");

    /**
     * Orange coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate ORANGE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "orange_dyed_polished_andesite_pressure_plate");

    /**
     * Pink coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate PINK_DYED_POLISHED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "pink_dyed_polished_andesite_pressure_plate");

    /**
     * Purple coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate PURPLE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "purple_dyed_polished_andesite_pressure_plate");

    /**
     * Red coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate RED_DYED_POLISHED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "red_dyed_polished_andesite_pressure_plate");

    /**
     * Silver coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate SILVER_DYED_POLISHED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "silver_dyed_polished_andesite_pressure_plate");

    /**
     * White coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate WHITE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "white_dyed_polished_andesite_pressure_plate");

    /**
     * Yellow coloured {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static BlockBasicPressurePlate YELLOW_DYED_POLISHED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.ROCK, BlockPressurePlate.Sensitivity.EVERYTHING, "yellow_dyed_polished_andesite_pressure_plate");

    /**
     * Lime coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever LIME_DYED_STONE_LEVER = new BlockBasicLever("lime_dyed_stone_lever");

    /**
     * Black coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BLACK_DYED_STONE_LEVER = new BlockBasicLever("black_dyed_stone_lever");

    /**
     * Blue coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BLUE_DYED_STONE_LEVER = new BlockBasicLever("blue_dyed_stone_lever");

    /**
     * Brown coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BROWN_DYED_STONE_LEVER = new BlockBasicLever("brown_dyed_stone_lever");

    /**
     * Cyan coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever CYAN_DYED_STONE_LEVER = new BlockBasicLever("cyan_dyed_stone_lever");

    /**
     * Gray coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever GRAY_DYED_STONE_LEVER = new BlockBasicLever("gray_dyed_stone_lever");

    /**
     * Green coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever GREEN_DYED_STONE_LEVER = new BlockBasicLever("green_dyed_stone_lever");

    /**
     * Light blue coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever LIGHT_BLUE_DYED_STONE_LEVER = new BlockBasicLever("light_blue_dyed_stone_lever");

    /**
     * Magenta coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever MAGENTA_DYED_STONE_LEVER = new BlockBasicLever("magenta_dyed_stone_lever");

    /**
     * Orange coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever ORANGE_DYED_STONE_LEVER = new BlockBasicLever("orange_dyed_stone_lever");

    /**
     * Pink coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever PINK_DYED_STONE_LEVER = new BlockBasicLever("pink_dyed_stone_lever");

    /**
     * Purple coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever PURPLE_DYED_STONE_LEVER = new BlockBasicLever("purple_dyed_stone_lever");

    /**
     * Red coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever RED_DYED_STONE_LEVER = new BlockBasicLever("red_dyed_stone_lever");

    /**
     * Silver coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever SILVER_DYED_STONE_LEVER = new BlockBasicLever("silver_dyed_stone_lever");

    /**
     * White coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever WHITE_DYED_STONE_LEVER = new BlockBasicLever("white_dyed_stone_lever");

    /**
     * Yellow coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever YELLOW_DYED_STONE_LEVER = new BlockBasicLever("yellow_dyed_stone_lever");

    /**
     * Lime coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever LIME_DYED_COBBLESTONE_LEVER = new BlockBasicLever("lime_dyed_cobblestone_lever");

    /**
     * Black coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BLACK_DYED_COBBLESTONE_LEVER = new BlockBasicLever("black_dyed_cobblestone_lever");

    /**
     * Blue coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BLUE_DYED_COBBLESTONE_LEVER = new BlockBasicLever("blue_dyed_cobblestone_lever");

    /**
     * Brown coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BROWN_DYED_COBBLESTONE_LEVER = new BlockBasicLever("brown_dyed_cobblestone_lever");

    /**
     * Cyan coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever CYAN_DYED_COBBLESTONE_LEVER = new BlockBasicLever("cyan_dyed_cobblestone_lever");

    /**
     * Gray coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever GRAY_DYED_COBBLESTONE_LEVER = new BlockBasicLever("gray_dyed_cobblestone_lever");

    /**
     * Green coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever GREEN_DYED_COBBLESTONE_LEVER = new BlockBasicLever("green_dyed_cobblestone_lever");

    /**
     * Light blue coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever LIGHT_BLUE_DYED_COBBLESTONE_LEVER = new BlockBasicLever("light_blue_dyed_cobblestone_lever");

    /**
     * Magenta coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever MAGENTA_DYED_COBBLESTONE_LEVER = new BlockBasicLever("magenta_dyed_cobblestone_lever");

    /**
     * Orange coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever ORANGE_DYED_COBBLESTONE_LEVER = new BlockBasicLever("orange_dyed_cobblestone_lever");

    /**
     * Pink coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever PINK_DYED_COBBLESTONE_LEVER = new BlockBasicLever("pink_dyed_cobblestone_lever");

    /**
     * Purple coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever PURPLE_DYED_COBBLESTONE_LEVER = new BlockBasicLever("purple_dyed_cobblestone_lever");

    /**
     * Red coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever RED_DYED_COBBLESTONE_LEVER = new BlockBasicLever("red_dyed_cobblestone_lever");

    /**
     * Silver coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever SILVER_DYED_COBBLESTONE_LEVER = new BlockBasicLever("silver_dyed_cobblestone_lever");

    /**
     * White coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever WHITE_DYED_COBBLESTONE_LEVER = new BlockBasicLever("white_dyed_cobblestone_lever");

    /**
     * Yellow coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever YELLOW_DYED_COBBLESTONE_LEVER = new BlockBasicLever("yellow_dyed_cobblestone_lever");

    /**
     * Lime coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever LIME_DYED_MOSSY_COBBLESTONE_LEVER = new BlockBasicLever("lime_dyed_mossy_cobblestone_lever");

    /**
     * Black coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BLACK_DYED_MOSSY_COBBLESTONE_LEVER = new BlockBasicLever("black_dyed_mossy_cobblestone_lever");

    /**
     * Blue coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BLUE_DYED_MOSSY_COBBLESTONE_LEVER = new BlockBasicLever("blue_dyed_mossy_cobblestone_lever");

    /**
     * Brown coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BROWN_DYED_MOSSY_COBBLESTONE_LEVER = new BlockBasicLever("brown_dyed_mossy_cobblestone_lever");

    /**
     * Cyan coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever CYAN_DYED_MOSSY_COBBLESTONE_LEVER = new BlockBasicLever("cyan_dyed_mossy_cobblestone_lever");

    /**
     * Gray coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever GRAY_DYED_MOSSY_COBBLESTONE_LEVER = new BlockBasicLever("gray_dyed_mossy_cobblestone_lever");

    /**
     * Green coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever GREEN_DYED_MOSSY_COBBLESTONE_LEVER = new BlockBasicLever("green_dyed_mossy_cobblestone_lever");

    /**
     * Light blue coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever LIGHT_BLUE_DYED_MOSSY_COBBLESTONE_LEVER = new BlockBasicLever("light_blue_dyed_mossy_cobblestone_lever");

    /**
     * Magenta coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever MAGENTA_DYED_MOSSY_COBBLESTONE_LEVER = new BlockBasicLever("magenta_dyed_mossy_cobblestone_lever");

    /**
     * Orange coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever ORANGE_DYED_MOSSY_COBBLESTONE_LEVER = new BlockBasicLever("orange_dyed_mossy_cobblestone_lever");

    /**
     * Pink coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever PINK_DYED_MOSSY_COBBLESTONE_LEVER = new BlockBasicLever("pink_dyed_mossy_cobblestone_lever");

    /**
     * Purple coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever PURPLE_DYED_MOSSY_COBBLESTONE_LEVER = new BlockBasicLever("purple_dyed_mossy_cobblestone_lever");

    /**
     * Red coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever RED_DYED_MOSSY_COBBLESTONE_LEVER = new BlockBasicLever("red_dyed_mossy_cobblestone_lever");

    /**
     * Silver coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever SILVER_DYED_MOSSY_COBBLESTONE_LEVER = new BlockBasicLever("silver_dyed_mossy_cobblestone_lever");

    /**
     * White coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever WHITE_DYED_MOSSY_COBBLESTONE_LEVER = new BlockBasicLever("white_dyed_mossy_cobblestone_lever");

    /**
     * Yellow coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever YELLOW_DYED_MOSSY_COBBLESTONE_LEVER = new BlockBasicLever("yellow_dyed_mossy_cobblestone_lever");



    /**
     * Lime coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever LIME_DYED_GRANITE_LEVER = new BlockBasicLever("lime_dyed_granite_lever");

    /**
     * Black coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BLACK_DYED_GRANITE_LEVER = new BlockBasicLever("black_dyed_granite_lever");

    /**
     * Blue coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BLUE_DYED_GRANITE_LEVER = new BlockBasicLever("blue_dyed_granite_lever");

    /**
     * Brown coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BROWN_DYED_GRANITE_LEVER = new BlockBasicLever("brown_dyed_granite_lever");

    /**
     * Cyan coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever CYAN_DYED_GRANITE_LEVER = new BlockBasicLever("cyan_dyed_granite_lever");

    /**
     * Gray coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever GRAY_DYED_GRANITE_LEVER = new BlockBasicLever("gray_dyed_granite_lever");

    /**
     * Green coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever GREEN_DYED_GRANITE_LEVER = new BlockBasicLever("green_dyed_granite_lever");

    /**
     * Light blue coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever LIGHT_BLUE_DYED_GRANITE_LEVER = new BlockBasicLever("light_blue_dyed_granite_lever");

    /**
     * Magenta coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever MAGENTA_DYED_GRANITE_LEVER = new BlockBasicLever("magenta_dyed_granite_lever");

    /**
     * Orange coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever ORANGE_DYED_GRANITE_LEVER = new BlockBasicLever("orange_dyed_granite_lever");

    /**
     * Pink coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever PINK_DYED_GRANITE_LEVER = new BlockBasicLever("pink_dyed_granite_lever");

    /**
     * Purple coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever PURPLE_DYED_GRANITE_LEVER = new BlockBasicLever("purple_dyed_granite_lever");

    /**
     * Red coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever RED_DYED_GRANITE_LEVER = new BlockBasicLever("red_dyed_granite_lever");

    /**
     * Silver coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever SILVER_DYED_GRANITE_LEVER = new BlockBasicLever("silver_dyed_granite_lever");

    /**
     * White coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever WHITE_DYED_GRANITE_LEVER = new BlockBasicLever("white_dyed_granite_lever");

    /**
     * Yellow coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever YELLOW_DYED_GRANITE_LEVER = new BlockBasicLever("yellow_dyed_granite_lever");


    /**
     * Lime coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever LIME_DYED_DIORITE_LEVER = new BlockBasicLever("lime_dyed_diorite_lever");

    /**
     * Black coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BLACK_DYED_DIORITE_LEVER = new BlockBasicLever("black_dyed_diorite_lever");

    /**
     * Blue coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BLUE_DYED_DIORITE_LEVER = new BlockBasicLever("blue_dyed_diorite_lever");

    /**
     * Brown coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BROWN_DYED_DIORITE_LEVER = new BlockBasicLever("brown_dyed_diorite_lever");

    /**
     * Cyan coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever CYAN_DYED_DIORITE_LEVER = new BlockBasicLever("cyan_dyed_diorite_lever");

    /**
     * Gray coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever GRAY_DYED_DIORITE_LEVER = new BlockBasicLever("gray_dyed_diorite_lever");

    /**
     * Green coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever GREEN_DYED_DIORITE_LEVER = new BlockBasicLever("green_dyed_diorite_lever");

    /**
     * Light blue coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever LIGHT_BLUE_DYED_DIORITE_LEVER = new BlockBasicLever("light_blue_dyed_diorite_lever");

    /**
     * Magenta coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever MAGENTA_DYED_DIORITE_LEVER = new BlockBasicLever("magenta_dyed_diorite_lever");

    /**
     * Orange coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever ORANGE_DYED_DIORITE_LEVER = new BlockBasicLever("orange_dyed_diorite_lever");

    /**
     * Pink coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever PINK_DYED_DIORITE_LEVER = new BlockBasicLever("pink_dyed_diorite_lever");

    /**
     * Purple coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever PURPLE_DYED_DIORITE_LEVER = new BlockBasicLever("purple_dyed_diorite_lever");

    /**
     * Red coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever RED_DYED_DIORITE_LEVER = new BlockBasicLever("red_dyed_diorite_lever");

    /**
     * Silver coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever SILVER_DYED_DIORITE_LEVER = new BlockBasicLever("silver_dyed_diorite_lever");

    /**
     * White coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever WHITE_DYED_DIORITE_LEVER = new BlockBasicLever("white_dyed_diorite_lever");

    /**
     * Yellow coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever YELLOW_DYED_DIORITE_LEVER = new BlockBasicLever("yellow_dyed_diorite_lever");

    /**
     * Lime coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever LIME_DYED_ANDESITE_LEVER = new BlockBasicLever("lime_dyed_andesite_lever");

    /**
     * Black coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BLACK_DYED_ANDESITE_LEVER = new BlockBasicLever("black_dyed_andesite_lever");

    /**
     * Blue coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BLUE_DYED_ANDESITE_LEVER = new BlockBasicLever("blue_dyed_andesite_lever");

    /**
     * Brown coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BROWN_DYED_ANDESITE_LEVER = new BlockBasicLever("brown_dyed_andesite_lever");

    /**
     * Cyan coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever CYAN_DYED_ANDESITE_LEVER = new BlockBasicLever("cyan_dyed_andesite_lever");

    /**
     * Gray coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever GRAY_DYED_ANDESITE_LEVER = new BlockBasicLever("gray_dyed_andesite_lever");

    /**
     * Green coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever GREEN_DYED_ANDESITE_LEVER = new BlockBasicLever("green_dyed_andesite_lever");

    /**
     * Light blue coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever LIGHT_BLUE_DYED_ANDESITE_LEVER = new BlockBasicLever("light_blue_dyed_andesite_lever");

    /**
     * Magenta coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever MAGENTA_DYED_ANDESITE_LEVER = new BlockBasicLever("magenta_dyed_andesite_lever");

    /**
     * Orange coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever ORANGE_DYED_ANDESITE_LEVER = new BlockBasicLever("orange_dyed_andesite_lever");

    /**
     * Pink coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever PINK_DYED_ANDESITE_LEVER = new BlockBasicLever("pink_dyed_andesite_lever");

    /**
     * Purple coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever PURPLE_DYED_ANDESITE_LEVER = new BlockBasicLever("purple_dyed_andesite_lever");

    /**
     * Red coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever RED_DYED_ANDESITE_LEVER = new BlockBasicLever("red_dyed_andesite_lever");

    /**
     * Silver coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever SILVER_DYED_ANDESITE_LEVER = new BlockBasicLever("silver_dyed_andesite_lever");

    /**
     * White coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever WHITE_DYED_ANDESITE_LEVER = new BlockBasicLever("white_dyed_andesite_lever");

    /**
     * Yellow coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever YELLOW_DYED_ANDESITE_LEVER = new BlockBasicLever("yellow_dyed_andesite_lever");


    /**
     * Lime coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever LIME_DYED_POLISHED_GRANITE_LEVER = new BlockBasicLever("lime_dyed_polished_granite_lever");

    /**
     * Black coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BLACK_DYED_POLISHED_GRANITE_LEVER = new BlockBasicLever("black_dyed_polished_granite_lever");

    /**
     * Blue coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BLUE_DYED_POLISHED_GRANITE_LEVER = new BlockBasicLever("blue_dyed_polished_granite_lever");

    /**
     * Brown coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BROWN_DYED_POLISHED_GRANITE_LEVER = new BlockBasicLever("brown_dyed_polished_granite_lever");

    /**
     * Cyan coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever CYAN_DYED_POLISHED_GRANITE_LEVER = new BlockBasicLever("cyan_dyed_polished_granite_lever");

    /**
     * Gray coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever GRAY_DYED_POLISHED_GRANITE_LEVER = new BlockBasicLever("gray_dyed_polished_granite_lever");

    /**
     * Green coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever GREEN_DYED_POLISHED_GRANITE_LEVER = new BlockBasicLever("green_dyed_polished_granite_lever");

    /**
     * Light blue coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever LIGHT_BLUE_DYED_POLISHED_GRANITE_LEVER = new BlockBasicLever("light_blue_dyed_polished_granite_lever");

    /**
     * Magenta coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever MAGENTA_DYED_POLISHED_GRANITE_LEVER = new BlockBasicLever("magenta_dyed_polished_granite_lever");

    /**
     * Orange coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever ORANGE_DYED_POLISHED_GRANITE_LEVER = new BlockBasicLever("orange_dyed_polished_granite_lever");

    /**
     * Pink coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever PINK_DYED_POLISHED_GRANITE_LEVER = new BlockBasicLever("pink_dyed_polished_granite_lever");

    /**
     * Purple coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever PURPLE_DYED_POLISHED_GRANITE_LEVER = new BlockBasicLever("purple_dyed_polished_granite_lever");

    /**
     * Red coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever RED_DYED_POLISHED_GRANITE_LEVER = new BlockBasicLever("red_dyed_polished_granite_lever");

    /**
     * Silver coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever SILVER_DYED_POLISHED_GRANITE_LEVER = new BlockBasicLever("silver_dyed_polished_granite_lever");

    /**
     * White coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever WHITE_DYED_POLISHED_GRANITE_LEVER = new BlockBasicLever("white_dyed_polished_granite_lever");

    /**
     * Yellow coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever YELLOW_DYED_POLISHED_GRANITE_LEVER = new BlockBasicLever("yellow_dyed_polished_granite_lever");


    /**
     * Lime coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever LIME_DYED_POLISHED_DIORITE_LEVER = new BlockBasicLever("lime_dyed_polished_diorite_lever");

    /**
     * Black coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BLACK_DYED_POLISHED_DIORITE_LEVER = new BlockBasicLever("black_dyed_polished_diorite_lever");

    /**
     * Blue coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BLUE_DYED_POLISHED_DIORITE_LEVER = new BlockBasicLever("blue_dyed_polished_diorite_lever");

    /**
     * Brown coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BROWN_DYED_POLISHED_DIORITE_LEVER = new BlockBasicLever("brown_dyed_polished_diorite_lever");

    /**
     * Cyan coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever CYAN_DYED_POLISHED_DIORITE_LEVER = new BlockBasicLever("cyan_dyed_polished_diorite_lever");

    /**
     * Gray coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever GRAY_DYED_POLISHED_DIORITE_LEVER = new BlockBasicLever("gray_dyed_polished_diorite_lever");

    /**
     * Green coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever GREEN_DYED_POLISHED_DIORITE_LEVER = new BlockBasicLever("green_dyed_polished_diorite_lever");

    /**
     * Light blue coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever LIGHT_BLUE_DYED_POLISHED_DIORITE_LEVER = new BlockBasicLever("light_blue_dyed_polished_diorite_lever");

    /**
     * Magenta coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever MAGENTA_DYED_POLISHED_DIORITE_LEVER = new BlockBasicLever("magenta_dyed_polished_diorite_lever");

    /**
     * Orange coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever ORANGE_DYED_POLISHED_DIORITE_LEVER = new BlockBasicLever("orange_dyed_polished_diorite_lever");

    /**
     * Pink coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever PINK_DYED_POLISHED_DIORITE_LEVER = new BlockBasicLever("pink_dyed_polished_diorite_lever");

    /**
     * Purple coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever PURPLE_DYED_POLISHED_DIORITE_LEVER = new BlockBasicLever("purple_dyed_polished_diorite_lever");

    /**
     * Red coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever RED_DYED_POLISHED_DIORITE_LEVER = new BlockBasicLever("red_dyed_polished_diorite_lever");

    /**
     * Silver coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever SILVER_DYED_POLISHED_DIORITE_LEVER = new BlockBasicLever("silver_dyed_polished_diorite_lever");

    /**
     * White coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever WHITE_DYED_POLISHED_DIORITE_LEVER = new BlockBasicLever("white_dyed_polished_diorite_lever");

    /**
     * Yellow coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever YELLOW_DYED_POLISHED_DIORITE_LEVER = new BlockBasicLever("yellow_dyed_polished_diorite_lever");

    /**
     * Lime coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever LIME_DYED_POLISHED_ANDESITE_LEVER = new BlockBasicLever("lime_dyed_polished_andesite_lever");

    /**
     * Black coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BLACK_DYED_POLISHED_ANDESITE_LEVER = new BlockBasicLever("black_dyed_polished_andesite_lever");

    /**
     * Blue coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BLUE_DYED_POLISHED_ANDESITE_LEVER = new BlockBasicLever("blue_dyed_polished_andesite_lever");

    /**
     * Brown coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever BROWN_DYED_POLISHED_ANDESITE_LEVER = new BlockBasicLever("brown_dyed_polished_andesite_lever");

    /**
     * Cyan coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever CYAN_DYED_POLISHED_ANDESITE_LEVER = new BlockBasicLever("cyan_dyed_polished_andesite_lever");

    /**
     * Gray coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever GRAY_DYED_POLISHED_ANDESITE_LEVER = new BlockBasicLever("gray_dyed_polished_andesite_lever");

    /**
     * Green coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever GREEN_DYED_POLISHED_ANDESITE_LEVER = new BlockBasicLever("green_dyed_polished_andesite_lever");

    /**
     * Light blue coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever LIGHT_BLUE_DYED_POLISHED_ANDESITE_LEVER = new BlockBasicLever("light_blue_dyed_polished_andesite_lever");

    /**
     * Magenta coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever MAGENTA_DYED_POLISHED_ANDESITE_LEVER = new BlockBasicLever("magenta_dyed_polished_andesite_lever");

    /**
     * Orange coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever ORANGE_DYED_POLISHED_ANDESITE_LEVER = new BlockBasicLever("orange_dyed_polished_andesite_lever");

    /**
     * Pink coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever PINK_DYED_POLISHED_ANDESITE_LEVER = new BlockBasicLever("pink_dyed_polished_andesite_lever");

    /**
     * Purple coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever PURPLE_DYED_POLISHED_ANDESITE_LEVER = new BlockBasicLever("purple_dyed_polished_andesite_lever");

    /**
     * Red coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever RED_DYED_POLISHED_ANDESITE_LEVER = new BlockBasicLever("red_dyed_polished_andesite_lever");

    /**
     * Silver coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever SILVER_DYED_POLISHED_ANDESITE_LEVER = new BlockBasicLever("silver_dyed_polished_andesite_lever");

    /**
     * White coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever WHITE_DYED_POLISHED_ANDESITE_LEVER = new BlockBasicLever("white_dyed_polished_andesite_lever");

    /**
     * Yellow coloured {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static BlockBasicLever YELLOW_DYED_POLISHED_ANDESITE_LEVER = new BlockBasicLever("yellow_dyed_polished_andesite_lever");


    /**
     * Registers the {@link net.minecraft.block.Block}s added by the {@link IgneousExtrasMod}
     *
     * @since 0.0.1
     */
	public static void registerBlocks() {

        //First, we'll register dyed blocks
        if (ConfigHandler.ENABLE_DYED_STONE_BLOCKS) {
            registerColoredBlocks(DYED_COBBLESTONE, DYED_MOSSY_COBBLESTONE,
                                  DYED_STONE, 
                                  DYED_GRANITE, DYED_SMOOTH_GRANITE,
                                  DYED_DIORITE, DYED_SMOOTH_DIORITE,
                                  DYED_ANDESITE, DYED_SMOOTH_ANDESITE);
        }

        if (ConfigHandler.ENABLE_ADDITIONAL_STAIRS) {
            registerSimpleBlocks(STONE_STAIRS, MOSSY_COBBLESTONE_STAIRS,
                                GRANITE_STAIRS, POLISHED_GRANITE_STAIRS,
                                DIORITE_STAIRS, POLISHED_DIORITE_STAIRS,
                                ANDESITE_STAIRS, POLISHED_ANDESITE_STAIRS);

            //Okay, dyed blocks now!
            if (ConfigHandler.ENABLE_DYED_STONE_BLOCKS) {
                registerSimpleBlocks(WHITE_DYED_COBBLESTONE_STAIRS, ORANGE_DYED_COBBLESTONE_STAIRS,
                        MAGENTA_DYED_COBBLESTONE_STAIRS, LIGHT_BLUE_DYED_COBBLESTONE_STAIRS,
                        YELLOW_DYED_COBBLESTONE_STAIRS, LIME_DYED_COBBLESTONE_STAIRS,
                        PINK_DYED_COBBLESTONE_STAIRS, GRAY_DYED_COBBLESTONE_STAIRS,
                        SILVER_DYED_COBBLESTONE_STAIRS, CYAN_DYED_COBBLESTONE_STAIRS,
                        PURPLE_DYED_COBBLESTONE_STAIRS, BLUE_DYED_COBBLESTONE_STAIRS,
                        BROWN_DYED_COBBLESTONE_STAIRS, GREEN_DYED_COBBLESTONE_STAIRS,
                        RED_DYED_COBBLESTONE_STAIRS, BLACK_DYED_COBBLESTONE_STAIRS,
                        WHITE_DYED_MOSSY_COBBLESTONE_STAIRS, ORANGE_DYED_MOSSY_COBBLESTONE_STAIRS,
                        MAGENTA_DYED_MOSSY_COBBLESTONE_STAIRS, LIGHT_BLUE_DYED_MOSSY_COBBLESTONE_STAIRS,
                        YELLOW_DYED_MOSSY_COBBLESTONE_STAIRS, LIME_DYED_MOSSY_COBBLESTONE_STAIRS,
                        PINK_DYED_MOSSY_COBBLESTONE_STAIRS, GRAY_DYED_MOSSY_COBBLESTONE_STAIRS,
                        SILVER_DYED_MOSSY_COBBLESTONE_STAIRS, CYAN_DYED_MOSSY_COBBLESTONE_STAIRS,
                        PURPLE_DYED_MOSSY_COBBLESTONE_STAIRS, BLUE_DYED_MOSSY_COBBLESTONE_STAIRS,
                        BROWN_DYED_MOSSY_COBBLESTONE_STAIRS, GREEN_DYED_MOSSY_COBBLESTONE_STAIRS,
                        RED_DYED_MOSSY_COBBLESTONE_STAIRS, BLACK_DYED_MOSSY_COBBLESTONE_STAIRS,
                        WHITE_DYED_STONE_STAIRS, ORANGE_DYED_STONE_STAIRS, MAGENTA_DYED_STONE_STAIRS,
                        LIGHT_BLUE_DYED_STONE_STAIRS, YELLOW_DYED_STONE_STAIRS, LIME_DYED_STONE_STAIRS,
                        PINK_DYED_STONE_STAIRS, GRAY_DYED_STONE_STAIRS, SILVER_DYED_STONE_STAIRS,
                        CYAN_DYED_STONE_STAIRS, PURPLE_DYED_STONE_STAIRS, BLUE_DYED_STONE_STAIRS,
                        BROWN_DYED_STONE_STAIRS, GREEN_DYED_STONE_STAIRS, RED_DYED_STONE_STAIRS, BLACK_DYED_STONE_STAIRS,
                        WHITE_DYED_ANDESITE_STAIRS, ORANGE_DYED_ANDESITE_STAIRS,
                        MAGENTA_DYED_ANDESITE_STAIRS, LIGHT_BLUE_DYED_ANDESITE_STAIRS, YELLOW_DYED_ANDESITE_STAIRS,
                        LIME_DYED_ANDESITE_STAIRS, PINK_DYED_ANDESITE_STAIRS, GRAY_DYED_ANDESITE_STAIRS,
                        SILVER_DYED_ANDESITE_STAIRS, CYAN_DYED_ANDESITE_STAIRS, PURPLE_DYED_ANDESITE_STAIRS,
                        BLUE_DYED_ANDESITE_STAIRS, BROWN_DYED_ANDESITE_STAIRS, GREEN_DYED_ANDESITE_STAIRS,
                        RED_DYED_ANDESITE_STAIRS, BLACK_DYED_ANDESITE_STAIRS,
                        WHITE_DYED_DIORITE_STAIRS, ORANGE_DYED_DIORITE_STAIRS, MAGENTA_DYED_DIORITE_STAIRS,
                        LIGHT_BLUE_DYED_DIORITE_STAIRS, YELLOW_DYED_DIORITE_STAIRS, LIME_DYED_DIORITE_STAIRS,
                        PINK_DYED_DIORITE_STAIRS, GRAY_DYED_DIORITE_STAIRS, SILVER_DYED_DIORITE_STAIRS,
                        CYAN_DYED_DIORITE_STAIRS, PURPLE_DYED_DIORITE_STAIRS, BLUE_DYED_DIORITE_STAIRS,
                        BROWN_DYED_DIORITE_STAIRS, GREEN_DYED_DIORITE_STAIRS, RED_DYED_DIORITE_STAIRS,
                        BLACK_DYED_DIORITE_STAIRS, WHITE_DYED_GRANITE_STAIRS, ORANGE_DYED_GRANITE_STAIRS, MAGENTA_DYED_GRANITE_STAIRS,
                        LIGHT_BLUE_DYED_GRANITE_STAIRS, YELLOW_DYED_GRANITE_STAIRS, LIME_DYED_GRANITE_STAIRS,
                        PINK_DYED_GRANITE_STAIRS, GRAY_DYED_GRANITE_STAIRS, SILVER_DYED_GRANITE_STAIRS,
                        CYAN_DYED_GRANITE_STAIRS, PURPLE_DYED_GRANITE_STAIRS, BLUE_DYED_GRANITE_STAIRS,
                        BROWN_DYED_GRANITE_STAIRS, GREEN_DYED_GRANITE_STAIRS, RED_DYED_GRANITE_STAIRS,
                        BLACK_DYED_GRANITE_STAIRS, WHITE_DYED_POLISHED_ANDESITE_STAIRS, ORANGE_DYED_POLISHED_ANDESITE_STAIRS,
                        MAGENTA_DYED_POLISHED_ANDESITE_STAIRS, LIGHT_BLUE_DYED_POLISHED_ANDESITE_STAIRS,
                        YELLOW_DYED_POLISHED_ANDESITE_STAIRS, LIME_DYED_POLISHED_ANDESITE_STAIRS,
                        PINK_DYED_POLISHED_ANDESITE_STAIRS, GRAY_DYED_POLISHED_ANDESITE_STAIRS,
                        SILVER_DYED_POLISHED_ANDESITE_STAIRS, CYAN_DYED_POLISHED_ANDESITE_STAIRS,
                        PURPLE_DYED_POLISHED_ANDESITE_STAIRS, BLUE_DYED_POLISHED_ANDESITE_STAIRS,
                        BROWN_DYED_POLISHED_ANDESITE_STAIRS, GREEN_DYED_POLISHED_ANDESITE_STAIRS,
                        RED_DYED_POLISHED_ANDESITE_STAIRS, BLACK_DYED_POLISHED_ANDESITE_STAIRS,
                        WHITE_DYED_POLISHED_DIORITE_STAIRS, ORANGE_DYED_POLISHED_DIORITE_STAIRS,
                        MAGENTA_DYED_POLISHED_DIORITE_STAIRS, LIGHT_BLUE_DYED_POLISHED_DIORITE_STAIRS,
                        YELLOW_DYED_POLISHED_DIORITE_STAIRS, LIME_DYED_POLISHED_DIORITE_STAIRS,
                        PINK_DYED_POLISHED_DIORITE_STAIRS, GRAY_DYED_POLISHED_DIORITE_STAIRS,
                        SILVER_DYED_POLISHED_DIORITE_STAIRS, CYAN_DYED_POLISHED_DIORITE_STAIRS,
                        PURPLE_DYED_POLISHED_DIORITE_STAIRS, BLUE_DYED_POLISHED_DIORITE_STAIRS,
                        BROWN_DYED_POLISHED_DIORITE_STAIRS, GREEN_DYED_POLISHED_DIORITE_STAIRS,
                        RED_DYED_POLISHED_DIORITE_STAIRS, BLACK_DYED_POLISHED_DIORITE_STAIRS,
                        WHITE_DYED_POLISHED_GRANITE_STAIRS, ORANGE_DYED_POLISHED_GRANITE_STAIRS,
                        MAGENTA_DYED_POLISHED_GRANITE_STAIRS, LIGHT_BLUE_DYED_POLISHED_GRANITE_STAIRS,
                        YELLOW_DYED_POLISHED_GRANITE_STAIRS, LIME_DYED_POLISHED_GRANITE_STAIRS,
                        PINK_DYED_POLISHED_GRANITE_STAIRS, GRAY_DYED_POLISHED_GRANITE_STAIRS,
                        SILVER_DYED_POLISHED_GRANITE_STAIRS, CYAN_DYED_POLISHED_GRANITE_STAIRS,
                        PURPLE_DYED_POLISHED_GRANITE_STAIRS, BLUE_DYED_POLISHED_GRANITE_STAIRS,
                        BROWN_DYED_POLISHED_GRANITE_STAIRS, GREEN_DYED_POLISHED_GRANITE_STAIRS,
                        RED_DYED_POLISHED_GRANITE_STAIRS, BLACK_DYED_POLISHED_GRANITE_STAIRS);
            }
        }

        //Now register pressure plates

        if (ConfigHandler.ENABLE_ADDITIONAL_PRESSURE_PLATES) {
            registerSimpleBlocks(COBBLESTONE_PRESSURE_PLATE, MOSSY_COBBLESTONE_PRESSURE_PLATE, GRANITE_PRESSURE_PLATE,
                    POLISHED_GRANITE_PRESSURE_PLATE, DIORITE_PRESSURE_PLATE, POLISHED_DIORITE_PRESSURE_PLATE,
                    ANDESITE_PRESSURE_PLATE, POLISHED_ANDESITE_PRESSURE_PLATE, STONE_BRICK_PRESSURE_PLATE,
                    CRACKED_STONE_BRICK_PRESSURE_PLATE, CHISELED_STONE_BRICK_PRESSURE_PLATE,
                    MOSSY_STONE_BRICK_PRESSURE_PLATE);
            
            if (ConfigHandler.ENABLE_DYED_STONE_BLOCKS) {
                registerSimpleBlocks(WHITE_DYED_STONE_PRESSURE_PLATE, ORANGE_DYED_STONE_PRESSURE_PLATE,
                        MAGENTA_DYED_STONE_PRESSURE_PLATE, LIGHT_BLUE_DYED_STONE_PRESSURE_PLATE,
                        YELLOW_DYED_STONE_PRESSURE_PLATE, LIME_DYED_STONE_PRESSURE_PLATE,
                        PINK_DYED_STONE_PRESSURE_PLATE, GRAY_DYED_STONE_PRESSURE_PLATE,
                        SILVER_DYED_STONE_PRESSURE_PLATE, CYAN_DYED_STONE_PRESSURE_PLATE,
                        PURPLE_DYED_STONE_PRESSURE_PLATE, BLUE_DYED_STONE_PRESSURE_PLATE,
                        BROWN_DYED_STONE_PRESSURE_PLATE, GREEN_DYED_STONE_PRESSURE_PLATE, RED_DYED_STONE_PRESSURE_PLATE,
                        BLACK_DYED_STONE_PRESSURE_PLATE, WHITE_DYED_COBBLESTONE_PRESSURE_PLATE,
                        ORANGE_DYED_COBBLESTONE_PRESSURE_PLATE, MAGENTA_DYED_COBBLESTONE_PRESSURE_PLATE,
                        LIGHT_BLUE_DYED_COBBLESTONE_PRESSURE_PLATE, YELLOW_DYED_COBBLESTONE_PRESSURE_PLATE,
                        LIME_DYED_COBBLESTONE_PRESSURE_PLATE, PINK_DYED_COBBLESTONE_PRESSURE_PLATE,
                        GRAY_DYED_COBBLESTONE_PRESSURE_PLATE, SILVER_DYED_COBBLESTONE_PRESSURE_PLATE,
                        CYAN_DYED_COBBLESTONE_PRESSURE_PLATE, PURPLE_DYED_COBBLESTONE_PRESSURE_PLATE,
                        BLUE_DYED_COBBLESTONE_PRESSURE_PLATE, BROWN_DYED_COBBLESTONE_PRESSURE_PLATE,
                        GREEN_DYED_COBBLESTONE_PRESSURE_PLATE, RED_DYED_COBBLESTONE_PRESSURE_PLATE,
                        BLACK_DYED_COBBLESTONE_PRESSURE_PLATE, WHITE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE,
                        ORANGE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE, MAGENTA_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE,
                        LIGHT_BLUE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE, YELLOW_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE,
                        LIME_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE, PINK_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE,
                        GRAY_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE, SILVER_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE,
                        CYAN_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE, PURPLE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE,
                        BLUE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE, BROWN_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE,
                        GREEN_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE, RED_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE,
                        BLACK_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE, WHITE_DYED_GRANITE_PRESSURE_PLATE,
                        ORANGE_DYED_GRANITE_PRESSURE_PLATE, MAGENTA_DYED_GRANITE_PRESSURE_PLATE,
                        LIGHT_BLUE_DYED_GRANITE_PRESSURE_PLATE, YELLOW_DYED_GRANITE_PRESSURE_PLATE,
                        LIME_DYED_GRANITE_PRESSURE_PLATE, PINK_DYED_GRANITE_PRESSURE_PLATE,
                        GRAY_DYED_GRANITE_PRESSURE_PLATE, SILVER_DYED_GRANITE_PRESSURE_PLATE,
                        CYAN_DYED_GRANITE_PRESSURE_PLATE, PURPLE_DYED_GRANITE_PRESSURE_PLATE,
                        BLUE_DYED_GRANITE_PRESSURE_PLATE, BROWN_DYED_GRANITE_PRESSURE_PLATE,
                        GREEN_DYED_GRANITE_PRESSURE_PLATE, RED_DYED_GRANITE_PRESSURE_PLATE,
                        BLACK_DYED_GRANITE_PRESSURE_PLATE, WHITE_DYED_DIORITE_PRESSURE_PLATE,
                        ORANGE_DYED_DIORITE_PRESSURE_PLATE, MAGENTA_DYED_DIORITE_PRESSURE_PLATE,
                        LIGHT_BLUE_DYED_DIORITE_PRESSURE_PLATE, YELLOW_DYED_DIORITE_PRESSURE_PLATE,
                        LIME_DYED_DIORITE_PRESSURE_PLATE, PINK_DYED_DIORITE_PRESSURE_PLATE,
                        GRAY_DYED_DIORITE_PRESSURE_PLATE, SILVER_DYED_DIORITE_PRESSURE_PLATE,
                        CYAN_DYED_DIORITE_PRESSURE_PLATE, PURPLE_DYED_DIORITE_PRESSURE_PLATE,
                        BLUE_DYED_DIORITE_PRESSURE_PLATE, BROWN_DYED_DIORITE_PRESSURE_PLATE,
                        GREEN_DYED_DIORITE_PRESSURE_PLATE, RED_DYED_DIORITE_PRESSURE_PLATE,
                        BLACK_DYED_DIORITE_PRESSURE_PLATE, WHITE_DYED_ANDESITE_PRESSURE_PLATE,
                        ORANGE_DYED_ANDESITE_PRESSURE_PLATE, MAGENTA_DYED_ANDESITE_PRESSURE_PLATE,
                        LIGHT_BLUE_DYED_ANDESITE_PRESSURE_PLATE, YELLOW_DYED_ANDESITE_PRESSURE_PLATE,
                        LIME_DYED_ANDESITE_PRESSURE_PLATE, PINK_DYED_ANDESITE_PRESSURE_PLATE,
                        GRAY_DYED_ANDESITE_PRESSURE_PLATE, SILVER_DYED_ANDESITE_PRESSURE_PLATE,
                        CYAN_DYED_ANDESITE_PRESSURE_PLATE, PURPLE_DYED_ANDESITE_PRESSURE_PLATE,
                        BLUE_DYED_ANDESITE_PRESSURE_PLATE, BROWN_DYED_ANDESITE_PRESSURE_PLATE,
                        GREEN_DYED_ANDESITE_PRESSURE_PLATE, RED_DYED_ANDESITE_PRESSURE_PLATE,
                        BLACK_DYED_ANDESITE_PRESSURE_PLATE, WHITE_DYED_POLISHED_GRANITE_PRESSURE_PLATE,
                        ORANGE_DYED_POLISHED_GRANITE_PRESSURE_PLATE, MAGENTA_DYED_POLISHED_GRANITE_PRESSURE_PLATE,
                        LIGHT_BLUE_DYED_POLISHED_GRANITE_PRESSURE_PLATE, YELLOW_DYED_POLISHED_GRANITE_PRESSURE_PLATE,
                        LIME_DYED_POLISHED_GRANITE_PRESSURE_PLATE, PINK_DYED_POLISHED_GRANITE_PRESSURE_PLATE,
                        GRAY_DYED_POLISHED_GRANITE_PRESSURE_PLATE, SILVER_DYED_POLISHED_GRANITE_PRESSURE_PLATE,
                        CYAN_DYED_POLISHED_GRANITE_PRESSURE_PLATE, PURPLE_DYED_POLISHED_GRANITE_PRESSURE_PLATE,
                        BLUE_DYED_POLISHED_GRANITE_PRESSURE_PLATE, BROWN_DYED_POLISHED_GRANITE_PRESSURE_PLATE,
                        GREEN_DYED_POLISHED_GRANITE_PRESSURE_PLATE, RED_DYED_POLISHED_GRANITE_PRESSURE_PLATE,
                        BLACK_DYED_POLISHED_GRANITE_PRESSURE_PLATE, WHITE_DYED_POLISHED_DIORITE_PRESSURE_PLATE,
                        ORANGE_DYED_POLISHED_DIORITE_PRESSURE_PLATE, MAGENTA_DYED_POLISHED_DIORITE_PRESSURE_PLATE,
                        LIGHT_BLUE_DYED_POLISHED_DIORITE_PRESSURE_PLATE, YELLOW_DYED_POLISHED_DIORITE_PRESSURE_PLATE,
                        LIME_DYED_POLISHED_DIORITE_PRESSURE_PLATE, PINK_DYED_POLISHED_DIORITE_PRESSURE_PLATE,
                        GRAY_DYED_POLISHED_DIORITE_PRESSURE_PLATE, SILVER_DYED_POLISHED_DIORITE_PRESSURE_PLATE,
                        CYAN_DYED_POLISHED_DIORITE_PRESSURE_PLATE, PURPLE_DYED_POLISHED_DIORITE_PRESSURE_PLATE,
                        BLUE_DYED_POLISHED_DIORITE_PRESSURE_PLATE, BROWN_DYED_POLISHED_DIORITE_PRESSURE_PLATE,
                        GREEN_DYED_POLISHED_DIORITE_PRESSURE_PLATE, RED_DYED_POLISHED_DIORITE_PRESSURE_PLATE,
                        BLACK_DYED_POLISHED_DIORITE_PRESSURE_PLATE, WHITE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE,
                        ORANGE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE, MAGENTA_DYED_POLISHED_ANDESITE_PRESSURE_PLATE,
                        LIGHT_BLUE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE, YELLOW_DYED_POLISHED_ANDESITE_PRESSURE_PLATE,
                        LIME_DYED_POLISHED_ANDESITE_PRESSURE_PLATE, PINK_DYED_POLISHED_ANDESITE_PRESSURE_PLATE,
                        GRAY_DYED_POLISHED_ANDESITE_PRESSURE_PLATE, SILVER_DYED_POLISHED_ANDESITE_PRESSURE_PLATE,
                        CYAN_DYED_POLISHED_ANDESITE_PRESSURE_PLATE, PURPLE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE,
                        BLUE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE, BROWN_DYED_POLISHED_ANDESITE_PRESSURE_PLATE,
                        GREEN_DYED_POLISHED_ANDESITE_PRESSURE_PLATE, RED_DYED_POLISHED_ANDESITE_PRESSURE_PLATE,
                        BLACK_DYED_POLISHED_ANDESITE_PRESSURE_PLATE);
            }
        }

        //Now register levers

        if (ConfigHandler.ENABLE_ADDITIONAL_LEVERS) {

            registerSimpleBlocks(STONE_LEVER, GRANITE_LEVER, POLISHED_GRANITE_LEVER, DIORITE_LEVER,
                    POLISHED_DIORITE_LEVER, ANDESITE_LEVER, POLISHED_ANDESITE_LEVER, MOSSY_COBBLESTONE_LEVER,
                    STONE_BRICK_LEVER, CHISELED_STONE_BRICK_LEVER, CRACKED_STONE_BRICK_LEVER, MOSSY_STONE_BRICK_LEVER);
            
            if (ConfigHandler.ENABLE_DYED_STONE_BLOCKS) {
                registerSimpleBlocks(WHITE_DYED_STONE_LEVER, ORANGE_DYED_STONE_LEVER, MAGENTA_DYED_STONE_LEVER,
                        LIGHT_BLUE_DYED_STONE_LEVER, YELLOW_DYED_STONE_LEVER, LIME_DYED_STONE_LEVER,
                        PINK_DYED_STONE_LEVER, GRAY_DYED_STONE_LEVER, SILVER_DYED_STONE_LEVER, CYAN_DYED_STONE_LEVER,
                        PURPLE_DYED_STONE_LEVER, BLUE_DYED_STONE_LEVER, BROWN_DYED_STONE_LEVER, GREEN_DYED_STONE_LEVER,
                        RED_DYED_STONE_LEVER, BLACK_DYED_STONE_LEVER, WHITE_DYED_COBBLESTONE_LEVER,
                        ORANGE_DYED_COBBLESTONE_LEVER, MAGENTA_DYED_COBBLESTONE_LEVER,
                        LIGHT_BLUE_DYED_COBBLESTONE_LEVER, YELLOW_DYED_COBBLESTONE_LEVER, LIME_DYED_COBBLESTONE_LEVER,
                        PINK_DYED_COBBLESTONE_LEVER, GRAY_DYED_COBBLESTONE_LEVER, SILVER_DYED_COBBLESTONE_LEVER,
                        CYAN_DYED_COBBLESTONE_LEVER, PURPLE_DYED_COBBLESTONE_LEVER, BLUE_DYED_COBBLESTONE_LEVER,
                        BROWN_DYED_COBBLESTONE_LEVER, GREEN_DYED_COBBLESTONE_LEVER, RED_DYED_COBBLESTONE_LEVER,
                        BLACK_DYED_COBBLESTONE_LEVER, WHITE_DYED_MOSSY_COBBLESTONE_LEVER,
                        ORANGE_DYED_MOSSY_COBBLESTONE_LEVER, MAGENTA_DYED_MOSSY_COBBLESTONE_LEVER,
                        LIGHT_BLUE_DYED_MOSSY_COBBLESTONE_LEVER, YELLOW_DYED_MOSSY_COBBLESTONE_LEVER,
                        LIME_DYED_MOSSY_COBBLESTONE_LEVER, PINK_DYED_MOSSY_COBBLESTONE_LEVER,
                        GRAY_DYED_MOSSY_COBBLESTONE_LEVER, SILVER_DYED_MOSSY_COBBLESTONE_LEVER,
                        CYAN_DYED_MOSSY_COBBLESTONE_LEVER, PURPLE_DYED_MOSSY_COBBLESTONE_LEVER,
                        BLUE_DYED_MOSSY_COBBLESTONE_LEVER, BROWN_DYED_MOSSY_COBBLESTONE_LEVER,
                        GREEN_DYED_MOSSY_COBBLESTONE_LEVER, RED_DYED_MOSSY_COBBLESTONE_LEVER,
                        BLACK_DYED_MOSSY_COBBLESTONE_LEVER, WHITE_DYED_GRANITE_LEVER, ORANGE_DYED_GRANITE_LEVER,
                        MAGENTA_DYED_GRANITE_LEVER, LIGHT_BLUE_DYED_GRANITE_LEVER, YELLOW_DYED_GRANITE_LEVER,
                        LIME_DYED_GRANITE_LEVER, PINK_DYED_GRANITE_LEVER, GRAY_DYED_GRANITE_LEVER,
                        SILVER_DYED_GRANITE_LEVER, CYAN_DYED_GRANITE_LEVER, PURPLE_DYED_GRANITE_LEVER,
                        BLUE_DYED_GRANITE_LEVER, BROWN_DYED_GRANITE_LEVER, GREEN_DYED_GRANITE_LEVER,
                        RED_DYED_GRANITE_LEVER, BLACK_DYED_GRANITE_LEVER, WHITE_DYED_DIORITE_LEVER,
                        ORANGE_DYED_DIORITE_LEVER, MAGENTA_DYED_DIORITE_LEVER, LIGHT_BLUE_DYED_DIORITE_LEVER,
                        YELLOW_DYED_DIORITE_LEVER, LIME_DYED_DIORITE_LEVER, PINK_DYED_DIORITE_LEVER,
                        GRAY_DYED_DIORITE_LEVER, SILVER_DYED_DIORITE_LEVER, CYAN_DYED_DIORITE_LEVER,
                        PURPLE_DYED_DIORITE_LEVER, BLUE_DYED_DIORITE_LEVER, BROWN_DYED_DIORITE_LEVER,
                        GREEN_DYED_DIORITE_LEVER, RED_DYED_DIORITE_LEVER, BLACK_DYED_DIORITE_LEVER,
                        WHITE_DYED_ANDESITE_LEVER, ORANGE_DYED_ANDESITE_LEVER, MAGENTA_DYED_ANDESITE_LEVER,
                        LIGHT_BLUE_DYED_ANDESITE_LEVER, YELLOW_DYED_ANDESITE_LEVER, LIME_DYED_ANDESITE_LEVER,
                        PINK_DYED_ANDESITE_LEVER, GRAY_DYED_ANDESITE_LEVER, SILVER_DYED_ANDESITE_LEVER,
                        CYAN_DYED_ANDESITE_LEVER, PURPLE_DYED_ANDESITE_LEVER, BLUE_DYED_ANDESITE_LEVER,
                        BROWN_DYED_ANDESITE_LEVER, GREEN_DYED_ANDESITE_LEVER, RED_DYED_ANDESITE_LEVER,
                        BLACK_DYED_ANDESITE_LEVER, WHITE_DYED_POLISHED_GRANITE_LEVER,
                        ORANGE_DYED_POLISHED_GRANITE_LEVER, MAGENTA_DYED_POLISHED_GRANITE_LEVER,
                        LIGHT_BLUE_DYED_POLISHED_GRANITE_LEVER, YELLOW_DYED_POLISHED_GRANITE_LEVER,
                        LIME_DYED_POLISHED_GRANITE_LEVER, PINK_DYED_POLISHED_GRANITE_LEVER,
                        GRAY_DYED_POLISHED_GRANITE_LEVER, SILVER_DYED_POLISHED_GRANITE_LEVER,
                        CYAN_DYED_POLISHED_GRANITE_LEVER, PURPLE_DYED_POLISHED_GRANITE_LEVER,
                        BLUE_DYED_POLISHED_GRANITE_LEVER, BROWN_DYED_POLISHED_GRANITE_LEVER,
                        GREEN_DYED_POLISHED_GRANITE_LEVER, RED_DYED_POLISHED_GRANITE_LEVER,
                        BLACK_DYED_POLISHED_GRANITE_LEVER, WHITE_DYED_POLISHED_DIORITE_LEVER,
                        ORANGE_DYED_POLISHED_DIORITE_LEVER, MAGENTA_DYED_POLISHED_DIORITE_LEVER,
                        LIGHT_BLUE_DYED_POLISHED_DIORITE_LEVER, YELLOW_DYED_POLISHED_DIORITE_LEVER,
                        LIME_DYED_POLISHED_DIORITE_LEVER, PINK_DYED_POLISHED_DIORITE_LEVER,
                        GRAY_DYED_POLISHED_DIORITE_LEVER, SILVER_DYED_POLISHED_DIORITE_LEVER,
                        CYAN_DYED_POLISHED_DIORITE_LEVER, PURPLE_DYED_POLISHED_DIORITE_LEVER,
                        BLUE_DYED_POLISHED_DIORITE_LEVER, BROWN_DYED_POLISHED_DIORITE_LEVER,
                        GREEN_DYED_POLISHED_DIORITE_LEVER, RED_DYED_POLISHED_DIORITE_LEVER,
                        BLACK_DYED_POLISHED_DIORITE_LEVER, WHITE_DYED_POLISHED_ANDESITE_LEVER,
                        ORANGE_DYED_POLISHED_ANDESITE_LEVER, MAGENTA_DYED_POLISHED_ANDESITE_LEVER,
                        LIGHT_BLUE_DYED_POLISHED_ANDESITE_LEVER, YELLOW_DYED_POLISHED_ANDESITE_LEVER,
                        LIME_DYED_POLISHED_ANDESITE_LEVER, PINK_DYED_POLISHED_ANDESITE_LEVER,
                        GRAY_DYED_POLISHED_ANDESITE_LEVER, SILVER_DYED_POLISHED_ANDESITE_LEVER,
                        CYAN_DYED_POLISHED_ANDESITE_LEVER, PURPLE_DYED_POLISHED_ANDESITE_LEVER,
                        BLUE_DYED_POLISHED_ANDESITE_LEVER, BROWN_DYED_POLISHED_ANDESITE_LEVER,
                        GREEN_DYED_POLISHED_ANDESITE_LEVER, RED_DYED_POLISHED_ANDESITE_LEVER,
                        BLACK_DYED_POLISHED_ANDESITE_LEVER);
            }

        }

        if (ConfigHandler.ENABLE_DYED_STONE_BLOCKS) {
            //Now we register meshes for coloured blocks in this loop
            for (EnumDyeColor color : EnumDyeColor.values()) {

                //Start off with dyed cobblestone
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DYED_COBBLESTONE), color.getMetadata(), "dyed_cobblestone", "color=" + color.getName());

                //Then dyed mossy cobblestone
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DYED_MOSSY_COBBLESTONE), color.getMetadata(), "dyed_mossy_cobblestone", "color=" + color.getName());

                //Then dyed stone
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DYED_STONE), color.getMetadata(), "dyed_stone", "color=" + color.getName());

                //Then dyed granite
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DYED_GRANITE), color.getMetadata(), "dyed_granite", "color=" + color.getName());
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DYED_SMOOTH_GRANITE), color.getMetadata(), "dyed_smooth_granite", "color=" + color.getName());

                //Then dyed diorite
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DYED_DIORITE), color.getMetadata(), "dyed_diorite", "color=" + color.getName());
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DYED_SMOOTH_DIORITE), color.getMetadata(), "dyed_smooth_diorite", "color=" + color.getName());

                //Then dyed andesite
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DYED_ANDESITE), color.getMetadata(), "dyed_andesite", "color=" + color.getName());
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DYED_SMOOTH_ANDESITE), color.getMetadata(), "dyed_smooth_andesite", "color=" + color.getName());
            }
        }

        if (ConfigHandler.ENABLE_ADDITIONAL_STAIRS) {
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(STONE_STAIRS), 0, "stone_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MOSSY_COBBLESTONE_STAIRS), 0, "mossy_cobblestone_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRANITE_STAIRS), 0, "granite_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_GRANITE_STAIRS), 0, "polished_granite_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DIORITE_STAIRS), 0, "diorite_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_DIORITE_STAIRS), 0, "polished_diorite_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ANDESITE_STAIRS), 0, "andesite_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_ANDESITE_STAIRS), 0, "polished_andesite_stairs", "inventory");

            //Now begin the dyed versions
            if (ConfigHandler.ENABLE_DYED_STONE_BLOCKS) {
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_COBBLESTONE_STAIRS), 0, "white_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_COBBLESTONE_STAIRS), 0, "orange_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_COBBLESTONE_STAIRS), 0, "magenta_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_COBBLESTONE_STAIRS), 0, "light_blue_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_COBBLESTONE_STAIRS), 0, "yellow_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_COBBLESTONE_STAIRS), 0, "lime_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_COBBLESTONE_STAIRS), 0, "pink_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_COBBLESTONE_STAIRS), 0, "gray_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_COBBLESTONE_STAIRS), 0, "silver_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_COBBLESTONE_STAIRS), 0, "cyan_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_COBBLESTONE_STAIRS), 0, "purple_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_COBBLESTONE_STAIRS), 0, "blue_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_COBBLESTONE_STAIRS), 0, "brown_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_COBBLESTONE_STAIRS), 0, "green_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_COBBLESTONE_STAIRS), 0, "red_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_COBBLESTONE_STAIRS), 0, "black_dyed_cobblestone_stairs", "inventory");

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "white_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "orange_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "magenta_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "light_blue_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "yellow_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "lime_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "pink_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "gray_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "silver_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "cyan_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "purple_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "blue_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "brown_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "green_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "red_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "black_dyed_mossy_cobblestone_stairs", "inventory");


                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_STONE_STAIRS), 0, "white_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_STONE_STAIRS), 0, "orange_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_STONE_STAIRS), 0, "magenta_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_STONE_STAIRS), 0, "light_blue_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_STONE_STAIRS), 0, "yellow_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_STONE_STAIRS), 0, "lime_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_STONE_STAIRS), 0, "pink_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_STONE_STAIRS), 0, "gray_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_STONE_STAIRS), 0, "silver_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_STONE_STAIRS), 0, "cyan_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_STONE_STAIRS), 0, "purple_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_STONE_STAIRS), 0, "blue_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_STONE_STAIRS), 0, "brown_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_STONE_STAIRS), 0, "green_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_STONE_STAIRS), 0, "red_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_STONE_STAIRS), 0, "black_dyed_stone_stairs", "inventory");

                //I repeat; ugh

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_ANDESITE_STAIRS), 0, "white_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_ANDESITE_STAIRS), 0, "orange_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_ANDESITE_STAIRS), 0, "magenta_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_ANDESITE_STAIRS), 0, "light_blue_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_ANDESITE_STAIRS), 0, "yellow_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_ANDESITE_STAIRS), 0, "lime_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_ANDESITE_STAIRS), 0, "pink_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_ANDESITE_STAIRS), 0, "gray_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_ANDESITE_STAIRS), 0, "silver_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_ANDESITE_STAIRS), 0, "cyan_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_ANDESITE_STAIRS), 0, "purple_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_ANDESITE_STAIRS), 0, "blue_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_ANDESITE_STAIRS), 0, "brown_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_ANDESITE_STAIRS), 0, "green_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_ANDESITE_STAIRS), 0, "red_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_ANDESITE_STAIRS), 0, "black_dyed_andesite_stairs", "inventory");

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_DIORITE_STAIRS), 0, "white_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_DIORITE_STAIRS), 0, "orange_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_DIORITE_STAIRS), 0, "magenta_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_DIORITE_STAIRS), 0, "light_blue_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_DIORITE_STAIRS), 0, "yellow_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_DIORITE_STAIRS), 0, "lime_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_DIORITE_STAIRS), 0, "pink_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_DIORITE_STAIRS), 0, "gray_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_DIORITE_STAIRS), 0, "silver_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_DIORITE_STAIRS), 0, "cyan_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_DIORITE_STAIRS), 0, "purple_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_DIORITE_STAIRS), 0, "blue_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_DIORITE_STAIRS), 0, "brown_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_DIORITE_STAIRS), 0, "green_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_DIORITE_STAIRS), 0, "red_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_DIORITE_STAIRS), 0, "black_dyed_diorite_stairs", "inventory");

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_GRANITE_STAIRS), 0, "white_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_GRANITE_STAIRS), 0, "orange_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_GRANITE_STAIRS), 0, "magenta_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_GRANITE_STAIRS), 0, "light_blue_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_GRANITE_STAIRS), 0, "yellow_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_GRANITE_STAIRS), 0, "lime_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_GRANITE_STAIRS), 0, "pink_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_GRANITE_STAIRS), 0, "gray_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_GRANITE_STAIRS), 0, "silver_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_GRANITE_STAIRS), 0, "cyan_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_GRANITE_STAIRS), 0, "purple_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_GRANITE_STAIRS), 0, "blue_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_GRANITE_STAIRS), 0, "brown_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_GRANITE_STAIRS), 0, "green_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_GRANITE_STAIRS), 0, "red_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_GRANITE_STAIRS), 0, "black_dyed_granite_stairs", "inventory");

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_POLISHED_ANDESITE_STAIRS), 0, "white_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_POLISHED_ANDESITE_STAIRS), 0, "orange_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_POLISHED_ANDESITE_STAIRS), 0, "magenta_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_POLISHED_ANDESITE_STAIRS), 0, "light_blue_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_POLISHED_ANDESITE_STAIRS), 0, "yellow_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_POLISHED_ANDESITE_STAIRS), 0, "lime_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_POLISHED_ANDESITE_STAIRS), 0, "pink_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_POLISHED_ANDESITE_STAIRS), 0, "gray_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_POLISHED_ANDESITE_STAIRS), 0, "silver_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_POLISHED_ANDESITE_STAIRS), 0, "cyan_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_POLISHED_ANDESITE_STAIRS), 0, "purple_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_POLISHED_ANDESITE_STAIRS), 0, "blue_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_POLISHED_ANDESITE_STAIRS), 0, "brown_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_POLISHED_ANDESITE_STAIRS), 0, "green_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_POLISHED_ANDESITE_STAIRS), 0, "red_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_POLISHED_ANDESITE_STAIRS), 0, "black_dyed_polished_andesite_stairs", "inventory");

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_POLISHED_DIORITE_STAIRS), 0, "white_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_POLISHED_DIORITE_STAIRS), 0, "orange_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_POLISHED_DIORITE_STAIRS), 0, "magenta_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_POLISHED_DIORITE_STAIRS), 0, "light_blue_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_POLISHED_DIORITE_STAIRS), 0, "yellow_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_POLISHED_DIORITE_STAIRS), 0, "lime_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_POLISHED_DIORITE_STAIRS), 0, "pink_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_POLISHED_DIORITE_STAIRS), 0, "gray_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_POLISHED_DIORITE_STAIRS), 0, "silver_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_POLISHED_DIORITE_STAIRS), 0, "cyan_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_POLISHED_DIORITE_STAIRS), 0, "purple_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_POLISHED_DIORITE_STAIRS), 0, "blue_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_POLISHED_DIORITE_STAIRS), 0, "brown_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_POLISHED_DIORITE_STAIRS), 0, "green_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_POLISHED_DIORITE_STAIRS), 0, "red_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_POLISHED_DIORITE_STAIRS), 0, "black_dyed_polished_diorite_stairs", "inventory");

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_POLISHED_GRANITE_STAIRS), 0, "white_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_POLISHED_GRANITE_STAIRS), 0, "orange_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_POLISHED_GRANITE_STAIRS), 0, "magenta_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_POLISHED_GRANITE_STAIRS), 0, "light_blue_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_POLISHED_GRANITE_STAIRS), 0, "yellow_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_POLISHED_GRANITE_STAIRS), 0, "lime_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_POLISHED_GRANITE_STAIRS), 0, "pink_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_POLISHED_GRANITE_STAIRS), 0, "gray_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_POLISHED_GRANITE_STAIRS), 0, "silver_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_POLISHED_GRANITE_STAIRS), 0, "cyan_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_POLISHED_GRANITE_STAIRS), 0, "purple_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_POLISHED_GRANITE_STAIRS), 0, "blue_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_POLISHED_GRANITE_STAIRS), 0, "brown_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_POLISHED_GRANITE_STAIRS), 0, "green_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_POLISHED_GRANITE_STAIRS), 0, "red_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_POLISHED_GRANITE_STAIRS), 0, "black_dyed_polished_granite_stairs", "inventory");
            }

        }

        if (ConfigHandler.ENABLE_ADDITIONAL_PRESSURE_PLATES) {
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(COBBLESTONE_PRESSURE_PLATE), 0, "cobblestone_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MOSSY_COBBLESTONE_PRESSURE_PLATE), 0, "mossy_cobblestone_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRANITE_PRESSURE_PLATE), 0, "granite_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_GRANITE_PRESSURE_PLATE), 0, "polished_granite_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DIORITE_PRESSURE_PLATE), 0, "diorite_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_DIORITE_PRESSURE_PLATE), 0, "polished_diorite_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ANDESITE_PRESSURE_PLATE), 0, "andesite_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_ANDESITE_PRESSURE_PLATE), 0, "polished_andesite_pressure_plate", "inventory");

            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(STONE_BRICK_PRESSURE_PLATE), 0, "stone_brick_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CHISELED_STONE_BRICK_PRESSURE_PLATE), 0, "chiseled_stone_brick_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CRACKED_STONE_BRICK_PRESSURE_PLATE), 0, "cracked_stone_brick_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MOSSY_STONE_BRICK_PRESSURE_PLATE), 0, "mossy_stone_brick_pressure_plate", "inventory");

            if (ConfigHandler.ENABLE_DYED_STONE_BLOCKS) {
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_STONE_PRESSURE_PLATE), 0, "white_dyed_stone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_STONE_PRESSURE_PLATE), 0, "orange_dyed_stone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_STONE_PRESSURE_PLATE), 0, "magenta_dyed_stone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_STONE_PRESSURE_PLATE), 0, "light_blue_dyed_stone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_STONE_PRESSURE_PLATE), 0, "yellow_dyed_stone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_STONE_PRESSURE_PLATE), 0, "lime_dyed_stone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_STONE_PRESSURE_PLATE), 0, "pink_dyed_stone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_STONE_PRESSURE_PLATE), 0, "gray_dyed_stone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_STONE_PRESSURE_PLATE), 0, "silver_dyed_stone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_STONE_PRESSURE_PLATE), 0, "cyan_dyed_stone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_STONE_PRESSURE_PLATE), 0, "purple_dyed_stone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_STONE_PRESSURE_PLATE), 0, "blue_dyed_stone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_STONE_PRESSURE_PLATE), 0, "brown_dyed_stone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_STONE_PRESSURE_PLATE), 0, "green_dyed_stone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_STONE_PRESSURE_PLATE), 0, "red_dyed_stone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_STONE_PRESSURE_PLATE), 0, "black_dyed_stone_pressure_plate", "inventory");

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_COBBLESTONE_PRESSURE_PLATE), 0, "white_dyed_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_COBBLESTONE_PRESSURE_PLATE), 0, "orange_dyed_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_COBBLESTONE_PRESSURE_PLATE), 0, "magenta_dyed_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_COBBLESTONE_PRESSURE_PLATE), 0, "light_blue_dyed_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_COBBLESTONE_PRESSURE_PLATE), 0, "yellow_dyed_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_COBBLESTONE_PRESSURE_PLATE), 0, "lime_dyed_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_COBBLESTONE_PRESSURE_PLATE), 0, "pink_dyed_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_COBBLESTONE_PRESSURE_PLATE), 0, "gray_dyed_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_COBBLESTONE_PRESSURE_PLATE), 0, "silver_dyed_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_COBBLESTONE_PRESSURE_PLATE), 0, "cyan_dyed_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_COBBLESTONE_PRESSURE_PLATE), 0, "purple_dyed_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_COBBLESTONE_PRESSURE_PLATE), 0, "blue_dyed_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_COBBLESTONE_PRESSURE_PLATE), 0, "brown_dyed_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_COBBLESTONE_PRESSURE_PLATE), 0, "green_dyed_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_COBBLESTONE_PRESSURE_PLATE), 0, "red_dyed_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_COBBLESTONE_PRESSURE_PLATE), 0, "black_dyed_cobblestone_pressure_plate", "inventory");

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE), 0, "white_dyed_mossy_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE), 0, "orange_dyed_mossy_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE), 0, "magenta_dyed_mossy_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE), 0, "light_blue_dyed_mossy_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE), 0, "yellow_dyed_mossy_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE), 0, "lime_dyed_mossy_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE), 0, "pink_dyed_mossy_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE), 0, "gray_dyed_mossy_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE), 0, "silver_dyed_mossy_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE), 0, "cyan_dyed_mossy_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE), 0, "purple_dyed_mossy_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE), 0, "blue_dyed_mossy_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE), 0, "brown_dyed_mossy_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE), 0, "green_dyed_mossy_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE), 0, "red_dyed_mossy_cobblestone_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE), 0, "black_dyed_mossy_cobblestone_pressure_plate", "inventory");


                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_GRANITE_PRESSURE_PLATE), 0, "white_dyed_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_GRANITE_PRESSURE_PLATE), 0, "orange_dyed_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_GRANITE_PRESSURE_PLATE), 0, "magenta_dyed_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_GRANITE_PRESSURE_PLATE), 0, "light_blue_dyed_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_GRANITE_PRESSURE_PLATE), 0, "yellow_dyed_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_GRANITE_PRESSURE_PLATE), 0, "lime_dyed_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_GRANITE_PRESSURE_PLATE), 0, "pink_dyed_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_GRANITE_PRESSURE_PLATE), 0, "gray_dyed_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_GRANITE_PRESSURE_PLATE), 0, "silver_dyed_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_GRANITE_PRESSURE_PLATE), 0, "cyan_dyed_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_GRANITE_PRESSURE_PLATE), 0, "purple_dyed_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_GRANITE_PRESSURE_PLATE), 0, "blue_dyed_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_GRANITE_PRESSURE_PLATE), 0, "brown_dyed_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_GRANITE_PRESSURE_PLATE), 0, "green_dyed_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_GRANITE_PRESSURE_PLATE), 0, "red_dyed_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_GRANITE_PRESSURE_PLATE), 0, "black_dyed_granite_pressure_plate", "inventory");



                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_DIORITE_PRESSURE_PLATE), 0, "white_dyed_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_DIORITE_PRESSURE_PLATE), 0, "orange_dyed_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_DIORITE_PRESSURE_PLATE), 0, "magenta_dyed_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_DIORITE_PRESSURE_PLATE), 0, "light_blue_dyed_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_DIORITE_PRESSURE_PLATE), 0, "yellow_dyed_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_DIORITE_PRESSURE_PLATE), 0, "lime_dyed_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_DIORITE_PRESSURE_PLATE), 0, "pink_dyed_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_DIORITE_PRESSURE_PLATE), 0, "gray_dyed_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_DIORITE_PRESSURE_PLATE), 0, "silver_dyed_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_DIORITE_PRESSURE_PLATE), 0, "cyan_dyed_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_DIORITE_PRESSURE_PLATE), 0, "purple_dyed_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_DIORITE_PRESSURE_PLATE), 0, "blue_dyed_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_DIORITE_PRESSURE_PLATE), 0, "brown_dyed_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_DIORITE_PRESSURE_PLATE), 0, "green_dyed_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_DIORITE_PRESSURE_PLATE), 0, "red_dyed_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_DIORITE_PRESSURE_PLATE), 0, "black_dyed_diorite_pressure_plate", "inventory");



                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_ANDESITE_PRESSURE_PLATE), 0, "white_dyed_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_ANDESITE_PRESSURE_PLATE), 0, "orange_dyed_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_ANDESITE_PRESSURE_PLATE), 0, "magenta_dyed_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_ANDESITE_PRESSURE_PLATE), 0, "light_blue_dyed_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_ANDESITE_PRESSURE_PLATE), 0, "yellow_dyed_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_ANDESITE_PRESSURE_PLATE), 0, "lime_dyed_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_ANDESITE_PRESSURE_PLATE), 0, "pink_dyed_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_ANDESITE_PRESSURE_PLATE), 0, "gray_dyed_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_ANDESITE_PRESSURE_PLATE), 0, "silver_dyed_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_ANDESITE_PRESSURE_PLATE), 0, "cyan_dyed_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_ANDESITE_PRESSURE_PLATE), 0, "purple_dyed_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_ANDESITE_PRESSURE_PLATE), 0, "blue_dyed_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_ANDESITE_PRESSURE_PLATE), 0, "brown_dyed_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_ANDESITE_PRESSURE_PLATE), 0, "green_dyed_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_ANDESITE_PRESSURE_PLATE), 0, "red_dyed_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_ANDESITE_PRESSURE_PLATE), 0, "black_dyed_andesite_pressure_plate", "inventory");


                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_POLISHED_GRANITE_PRESSURE_PLATE), 0, "white_dyed_polished_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_POLISHED_GRANITE_PRESSURE_PLATE), 0, "orange_dyed_polished_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_POLISHED_GRANITE_PRESSURE_PLATE), 0, "magenta_dyed_polished_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_POLISHED_GRANITE_PRESSURE_PLATE), 0, "light_blue_dyed_polished_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_POLISHED_GRANITE_PRESSURE_PLATE), 0, "yellow_dyed_polished_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_POLISHED_GRANITE_PRESSURE_PLATE), 0, "lime_dyed_polished_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_POLISHED_GRANITE_PRESSURE_PLATE), 0, "pink_dyed_polished_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_POLISHED_GRANITE_PRESSURE_PLATE), 0, "gray_dyed_polished_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_POLISHED_GRANITE_PRESSURE_PLATE), 0, "silver_dyed_polished_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_POLISHED_GRANITE_PRESSURE_PLATE), 0, "cyan_dyed_polished_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_POLISHED_GRANITE_PRESSURE_PLATE), 0, "purple_dyed_polished_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_POLISHED_GRANITE_PRESSURE_PLATE), 0, "blue_dyed_polished_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_POLISHED_GRANITE_PRESSURE_PLATE), 0, "brown_dyed_polished_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_POLISHED_GRANITE_PRESSURE_PLATE), 0, "green_dyed_polished_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_POLISHED_GRANITE_PRESSURE_PLATE), 0, "red_dyed_polished_granite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_POLISHED_GRANITE_PRESSURE_PLATE), 0, "black_dyed_polished_granite_pressure_plate", "inventory");



                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_POLISHED_DIORITE_PRESSURE_PLATE), 0, "white_dyed_polished_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_POLISHED_DIORITE_PRESSURE_PLATE), 0, "orange_dyed_polished_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_POLISHED_DIORITE_PRESSURE_PLATE), 0, "magenta_dyed_polished_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_POLISHED_DIORITE_PRESSURE_PLATE), 0, "light_blue_dyed_polished_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_POLISHED_DIORITE_PRESSURE_PLATE), 0, "yellow_dyed_polished_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_POLISHED_DIORITE_PRESSURE_PLATE), 0, "lime_dyed_polished_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_POLISHED_DIORITE_PRESSURE_PLATE), 0, "pink_dyed_polished_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_POLISHED_DIORITE_PRESSURE_PLATE), 0, "gray_dyed_polished_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_POLISHED_DIORITE_PRESSURE_PLATE), 0, "silver_dyed_polished_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_POLISHED_DIORITE_PRESSURE_PLATE), 0, "cyan_dyed_polished_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_POLISHED_DIORITE_PRESSURE_PLATE), 0, "purple_dyed_polished_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_POLISHED_DIORITE_PRESSURE_PLATE), 0, "blue_dyed_polished_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_POLISHED_DIORITE_PRESSURE_PLATE), 0, "brown_dyed_polished_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_POLISHED_DIORITE_PRESSURE_PLATE), 0, "green_dyed_polished_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_POLISHED_DIORITE_PRESSURE_PLATE), 0, "red_dyed_polished_diorite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_POLISHED_DIORITE_PRESSURE_PLATE), 0, "black_dyed_polished_diorite_pressure_plate", "inventory");



                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE), 0, "white_dyed_polished_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE), 0, "orange_dyed_polished_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_POLISHED_ANDESITE_PRESSURE_PLATE), 0, "magenta_dyed_polished_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE), 0, "light_blue_dyed_polished_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_POLISHED_ANDESITE_PRESSURE_PLATE), 0, "yellow_dyed_polished_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_POLISHED_ANDESITE_PRESSURE_PLATE), 0, "lime_dyed_polished_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_POLISHED_ANDESITE_PRESSURE_PLATE), 0, "pink_dyed_polished_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_POLISHED_ANDESITE_PRESSURE_PLATE), 0, "gray_dyed_polished_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_POLISHED_ANDESITE_PRESSURE_PLATE), 0, "silver_dyed_polished_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_POLISHED_ANDESITE_PRESSURE_PLATE), 0, "cyan_dyed_polished_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE), 0, "purple_dyed_polished_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE), 0, "blue_dyed_polished_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_POLISHED_ANDESITE_PRESSURE_PLATE), 0, "brown_dyed_polished_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_POLISHED_ANDESITE_PRESSURE_PLATE), 0, "green_dyed_polished_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_POLISHED_ANDESITE_PRESSURE_PLATE), 0, "red_dyed_polished_andesite_pressure_plate", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_POLISHED_ANDESITE_PRESSURE_PLATE), 0, "black_dyed_polished_andesite_pressure_plate", "inventory");


            }
        }

        if (ConfigHandler.ENABLE_ADDITIONAL_LEVERS) {
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(STONE_LEVER), 0, "stone_lever", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRANITE_LEVER), 0, "granite_lever", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_GRANITE_LEVER), 0, "polished_granite_lever", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DIORITE_LEVER), 0, "diorite_lever", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_DIORITE_LEVER), 0, "polished_diorite_lever", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ANDESITE_LEVER), 0, "andesite_lever", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_ANDESITE_LEVER), 0, "polished_andesite_lever", "inventory");

            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MOSSY_COBBLESTONE_LEVER), 0, "mossy_cobblestone_lever", "inventory");

            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(STONE_BRICK_LEVER), 0, "stone_brick_lever", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CRACKED_STONE_BRICK_LEVER), 0, "cracked_stone_brick_lever", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CHISELED_STONE_BRICK_LEVER), 0, "chiseled_stone_brick_lever", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MOSSY_STONE_BRICK_LEVER), 0, "mossy_stone_brick_lever", "inventory");
            
            if (ConfigHandler.ENABLE_DYED_STONE_BLOCKS) {

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_STONE_LEVER), 0, "white_dyed_stone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_STONE_LEVER), 0, "orange_dyed_stone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_STONE_LEVER), 0, "magenta_dyed_stone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_STONE_LEVER), 0, "light_blue_dyed_stone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_STONE_LEVER), 0, "yellow_dyed_stone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_STONE_LEVER), 0, "lime_dyed_stone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_STONE_LEVER), 0, "pink_dyed_stone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_STONE_LEVER), 0, "gray_dyed_stone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_STONE_LEVER), 0, "silver_dyed_stone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_STONE_LEVER), 0, "cyan_dyed_stone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_STONE_LEVER), 0, "purple_dyed_stone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_STONE_LEVER), 0, "blue_dyed_stone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_STONE_LEVER), 0, "brown_dyed_stone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_STONE_LEVER), 0, "green_dyed_stone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_STONE_LEVER), 0, "red_dyed_stone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_STONE_LEVER), 0, "black_dyed_stone_lever", "inventory");

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_MOSSY_COBBLESTONE_LEVER), 0, "white_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_MOSSY_COBBLESTONE_LEVER), 0, "orange_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_MOSSY_COBBLESTONE_LEVER), 0, "magenta_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_MOSSY_COBBLESTONE_LEVER), 0, "light_blue_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_MOSSY_COBBLESTONE_LEVER), 0, "yellow_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_MOSSY_COBBLESTONE_LEVER), 0, "lime_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_MOSSY_COBBLESTONE_LEVER), 0, "pink_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_MOSSY_COBBLESTONE_LEVER), 0, "gray_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_MOSSY_COBBLESTONE_LEVER), 0, "silver_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_MOSSY_COBBLESTONE_LEVER), 0, "cyan_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_MOSSY_COBBLESTONE_LEVER), 0, "purple_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_MOSSY_COBBLESTONE_LEVER), 0, "blue_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_MOSSY_COBBLESTONE_LEVER), 0, "brown_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_MOSSY_COBBLESTONE_LEVER), 0, "green_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_MOSSY_COBBLESTONE_LEVER), 0, "red_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_MOSSY_COBBLESTONE_LEVER), 0, "black_dyed_mossy_cobblestone_lever", "inventory");

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_COBBLESTONE_LEVER), 0, "white_dyed_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_COBBLESTONE_LEVER), 0, "orange_dyed_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_COBBLESTONE_LEVER), 0, "magenta_dyed_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_COBBLESTONE_LEVER), 0, "light_blue_dyed_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_COBBLESTONE_LEVER), 0, "yellow_dyed_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_COBBLESTONE_LEVER), 0, "lime_dyed_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_COBBLESTONE_LEVER), 0, "pink_dyed_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_COBBLESTONE_LEVER), 0, "gray_dyed_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_COBBLESTONE_LEVER), 0, "silver_dyed_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_COBBLESTONE_LEVER), 0, "cyan_dyed_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_COBBLESTONE_LEVER), 0, "purple_dyed_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_COBBLESTONE_LEVER), 0, "blue_dyed_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_COBBLESTONE_LEVER), 0, "brown_dyed_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_COBBLESTONE_LEVER), 0, "green_dyed_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_COBBLESTONE_LEVER), 0, "red_dyed_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_COBBLESTONE_LEVER), 0, "black_dyed_cobblestone_lever", "inventory");


                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_MOSSY_COBBLESTONE_LEVER), 0, "white_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_MOSSY_COBBLESTONE_LEVER), 0, "orange_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_MOSSY_COBBLESTONE_LEVER), 0, "magenta_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_MOSSY_COBBLESTONE_LEVER), 0, "light_blue_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_MOSSY_COBBLESTONE_LEVER), 0, "yellow_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_MOSSY_COBBLESTONE_LEVER), 0, "lime_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_MOSSY_COBBLESTONE_LEVER), 0, "pink_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_MOSSY_COBBLESTONE_LEVER), 0, "gray_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_MOSSY_COBBLESTONE_LEVER), 0, "silver_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_MOSSY_COBBLESTONE_LEVER), 0, "cyan_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_MOSSY_COBBLESTONE_LEVER), 0, "purple_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_MOSSY_COBBLESTONE_LEVER), 0, "blue_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_MOSSY_COBBLESTONE_LEVER), 0, "brown_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_MOSSY_COBBLESTONE_LEVER), 0, "green_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_MOSSY_COBBLESTONE_LEVER), 0, "red_dyed_mossy_cobblestone_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_MOSSY_COBBLESTONE_LEVER), 0, "black_dyed_mossy_cobblestone_lever", "inventory");


                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_GRANITE_LEVER), 0, "white_dyed_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_GRANITE_LEVER), 0, "orange_dyed_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_GRANITE_LEVER), 0, "magenta_dyed_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_GRANITE_LEVER), 0, "light_blue_dyed_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_GRANITE_LEVER), 0, "yellow_dyed_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_GRANITE_LEVER), 0, "lime_dyed_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_GRANITE_LEVER), 0, "pink_dyed_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_GRANITE_LEVER), 0, "gray_dyed_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_GRANITE_LEVER), 0, "silver_dyed_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_GRANITE_LEVER), 0, "cyan_dyed_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_GRANITE_LEVER), 0, "purple_dyed_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_GRANITE_LEVER), 0, "blue_dyed_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_GRANITE_LEVER), 0, "brown_dyed_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_GRANITE_LEVER), 0, "green_dyed_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_GRANITE_LEVER), 0, "red_dyed_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_GRANITE_LEVER), 0, "black_dyed_granite_lever", "inventory");



                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_DIORITE_LEVER), 0, "white_dyed_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_DIORITE_LEVER), 0, "orange_dyed_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_DIORITE_LEVER), 0, "magenta_dyed_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_DIORITE_LEVER), 0, "light_blue_dyed_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_DIORITE_LEVER), 0, "yellow_dyed_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_DIORITE_LEVER), 0, "lime_dyed_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_DIORITE_LEVER), 0, "pink_dyed_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_DIORITE_LEVER), 0, "gray_dyed_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_DIORITE_LEVER), 0, "silver_dyed_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_DIORITE_LEVER), 0, "cyan_dyed_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_DIORITE_LEVER), 0, "purple_dyed_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_DIORITE_LEVER), 0, "blue_dyed_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_DIORITE_LEVER), 0, "brown_dyed_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_DIORITE_LEVER), 0, "green_dyed_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_DIORITE_LEVER), 0, "red_dyed_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_DIORITE_LEVER), 0, "black_dyed_diorite_lever", "inventory");



                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_ANDESITE_LEVER), 0, "white_dyed_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_ANDESITE_LEVER), 0, "orange_dyed_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_ANDESITE_LEVER), 0, "magenta_dyed_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_ANDESITE_LEVER), 0, "light_blue_dyed_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_ANDESITE_LEVER), 0, "yellow_dyed_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_ANDESITE_LEVER), 0, "lime_dyed_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_ANDESITE_LEVER), 0, "pink_dyed_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_ANDESITE_LEVER), 0, "gray_dyed_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_ANDESITE_LEVER), 0, "silver_dyed_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_ANDESITE_LEVER), 0, "cyan_dyed_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_ANDESITE_LEVER), 0, "purple_dyed_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_ANDESITE_LEVER), 0, "blue_dyed_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_ANDESITE_LEVER), 0, "brown_dyed_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_ANDESITE_LEVER), 0, "green_dyed_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_ANDESITE_LEVER), 0, "red_dyed_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_ANDESITE_LEVER), 0, "black_dyed_andesite_lever", "inventory");


                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_POLISHED_GRANITE_LEVER), 0, "white_dyed_polished_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_POLISHED_GRANITE_LEVER), 0, "orange_dyed_polished_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_POLISHED_GRANITE_LEVER), 0, "magenta_dyed_polished_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_POLISHED_GRANITE_LEVER), 0, "light_blue_dyed_polished_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_POLISHED_GRANITE_LEVER), 0, "yellow_dyed_polished_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_POLISHED_GRANITE_LEVER), 0, "lime_dyed_polished_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_POLISHED_GRANITE_LEVER), 0, "pink_dyed_polished_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_POLISHED_GRANITE_LEVER), 0, "gray_dyed_polished_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_POLISHED_GRANITE_LEVER), 0, "silver_dyed_polished_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_POLISHED_GRANITE_LEVER), 0, "cyan_dyed_polished_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_POLISHED_GRANITE_LEVER), 0, "purple_dyed_polished_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_POLISHED_GRANITE_LEVER), 0, "blue_dyed_polished_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_POLISHED_GRANITE_LEVER), 0, "brown_dyed_polished_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_POLISHED_GRANITE_LEVER), 0, "green_dyed_polished_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_POLISHED_GRANITE_LEVER), 0, "red_dyed_polished_granite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_POLISHED_GRANITE_LEVER), 0, "black_dyed_polished_granite_lever", "inventory");



                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_POLISHED_DIORITE_LEVER), 0, "white_dyed_polished_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_POLISHED_DIORITE_LEVER), 0, "orange_dyed_polished_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_POLISHED_DIORITE_LEVER), 0, "magenta_dyed_polished_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_POLISHED_DIORITE_LEVER), 0, "light_blue_dyed_polished_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_POLISHED_DIORITE_LEVER), 0, "yellow_dyed_polished_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_POLISHED_DIORITE_LEVER), 0, "lime_dyed_polished_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_POLISHED_DIORITE_LEVER), 0, "pink_dyed_polished_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_POLISHED_DIORITE_LEVER), 0, "gray_dyed_polished_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_POLISHED_DIORITE_LEVER), 0, "silver_dyed_polished_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_POLISHED_DIORITE_LEVER), 0, "cyan_dyed_polished_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_POLISHED_DIORITE_LEVER), 0, "purple_dyed_polished_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_POLISHED_DIORITE_LEVER), 0, "blue_dyed_polished_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_POLISHED_DIORITE_LEVER), 0, "brown_dyed_polished_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_POLISHED_DIORITE_LEVER), 0, "green_dyed_polished_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_POLISHED_DIORITE_LEVER), 0, "red_dyed_polished_diorite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_POLISHED_DIORITE_LEVER), 0, "black_dyed_polished_diorite_lever", "inventory");



                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_POLISHED_ANDESITE_LEVER), 0, "white_dyed_polished_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_POLISHED_ANDESITE_LEVER), 0, "orange_dyed_polished_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_POLISHED_ANDESITE_LEVER), 0, "magenta_dyed_polished_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_POLISHED_ANDESITE_LEVER), 0, "light_blue_dyed_polished_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_POLISHED_ANDESITE_LEVER), 0, "yellow_dyed_polished_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_POLISHED_ANDESITE_LEVER), 0, "lime_dyed_polished_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_POLISHED_ANDESITE_LEVER), 0, "pink_dyed_polished_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_POLISHED_ANDESITE_LEVER), 0, "gray_dyed_polished_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_POLISHED_ANDESITE_LEVER), 0, "silver_dyed_polished_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_POLISHED_ANDESITE_LEVER), 0, "cyan_dyed_polished_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_POLISHED_ANDESITE_LEVER), 0, "purple_dyed_polished_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_POLISHED_ANDESITE_LEVER), 0, "blue_dyed_polished_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_POLISHED_ANDESITE_LEVER), 0, "brown_dyed_polished_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_POLISHED_ANDESITE_LEVER), 0, "green_dyed_polished_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_POLISHED_ANDESITE_LEVER), 0, "red_dyed_polished_andesite_lever", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_POLISHED_ANDESITE_LEVER), 0, "black_dyed_polished_andesite_lever", "inventory");


            }
        }
    }

    /**
     * Registers recipes for {@link net.minecraft.block.Block}s added by the {@link IgneousExtrasMod}
     *
     * @since 0.0.1
     */
    public static void registerRecipes() {

        if (ConfigHandler.ENABLE_DYED_STONE_BLOCKS) {
            registerSingleDyeBlockRecipeCombination(Blocks.COBBLESTONE, DYED_COBBLESTONE);
            registerSingleDyeBlockRecipeCombination(Blocks.MOSSY_COBBLESTONE, DYED_MOSSY_COBBLESTONE);
            registerSingleDyeBlockRecipeCombination(Blocks.STONE, 0, DYED_STONE);
            registerSingleDyeBlockRecipeCombination(Blocks.STONE, 1, DYED_GRANITE);
            registerSingleDyeBlockRecipeCombination(Blocks.STONE, 2, DYED_SMOOTH_GRANITE);
            registerSingleDyeBlockRecipeCombination(Blocks.STONE, 3, DYED_DIORITE);
            registerSingleDyeBlockRecipeCombination(Blocks.STONE, 4, DYED_SMOOTH_DIORITE);
            registerSingleDyeBlockRecipeCombination(Blocks.STONE, 5, DYED_ANDESITE);
            registerSingleDyeBlockRecipeCombination(Blocks.STONE, 6, DYED_SMOOTH_ANDESITE);
        }

        if (ConfigHandler.ENABLE_ADDITIONAL_STAIRS) {
            registerStairsRecipe(Blocks.STONE, 0, STONE_STAIRS);
            registerStairsRecipe(Blocks.MOSSY_COBBLESTONE, 0, MOSSY_COBBLESTONE_STAIRS);
            registerStairsRecipe(Blocks.STONE, 1, GRANITE_STAIRS);
            registerStairsRecipe(Blocks.STONE, 2, POLISHED_GRANITE_STAIRS);
            registerStairsRecipe(Blocks.STONE, 3, DIORITE_STAIRS);
            registerStairsRecipe(Blocks.STONE, 4, POLISHED_DIORITE_STAIRS);
            registerStairsRecipe(Blocks.STONE, 5, ANDESITE_STAIRS);
            registerStairsRecipe(Blocks.STONE, 6, POLISHED_ANDESITE_STAIRS);

            //Now dyed variants
            if (ConfigHandler.ENABLE_DYED_STONE_BLOCKS) {
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.RED.getMetadata(), RED_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_COBBLESTONE_STAIRS);
                
                
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.RED.getMetadata(), RED_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_MOSSY_COBBLESTONE_STAIRS);


                registerStairsRecipe(DYED_STONE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.RED.getMetadata(), RED_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_STONE_STAIRS);

                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.RED.getMetadata(), RED_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_ANDESITE_STAIRS);

                
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.RED.getMetadata(), RED_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_DIORITE_STAIRS);

                
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.RED.getMetadata(), RED_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_GRANITE_STAIRS);

                
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.RED.getMetadata(), RED_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_POLISHED_ANDESITE_STAIRS);

                
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.RED.getMetadata(), RED_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_POLISHED_DIORITE_STAIRS);

                
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.RED.getMetadata(), RED_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_POLISHED_GRANITE_STAIRS);
            }

        }

        if (ConfigHandler.ENABLE_ADDITIONAL_PRESSURE_PLATES) {
            registerPressurePlateRecipe(Blocks.COBBLESTONE, 0, COBBLESTONE_PRESSURE_PLATE);
            registerPressurePlateRecipe(Blocks.MOSSY_COBBLESTONE, 0, MOSSY_COBBLESTONE_PRESSURE_PLATE);

            registerPressurePlateRecipe(Blocks.STONE, BlockStone.EnumType.GRANITE.getMetadata(), GRANITE_PRESSURE_PLATE);
            registerPressurePlateRecipe(Blocks.STONE, BlockStone.EnumType.GRANITE_SMOOTH.getMetadata(), POLISHED_GRANITE_PRESSURE_PLATE);
            registerPressurePlateRecipe(Blocks.STONE, BlockStone.EnumType.ANDESITE.getMetadata(), ANDESITE_PRESSURE_PLATE);
            registerPressurePlateRecipe(Blocks.STONE, BlockStone.EnumType.ANDESITE_SMOOTH.getMetadata(), POLISHED_ANDESITE_PRESSURE_PLATE);
            registerPressurePlateRecipe(Blocks.STONE, BlockStone.EnumType.DIORITE.getMetadata(), DIORITE_PRESSURE_PLATE);
            registerPressurePlateRecipe(Blocks.STONE, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata(), POLISHED_DIORITE_PRESSURE_PLATE);

            registerPressurePlateRecipe(Blocks.STONEBRICK, BlockStoneBrick.EnumType.DEFAULT.getMetadata(), STONE_BRICK_PRESSURE_PLATE);
            registerPressurePlateRecipe(Blocks.STONEBRICK, BlockStoneBrick.EnumType.CHISELED.getMetadata(), CHISELED_STONE_BRICK_PRESSURE_PLATE);
            registerPressurePlateRecipe(Blocks.STONEBRICK, BlockStoneBrick.EnumType.CRACKED.getMetadata(), CRACKED_STONE_BRICK_PRESSURE_PLATE);
            registerPressurePlateRecipe(Blocks.STONEBRICK, BlockStoneBrick.EnumType.MOSSY.getMetadata(), MOSSY_STONE_BRICK_PRESSURE_PLATE);

            if (ConfigHandler.ENABLE_DYED_STONE_BLOCKS) {
                registerPressurePlateRecipe(DYED_STONE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_STONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_STONE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_STONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_STONE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_STONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_STONE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_STONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_STONE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_STONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_STONE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_STONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_STONE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_STONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_STONE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_STONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_STONE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_STONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_STONE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_STONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_STONE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_STONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_STONE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_STONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_STONE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_STONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_STONE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_STONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_STONE, EnumDyeColor.RED.getMetadata(), RED_DYED_STONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_STONE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_STONE_PRESSURE_PLATE);

                registerPressurePlateRecipe(DYED_COBBLESTONE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_COBBLESTONE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_COBBLESTONE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_COBBLESTONE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_COBBLESTONE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_COBBLESTONE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_COBBLESTONE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_COBBLESTONE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_COBBLESTONE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_COBBLESTONE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_COBBLESTONE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_COBBLESTONE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_COBBLESTONE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_COBBLESTONE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_COBBLESTONE, EnumDyeColor.RED.getMetadata(), RED_DYED_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_COBBLESTONE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_COBBLESTONE_PRESSURE_PLATE);

                registerPressurePlateRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.RED.getMetadata(), RED_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_MOSSY_COBBLESTONE_PRESSURE_PLATE);


                registerPressurePlateRecipe(DYED_GRANITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_GRANITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_GRANITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_GRANITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_GRANITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_GRANITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_GRANITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_GRANITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_GRANITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_GRANITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_GRANITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_GRANITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_GRANITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_GRANITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_GRANITE, EnumDyeColor.RED.getMetadata(), RED_DYED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_GRANITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_GRANITE_PRESSURE_PLATE);

                registerPressurePlateRecipe(DYED_DIORITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_DIORITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_DIORITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_DIORITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_DIORITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_DIORITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_DIORITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_DIORITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_DIORITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_DIORITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_DIORITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_DIORITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_DIORITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_DIORITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_DIORITE, EnumDyeColor.RED.getMetadata(), RED_DYED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_DIORITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_DIORITE_PRESSURE_PLATE);

                registerPressurePlateRecipe(DYED_ANDESITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_ANDESITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_ANDESITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_ANDESITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_ANDESITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_ANDESITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_ANDESITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_ANDESITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_ANDESITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_ANDESITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_ANDESITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_ANDESITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_ANDESITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_ANDESITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_ANDESITE, EnumDyeColor.RED.getMetadata(), RED_DYED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_ANDESITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_ANDESITE_PRESSURE_PLATE);

                registerPressurePlateRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_POLISHED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_POLISHED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_POLISHED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_POLISHED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_POLISHED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_POLISHED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_POLISHED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_POLISHED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_POLISHED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_POLISHED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_POLISHED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_POLISHED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_POLISHED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_POLISHED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.RED.getMetadata(), RED_DYED_POLISHED_GRANITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_POLISHED_GRANITE_PRESSURE_PLATE);

                registerPressurePlateRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_POLISHED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_POLISHED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_POLISHED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_POLISHED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_POLISHED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_POLISHED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_POLISHED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_POLISHED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_POLISHED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_POLISHED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_POLISHED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_POLISHED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_POLISHED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_POLISHED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.RED.getMetadata(), RED_DYED_POLISHED_DIORITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_POLISHED_DIORITE_PRESSURE_PLATE);

                registerPressurePlateRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_POLISHED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_POLISHED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_POLISHED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_POLISHED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_POLISHED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_POLISHED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_POLISHED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_POLISHED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_POLISHED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_POLISHED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.RED.getMetadata(), RED_DYED_POLISHED_ANDESITE_PRESSURE_PLATE);
                registerPressurePlateRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_POLISHED_ANDESITE_PRESSURE_PLATE);
            }
        }

        if (ConfigHandler.ENABLE_ADDITIONAL_LEVERS) {
            registerLeverRecipe(Blocks.STONE, BlockStone.EnumType.STONE.getMetadata(), STONE_LEVER);
            registerLeverRecipe(Blocks.STONE, BlockStone.EnumType.GRANITE.getMetadata(), GRANITE_LEVER);
            registerLeverRecipe(Blocks.STONE, BlockStone.EnumType.GRANITE_SMOOTH.getMetadata(), POLISHED_GRANITE_LEVER);
            registerLeverRecipe(Blocks.STONE, BlockStone.EnumType.DIORITE.getMetadata(), DIORITE_LEVER);
            registerLeverRecipe(Blocks.STONE, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata(), POLISHED_DIORITE_LEVER);
            registerLeverRecipe(Blocks.STONE, BlockStone.EnumType.ANDESITE.getMetadata(), ANDESITE_LEVER);
            registerLeverRecipe(Blocks.STONE, BlockStone.EnumType.ANDESITE_SMOOTH.getMetadata(), POLISHED_ANDESITE_LEVER);

            registerLeverRecipe(Blocks.MOSSY_COBBLESTONE, 0, MOSSY_COBBLESTONE_LEVER);

            registerLeverRecipe(Blocks.STONEBRICK, BlockStoneBrick.EnumType.DEFAULT.getMetadata(), STONE_BRICK_LEVER);
            registerLeverRecipe(Blocks.STONEBRICK, BlockStoneBrick.EnumType.CRACKED.getMetadata(), CRACKED_STONE_BRICK_LEVER);
            registerLeverRecipe(Blocks.STONEBRICK, BlockStoneBrick.EnumType.CHISELED.getMetadata(), CHISELED_STONE_BRICK_LEVER);
            registerLeverRecipe(Blocks.STONEBRICK, BlockStoneBrick.EnumType.MOSSY.getMetadata(), MOSSY_STONE_BRICK_LEVER);
            
            if (ConfigHandler.ENABLE_DYED_STONE_BLOCKS) {

                registerLeverRecipe(DYED_STONE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_STONE_LEVER);
                registerLeverRecipe(DYED_STONE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_STONE_LEVER);
                registerLeverRecipe(DYED_STONE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_STONE_LEVER);
                registerLeverRecipe(DYED_STONE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_STONE_LEVER);
                registerLeverRecipe(DYED_STONE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_STONE_LEVER);
                registerLeverRecipe(DYED_STONE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_STONE_LEVER);
                registerLeverRecipe(DYED_STONE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_STONE_LEVER);
                registerLeverRecipe(DYED_STONE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_STONE_LEVER);
                registerLeverRecipe(DYED_STONE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_STONE_LEVER);
                registerLeverRecipe(DYED_STONE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_STONE_LEVER);
                registerLeverRecipe(DYED_STONE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_STONE_LEVER);
                registerLeverRecipe(DYED_STONE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_STONE_LEVER);
                registerLeverRecipe(DYED_STONE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_STONE_LEVER);
                registerLeverRecipe(DYED_STONE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_STONE_LEVER);
                registerLeverRecipe(DYED_STONE, EnumDyeColor.RED.getMetadata(), RED_DYED_STONE_LEVER);
                registerLeverRecipe(DYED_STONE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_STONE_LEVER);

                registerLeverRecipe(DYED_COBBLESTONE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_COBBLESTONE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_COBBLESTONE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_COBBLESTONE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_COBBLESTONE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_COBBLESTONE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_COBBLESTONE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_COBBLESTONE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_COBBLESTONE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_COBBLESTONE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_COBBLESTONE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_COBBLESTONE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_COBBLESTONE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_COBBLESTONE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_COBBLESTONE, EnumDyeColor.RED.getMetadata(), RED_DYED_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_COBBLESTONE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_COBBLESTONE_LEVER);

                registerLeverRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_MOSSY_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_MOSSY_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_MOSSY_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_MOSSY_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_MOSSY_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_MOSSY_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_MOSSY_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_MOSSY_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_MOSSY_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_MOSSY_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_MOSSY_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_MOSSY_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_MOSSY_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_MOSSY_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.RED.getMetadata(), RED_DYED_MOSSY_COBBLESTONE_LEVER);
                registerLeverRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_MOSSY_COBBLESTONE_LEVER);


                registerLeverRecipe(DYED_GRANITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_GRANITE_LEVER);
                registerLeverRecipe(DYED_GRANITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_GRANITE_LEVER);
                registerLeverRecipe(DYED_GRANITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_GRANITE_LEVER);
                registerLeverRecipe(DYED_GRANITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_GRANITE_LEVER);
                registerLeverRecipe(DYED_GRANITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_GRANITE_LEVER);
                registerLeverRecipe(DYED_GRANITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_GRANITE_LEVER);
                registerLeverRecipe(DYED_GRANITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_GRANITE_LEVER);
                registerLeverRecipe(DYED_GRANITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_GRANITE_LEVER);
                registerLeverRecipe(DYED_GRANITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_GRANITE_LEVER);
                registerLeverRecipe(DYED_GRANITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_GRANITE_LEVER);
                registerLeverRecipe(DYED_GRANITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_GRANITE_LEVER);
                registerLeverRecipe(DYED_GRANITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_GRANITE_LEVER);
                registerLeverRecipe(DYED_GRANITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_GRANITE_LEVER);
                registerLeverRecipe(DYED_GRANITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_GRANITE_LEVER);
                registerLeverRecipe(DYED_GRANITE, EnumDyeColor.RED.getMetadata(), RED_DYED_GRANITE_LEVER);
                registerLeverRecipe(DYED_GRANITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_GRANITE_LEVER);

                registerLeverRecipe(DYED_DIORITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_DIORITE_LEVER);
                registerLeverRecipe(DYED_DIORITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_DIORITE_LEVER);
                registerLeverRecipe(DYED_DIORITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_DIORITE_LEVER);
                registerLeverRecipe(DYED_DIORITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_DIORITE_LEVER);
                registerLeverRecipe(DYED_DIORITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_DIORITE_LEVER);
                registerLeverRecipe(DYED_DIORITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_DIORITE_LEVER);
                registerLeverRecipe(DYED_DIORITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_DIORITE_LEVER);
                registerLeverRecipe(DYED_DIORITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_DIORITE_LEVER);
                registerLeverRecipe(DYED_DIORITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_DIORITE_LEVER);
                registerLeverRecipe(DYED_DIORITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_DIORITE_LEVER);
                registerLeverRecipe(DYED_DIORITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_DIORITE_LEVER);
                registerLeverRecipe(DYED_DIORITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_DIORITE_LEVER);
                registerLeverRecipe(DYED_DIORITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_DIORITE_LEVER);
                registerLeverRecipe(DYED_DIORITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_DIORITE_LEVER);
                registerLeverRecipe(DYED_DIORITE, EnumDyeColor.RED.getMetadata(), RED_DYED_DIORITE_LEVER);
                registerLeverRecipe(DYED_DIORITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_DIORITE_LEVER);

                registerLeverRecipe(DYED_ANDESITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_ANDESITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_ANDESITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_ANDESITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_ANDESITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_ANDESITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_ANDESITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_ANDESITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_ANDESITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_ANDESITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_ANDESITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_ANDESITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_ANDESITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_ANDESITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_ANDESITE, EnumDyeColor.RED.getMetadata(), RED_DYED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_ANDESITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_ANDESITE_LEVER);

                registerLeverRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_POLISHED_GRANITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_POLISHED_GRANITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_POLISHED_GRANITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_POLISHED_GRANITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_POLISHED_GRANITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_POLISHED_GRANITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_POLISHED_GRANITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_POLISHED_GRANITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_POLISHED_GRANITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_POLISHED_GRANITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_POLISHED_GRANITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_POLISHED_GRANITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_POLISHED_GRANITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_POLISHED_GRANITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.RED.getMetadata(), RED_DYED_POLISHED_GRANITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_POLISHED_GRANITE_LEVER);

                registerLeverRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_POLISHED_DIORITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_POLISHED_DIORITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_POLISHED_DIORITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_POLISHED_DIORITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_POLISHED_DIORITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_POLISHED_DIORITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_POLISHED_DIORITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_POLISHED_DIORITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_POLISHED_DIORITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_POLISHED_DIORITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_POLISHED_DIORITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_POLISHED_DIORITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_POLISHED_DIORITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_POLISHED_DIORITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.RED.getMetadata(), RED_DYED_POLISHED_DIORITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_POLISHED_DIORITE_LEVER);

                registerLeverRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_POLISHED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_POLISHED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_POLISHED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_POLISHED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_POLISHED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_POLISHED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_POLISHED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_POLISHED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_POLISHED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_POLISHED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_POLISHED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_POLISHED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_POLISHED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_POLISHED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.RED.getMetadata(), RED_DYED_POLISHED_ANDESITE_LEVER);
                registerLeverRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_POLISHED_ANDESITE_LEVER);
                
            }
        }

    }

    /**
     * Registers a {@link BlockStairs} recipe
     *
     * @param baseBlock The base block to be consumed
     * @param baseBlockMetadata The required metadata value of the base block
     * @param stairBlock The stair block to be returned
     * @since 0.0.1
     */
    public static void registerStairsRecipe(Block baseBlock, int baseBlockMetadata, Block stairBlock) {
        ItemStack input = new ItemStack(baseBlock, 1, baseBlockMetadata);
        ItemStack output = new ItemStack(stairBlock, 4, 0);

        GameRegistry.addShapedRecipe(output, "  I", " II", "III", 'I', input);
        GameRegistry.addShapedRecipe(output, "I  ", "II ", "III", 'I', input);

        IgneousExtrasMod.REGISTERED_RECIPES += 1;
    }

    /**
     * Registers a {@link BlockPressurePlate} recipe
     *
     * @param baseBlock The base block to be consumed
     * @param baseBlockMetadata The required metadata value of the base block
     * @param plateBlock The plate block to be returned
     * @since 0.0.2
     */
    public static void registerPressurePlateRecipe(Block baseBlock, int baseBlockMetadata, Block plateBlock) {
        ItemStack input = new ItemStack(baseBlock, 1, baseBlockMetadata);
        ItemStack output = new ItemStack(plateBlock, 1, 0);

        GameRegistry.addShapedRecipe(output, "II", 'I', input);

        IgneousExtrasMod.REGISTERED_RECIPES += 1;
    }

    /**
     * Registers a {@link BlockBasicLever} recipe
     *
     * @param baseBlock The base block to be consumed
     * @param baseBlockMetadata The required metadata value of the base block
     * @param leverBlock The lever block to be returned
     * @since 0.0.2
     */
    public static void registerLeverRecipe(Block baseBlock, int baseBlockMetadata, Block leverBlock) {
        ItemStack input = new ItemStack(baseBlock, 1, baseBlockMetadata);
        ItemStack output = new ItemStack(leverBlock, 1, 0);
        ItemStack stick = new ItemStack(Items.STICK, 1);

        GameRegistry.addShapedRecipe(output, "S", "I", 'I', input, 'S', stick);

        IgneousExtrasMod.REGISTERED_RECIPES += 1;
    }

    /**
     * Registers all dye variant recipes for a single input {@link Block}
     *
     * @param blockToConsume The {@link Block} to consume
     * @param blockToReturn The {@link Block} to return
     *
     * @since 0.0.1
     */
    public static void registerSingleDyeBlockRecipeCombination(Block blockToConsume, Block blockToReturn) {
        registerSingleDyeBlockRecipeCombination(blockToConsume, 0, blockToReturn);
    }

    /**
     * Registers all dye variant recipes for a single input {@link Block}
     *
     * @param blockToConsume The {@link Block} to consume
     * @param consumptionMetadata The metadata of the block being consumed
     * @param blockToReturn The {@link Block} to return
     *
     * @since 0.0.1
     */
    public static void registerSingleDyeBlockRecipeCombination(Block blockToConsume, int consumptionMetadata, Block blockToReturn) {
        ItemStack dye;
        ItemStack water = new ItemStack(Items.WATER_BUCKET, 1);
        for (EnumDyeColor color : EnumDyeColor.values()) {
            dye = new ItemStack(Items.DYE, 1, color.getDyeDamage());

            ItemStack input = new ItemStack(blockToConsume, 1, consumptionMetadata);
            ItemStack output = new ItemStack(blockToReturn, 8, color.getMetadata());

            GameRegistry.addShapedRecipe(output, "III", "IDI", "III", 'I', input, 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(blockToConsume, 8, consumptionMetadata),
                                         "OOO", "OWO", "OOO",
                                         'W', water, 'O', new ItemStack(blockToReturn, 1, color.getMetadata()));


            IgneousExtrasMod.REGISTERED_RECIPES += 2;
        }
    }

    /**
     * Registers a simple {@link Block}
     *
     * TODO Add more variants as needed
     *
     * @param block The {@link Block} to register
     * @since 0.0.2
     */
    public static void registerSimpleBlock(Block block) {
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));

        IgneousExtrasMod.REGISTERED_BLOCKS += 1;
    }

    /**
     * Registers a number of simple {@link Block}s
     *
     * @param blocks The {@link Block}s to register
     * @since 0.0.2
     */
    public static void registerSimpleBlocks(Block... blocks) {
        for (Block block : blocks) {
            registerSimpleBlock(block);
        }
    }

    /**
     * Registers a colored {@link Block}
     *
     * @param block The {@link Block} to register
     * @since 0.0.2
     */
    public static void registerColoredBlock(Block block) {
        GameRegistry.register(block);
        GameRegistry.register(new ItemColoredBlock(block).setRegistryName(block.getRegistryName()));

        IgneousExtrasMod.REGISTERED_BLOCKS += 1;
    }

    /**
     * Registers a number of colored {@link Block}s
     *
     * @param blocks The {@link Block}s to register
     * @since 0.0.2
     */
    public static void registerColoredBlocks(Block... blocks) {
        for (Block block : blocks) {
            registerColoredBlock(block);
        }
    }

}
