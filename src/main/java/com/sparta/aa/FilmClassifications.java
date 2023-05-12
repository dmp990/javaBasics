package com.sparta.aa;

public class FilmClassifications {

    /*
     * Requirements as on the BBFC website:
     * U: 4 and over
     * PG: 8 and over
     * 12: 12 and over
     * 15: 15 and over
     * 18: 18 and over
     * */

    public static void main(String[] args) {
        System.out.println(availableClassifications(1));
    }

    public static String availableClassifications(int ageOfViewer) {
        if (ageOfViewer <= 0) {
            return "Invalid Age.";
        }
        String result = "";
        if (ageOfViewer >= 18) {
            result = "All films are available.";
        } else if (ageOfViewer >= 15) {
            result = "U, PG, 12 & 15 films are available.";
        } else if (ageOfViewer >= 12) {
            result = "U, PG & 12 films are available.";
        } else if (ageOfViewer >= 8) {
            result = "U & PG films are available.";
        } else if (ageOfViewer >= 4) {
            result = "U films are available.";
        } else {
            result = "No films are available.";
        }
        return result;
    }
}
