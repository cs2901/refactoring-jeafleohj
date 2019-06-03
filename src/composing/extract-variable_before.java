void renderBanner() {
    final boolean is_mac = (platform.toUpperCase().indexOf("MAC") > -1);
    final boolean is_ie = (browser.toUpperCase().indexOf("IE") > -1);
  if ( is_mac && is_ie &&
        wasInitialized() && resize > 0 )
  {
    // do something
  }
}