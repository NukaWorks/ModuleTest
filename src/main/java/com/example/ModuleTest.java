package com.example;

import org.nutdevs.modularkit.core.ModularModule;
import org.nutdevs.modularkit.core.ex.ModUuidEx;

/**
 * A simple ModularKit external module called "TestModule".
 */
public class ModuleTest extends ModularModule {
    public ModuleTest() throws ModUuidEx {
        // simple constructor for create a valid ModularModule.

        super("ModuleTest", "758ad8e8", "Sundev79", "0.0.1");

         /*
            - Found a good name
            - Go to https://uuidgenerator.net or run uuidgen on *nix systems and copy the first group of the uuid.
            - Enjoy !
         */
    }

    /**
     * the runEvent(), called on the module is started (enabled).
     */
    @Override
    public void runEvent() {
        System.out.println("Hello " + this.getModuleName() + " !");
    }
}
