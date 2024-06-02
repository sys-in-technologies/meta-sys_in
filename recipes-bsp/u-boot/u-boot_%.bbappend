SRC_URI:raft-ep-neon-va = "git://github.com/sys-in-technologies/u-boot.git;protocol=https;branch=master"
SRCREV:raft-ep-neon-va = "${AUTOREV}" 

DEPENDS += "bc-native dtc-native python3-pyelftools-native"
