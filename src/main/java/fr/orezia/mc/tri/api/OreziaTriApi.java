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
   * Gets the {@link Filter filter} of the given {@link Inventory inventory} (if there is one).
   *
   * @param inventory the {@link Inventory inventory}
   * @return the optional {@link Filter filter} of the given {@link Inventory inventory}
   */
  @PublicApi
  @Contract(value = "_ -> new", pure = true)
  @NotNull Optional<Filter> getFilter(final @NotNull Inventory inventory);

  /**
   * Gets the blacklist of the player corresponding to the given unique ID.
   *
   * @param uniqueId the player's unique ID
   * @return the blacklist of the player
   */
  @PublicApi
  @Contract(value = "_ -> new", pure = true)
  @NotNull Optional<List<@NotNull ItemStack>> getPlayerBlacklist(final @NotNull UUID uniqueId);

  /**
   * Returns whether the given {@link ItemStack item} can be placed in the given {@link Inventory inventory} or not,
   * only considering the eventual {@link Filter filter} linked to this {@link Inventory inventory}.
   *
   * @param item      the {@link ItemStack item}
   * @param inventory the {@link Inventory inventory}
   * @return {@code true} if no {@link Filter filter} prevents the {@link ItemStack item} to be placed in the {@link
   * Inventory inventory}, {@code false} otherwise.
   */
  @PublicApi
  @Contract(pure = true)
  boolean isItemAllowedInInventory(final @NotNull ItemStack item, final @NotNull Inventory inventory);

}
