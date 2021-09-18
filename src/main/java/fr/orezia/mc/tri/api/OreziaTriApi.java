package fr.orezia.mc.tri.api;

import fr.orezia.mc.core.api.OreziaPluginApi;
import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.tri.api.entity.Filter;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Entry point for the OreziaTri plugin.
 *
 * @since 1.0
 */
@PublicApi
public interface OreziaTriApi extends OreziaPluginApi {

  /**
   * Gets the filter of the given inventory (if there is one).
   *
   * @param inventory The inventory
   * @return the optional filter of the given inventory
   */
  @PublicApi
  @Contract(value = "_ -> new", pure = true)
  @NotNull Optional<Filter> getFilter(final @NotNull Inventory inventory);

  /**
   * Gets the blacklist of the player corresponding to the given unique ID.
   *
   * @param uniqueId The player's unique ID
   * @return the blacklist of the player
   */
  @PublicApi
  @Contract(value = "_ -> new", pure = true)
  @NotNull Optional<@NotNull List<@NotNull ItemStack>> getPlayerBlacklist(
      final @NotNull UUID uniqueId);

  /**
   * Returns whether the given item can be placed in the given inventory or not, only considering
   * the eventual filter linked to this inventory.
   *
   * @param item      The item
   * @param inventory The inventory
   * @return {@code true} if the filter doesn't prevent the item to be placed in the inventory,
   * {@code false} otherwise.
   */
  @PublicApi
  @Contract(pure = true)
  boolean isItemAllowedInInventory(final @NotNull ItemStack item,
      final @NotNull Inventory inventory);

}
