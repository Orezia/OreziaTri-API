package fr.orezia.mc.tri.api;

import fr.orezia.mc.core.api.annotation.PublicApi;
import org.jetbrains.annotations.NotNull;

/**
 * Entry point for plugin OreziaTri
 * @since 3.1
 */
@PublicApi
public interface OreziaTriApi {

  /**
   * Get the plugin name.
   *
   * @return The plugin name.
   */
  @PublicApi
  @NotNull String pluginName();

}
