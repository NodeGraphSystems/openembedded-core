SUMMARY = "Babeltrace - Trace Format Babel Tower"
DESCRIPTION = "Babeltrace provides trace read and write libraries in host side, as well as a trace converter, which used to convert LTTng 2.0 traces into human-readable log."
HOMEPAGE = "http://www.efficios.com/babeltrace/"
BUGTRACKER = "https://bugs.lttng.org/projects/babeltrace"

LICENSE = "MIT & GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=76ba15dd76a248e1dd526bca0e2125fa"

DEPENDS = "glib-2.0 util-linux popt bison-native flex-native"

inherit autotools pkgconfig

SRC_URI = "git://git.linuxfoundation.org/diamon/babeltrace.git;branch=stable-1.5 \
"

EXTRA_OECONF = "--disable-debug-info"

S = "${WORKDIR}/git"
SRCREV = "d68a4daf85c73ab7d7070de0c98d0c170af4758e"
