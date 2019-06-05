/*
Copyright 2018 axpendix@hotmail.com

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package net.tcgone.carddb.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication(scanBasePackages = "net.tcgone.carddb")
public class Application implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private PioReader pioReader;
	@Autowired
	private SetWriter setWriter;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<String> pios = args.getOptionValues("pio");
		List<String> kirbies = args.getOptionValues("kirby");
		if((pios==null||pios.isEmpty())&&(kirbies==null||kirbies.isEmpty())){
			printUsage();
			return;
		}
		boolean exportYaml = args.getOptionValues("export-yaml")!=null;
		boolean exportImplTmpl = args.getOptionValues("export-impl-tmpl")!=null;
		if(!exportImplTmpl&&!exportYaml){
			printUsage();
			return;
		}

//		// run below to merge all from pio to ones in db
//		pioReader.init();
//		// then overwrite yamls here
//		setWriter.writeAllMerged();
	}

	private void printUsage() {
		System.out.println("This tool loads and converts pio/kirby format Pokemon TCG data into TCG ONE Card Database format and/or TCG ONE Card Implementation Groovy Template. \n" +
				"Load pio files (https://github.com/PokemonTCG/pokemon-tcg-data/tree/master/json/cards) by; \n" +
				"\t--pio 'Unbroken Bonds.json' --pio 'Detective Pikachu.json' and so on. Multiple files can be loaded this way.\n" +
				"and/or load kirby files (https://github.com/kirbyUK/ptcgo-data/tree/master/en_US) by; \n" +
				"\t--kirby 'sm9.json' --kirby 'det1.json' and so on. Multiple files can be loaded this way.\n" +
				"then, export to yaml or impl-tmpl;\n" +
				"\t--export-yaml --export-impl-tmpl\n");
	}
}
