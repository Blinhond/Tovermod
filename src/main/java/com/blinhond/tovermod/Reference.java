package com.blinhond.tovermod;

public class Reference {
    public static final String MOD_ID = "btm";
    public static final String NAME = "Tovermod";
    public static final String VERSION = "1.0";

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
        NEEDYFINGER("needyfinger", "ItemNeedyFinger");

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
        SOLIDASHBLOCK("solidashblock", "BlockSolidAsh");
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
