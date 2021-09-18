package fr.orezia.mc.tri.api.entity;

import static java.util.Objects.nonNull;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.List;
import java.util.Objects;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Filter class.
 *
 * @since 1.0
 */
@PublicApi
public record Filter(@NotNull Location location, @NotNull List<@NotNull ItemStack> items,
                     boolean strictness) {

  /**
   * {@inheritDoc}
   */
  @Override
  @Contract(value = "null -> false", pure = true)
  public boolean equals(final @Nullable Object that) {
    return this == that || nonNull(that) && Filter.class == that.getClass()
        && location.equals(((Filter) that).location);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @Contract(pure = true)
  public int hashCode() {
    return Objects.hash(location);
  }

}
