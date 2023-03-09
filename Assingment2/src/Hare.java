public class Hare extends Run {

    public Hare(int curr_pos, int lane, String name) {


        this.curr_pos = curr_pos;
        this.lane = lane;

        this.RUNNER_NAME = name;
        symbol = "H";
        MOVE = RUNNER_NAME + "Ready Set Go !!!";
        Runners.add(this);

    }

    public void calculateMove() {
        int move = getMOVE();
        if (move >= 1 && move <= 20) {
            MOVE(MoveType.SLEEP);
            MOVE = RUNNER_NAME + " IS SLEEPING ";
        } else if (move >= 21 && move <= 40) {
            MOVE(MoveType.BIG_HOP);
            MOVE = RUNNER_NAME + " 9 Steps forwarding";
        } else if (move >= 41 && move <= 50) {
            MOVE(MoveType.BIG_SLIP);
            MOVE = RUNNER_NAME + " 12 Steps back warding";

        } else if (move >= 51 && move <= 80) {
            MOVE(MoveType.SMALL_HOP);
            MOVE = RUNNER_NAME + " forwarding 1 by each move";
        } else {

            MOVE(MoveType.SMALL_SLIP);
            MOVE = RUNNER_NAME + " back warding 2 by each move";

        }
    }
}