public class Tortoise extends  Run{



    public  Tortoise(int curr_pos, int lane, String name){


this.curr_pos=curr_pos;
this.lane=lane;

this.RUNNER_NAME=name;
symbol="T";
MOVE=RUNNER_NAME+"Ready Set Go !!!";
Runners.add(this);

}

    @Override
    public void calculateMove() {
        int move=getMOVE();
        if(move>=1 && move<=50){
            MOVE(MoveType.FAST_PLOD);
            MOVE=RUNNER_NAME+"3 STEPS";
        } else if (move>=51 && move<=70) {
            MOVE(MoveType.SLIP);
            MOVE=RUNNER_NAME+"Dropped 6 steps";
        }
        else
            MOVE(MoveType.SLOW_PLOD);
        MOVE=RUNNER_NAME+"Moved 1 Step";
    }
}
