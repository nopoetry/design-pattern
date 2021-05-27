package com.libuyan.designpattern.__m__MVC.view;

import com.libuyan.designpattern.__m__MVC.model.BeatModel;
import com.libuyan.designpattern.__m__MVC.model.BeatModelInterface;
import com.libuyan.designpattern.__m__MVC.observer.BeatObserver;
import com.libuyan.designpattern.__m__MVC.observer.BpmObserver;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author libuyan
 * @date 2021/5/27 16:04
 */
public class DjView implements ActionListener, BeatObserver, BpmObserver {
    private BeatModelInterface beatModel;

    private ControllerInterface controller;

    JFrame viewFrame;

    JPanel viewPanel;

    JMenuBar beatBar;

    JLabel bpmOutputLabel;

    public DjView(BeatModelInterface beatModel, ControllerInterface controller) {
        this.beatModel = beatModel;
        this.controller = controller;
        beatModel.registerBeatObserver(this);
        beatModel.registerBpmObserver(this);
    }

    public void creatView() {
        viewFrame = new JFrame();
        viewPanel = new JPanel();
        beatBar = new JMenuBar();
        bpmOutputLabel = new JLabel("");
    }

    void updateBpm() {
        int bpm = beatModel.getBpm();
        bpmOutputLabel.setText(String.valueOf(bpm));
    }

    void updateBeat() {
    }

    @Override
    public void update(BeatModel beatModel) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
