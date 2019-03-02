package com.dinoethan.theprimevalmod.blocks.fence;

import com.dinoethan.theprimevalmod.main;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockFenceGateBase extends BlockFenceGate { //implements DefaultRenderedItem {

    public BlockFenceGateBase(String name) {
        super(BlockPlanks.EnumType.OAK);
        this.setCreativeTab(main.primevaltab);
        this.setTranslationKey(name);
        this.setRegistryName(name);
        this.setHardness(2.0F);
        this.setResistance(5.0F);
        this.setSoundType(SoundType.WOOD);
    }

    private void setTranslationKey(String name) {
		
	}

	@Override
    public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) {
        return true;
    }

	//@Override
	//public String getResource(ResourceLocation registryName) {
	//	return null;
	//}
}

    