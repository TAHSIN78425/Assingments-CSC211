

import  java.io.IOException;
import java.util.Scanner;

public class Racing extends Race {
    private  Run runner;
    private boolean race_over;

    public Racing() {


        runner= new Run();
        new Tortoise(0,0,"Tortoise");
        new  Hare(0,0,"Hare");
        race_over=false;

    }
    public void get_Plac(){


        for(Run runner: Run.Runners){

    if(runner.curr_pos==Race.Length_of_RACE){

        System.out.println("Winner is "+ runner.RUNNER_NAME);
    }



}

    }
    public void racing(){

Set_up_race();
do{

    Scanner scanner= new Scanner(System.in);
    scanner.nextLine();
    for(Run runner: Run.Runners){

runner.calculateMove();
        Race.Runner_pos(runner);
        System.out.println(runner.MOVE);
    }

Race.Display();
}while(!race_over);

get_Plac();;

    }
    private  void Set_up_race(){



        Race.Runner_pos(runner);
        System.out.println(runner.MOVE);
    }
}
