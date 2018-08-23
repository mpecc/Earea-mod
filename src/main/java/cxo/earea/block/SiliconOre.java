package cxo.earea.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class SiliconOre extends Block{
	public SiliconOre (){	
		super(Material.ROCK);

		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0F);
		
		
		
		
		
		
		
		
		
		
		

		/*setSoundType(SoundType.STONE);//表示方块踩上去的声音
		setHardness(50.0f);//表示方块硬度 黑曜石的硬度为50
		setHarvestLevel("pickaxe", 2);//pickaxe表示镐子（axe表示斧子 shovel表示铲子） 2表示铁镐以上才能挖掘（3-钻石 1-石 0-木/金）*/
		
						

	}
}
		
		

	
	
	
	

