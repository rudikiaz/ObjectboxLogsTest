# ObjectboxLogsTest
This repository is a simple test that reproduce the strange logs that appear on Objectbox when updating indexes like `[WARN ] Skipped low-level close of cursor (write, TX #3 alive)`


The content of the test reproduces the inserting of 100 Demo objects into its box

Just execute `gradlew test` and 200 logs will appear in format:
`[WARN ] Skipped low-level close of cursor (write, TX #103 alive)`
From 3 to 103, twice every number

If in the Demo class(Object box entity) is removed one of the `@Index` annotation, each number will only appear a single time (from 3 to 103)
so on, if all the `@Index` anotations are removed, no logs will appear.


