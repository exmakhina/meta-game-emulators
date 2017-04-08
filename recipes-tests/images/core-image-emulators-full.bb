require core-image-emulators-base.bb

SUMMARY = "An image with all videogame emulators enabled"

LICENSE = "MIT" 

IMAGE_FEATURES += "splash package-management x11-base x11-sato ssh-server-openssh hwcodecs"

CORE_IMAGE_EXTRA_INSTALL += " \
    snes9x \
    snes9x-sdl \
    advancemame \
    stella \
    uae4all2 \
    mednafen \
    "

IMAGE_INSTALL += " \
    kodi \
    kodi-startup \
"
