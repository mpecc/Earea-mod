package cxo.earea;

import cxo.earea.axoc.Wcc1;
import cxo.earea.axoc.Wcc2;
import cxo.earea.block.SiliconOre;
import cxo.earea.item.Sewc;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Earea.MODID, version = Earea.VERSION, name = Earea.VERSION)
public class Earea
{
	public static final String MODID = "earea";
	public static final String NAME = "Earea MOD";
	public static final String VERSION = "1.0";
//����������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
    	Wcc1.init();	//������Mod��ʼ��֮ǰ���ã���ʱ��Ӧ�ü��������ļ���ʵ������Ʒ�ͷ��飬��ע�����ǡ�
    }
    @EventHandler
    public void init(FMLInitializationEvent event) 
    {
    	Wcc2.init();	//���ڸ�Mod�ĳ�ʼ������ʱ��Ӧ��ΪMod�������ã���ע��ϳɱ������ϵͳ������������Mod���ͽ�����Ϣ��
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	//������Mod����ʼ��֮����ã���ʱ��Ӧ�ý�������Mod���͵Ľ�����Ϣ������ɶ�Mod�����á�
    }
}
