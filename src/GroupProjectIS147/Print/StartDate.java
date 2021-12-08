package GroupProjectIS147.Print;

public class StartDate {
    int start = 3;
    int endPass = 1;

    public static int StartDateInt(int start, int endPass) {
//        Integer.parseInt(start);

//        this.start = start;
//        this.endPass = endPass;

        System.out.println("March " + Math.max(start, endPass)
                + " 2021");

        //Math.min() for end date       pass the same 2 values

        return StartDateInt(3,1);
    }
}
//
//    public int getStart() {
//        return start;
//    }
//
//    public void setStart(int start) {
//        this.start = start;
//    }
//
//    public int getEndPass() {
//        return endPass;
//    }
//
//    public void setEndPass(int endPass) {
//        this.endPass = endPass;
//    }
//}
