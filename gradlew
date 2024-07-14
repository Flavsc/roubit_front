#!/bin/bash
set -e
export TERM=dumb
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
"$SCRIPT_DIR"/gradle/bin/gradle "$@"
