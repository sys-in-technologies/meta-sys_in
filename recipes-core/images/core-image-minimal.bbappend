IMAGE_FEATURES_REPLACES_ssh-server-openssh = "ssh-server-dropbear"
IMAGE_FEATURES:append = "ssh-server-openssh"

IMAGE_INSTALL += "devmem2 rsync mosquitto libmosquitto1"
IMAGE_INSTALL += "python3 python3-pip python3-modules python3-paho-mqtt python3-spidev"
IMAGE_INSTALL += "python3-gpiod python3-supervisor"
IMAGE_INSTALL += "libgpiod libgpiod-tools"
IMAGE_INSTALL += "usbutils ppp"
IMAGE_INSTALL += "ntp"
