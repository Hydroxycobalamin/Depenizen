package com.morphanone.depenizenbukkit.support.bungee.packets;

public class ClientPacketOutRegister extends Packet {

    private String name;

    public ClientPacketOutRegister(String name) {
        this.name = name;
    }

    @Override
    public void serialize(DataSerializer serializer) {
        serializer.writeInt(0x00);
        serializer.writeString(name);
    }
}