package es.ulpgc.dis;

import es.ulpgc.dis.Control.HistogramLoader;
import es.ulpgc.dis.Control.TitleTypeHistogramLoader;
import es.ulpgc.dis.Model.Title;
import es.ulpgc.dis.View.MainFrame;
import es.ulpgc.dis.io.TSVTitleReader;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        HistogramLoader histogram = new TitleTypeHistogramLoader();
        mainFrame.histogramDisplay().show(histogram.load(args[0]));
        mainFrame.setVisible(true);
    }

}
