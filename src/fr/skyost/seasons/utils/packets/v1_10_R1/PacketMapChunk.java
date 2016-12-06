package fr.skyost.seasons.utils.packets.v1_10_R1;

import net.minecraft.server.v1_10_R1.PacketPlayOutMapChunk;

import org.bukkit.craftbukkit.v1_10_R1.CraftChunk;
import org.bukkit.craftbukkit.v1_10_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class PacketMapChunk {
	
private final PacketPlayOutMapChunk packet;
	
	public PacketMapChunk(final org.bukkit.Chunk chunk) {
		this.packet = new PacketPlayOutMapChunk(((CraftChunk)chunk).getHandle(), 0);
	}
	
	public final void send(final Player player) {
		((CraftPlayer)player).getHandle().playerConnection.sendPacket(packet);
	}

}