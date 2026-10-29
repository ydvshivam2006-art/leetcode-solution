class Solution {
    private static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aArrive = dateToDayOfYear(arriveAlice);
        int aLeave = dateToDayOfYear(leaveAlice);
        int bArrive = dateToDayOfYear(arriveBob);
        int bLeave = dateToDayOfYear(leaveBob);

        int start = Math.max(aArrive, bArrive);
        int end = Math.min(aLeave, bLeave);

        if (start > end) {
            return 0;
        }

        return end - start + 1;
    }

    private int dateToDayOfYear(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        int totalDays = 0;
        for (int i = 0; i < month - 1; i++) {
            totalDays += DAYS_IN_MONTHS[i];
        }
        totalDays += day;

        return totalDays;
    }
}