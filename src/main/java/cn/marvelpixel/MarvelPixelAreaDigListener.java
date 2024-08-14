package cn.marvelpixel;

import org.apache.commons.lang.StringUtils;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.StringUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class MarvelPixelAreaDigListener implements Listener {
    @EventHandler
    public void BlockBreak(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
        int x = block.getX();
        int y = block.getY();
        int z = block.getZ();
        ItemStack item = player.getItemInHand();
        String[] lore = item.getLore().toArray(new String[0]);
        Arrays.sort(lore);
        int num = Arrays.binarySearch(lore,"爆破之镐1");
        num = Arrays.binarySearch(lore,"爆破之镐2");
        num = Arrays.binarySearch(lore, "爆破之镐3");
        num = Arrays.binarySearch(lore,"爆破之镐4");
        num = Arrays.binarySearch(lore,"爆破之镐5");
        String level = StringUtils.substringAfterLast(lore[num],"镐");
        int l = (int) level.charAt(0);

    }
}
