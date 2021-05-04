package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import de.appgewaltig.disk_space.DiskSpacePlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    DiskSpacePlugin.registerWith(registry.registrarFor("de.appgewaltig.disk_space.DiskSpacePlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
