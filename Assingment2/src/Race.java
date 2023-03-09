public class Race {
    public static final int Length_of_RACE = 10;
    public static final int Runners = 2;
    public String[][] run;

    public Race() {

        run = new String[Length_of_RACE + 1][Runners];
    }

    public void Display() {

        System.out.println(" ");
        for (int i = 0; i <= Length_of_RACE; i++) {

            for (int j = 0; j < Runners; j ++) {

if(run[i][j]==null){
    System.out.println("||");


}
else
    System.out.println(run[i][j]+"||");
            }

        }


    }
    public  void Runner_pos(Run runner){
        run[runner.start_pos][runner.lane]=null;
run[runner.curr_pos][runner.lane]=runner.symbol;



    }
}