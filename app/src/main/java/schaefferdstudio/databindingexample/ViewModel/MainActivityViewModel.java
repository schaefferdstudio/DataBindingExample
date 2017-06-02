package schaefferdstudio.databindingexample.ViewModel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import schaefferdstudio.databindingexample.BR;



/**
 * Created by SchaefferDStudio on 01.06.2017.
 */

public class MainActivityViewModel extends BaseObservable {
    private boolean enableStartChecked = false;
    private int volumeLevel = 0;
    @Bindable
    public void setEnableStartChecked(boolean enableStartChecked) {
        this.enableStartChecked = enableStartChecked;
        notifyPropertyChanged(BR.enableStartChecked);
    }

    @Bindable
    public boolean isEnableStartChecked() {
        return enableStartChecked;
    }

    @Bindable
    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
        notifyPropertyChanged(BR.volumeLevel);
    }

    @Bindable
    public int getVolumeLevel() {
        return volumeLevel;
    }
}
