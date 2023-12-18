package net.jericko.accessories.item;

import net.jericko.accessories.Accessories;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Accessories.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab ACCESSORY_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        ACCESSORY_TAB = event.registerCreativeModeTab(new ResourceLocation(Accessories.MOD_ID, "accessory_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.TEST_ITEM.get()))
                        .title(Component.translatable("creativemodetab.accessory_tab")));

    }
}
