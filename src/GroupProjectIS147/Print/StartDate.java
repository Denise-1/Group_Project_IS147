package GroupProjectIS147.Print;

/**
 * Displays the start and end dates for the medications prescribed to the user
 * @see Input case 2 in switch statement
 *
 * @author Denise C
 */

public class StartDate {

        int start = 3;
        int endPass = 1;

    /**
     * StartDate constructor that passes values to see the days in which the user starts and ends medication
     * @param start indicates the day the user starts medication
     * @param endPass indicates the day the user ends medication
     */

    public StartDate(int start, int endPass){


            this.start = start;
            this.endPass = endPass;
            Math.max(start, endPass);

        }

        public StartDate() {

        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEndPass() {
            return endPass;
        }

        public void setEndPass(int endPass) {
            this.endPass = endPass;

    }
}
