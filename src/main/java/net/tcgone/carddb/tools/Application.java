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

import net.tcgone.carddb.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author axpendix@hotmail.com
 */
@SpringBootApplication(scanBasePackages = "net.tcgone.carddb")
public class Application implements ApplicationRunner {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		System.setProperty("java.net.useSystemProxies","true");
		System.setProperty("http.agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.7 (KHTML, like Gecko) Chrome/16.0.912.75 Safari/535.7");
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private PioReader pioReader;
	@Autowired
	private SetWriter setWriter;
	@Autowired
	private ScanDownloader scanDownloader;

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
		boolean downloadScans = args.getOptionValues("download-scans")!=null;
		if(!exportImplTmpl&&!exportYaml&&!downloadScans){
			printUsage();
			return;
		}
		List<Card> allCards=new ArrayList<>();
		if(pios!=null){
			for (String filename : pios) {
				log.info("Reading {}", filename);
				allCards.addAll(pioReader.loadPio(new FileInputStream(filename), PioReader.ReaderMode.PIO));
			}
		}
		if(kirbies!=null){
			for (String filename : kirbies) {
				log.info("Reading {}", filename);
				allCards.addAll(pioReader.loadPio(new FileInputStream(filename), PioReader.ReaderMode.KIRBY));
			}
		}
		if(downloadScans){
			scanDownloader.downloadAll(allCards);
		}
		if(exportImplTmpl){
			log.warn("export-impl-tmpl not implemented yet");
		}
		if(exportYaml){
			setWriter.writeAll(allCards);
			log.info("YAMLs have been written to ./output folder");
		}
	}

	private void printUsage() {
		System.out.println("This tool loads and converts pio/kirby format Pokemon TCG data into TCG ONE Card Database format and/or TCG ONE Card Implementation Groovy Template. \n" +
				"Load pio files (https://github.com/PokemonTCG/pokemon-tcg-data/tree/master/json/cards) by; \n" +
				"\t--pio 'Unbroken Bonds.json' --pio 'Detective Pikachu.json' and so on. Multiple files can be loaded this way.\n" +
				"and/or load kirby files (https://github.com/kirbyUK/ptcgo-data/tree/master/en_US) by; \n" +
				"\t--kirby 'sm9.json' --kirby 'det1.json' and so on. Multiple files can be loaded this way.\n" +
				"then, export to yaml or impl-tmpl;\n" +
				"\t--export-yaml --export-impl-tmpl\n" +
				"and/or download scans;\n" +
				"\t--download-scans");
	}
}
