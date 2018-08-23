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
//██████████████████████████████████████████████████████████████████████████████████████████████████████████████
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
    	Wcc1.init();	//在所有Mod初始化之前调用，这时候应该加载配置文件，实例化物品和方块，并注册它们。
    }
    @EventHandler
    public void init(FMLInitializationEvent event) 
    {
    	Wcc2.init();	//用于该Mod的初始化，这时候应该为Mod进行设置，如注册合成表和烧炼系统，并且向其他Mod发送交互信息。
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	//在所有Mod都初始化之后调用，这时候应该接收其他Mod发送的交互信息，并完成对Mod的设置。
    }
}
