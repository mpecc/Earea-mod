package cxo.earea.axoc;

import cxo.earea.block.SiliconOre;
import cxo.earea.item.Sewc;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Wcc1 {
	public static void init()	//在所有Mod初始化之前调用，这时候应该加载配置文件，实例化物品和方块，并注册它们。
	{
		
		ForgeRegistries.ITEMS.register(new Sewc().setRegistryName("CPU"));
		
    	ForgeRegistries.BLOCKS.register(new SiliconOre().setRegistryName("siliconore"));
    	

	}
}
