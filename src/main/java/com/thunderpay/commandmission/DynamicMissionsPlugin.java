package com.thunderpay.commandmission;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class DynamicMissionsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("DynamicMissionsPlugin has been enabled!");
        // Aquí puedes inicializar tu configuración y registrar eventos
    }

    @Override
    public void onDisable() {
        getLogger().info("DynamicMissionsPlugin has been disabled!");
        // Aquí puedes guardar datos o realizar acciones de limpieza al deshabilitar el plugin
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("mission")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("Este comando solo puede ser ejecutado por un jugador.");
                return true;
            }

            Player player = (Player) sender;

            // Aquí puedes implementar la lógica para generar y asignar misiones al jugador

            player.sendMessage("¡Has recibido una nueva misión!");
            return true;
        }
        return false;
    }
}
