package ru.javabegin.training.goldman.utils;

import javax.swing.*;
import java.awt.*;

public class MessageManager {

    public static void showInformMessage(Component comp, String message) {
        JOptionPane.showMessageDialog(comp, message, "Message Dialog", JOptionPane.PLAIN_MESSAGE);
    }
}
