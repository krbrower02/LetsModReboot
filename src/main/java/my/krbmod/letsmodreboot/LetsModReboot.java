package my.krbmod.letsmodreboot;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LetsModReboot.MODID, name = LetsModReboot.NAME, version = LetsModReboot.VERSION) 
public class LetsModReboot {

	   public static final String MODID = "letsmodreboot";
	   public static final String NAME = "Lets Mod Reboot";
	   public static final String VERSION = "1.8.9-1.0";
	   
	   @Instance(MODID)
	   public static LetsModReboot instance;
	   
	   @EventHandler
	   public void init(FMLPreInitializationEvent event)
	  
	    {
			// some example code
		   // More Code
	    }
	   

	   @EventHandler
	   public void init(FMLInitializationEvent event)
	   {

	   }

	   @EventHandler
	   public void init(FMLPostInitializationEvent event)
	   {

	   }

	   
}
