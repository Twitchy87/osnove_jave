package d11_09_2023;

public class YoutubePlayer {

    private Video video;
    private int videoQuality;
    private String viewMode;
    private int soundVolume;
    private int currentVideoTime;

    public YoutubePlayer(){
        this.soundVolume = 75;
        this.videoQuality = 144;
        this.viewMode = "mini player";
    }

    public void loadVideo(Video video){
        this.video = video;
        this.currentVideoTime = 0;
        this.video.view();
    }

    public void soundVolumeUp(){
        this.soundVolume += 10;
        if (this.soundVolume > 100){
            this.soundVolume = 100;
        }
    }

    public void soundVolumeDown(){
        this.soundVolume -= 10;
        if (this.soundVolume < 0){
            this.soundVolume = 0;
        }
    }

    public void setVideoQuality(int internetSpeed){
        if (internetSpeed <= 2){
            this.videoQuality = 144;
        } else if (internetSpeed <= 4) {
            this.videoQuality = 240;
        } else if (internetSpeed <= 6) {
            this.videoQuality = 360;
        } else if (internetSpeed <= 8) {
            this.videoQuality = 720;
        } else {
            this.videoQuality = 1080;
        }
    }

    public void miniPlayerModeOn(){
        this.viewMode = "mini player";
    }

    public void theaterModeOn(){
        this.viewMode = "theater mode";
    }

    public void fullScreenModeOn(){
        this.viewMode = "full screen";
    }

    public void fastForward(){
        this.currentVideoTime += 10;
        if (this.currentVideoTime > this.video.getLength()){
            this.currentVideoTime = this.video.getLength();
        }
    }
    public void rewind(){
        this.currentVideoTime -= 10;
        if (this.currentVideoTime < 0){
            this.currentVideoTime = 0;
        }
    }

    public void printSoundVolume(){
        int numberOfSigns = soundVolume / 10;
        if (numberOfSigns == 0){
            System.out.println("Sound: </");
        } else {
            System.out.print("Sound: <:");
            for (int i = 0; i < numberOfSigns; i++) {
                System.out.print("|");
            }
        }
    }

    public void printViewMode(){
        if (this.viewMode.equals("mini player")){
            System.out.println("Viewing mode: []");
        } else if (this.viewMode.equals("theater mode")) {
            System.out.println("Viewing mode: [...]");
        } else if (this.viewMode.equals("full screen")) {
            System.out.println("Viewing mode: [||||]");
        }
    }

    public void printCurrentVideoTime(){
        int currentMinute = this.currentVideoTime / 60;
        int currentSecond = this.currentVideoTime % 60;
        int fullMinute = this.video.getLength() / 60;
        int fullSecond = this.video.getLength() % 60;

        System.out.print(currentMinute + ":" + currentSecond + " / " + fullMinute + ":" + fullSecond);
    }

    public void printTimeline(){
        int numberOfStars = this.currentVideoTime * 100 / this.video.getLength();
        System.out.print("Timeline: ");
        for (int i = 0; i < 100; i++) {
            if (i < numberOfStars){
                System.out.print("*");
            } else {
                System.out.print(".");
            }
        }
    }

    public void printPlayer(){
        this.printCurrentVideoTime();
        System.out.print(" ");
        this.printSoundVolume();
        System.out.println();
        this.printTimeline();
        System.out.println();
        System.out.println("Video quality: " + this.videoQuality);
        this.printViewMode();
        System.out.println(this.video.getTitle());
        System.out.println("Likes " + this.video.getNumberOfLikes() + " | Dislikes " + this.video.getNumberOfDislikes());
        System.out.println(this.video.getNumberOfViews() + " views");
    }

    public String shareVideo(){
        return "https://youtu.be/" + this.video.getId();
    }

    public Video getVideo(){
        return this.video;
    }
    public int getVideoQuality(){
        return this.videoQuality;
    }
    public String getViewMode(){
        return this.viewMode;
    }
    public int getSoundVolume(){
        return this.soundVolume;
    }
    public int getCurrentVideoTime(){
        return this.currentVideoTime;
    }
}
