# java-cli-maven-ssl-postgres-flyway-join

## Description
Creates a small database table
called `dog`. This table, `dog`, has been normalized to 3NF.
Two new tables have been added, `breedLookup` and `colorLookup`.
Creates a new table `dog_expanded` that joins
`dog`, `breedLookup` and `colorLookup`. All output normally
seen in a terminal will be in `java-srv/log` which will dump to the screen. The project may seem to hang but the logs from the container must be written to the project this can take up to 3 min.

Uses flyway migration tool to augment
the schema.

Uses self-sign ssl.

## Tech stack
- java
- maven
  - flyway
  - log4j
  - postgres driver

## Docker stack
- alpine:edge
- maven:3-openjdk-17
- postgres:alpine

## To run
`sudo ./install.sh -u`
Creates java-srv/log

## To stop
`sudo ./install.sh -d`
Removes java-srv/log

## For help
`sudo ./install.sh -h`

## Credit
- [Java code based on](https://github.com/htorun/dbtableprinter)
- [Flyway serviced based on](https://www.baeldung.com/database-migrations-with-flyway)

## java-cli specific search
- [Search by maven](https://github.com/bearddan2000?tab=repositories&q=java-cli-maven&type=&language=&sort=)
- [Search by postgres](https://github.com/bearddan2000?tab=repositories&q=java-cli-postgres&type=&language=&sort=)
- [Search by flyway](https://github.com/bearddan2000?tab=repositories&q=java-cli-flyway&type=&language=&sort=)
- [Search by join](https://github.com/bearddan2000?tab=repositories&q=java-cli-join&type=&language=&sort=)
- [Search by log4j](https://github.com/bearddan2000?tab=repositories&q=java-cli-log4j&type=&language=&sort=)
- [Search by driver](https://github.com/bearddan2000?tab=repositories&q=java-cli-driver&type=&language=&sort=)

## General search
- [Search by java](https://github.com/bearddan2000?tab=repositories&q=java&type=&language=&sort=)
- [Search by cli](https://github.com/bearddan2000?tab=repositories&q=cli&type=&language=&sort=)
- [Search by maven](https://github.com/bearddan2000?tab=repositories&q=maven&type=&language=&sort=)
- [Search by postgres](https://github.com/bearddan2000?tab=repositories&q=postgres&type=&language=&sort=)
- [Search by flyway](https://github.com/bearddan2000?tab=repositories&q=flyway&type=&language=&sort=)
- [Search by join](https://github.com/bearddan2000?tab=repositories&q=join&type=&language=&sort=)
- [Search by log4j](https://github.com/bearddan2000?tab=repositories&q=log4j&type=&language=&sort=)
- [Search by driver](https://github.com/bearddan2000?tab=repositories&q=driver&type=&language=&sort=)
