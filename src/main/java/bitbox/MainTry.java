package bitbox;

import bitbox.baseconverter.BaseConverter;
import bitbox.bitcombiner.BitCombiner;
import bitbox.bitpainter.BitPainter;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainTry {

    private static final int GRID_SIZE = 3;

    public static void main(String[] args) throws ParseException {
       Long num = Long.parseLong("f",16);
        System.out.println(num);
    }
}
