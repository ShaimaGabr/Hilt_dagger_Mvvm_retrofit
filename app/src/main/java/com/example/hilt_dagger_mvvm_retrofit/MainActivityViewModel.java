package com.example.hilt_dagger_mvvm_retrofit;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MainActivityViewModel extends ViewModel {
    MutableLiveData<List<RecyclerData>> liveData;

    @Inject
    RetroServiceInterface retroServiceInterface;

    @Inject
    public MainActivityViewModel() {
        liveData = new MutableLiveData();
    }

    public MutableLiveData<List<RecyclerData>> getLiveData() {
        return liveData;
    }

    public void makeApiCall() {
        RetroRepository retroRepository = new RetroRepository(retroServiceInterface);
        retroRepository.makeAPICall("cat", liveData);
    }
}
