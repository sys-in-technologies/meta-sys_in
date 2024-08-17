SRC_URI:raft-ep-neon-va = "git://git@gitlab.sys-in.com.cn/sys-in-technologies/u-boot.git;protocol=ssh;branch=sys-in-release"
SRCREV:raft-ep-neon-va = "${AUTOREV}" 

DEPENDS += "bc-native dtc-native python3-pyelftools-native"
