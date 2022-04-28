package packagedesafio01;

public class Desafio01 {
    public static String movimento = "";

    public static void main(String[] args) {
        Rey rey = new Rey(2, 3);
        Skywalker skywalker = new Skywalker(0, 0);

        int rX = rey.getreyX();
        int rY = rey.getreyY();
        int sX = skywalker.getSkywalkerX();
        int sY = skywalker.getSkywalkerY();

        while (rX != sX && rY != sY) {
            if ((rX - sX <= -1) && (rY - sY <= -1)) {
                rX = rX+1;
                rY = rY+1;
                movimento = movimento + "[SE] ";
            }
            if ((rX - sX >= 1) && (rY - sY >= 1)) {
                rX = rX-1;
                rY = rY-1;
                movimento = movimento + "[NW] ";
            }
            if ((rX - sX >= 1) && (rY - sY <= -1)) {
                rX = rX-1;
                rY = rY+1;
                movimento = movimento + "[SW] ";
            }
            if ((rX - sX <= -1) && (rY - sY >= 1)) {
                rX = rX+1;
                rY = rY-1;
                movimento = movimento + "[NE] ";
            }
            if ((rX - sX <= -1) && (rY - sY == 0)) {
                movimento = movimento + "[E] ";
                rX = rX+1;
            }
            if ((rX - sX == 0) && (rY - sY <= -1)) {
                movimento = movimento + "[S] ";
                rY = rY+1;
            }
            
             if ((rX - sX >= 1) && (rY - sY == 0)) {
                movimento = movimento + "[W] ";
                rX = rX-1;
            }
             if ((rX - sX == 0) && (rY - sY >= 1)) {
                movimento = movimento + "[N] ";
                rY = rY-1;
            }
        }
        System.out.println(movimento);
        return;
    }
}
