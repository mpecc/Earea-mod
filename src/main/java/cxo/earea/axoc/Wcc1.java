package cxo.earea.axoc;

import cxo.earea.block.SiliconOre;
import cxo.earea.item.Sewc;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Wcc1 {
	public static void init()	//������Mod��ʼ��֮ǰ���ã���ʱ��Ӧ�ü��������ļ���ʵ������Ʒ�ͷ��飬��ע�����ǡ�
	{
		
		ForgeRegistries.ITEMS.register(new Sewc().setRegistryName("CPU"));
		
    	ForgeRegistries.BLOCKS.register(new SiliconOre().setRegistryName("siliconore"));
    	

	}
}
