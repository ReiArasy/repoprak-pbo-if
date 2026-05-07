/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sample;

/**
 *
 * @author HP VICTUS
 */
public class Utils {
      public static Double timeToSeconds(String time) {
        if (time == null || time.isEmpty()) {
            throw new IllegalArgumentException("Time string cannot be null or empty");
        }

        // Memecah string "HH:MM:SS"
        String[] parts = time.split(":");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid time format, must be HH:MM:SS");
        }

        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);

        // Kalkulasi ke detik
        double totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        return totalSeconds;
    }
}
