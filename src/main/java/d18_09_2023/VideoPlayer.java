package d18_09_2023;

public class VideoPlayer {

    private int videoLength;
    private int currentVideoTime;
    private int soundVolume;
    private int videoQuality;

    public VideoPlayer(int videoLength) {
        this.videoLength = videoLength;
    }

    public VideoPlayer(int videoLength, int currentVideoTime, int soundVolume, int videoQuality) {
        this.videoLength = videoLength;
        this.currentVideoTime = currentVideoTime;
        this.soundVolume = soundVolume;
        this.videoQuality = videoQuality;
    }

    public void print(){
        System.out.println("Trenutno vreme videa: " + this.currentVideoTime / 60 + ":" + this.currentVideoTime % 60 + "/" + this.videoLength / 60 + ":" + this.videoLength % 60);
        System.out.println("Jacina zvuka: " + this.soundVolume);
        System.out.println("Kvalitet videa: " + this.videoQuality);
    }

    public int getVideoLength() {
        return videoLength;
    }

    public void setVideoLength(int videoLength) {
        this.videoLength = videoLength;
    }

    public int getCurrentVideoTime() {
        return currentVideoTime;
    }

    public void setCurrentVideoTime(int currentVideoTime) {
        this.currentVideoTime = currentVideoTime;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    public int getVideoQuality() {
        return videoQuality;
    }

    public void setVideoQuality(int videoQuality) {
        this.videoQuality = videoQuality;
    }
}
