package Nero.Punch4Wool;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(Punch4Wool.MODID)
public class Punch4Wool {

    public static final String MODID = "p4w";
    public Punch4Wool() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        MinecraftForge.EVENT_BUS.register(SheepWoolEvent.class);
    }
    private void setup(final FMLCommonSetupEvent event) {
        // Код инициализации
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        // Межмодовая коммуникация
    }

    private void processIMC(final InterModProcessEvent event) {
        // Обработка межмодовой коммуникации
    }

}
