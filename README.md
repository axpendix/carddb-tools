# carddb-tools

This project has some toolset to add/update cards to TCG ONE card database and card implementations.

## Features

- Reading from [pokemontcg.io](https://github.com/PokemonTCG/pokemon-tcg-data/tree/master/json/cards) or [Kirby's format (preferred)]((https://github.com/kirbyUK/ptcgo-data/tree/master/en_US))
- Downloading scans
- Generating [TCG ONE Card Database YAML files](https://gitlab.com/tcgone/carddb/tree/master/src/main/resources/cards)
- Generating [TCG ONE Engine Implementation Groovy Files](https://gitlab.com/tcgone/engine-card-impl/tree/master/src/tcgwars/logic/impl)
- Reading from [TCG ONE Card Database YAML files](https://gitlab.com/tcgone/carddb/tree/master/src/main/resources/cards)

## Instructions

1. Build it: `./mvnw package`
2. View options: `java -jar target/carddb-tools-*.jar`
3. Read from [kirby's repo](https://github.com/kirbyUK/ptcgo-data/tree/master/en_US), convert to yaml and implementation templates: `java -jar target/carddb-tools-*.jar "--pio=../ptcgo-data/en_US/sm10.json" "--pio=../ptcgo-data/en_US/det1.json" --export-yaml --export-impl-tmpl`
4. Download scans: `java -jar target/carddb-tools-*.jar "--pio=../ptcgo-data/en_US/sm10.json" "--pio=../ptcgo-data/en_US/det1.json" --download-scans`

