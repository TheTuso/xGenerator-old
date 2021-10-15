package pl.tuso.xgenerator.biome.handler;

import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.generator.WorldInfo;
import pl.tuso.xgenerator.biome.layer.util.GenUtils;
import pl.tuso.xgenerator.biome.math.FastNoiseLite;

import java.util.Random;

public class DesertHandler implements BiomeHandler {

    @Override
    public Material[] getSurfaceCrust(Random random) {
        return new Material[] {Material.SAND};
    }

    @Override
    public Biome getVanillaBiome() {
        return Biome.DESERT;
    }

    @Override
    public void setCustomBiome() {

    }

    @Override
    public double getNoise(WorldInfo worldInfo, int x, int y, int z) {
        n.SetSeed((int) worldInfo.getSeed() * 4);
        n.SetNoiseType(FastNoiseLite.NoiseType.OpenSimplex2S);
        n.SetFractalOctaves(3);
        n.SetFrequency(0.07f);
        return n.GetNoise(x, y, z);
    }

}
