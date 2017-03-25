SUMMARY = "Multi-platform Atari 2600 VCS emulator"
HOMEPAGE = "http://stella.sourceforge.net/" 
SECTION = "emulators"

LICENSE = "GPLv2" 
LIC_FILES_CHKSUM = "file://License.txt;md5=878e3965c7b52d85827c75f5a2f3b314" 

SRC_URI = "https://github.com/stella-emu/stella/archive/release-3.9.3.tar.gz \
           file://cross_compile_support.patch"

SRC_URI[md5sum] = "ecd95b79f11556c2dc8afa060475045d"
SRC_URI[sha256sum] = "90f0718b5b580b23c133129e35d815b6f2a2f2ddad8140bed7d52cc9add8b8c1"

S = "${WORKDIR}/${PN}-release-${PV}"
DEPENDS = "libsdl zlib libpng"

FILES_${PN} += "${datadir}/icons"

inherit autotools-brokensep
