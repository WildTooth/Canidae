package com.github.wildtooth.canidae.core;

import net.labymod.api.addon.LabyAddon;

public class CanidaeAddon extends LabyAddon<CanidaeConfiguration> {

  @Override
  protected void enable() {
    this.registerSettingCategory();

    this.logger().info("Enabled the Addon");
  }

  @Override
  protected Class<CanidaeConfiguration> configurationClass() {
    return CanidaeConfiguration.class;
  }
}