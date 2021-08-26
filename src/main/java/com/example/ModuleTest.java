package com.example;

import org.nutdevs.modularkit.core.ModularModule;
import org.nutdevs.modularkit.core.ex.ModUuidEx;

public class ModuleTest extends ModularModule {
    public ModuleTest() throws ModUuidEx {
        super("ModuleTest", "758ad8e8", "Sundev79", "0.0.1");
    }

    @Override
    public void runEvent() {
        System.out.println("Hello " + this.getModuleName() + " !");
    }
}
