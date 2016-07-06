package org.bukkit.material;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;

/**
 * 代表不同种类的光滑的砖（石头、苔石、圆石、石砖）.
 */
public class SmoothBrick extends TexturedMaterial {

    private static final List<Material> textures = new ArrayList<Material>();
    static {
        textures.add(Material.STONE);
        textures.add(Material.MOSSY_COBBLESTONE);
        textures.add(Material.COBBLESTONE);
        textures.add(Material.SMOOTH_BRICK);
    }

    public SmoothBrick() {
        super(Material.SMOOTH_BRICK);
    }

    /**
     * @param type the raw type id
     * @deprecated 不安全的参数
     */
    @Deprecated
    public SmoothBrick(final int type) {
        super(type);
    }

    public SmoothBrick(final Material type) {
        super((textures.contains(type)) ? Material.SMOOTH_BRICK : type);
        if (textures.contains(type)) {
            setMaterial(type);
        }
    }

    /**
     * @param type the raw type id
     * @param data the raw data value
     * @deprecated 不安全的参数
     */
    @Deprecated
    public SmoothBrick(final int type, final byte data) {
        super(type, data);
    }

    /**
     * @param type the type
     * @param data the raw data value
     * @deprecated 不安全的参数
     */
    @Deprecated
    public SmoothBrick(final Material type, final byte data) {
        super(type, data);
    }

    @Override
    public List<Material> getTextures() {
        return textures;
    }

    @Override
    public SmoothBrick clone() {
        return (SmoothBrick) super.clone();
    }
}