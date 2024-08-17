DESCRIPTION = "Linux Kernel from git"
SECTION = "kernel"
LICENSE = "GPLv2"

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

FILESEXTRAPATHS:prepend := "{THISDIR}/${PN}:"

KBRANCH:raft-ep-neon-va = "sys_in-release"
SRC_URI:raft-ep-neon-va = "\
    git://git@gitlab.sys-in.com.cn/sys-in-technologies/linux.git;name=machine;branch=${KBRANCH};protocol=ssh\
    "
SRC_URI:raft-ep-neon-va += "file://ftrace.cfg"

SRCREV:raft-ep-neon-va = "${AUTOREV}"

LINUX_VERSION ?= "${PV}"
LINUX_VERSION_EXTENSION:append = "-custom"

S = "${WORKDIR}/git"
COMPATIBLE_MACHINE = "sun8i"
