package me.sirimperivm.spigot.other;

import me.sirimperivm.spigot.Main;
import org.bukkit.enchantments.Enchantment;

@SuppressWarnings("all")
public class Enchants {

    private static Main plugin = Main.getPlugin();

    public static Enchantment getEnchant(String name) {
        Enchantment enchant = Enchantment.DURABILITY;

        if (name.equalsIgnoreCase("ARROW_DAMAGE")) {
            enchant = Enchantment.ARROW_DAMAGE;
        } else if (name.equalsIgnoreCase("ARROW_FIRE")) {
            enchant = Enchantment.ARROW_FIRE;
        } else if (name.equalsIgnoreCase("ARROW_INFINITE")) {
            enchant = Enchantment.ARROW_INFINITE;
        } else if (name.equalsIgnoreCase("ARROW_KNOCKBACK")) {
            enchant = Enchantment.ARROW_KNOCKBACK;
        } else if (name.equalsIgnoreCase("BINDING_CURSE")) {
            enchant = Enchantment.BINDING_CURSE;
        } else if (name.equalsIgnoreCase("CHANNELING")) {
            enchant = Enchantment.CHANNELING;
        } else if (name.equalsIgnoreCase("DAMAGE_ALL")) {
            enchant = Enchantment.DAMAGE_ALL;
        } else if (name.equalsIgnoreCase("DAMAGE_ARTHROPODS")) {
            enchant = Enchantment.DAMAGE_ARTHROPODS;
        } else if (name.equalsIgnoreCase("DAMAGE_UNDEAD")) {
            enchant = Enchantment.DAMAGE_UNDEAD;
        } else if (name.equalsIgnoreCase("DEPTH_STRIDER")) {
            enchant = Enchantment.DEPTH_STRIDER;
        } else if (name.equalsIgnoreCase("DIG_SPEED")) {
            enchant = Enchantment.DIG_SPEED;
        } else if (name.equalsIgnoreCase("FIRE_ASPECT")) {
            enchant = Enchantment.FIRE_ASPECT;
        } else if (name.equalsIgnoreCase("FROST_WALKER")) {
            enchant = Enchantment.FROST_WALKER;
        } else if (name.equalsIgnoreCase("IMPALING")) {
            enchant = Enchantment.IMPALING;
        } else if (name.equalsIgnoreCase("KNOCKBACK")) {
            enchant = Enchantment.KNOCKBACK;
        } else if (name.equalsIgnoreCase("LOOT_BONUS_BLOCKS")) {
            enchant = Enchantment.LOOT_BONUS_BLOCKS;
        } else if (name.equalsIgnoreCase("LOOT_BONUS_MOBS")) {
            enchant = Enchantment.LOOT_BONUS_MOBS;
        } else if (name.equalsIgnoreCase("LOYALTY")) {
            enchant = Enchantment.LOYALTY;
        } else if (name.equalsIgnoreCase("LUCK")) {
            enchant = Enchantment.LUCK;
        } else if (name.equalsIgnoreCase("LURE")) {
            enchant = Enchantment.LURE;
        } else if (name.equalsIgnoreCase("MENDING")) {
            enchant = Enchantment.MENDING;
        } else if (name.equalsIgnoreCase("MULTISHOT")) {
            enchant = Enchantment.MULTISHOT;
        } else if (name.equalsIgnoreCase("OXYGEN")) {
            enchant = Enchantment.OXYGEN;
        } else if (name.equalsIgnoreCase("PIERCING")) {
            enchant = Enchantment.PIERCING;
        } else if (name.equalsIgnoreCase("PROTECTION_ENVIRONMENTAL")) {
            enchant = Enchantment.PROTECTION_ENVIRONMENTAL;
        } else if (name.equalsIgnoreCase("PROTECTION_EXPLOSIONS")) {
            enchant = Enchantment.PROTECTION_EXPLOSIONS;
        } else if (name.equalsIgnoreCase("PROTECTION_FALL")) {
            enchant = Enchantment.PROTECTION_FALL;
        } else if (name.equalsIgnoreCase("PROTECTION_FIRE")) {
            enchant = Enchantment.PROTECTION_FIRE;
        } else if (name.equalsIgnoreCase("PROTECTION_PROJECTILE")) {
            enchant = Enchantment.PROTECTION_PROJECTILE;
        } else if (name.equalsIgnoreCase("QUICK_CHARGE")) {
            enchant = Enchantment.QUICK_CHARGE;
        } else if (name.equalsIgnoreCase("RIPTIDE")) {
            enchant = Enchantment.RIPTIDE;
        } else if (name.equalsIgnoreCase("SILK_TOUCH")) {
            enchant = Enchantment.SILK_TOUCH;
        } else if (name.equalsIgnoreCase("SOUL_SPEED")) {
            enchant = Enchantment.SOUL_SPEED;
        } else if (name.equalsIgnoreCase("SWEEPING_EDGE")) {
            enchant = Enchantment.SWEEPING_EDGE;
        } else if (name.equalsIgnoreCase("SWIFT_SNEAK")) {
            enchant = Enchantment.SWIFT_SNEAK;
        } else if (name.equalsIgnoreCase("THORNS")) {
            enchant = Enchantment.THORNS;
        } else if (name.equalsIgnoreCase("VANISHING_CURSE")) {
            enchant = Enchantment.VANISHING_CURSE;
        } else if (name.equalsIgnoreCase("WATER_WORKER")) {
            enchant = Enchantment.WATER_WORKER;
        }

        return enchant;
    }
}
