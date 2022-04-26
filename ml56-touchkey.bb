SUMMARY = "ml56-touchkey.ko for Wi-Fi module"
SECTION = "modules"
LICENSE = "CLOSED"

SRC_URI += " \
    file://ml56-touchkey.ko \
    "
do_package_qa[noexec] = "1"
do_install() {
    install -d ${D}/${base_libdir}/modules/${KV}
    install -m 0644 ${WORKDIR}/ml56-touchkey.ko ${D}/${base_libdir}/modules/${KV}/ml56-touchkey.ko
}

FILES_SOLIBSDEV = ""
FILES_${PN} = "${base_libdir}/modules/${KV}/ml56-touchkey.ko"
PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(ma35d1)"
