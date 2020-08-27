package Piciorus.Ovidiu.Lab11.ex1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureController  {
    Thermometer t;
    TemperatureTextView tview;
    public TemperatureController(Thermometer t, TemperatureTextView tview){
        t.addObserver(tview);

        this.t = t;
        this.tview = tview;


    }


}