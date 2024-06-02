DESCRIPTION = "Linux Kernel from git"
SECTION = "kernel"
LICENSE = "GPLv2"

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

SRC_URI:raft-ep-neon-va = "\
    git://github.com/sys-in-technologies/linux.git;name=machine;branch=${KBRANCH};protocol=https\
    "
SRCREV:raft-ep-neon-va = "${AUTOREV}"

LINUX_VERSION ?= "${PV}"
LINUX_VERSION_EXTENSION:append = "-custom"

S = "${WORKDIR}/linux-${PV}"
COMPATIBLE_MACHINE = "sun8i"
