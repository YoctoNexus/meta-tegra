L4T_DEB_COPYRIGHT_MD5 = "8dc9729e1dc38aac4adb4bd6f6e3b370"

require tegra-debian-libraries-common.inc

LICENSE += "& Apache-2.0"
LIC_FILES_CHKSUM += "file://usr/share/doc/nvidia-tegra/LICENSE.tegra_sensors;md5=e7fe81c64aaee40b3d9e5b11c3e0ea58"

MAINSUM = "06e58e0decd9af534b3eeb23958ff9cb95d61079f2af443ec3908957a2d7e82b"

TEGRA_LIBRARIES_TO_INSTALL = "\
    nvidia/libnvcolorutil.so \
    nvidia/libnvdc.so \
    nvidia/libnvddk_2d_v2.so \
    nvidia/libnvddk_vic.so \
    nvidia/libnvdla_runtime.so \
    nvidia/libnvidia-rmapi-tegra.so.${L4T_LIB_VERSION} \
    nvidia/libnvidia-tls.so.${L4T_LIB_VERSION} \
    nvidia/libnvimp.so \
    nvidia/libnvisp_utils.so \
    nvidia/libnvos.so \
    nvidia/libnvphs.so \
    nvidia/libnvpva.so \
    nvidia/libnvpva_algorithms.so \
    nvidia/libnvpvaumd.so \
    nvidia/libnvrm_chip.so \
    nvidia/libnvrm_gpu.so \
    nvidia/libnvrm_host1x.so \
    nvidia/libnvrm_mem.so \
    nvidia/libnvrm_stream.so \
    nvidia/libnvrm_surface.so \
    nvidia/libnvrm_sync.so \
    nvidia/libnvsciipc.so \
    nvidia/libnvsocsys.so \
    nvidia/libnvtegrahv.so \
    nvidia/libnvvic.so \
    nvidia/libsensors.hal-client.nvs.so \
    nvidia/libsensors.l4t.no_fusion.nvs.so \
    nvidia/libsensors_hal.nvs.so \
"

FILES_SOLIBSDEV = ""
SOLIBS = ".so*"
RRECOMMENDS:${PN} = "kernel-module-nvgpu"
