package d18_09_2023;

public class TimeControl extends Control{

    private boolean moveVideoTimeForward;

    public TimeControl(boolean moveVideoTimeForward) {
        super();
        this.moveVideoTimeForward = moveVideoTimeForward;
    }

    @Override
    public void action(VideoPlayer videoPlayer) {
        int time = videoPlayer.getCurrentVideoTime();
        if (this.moveVideoTimeForward){
            videoPlayer.setCurrentVideoTime(time += 15);
            if (videoPlayer.getCurrentVideoTime() > videoPlayer.getVideoLength()){
                videoPlayer.setCurrentVideoTime(videoPlayer.getVideoLength());
            }
        } else {
            videoPlayer.setCurrentVideoTime(time -= 15);
            if (videoPlayer.getCurrentVideoTime() < 0){
                videoPlayer.setCurrentVideoTime(0);
            }
        }
    }
}
