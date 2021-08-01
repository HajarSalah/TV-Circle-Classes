package com.company;

public class TV {

    int channel=1;
    int volumeLevel=1;
    boolean on= false;

    public TV (){}

    public void turnOn (){
        this.on= true;
    }
    public void turnOff (){
        this.on=false;
    }
    public void setChannel (int newChannel) {
        this.channel=newChannel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }
    public void channelUp() {
        this.channel++;
    }
    public void channelDown() {
        this.channel--;
    }
    public void volumeUp () {
        this.volumeLevel++;
    }
    public void volumeDown () {
        this.volumeLevel-- ;
    }
}
