package com.libuyan.designpattern.__m__MVC.model;

import com.libuyan.designpattern.__m__MVC.observer.BeatObserver;
import com.libuyan.designpattern.__m__MVC.observer.BpmObserver;
import com.libuyan.designpattern.__m__MVC.observer.Observer;

import javax.sound.midi.Sequencer;
import java.util.ArrayList;
import java.util.List;

/**
 * @author libuyan
 * @date 2021/5/27 15:26
 */
public class BeatModel implements BeatModelInterface {
    private Sequencer sequencer;

    List<Observer> beatObserverList = new ArrayList<>();

    List<Observer> bpmObserverList = new ArrayList<>();

    private int bpm = 90;

    @Override
    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }

    @Override
    public void on() {
        sequencer.start();
        setBpm(90);
    }

    @Override
    public void off() {
        sequencer.stop();
        setBpm(0);
    }

    @Override
    public void setBpm(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(bpm);
        notifyBpmObservers();
    }

    void beatEvent() {
        notifyBeatObservers();
    }

    @Override
    public int getBpm() {
        return this.bpm;
    }

    @Override
    public void registerBeatObserver(Observer observer) {
        beatObserverList.add(observer);
    }

    @Override
    public void notifyBeatObservers() {
        beatObserverList.forEach(observer -> observer.update(this));
    }

    @Override
    public void registerBpmObserver(Observer observer) {
        bpmObserverList.add(observer);
    }

    @Override
    public void notifyBpmObservers() {
        bpmObserverList.forEach(observer -> observer.update(this));
    }

    private void buildTrackAndStart() {
    }

    private void setUpMidi() {
    }

}
