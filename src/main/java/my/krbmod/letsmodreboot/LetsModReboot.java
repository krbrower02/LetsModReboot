package my.krbmod.letsmodreboot;

import my.krbmod.letsmodreboot.proxy.IProxy;
import my.krbmod.letsmodreboot.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION) 
public class LetsModReboot {

	   
	   @Instance(Reference.MOD_ID)
	   public static LetsModReboot instance;

	   @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, 
			   serverSide = Reference.SERVER_PROXY_CLASS)
	   public static IProxy proxy;
	   
	   @EventHandler
	   public void preInit(FMLPreInitializationEvent event)
	  
	    {
			// some example code
		   // More Code
	    }
	   

	   @EventHandler
	   public void init(FMLInitializationEvent event)
	   {

	   }

	   @EventHandler
	   public void postInit(FMLPostInitializationEvent event)
	   {

	   }

	   
}
