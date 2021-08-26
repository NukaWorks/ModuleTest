package com.example;

import org.nutdevs.modularkit.core.ModularSource;
import org.nutdevs.modularkit.core.ex.ModRegisterEx;
import org.nutdevs.modularkit.core.ex.ModUuidEx;

import java.io.File;

public class Main {

    public static void main(String[] args) throws ModUuidEx, ModRegisterEx {
        ModularSource source = new ModularSource("98195aa7", new File("C:\\Users\\sunde\\Desktop\\NutDevs.org\\Projects\\ModuleTest\\Mods"));
        // No need to register - external modules will be auto-registered
        source.getModuleManager().runModule(source.getModuleManager().findModuleByUuiD("758ad8e8")); // Find and run the module
    }
}
