package net.playminecraft.enderblock;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EBLogger {

    public static final Logger log = Logger.getLogger("Minecraft");

    public static void severe(String string, Exception ex) {
        log.log(Level.SEVERE, "[EnderBlock] " + string, ex);

    }

    public static void severe(String string) {
        log.log(Level.SEVERE, "[EnderBlock] " + string);
    }

    public static void info(String string) {
        log.log(Level.INFO, "[EnderBlock] " + string);
    }

    public static void warning(String string) {
        log.log(Level.WARNING, "[EnderBlock] " + string);
    }
}
