package my.krbmod.letsmodreboot;

import my.krbmod.letsmodreboot.handler.ConfigurationHandler;
import my.krbmod.letsmodreboot.proxy.IProxy;
import my.krbmod.letsmodreboot.reference.Reference;
import my.krbmod.letsmodreboot.utility.LogHelper;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS) 
public class LetsModReboot {

	   
	   @Instance(Reference.MOD_ID)
	   public static LetsModReboot instance;

	   @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, 
			   serverSide = Reference.SERVER_PROXY_CLASS)
	   public static IProxy proxy;
	   
	   @EventHandler
	   public void preInit(FMLPreInitializationEvent event)
	  
	    {
			ConfigurationHandler.init(event.getSuggestedConfigurationFile());
			FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
			LogHelper.info("Pre Initialization Complete");
	    }
	   

	   @EventHandler
	   public void init(FMLInitializationEvent event)
	   {
			LogHelper.info("Initialization Complete");

	   }

	   @EventHandler
	   public void postInit(FMLPostInitializationEvent event)
	   {
			LogHelper.info("Post Initialization Complete");

	   }

	   
}
