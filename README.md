# carddb-tools

This project has some toolset to add/update cards to TCG ONE card database and card implementations.

## Features

- Reading from [pokemontcg.io](https://github.com/PokemonTCG/pokemon-tcg-data/tree/master/json/cards) or [Kirby's format (preferred)]((https://github.com/kirbyUK/ptcgo-data/tree/master/en_US))
- Downloading scans
- Generating [TCG ONE Card Database YAML files](https://gitlab.com/tcgone/carddb/tree/master/src/main/resources/cards)
- Generating [TCG ONE Engine Implementation Groovy Files](https://gitlab.com/tcgone/engine-card-impl/tree/master/src/tcgwars/logic/impl)
- Reading from [TCG ONE Card Database YAML files](https://gitlab.com/tcgone/carddb/tree/master/src/main/resources/cards)

## Instructions

1. Clone repo <https://github.com/axpendix/carddb>, then run `./mvnw install` in that repo. You only need to do this once, until we move to a public maven repository.
1. Clone THIS repo and run: `./mvnw package`
1. View options: `java -jar target/carddb-tools-*.jar`
1. Read from [kirby's repo](https://github.com/kirbyUK/ptcgo-data/tree/master/en_US), convert to yaml and implementation templates: `java -jar target/carddb-tools-*.jar "--pio=../ptcgo-data/en_US/sm10.json" "--pio=../ptcgo-data/en_US/det1.json" --export-yaml --export-impl-tmpl`
1. Download scans: `java -jar target/carddb-tools-*.jar "--pio=../ptcgo-data/en_US/sm10.json" "--pio=../ptcgo-data/en_US/det1.json" --download-scans`

