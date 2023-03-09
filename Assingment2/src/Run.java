
import  java.util.Random;
import  java.util.ArrayList;
import java.util.List;

public abstract class Run {


    private  static Random Rand=new Random();
    public  int start_pos;
    public int curr_pos;
    public String symbol;
    public  int lane;
    public String RUNNER_NAME;
    public String MOVE;
public  static List<Run>Runners= new ArrayList<Run>();


    public String getMOVE() {
        return (Rand.nextInt(100)+1);
    }
    public  void  Make_move(int space){
start_pos=curr_pos;
    if(curr_pos+space<0){

curr_pos=0;

        
    } else if (curr_pos+space>Race.Length_of_RACE) {
        curr_pos=Race.Length_of_RACE;

        
    }
else {
    curr_pos+=space;
    }
    }
    public  boolean Win_or_Loss(Run runner){

    if(runner.curr_pos==Race.Length_of_RACE){

return  true;

return  false;

    }

    }
    public  abstract  void calculateMove();
}
