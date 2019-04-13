package com.mike.camera2previewstreamtest;

/**
 * Created by abhinav.srivastava on 9/23/18.
 */

class MyData{
    byte[] buffer;
    long presentationTimeUs;
    // to tell your encoder that is a EOS, otherwise you can not know when to stop
    boolean isEOS;
    public MyData(byte[] buffer,long presentationTimeUs, boolean isEOS){
        this.buffer = new byte[buffer.length];
        System.arraycopy(buffer, 0, this.buffer, 0, buffer.length);
        this.presentationTimeUs = presentationTimeUs;
        this.isEOS = isEOS;
    }

    public byte[] getBuffer() {
        return buffer;
    }

    public void setBuffer(byte[] buffer) {
        this.buffer = buffer;
    }

    public long getPresentationTimeUs() {
        return presentationTimeUs;
    }

    public void setPresentationTimeUs(long presentationTimeUs) {
        this.presentationTimeUs = presentationTimeUs;
    }

    public boolean isEOS() {
        return isEOS;
    }

    public void setEOS(boolean EOS) {
        isEOS = EOS;
    }

}
