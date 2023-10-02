package d18_09_2023;

public class AudioControl extends Control{

    private boolean soundVolumeUp;

    public AudioControl(boolean soundVolumeUp) {
        super();
        this.soundVolumeUp = soundVolumeUp;
    }

    @Override
    public void action(VideoPlayer videoPlayer){
        int soundVolume = videoPlayer.getSoundVolume();
        if (this.soundVolumeUp){
            videoPlayer.setSoundVolume(soundVolume += 1);
            if (videoPlayer.getSoundVolume() > 100){
                videoPlayer.setSoundVolume(100);
            }
        } else {
            videoPlayer.setSoundVolume(soundVolume -= 1);
            if (videoPlayer.getSoundVolume() < 0){
                videoPlayer.setSoundVolume(0);
            }
        }
    }
    public boolean isSoundVolumeUp() {
        return soundVolumeUp;
    }

    public void setSoundVolumeUp(boolean soundVolumeUp) {
        this.soundVolumeUp = soundVolumeUp;
    }
}
