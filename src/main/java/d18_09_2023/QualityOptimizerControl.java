package d18_09_2023;

public class QualityOptimizerControl extends Control{

    private double internetSpeed;

    public QualityOptimizerControl(double internetSpeed) {
        super();
        this.internetSpeed = internetSpeed;
    }

    @Override
    public void action(VideoPlayer videoPlayer) {
        double videoQuality = internetSpeed * 10.1;
        if (videoQuality <= 144){
            videoPlayer.setVideoQuality(144);
        } else if (videoQuality <= 240) {
            videoPlayer.setVideoQuality(240);
        } else if (videoQuality <= 360) {
            videoPlayer.setVideoQuality(360);
        } else if (videoQuality <= 480) {
            videoPlayer.setVideoQuality(480);
        } else if (videoQuality <= 720) {
            videoPlayer.setVideoQuality(720);
        } else if (videoQuality > 720) {
            videoPlayer.setVideoQuality(1080);
        }
    }

    public double getInternetSpeed() {
        return internetSpeed;
    }

    public void setInternetSpeed(double internetSpeed) {
        this.internetSpeed = internetSpeed;
    }
}
