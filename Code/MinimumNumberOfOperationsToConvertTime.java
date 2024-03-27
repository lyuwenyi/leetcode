class MinimumNumberOfOperationsToConvertTime {
    public int convertTime(String current, String correct) {
        String[] currents = current.split(":");
        String[] corrects = correct.split(":");
        int currentNum = Integer.parseInt(currents[0]) * 60 + Integer.parseInt(currents[1]);
        int correctNum = Integer.parseInt(corrects[0]) * 60 + Integer.parseInt(corrects[1]);
        int duration = correctNum - currentNum;
        int hours = duration / 60;
        int minutes = duration % 60;
        int quarter = minutes / 15;
        minutes = minutes % 15;
        int five = minutes / 5;
        minutes = minutes % 5;
        return hours + minutes + quarter + five;
    }
}