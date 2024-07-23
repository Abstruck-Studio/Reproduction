package org.abstruck.reproduction.event;

import org.abstruck.reproduction.gui.ReproductionGUI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * @author Astrack
 */
public class GUIEventHandler implements Listener {
    @EventHandler
    public void onGuiItemClick(InventoryClickEvent e){
        if (!e.getWhoClicked().getOpenInventory().getTitle().equals(ReproductionGUI.TITLE)){
            return;
        }

    }
}
