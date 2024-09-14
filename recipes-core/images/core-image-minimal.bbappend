IMAGE_FEATURES_REPLACES_ssh-server-openssh = "ssh-server-dropbear"
IMAGE_FEATURES:append = "ssh-server-openssh"

IMAGE_INSTALL += "devmem2 rsync mosquitto libmosquitto1"
IMAGE_INSTALL += "python3 python3-pip"
IMAGE_INSTALL += "libgpiod libgpiod-tools"
IMAGE_INSTALL += "usbutils"
