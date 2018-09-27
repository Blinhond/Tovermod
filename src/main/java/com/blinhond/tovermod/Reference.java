package com.blinhond.tovermod;

public class Reference {
    public static final String MOD_ID = "btm";
    public static final String NAME = "Tovermod";
    public static final String VERSION = "1.0";

    public static enum ToverModItems {
        ASH("ash", "ItemAsh"),
        URN("urn", "ItemUrn");

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
        ASHOREBLOCK("ashoreblock", "BlockAshOre");

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
