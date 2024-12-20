package es.ulpgc.dis;

import es.ulpgc.dis.io.HistogramLoader;
import es.ulpgc.dis.io.TitleTypeHistogramLoader;
import es.ulpgc.dis.View.MainFrame;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        HistogramLoader histogram = new TitleTypeHistogramLoader();
        mainFrame.histogramDisplay().show(histogram.load(args[0]));
        mainFrame.setVisible(true);
    }

}
