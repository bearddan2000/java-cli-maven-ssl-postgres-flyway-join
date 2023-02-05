#!/usr/bin/env bash

# A simple bash script to shorted docker CMD
# also allows for variables

FLYWAY_CONFIG="myFlywayConfig.conf"
FLYWAY_ARG="-Dflyway.configFiles=${FLYWAY_CONFIG}"

mvn flyway:clean $FLYWAY_ARG
mvn flyway:baseline $FLYWAY_ARG
mvn flyway:migrate $FLYWAY_ARG
mvn flyway:info $FLYWAY_ARG
