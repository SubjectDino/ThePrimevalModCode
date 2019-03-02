package com.dinoethan.theprimevalmod.period;

import net.minecraft.util.IStringSerializable;

public enum TimePeriod implements IStringSerializable {
    FUTURE("future", 0.00F, -0.1000F),
    HOLOCENE("holocene", 0.10F, 0.00F),
    PLEISTOCENE("pleistocene", 2.57F, 0.10F),
    PLIOCENE("pliocene", 5.333F, 2.58F),
    MIOCENE("miocene", 23.03F, 5.333F),
    OLIGOCENE("oligocene", 33.9F, 23.04F),
    EOCENE("eocene", 56.0F, 34.0F),
    PALEOCENE("paleocene", 65.0F, 56.01F),
    CRETACEOUS("cretaceous", 145.5F, 65.1F),
    JURASSIC("jurassic", 201.3F, 145.6F),
    TRIASSIC("triassic", 252.17F, 201.4F),
    PERMIAN("permian", 298.9F, 252.18F),
    CARBONIFEROUS("carboniferous", 358.9F, 299.0F),
    DEVONIAN("devonian", 419.2F, 359.0F),
    SILURIAN("silurian", 443.4F, 419.3F),
    ORDOVICIAN("ordovician", 485.4F, 443.5F),
    CAMBRIAN("cambrian", 541.0F, 485.5F),
    PRECAMBRIAN("precambrian", 4500000000.0F, 541.1F);

    private final String name;
    private final float startTime;
    private final float endTime;

    TimePeriod(String name, float startTime, float endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public static int getStartYLevel(TimePeriod period) {
        return 64 - (int) (period.getStartTime() != 0 ? period.getStartTime() * 64.0F / 541.0F : 0);
    }

    public static int getEndYLevel(TimePeriod period) {
        return 64 - (int) (period.getEndTime() != 0 ? period.getEndTime() * 64.0F / 541.0F : 0);
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public float getStartTime() {
        return this.startTime;
    }

    public float getEndTime() {
        return this.endTime;
    }
}
