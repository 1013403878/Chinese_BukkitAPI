package org.bukkit.command;

import org.bukkit.block.Block;

public interface BlockCommandSender extends CommandSender {

    /**
     * ����������ֹ���������.
     * <p>
     * ԭ��:
     * Returns the block this command sender belongs to
     *
     * @return ��ֹ���������
     */
    public Block getBlock();
}
