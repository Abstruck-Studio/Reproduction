package org.abstruck.reproduction.gui;

import com.pixelmonmod.pixelmon.api.events.pokemon.EVsGainedEvent;
import com.pixelmonmod.pixelmon.items.PixelmonItem;
import com.pixelmonmod.pixelmon.items.heldItems.ItemLuckyEgg;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Goulixiaoji
 */
public class ReproductionGUI {
    private static final ReproductionGUI INSTANCE = new ReproductionGUI();
    private static final int SIZE = 9 * 6;
    private static final ItemStack PLACEHOLDER = new ItemStack(Material.STAINED_GLASS_PANE);
    private static final ItemStack AIR = new ItemStack(Material.AIR);
    public static final Set<String> LUCKY_EGGS = new HashSet<>();
    public static final String TITLE = "宝可梦繁殖";
    public static final int PARENT_LOCAL_1 = 9 * 2 + 3 - 1;
    public static final int PARENT_LOCAL_2 = 9 * 2 + 7 - 1;

    static {

    }

    private ReproductionGUI(){
    }
    public static ReproductionGUI getInstance() {
        return INSTANCE;
    }

    public Inventory getInventory(Player player) {
        Inventory menu = Bukkit.createInventory(player, SIZE, TITLE);

        for (int i = 0; i < SIZE; i++){
            menu.setItem(i, PLACEHOLDER);
        }

        menu.setItem(PARENT_LOCAL_1, AIR);
        menu.setItem(PARENT_LOCAL_2, AIR);

        return menu;
    }

    public PixelmonItem onReproduction(Player player, Inventory menu) {
        ItemStack parent1 = menu.getItem(ReproductionGUI.PARENT_LOCAL_1);
        ItemStack parent2 = menu.getItem(ReproductionGUI.PARENT_LOCAL_2);
        parent2.getType().getId()
        if ()

    }

    private static void initLuckyEggs() {
        // 可以比较id的吗，不知道诶（（
        LUCKY_EGGS.add("pixelmon:master_ball");
        LUCKY_EGGS.add("pixelmon:friend_ball");
        LUCKY_EGGS.add()

    }

    private static void initPlaceholder(){
        ItemMeta itemMeta = PLACEHOLDER.getItemMeta();
        itemMeta.setDisplayName("");
        PLACEHOLDER.setItemMeta(itemMeta);
    }
}
