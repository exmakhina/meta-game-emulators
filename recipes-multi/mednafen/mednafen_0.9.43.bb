SUMMARY = "Command-line-driven multi-system emulator using OpenGL and SDL"
HOMEPAGE = "http://mednafen.sourceforge.net/"
SECTION = "emulators"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6e233eda45c807aa29aeaa6d94bc48a2"

SRC_URI = "https://mednafen.github.io/releases/files/mednafen-0.9.43.tar.xz \
           file://fix_configure_errors.patch \
           file://fix_sdl_flags_error.patch \
           file://fix_cast_compiler_error.patch \
	   file://fix_overloaded_abs_error.patch \
          "

SRC_URI[md5sum] = "435376f484bdd7b5adf9820616d40a48"
SRC_URI[sha256sum] = "b8305914cdf297fe6483219fa10c3fa14116fff8eed02f61326a0e32dd350f4d"

S = "${WORKDIR}/mednafen"

# large file support was generating a cross-compiling issue where sizeof(off_t) was
# returning 64 instead of 32, so we are disabling it for now
EXTRA_OECONF += "--disable-largefile"

inherit autotools-brokensep gettext

DEPENDS = "libsdl jack libsndfile1"
