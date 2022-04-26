# Recipe-ml56-touchkey-for-MA35D1
ML56 Touchkey for MA35D1

This recipe will add ml56-touchkey.ko to MA35D1 root file system and auto insert

1. git clone this recipe to meta-ma35d1 recipe-supports
2. Add ml56-touchkey to conf/local.conf IMAGE_INSTALL_append
3. Modify your device tree
4. bitbake your image

The ml56-touchkey.ko will locate at /lib/modules/5.4.181/extra
ml56-touchkey will be inserted when booting
