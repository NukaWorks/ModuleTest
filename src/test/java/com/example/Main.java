package com.example;

import org.nutdevs.modularkit.core.ModularSource;
import org.nutdevs.modularkit.core.ex.ModRegisterEx;
import org.nutdevs.modularkit.core.ex.ModSourceEx;
import org.nutdevs.modularkit.core.ex.ModUuidEx;

import java.io.File;

/**
 * A simple test class for boot the TestModule external module installed on the given directory.
 */
public class Main {

    public static void main(String[] args) {
        ModularSource source;
        try {
            source = new ModularSource("98195aa7", new File("/path/to/dir"), ".jar");
        } catch (ModUuidEx | ModSourceEx e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // No need to register - external modules will be auto-registered
        try {
            source.getModuleManager().runModule(source.getModuleManager().findModuleByUuiD("758ad8e8"));
        } catch (ModUuidEx | ModRegisterEx e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } // Find and run the module
    }
}
