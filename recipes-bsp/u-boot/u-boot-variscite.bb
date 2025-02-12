SUMMARY = "U-Boot for Variscite's i.MX boards"
require recipes-bsp/u-boot/u-boot.inc

inherit fsl-u-boot-localversion

LOCALVERSION_var-som-mx6 = "-mx6-jig"
LOCALVERSION_imx6ul-var-dart = "-mx6ul-jig"
LOCALVERSION_imx7-var-som = "-mx7-jig"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

PROVIDES += "u-boot"

SRCBRANCH_var-som-mx6 = "imx_v2015.04_4.1.15_1.1.0_ga_var03"
SRCBRANCH_imx6ul-var-dart = "imx_v2015.10_dart_6ul_var1"
SRCBRANCH_imx7-var-som = "imx_v2015.04_4.1.15_1.1.0_ga_var02"
UBOOT_SRC = "git://github.com/varjig/uboot-imx-jig.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(var-som-mx6|imx6ul-var-dart|imx7-var-som)"
