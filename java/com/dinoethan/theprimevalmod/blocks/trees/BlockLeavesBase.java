package com.dinoethan.theprimevalmod.blocks.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.dinoethan.theprimevalmod.main;
import com.dinoethan.theprimevalmod.init.ModBlocks;
import com.dinoethan.theprimevalmod.init.ModItems;
import com.dinoethan.theprimevalmod.util.IHasModel;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLeavesBase extends BlockLeaves implements IHasModel
{       
    public static String type;
    
    public BlockLeavesBase(String name) 
    {
        type = name.replaceAll("_leaves", "").trim();
        System.out.println(type);
        
        setUnlocalizedName(name);
        setRegistryName(name);
        setSoundType(SoundType.PLANT);
        setLightOpacity(1);
        setCreativeTab(main.primevaltab);
        setDefaultState(this.blockState.getBaseState().withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(true)));
                
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) 
    {
        if(type == "monkeypuzzle") return Item.getItemFromBlock(ModBlocks.MONKEYPUZZLE_SAPLING);
        else return Item.getItemFromBlock(ModBlocks.MONKEYPUZZLE_SAPLING);
    }
    
    @Override
    public int getMetaFromState(IBlockState state) 
    {
        int i = 0;
        if(!((Boolean)state.getValue(DECAYABLE)).booleanValue()) i |= 2;
        if(!((Boolean)state.getValue(CHECK_DECAY)).booleanValue()) i|= 4;
        return i;
    }
    
    @Override
    protected ItemStack getSilkTouchDrop(IBlockState state) 
    {
        return new ItemStack(this);
    }
    
    @Override
    protected int getSaplingDropChance(IBlockState state) {return 30;}
    
    @Override
    public EnumType getWoodType(int meta) {return null;}
    
    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) 
    {
        return NonNullList.withSize(1, new ItemStack(this));
    }
    
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return Blocks.LEAVES.isOpaqueCube(state);
    }
    
    @Override
    protected BlockStateContainer createBlockState() 
    {
        return new BlockStateContainer(this, new IProperty[] {CHECK_DECAY, DECAYABLE});
    }
    
    @Override
    public BlockRenderLayer getBlockLayer()
    {
        return Blocks.LEAVES.getBlockLayer();
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
        return Blocks.LEAVES.shouldSideBeRendered(state, world, pos, side);
    }
    
    @Override
    public void registerModels() 
    {
        main.proxy.registerModel(Item.getItemFromBlock(this), 0);
    }
    
    @Override
     public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
     {
      setDefaultState(this.blockState.getBaseState().withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(false)));
     }
}