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

import org.apache.commons.lang3.text.WordUtils;

/**
 * @author axpendix@hotmail.com
 */
public enum CoreCollection {

	//CLASSIC
	BASE_SET(111, "BS"),
	JUNGLE(112, "JU"),
	FOSSIL(113, "FO"),
	BASE_SET_2(114, "BS2"),
	TEAM_ROCKET(115, "TR"),

	//GYM
	GYM_HEROES(121, "G1"),
	GYM_CHALLENGE(122, "G2"),

	WIZARDS_BLACK_STAR_PROMOS(130, "WBSP"),
	VENDING_MACHINE(131, "VM"),
	SOUTHERN_ISLANDS(132, "SI"),
	LEGENDARY_COLLECTION(133, "LC"),

	//NEO
	NEO_GENESIS(161, "N1"),
	NEO_DISCOVERY(162, "N2"),
	NEO_REVELATION(163, "N3"),
	NEO_DESTINY(164, "N4"),

	//E-CARD
	EXPEDITION(171, "EXP"),
	AQUAPOLIS(172, "AQP"),
	SKYRIDGE(173, "SKR"),

	//EX
	RUBY_SAPPHIRE(211, "Ruby & Sapphire", "RS"),
	SANDSTORM(212, "SS"),
	DRAGON(213, "DR"),
	TEAM_MAGMA_VS_TEAM_AQUA(214, "Team Magma vs Team Aqua", "MA"),
	HIDDEN_LEGENDS(215, "HL"),
	FIRERED_LEAFGREEN(216, "FireRed & LeafGreen", "FRLG"),
	TEAM_ROCKET_RETURNS(217, "TRR"),
	DEOXYS(218, "DX"),
	EMERALD(219, "EM"),
	UNSEEN_FORCES(220, "UF"),
	DELTA_SPECIES(221, "DS"),
	LEGEND_MAKER(222, "LM"),
	HOLON_PHANTOMS(223, "HP"),
	CRYSTAL_GUARDIANS(224, "CG"),
	DRAGON_FRONTIERS(225, "DF"),
	POWER_KEEPERS(226, "PK"),

	//DIAMOND & PEARL
	DIAMOND_PEARL(251, "Diamond & Pearl", "DP"),
	MYSTERIOUS_TREASURES(252, "MT"),
	SECRET_WONDERS(253, "SW"),
	GREAT_ENCOUNTERS(254, "GE"),
	MAJESTIC_DAWN(255, "MD"),
	LEGENDS_AWAKENED(256, "LA"),
	STORMFRONT(257, "SF"),

	//PLATINUM
	PLATINUM(261, "PL"),
	RISING_RIVALS(262, "RR"),
	SUPREME_VICTORS(263, "SV"),
	ARCEUS(264, "AR"),

	//HEARTGOLD & SOULSILVER
	HEARTGOLD_SOULSILVER(271, "HeartGold & SoulSilver", "HGSS"),
	UNLEASHED(272, "UL"),
	UNDAUNTED(273, "UD"),
	TRIUMPHANT(274, "TM"),
	CALL_OF_LEGENDS(275, "Call of Legends", "CL"),

	POP_SERIES_1(281, "POP Series 1", "POP1"),
	POP_SERIES_2(282, "POP Series 2", "POP2"),
	POP_SERIES_3(283, "POP Series 3", "POP3"),
	POP_SERIES_4(284, "POP Series 4", "POP4"),
	POP_SERIES_5(285, "POP Series 5", "POP5"),
	POP_SERIES_6(286, "POP Series 6", "POP6"),
	POP_SERIES_7(287, "POP Series 7", "POP7"),
	POP_SERIES_8(288, "POP Series 8", "POP8"),
	POP_SERIES_9(289, "POP Series 9", "POP9"),

	//BLACK & WHITE
	BLACK_WHITE_PROMOS(310, "Black & White Promos", "BLWP"),
	BLACK_WHITE(311, "Black & White", "BLW"),
	EMERGING_POWERS(312, "EPO"),
	NOBLE_VICTORIES(313, "NVI"),
	NEXT_DESTINIES(314, "NXD"),
	DARK_EXPLORERS(315, "DEX"),
	DRAGONS_EXALTED(316, "DRX"),
	DRAGON_VAULT(317, "DRV"),
	BOUNDARIES_CROSSED(318, "BCR"),
	PLASMA_STORM(319, "PLS"),
	PLASMA_FREEZE(320, "PLF"),
	PLASMA_BLAST(321, "PLB"),
	LEGENDARY_TREASURES(322, "LTR"),

