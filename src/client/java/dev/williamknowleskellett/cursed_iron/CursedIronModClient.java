package dev.williamknowleskellett.cursed_iron;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ClientModInitializer;

public class CursedIronModClient implements ClientModInitializer{

    public static final Logger LOGGER = LoggerFactory.getLogger("cursed_iron");

    @Override
    public void onInitializeClient() {
        LOGGER.info("SPEOIURSEGPOESGR!");    
    }
    
}
