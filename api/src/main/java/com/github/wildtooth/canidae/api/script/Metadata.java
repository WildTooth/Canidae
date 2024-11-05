package com.github.wildtooth.canidae.api.script;

public interface Metadata {

  /**
   * The name of the script.
   * @return the name of the script
   */
  String getName();

  /**
   * The version of the script.
   * @return the version of the script
   */
  String getVersion();

  /**
   * The author of the script.
   * @return the author of the script
   */
  String getAuthor();

  /**
   * Whether the script is relying only on Canidae, not an expansion.
   * Conventions for this are not yet established.
   * @return true if the script is not using expansions
   */
  Boolean isNotPackMember();

}
