package com.ndt.sms.face.jna;

public class BufferInfo {
    public int width;
    public int height;
    public byte[] buffer;

    public BufferInfo(int w, int h, byte[] buf) {
        width = w;
        height = h;
        buffer = buf;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public byte[] getBuffer() {
        return buffer;
    }

    public void setBuffer(byte[] buffer) {
        this.buffer = buffer;
    }
}