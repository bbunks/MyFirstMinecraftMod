package com.nuiofrd.myfirstmod;

/**
 * Created by Nuiofrd on 10/21/2014.
 */

import com.nuiofrd.myfirstmod.refrence.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.nuiofrd.myfirstmod.proxy.IProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MyFirstMod {

    @Mod.Instance
    public static MyFirstMod instance;

    @SidedProxy(clientSide = "com.nuiofrd.myfirstmod.proxy.ClientProxy", serverSide = "com.nuiofrd.myfirstmod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
