package com.blinhond.tovermod;

public class Reference {
    public static final String MOD_ID = "btm";
    public static final String NAME = "Tovermod";
    public static final String VERSION = "1.0";

    // GUI
    public static final int GUI_ALCHEMIST_FURNACE = 1;

    // Constants
    public static final int MAX_STACK_SIZE_POTS= 16;

    public static enum ToverModItems {
        ASH("ash", "ItemAsh"),
        CLEANASH("cleanash",  "ItemCleanAsh"),
        URN("urn", "ItemUrn"),
        RAWURN("rawurn", "ItemRawUrn"),
        FILLEDURN("filledurn", "ItemFilledUrn"),
        GOLDRING("goldring", "ItemGoldRing"),
        NOCTURNALEYE("nocturnaleye", "ItemNocturnalEye"),
        LUMINITESHARD("luminiteshard", "ItemLuminiteShard"),
        ILLUMINATEDSHARD("illuminatedshard", "ItemIlluminatedShard"),
        BLACKASH("blackash", "ItemBlackAsh"),
        QUICKASH("quickash", "ItemQuickAsh"),
        VITALASH("vitalash", "ItemVitalAsh"),
        ALCHEMISTASH("alchemistash", "ItemAlchemistAsh"),
        NEEDYFINGER("needyfinger", "ItemNeedyFinger"),
        MOONSTONE("moonstone", "ItemMoonstone"),
        MOONSTONESHARD("moonstoneshard", "ItemMoonstoneShard"),
        MOONSTONEPICKAXE("moonstonepickaxe", "ItemMoonstonePickaxe"),
        MOONSTONEAXE("moonstoneaxe", "ItemMoonstoneAxe"),
        MOONSTONESWORD("moonstonesword", "ItemMoonstoneSword"),
        MOONSTONESHOVEL("moonstoneshovel", "ItemMoonstoneShovel"),
        MOONSTONEHOE("moonstonehoe", "ItemMoonstoneHoe"),
        GREEDYHAND("greedyhand", "ItemGreedyHand"),
        CURSEDBLOOD("cursedblood", "ItemCursedBlood"),
        BLOODYHAND("bloodyhand", "ItemBloodyHand"),
        POINTINGHAND("pointinghand", "ItemPointingHand"),
        CROOKEDHAND("crookedhand", "ItemCrookedHand"),
        BROKENHAND("brokenhand", "ItemBrokenHand"),
        SOLIDBLOOD("solidblood", "ItemSolidBlood"),
        NORTHSTARSHARD("northstarshard", "ItemNorthstarShard"),
        PRISM("prism", "ItemPrism"),
        SOULPRISM("soulprism", "ItemSoulPrism"),
        SATURATEDPRISM("saturatedprism", "ItemSaturatedPrism"),
        ILLUMINATEDPRISM("illuminatedprism", "ItemIlluminatedPrism"),
        HARDPRISM("hardprism", "ItemHardPrism"),
        RAGINGPRISM("ragingprism", "ItemRagingPrism"),
        CHAIN("chain", "ItemChain"),
        HARDCHAIN("hardchain", "ItemHardChain"),
        ABOMINATION("abomination", "ItemAbomination"),
        BOUNDAB0MINATION("boundabomination", "ItemBoundAbomination"),
        HUNGRYABOMINATION("hungryabomination", "ItemHungryAbomination"),
        BLINDABOMINATION("blindabomination", "ItemBlindAbomination"),
        WEAKABOMINATION("weakabomination", "ItemWeakAbomination"),
        COLDABOMINATION("coldabomination", "ItemColdAbomination");

        private String unlocalizedName;
        private String registryName;

        ToverModItems(String unlocalized, String registry) {
            unlocalizedName = unlocalized;
            registryName = registry;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }

        public String getRegistryName() {
            return registryName;
        }
    }

    public static enum ToverModBlocks {
        ASHOREBLOCK("ashoreblock", "BlockAshOre"),
        LUMINITEOREBLOCK("luminiteoreblock", "BlockLuminiteOre"),
        SOLIDASHBLOCK("solidashblock", "BlockSolidAsh"),
        MOONSTONEOREBLOCK("moonstoneoreblock", "BlockMoonstoneOre"),
        ALCHEMISTFURNACE("alchemistfurnaceblock", "BlockAlchemistFurnace"),
        BLOODBLOCK("bloodblock", "BlockBlood");

        private String unlocalizedName;
        private String registryName;

        ToverModBlocks(String unlocalized, String registry) {
            unlocalizedName = unlocalized;
            registryName = registry;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }

        public String getRegistryName() {
            return registryName;
        }
    }
}