	//XY
	KALOS_STARTER_SET(359, "KSS"),
  XY_PROMOS(360, "XY Promos", "XYP"),
	XY(361, "XY", "XY"),
	FLASHFIRE(362, "FLF"),
	FURIOUS_FISTS(363, "FUF"),
	PHANTOM_FORCES(364, "PHF"),
	PRIMAL_CLASH(365, "PCL"),
	DOUBLE_CRISIS(366, "DCR"),
	ROARING_SKIES(367, "ROS"),
	ANCIENT_ORIGINS(368, "AOR"),
	BREAKTHROUGH(369, "BREAKthrough", "BKT"),
	BREAKPOINT(370, "BREAKpoint", "BKP"),
	GENERATIONS(371, "GEN"),
	FATES_COLLIDE(372, "FCO"),
	STEAM_SIEGE(373, "STS"),
	EVOLUTIONS(374, "EVO"),

	//Sun & Moon
	SUN_MOON_PROMOS(410, "Sun & Moon Promos", "SMP"),
	SUN_MOON(411, "Sun & Moon", "SM"),
	GUARDIANS_RISING(412, "GRI"),
	BURNING_SHADOWS(413, "BUS"),
	SHINING_LEGENDS(414, "SLG"),
	CRIMSON_INVASION(415, "CIN"),
	ULTRA_PRISM(416, "UPR"),
	FORBIDDEN_LIGHT(417, "FLI"),
	CELESTIAL_STORM(418, "CLS"),
	DRAGON_MAJESTY(419, "DRM"),
	LOST_THUNDER(420, "LOT"),

	//POKEMOD
	POKEMOD_BASE_SET(911, "PMDBS"),
	POKEMOD_JUNGLE(912, "PMDJU"),
	POKEMOD_FOSSIL(913, "PMDFO"),
	POKEMOD_TEAM_ROCKET(914, "PMDTR"),
	POKEMOD_GYM_HEROES(915, "PMDG1"),
	POKEMOD_GYM_CHALLENGE(916, "PMDG2"),
	POKEMOD_NEO_GENESIS(917, "PMDN1"),
	POKEMOD_NEO_DISCOVERY(918, "PMDN2"),
	POKEMOD_NEO_REVELATION(919, "PMDN3"),
	POKEMOD_NEO_DESTINY(920, "PMDN4"),
	POKEMOD_EXPEDITION(921, "PMDEXP"),
	POKEMOD_AQUAPOLIS(922, "PMDAQP"),
	POKEMOD_SKYRIDGE(923, "PMDSKR"),
	POKEMOD_VENDING_MACHINE(924, "PMDVM"),
	POKEMOD_PROMOS(925, "PMDPRO"),
//	POKEMOD_(900, "PMD"),

	;

	int id;
	String shortName;
	String fullName;

	CoreCollection(int id, String shortName) {
		this(id, null, shortName);
	}

	CoreCollection(int id, String fullName, String shortName) {
		this.id = id;
		this.fullName = fullName;
		this.shortName = shortName;
	}

	public String getShortName(){
		return shortName;
	}
	
	public String getName(){
		return fullName==null? WordUtils.capitalizeFully(this.name(), "_".toCharArray()).replaceAll("_", " "):fullName;
	}
	
	public int getId() {
		return id;
	}

	public static CoreCollection findById(int id){
		for (CoreCollection item : values()) {
			if(item.id == id) return item;
		}
		throw new IllegalArgumentException("Collection "+id+" not found");
	}

	public static CoreCollection findByName(String name){
		for(CoreCollection item : values()){
			if(item.getName().equals(name)) return item;
		}
		throw new IllegalArgumentException("Collection "+name+" not found");
	}

	public static CoreCollection findByShortName(String shortName){
		for(CoreCollection item : values()){
			if(item.shortName.equals(shortName)) return item;
		}
		throw new IllegalArgumentException("Collection "+shortName+" not found");
	}

}
