public class Team {
    private int ID;
    private  int win;
    private  int loss;

    public Team(int ID, int win, int loss) {
        this.ID = ID;
        this.win = win;
        this.loss = loss;




        System.out.println("Team Id :"+ID);
        System.out.println("Win games :"+win);
        System.out.println("Lost games :"+loss);
        System.out.println("Number of games remaining "+(25-(win+loss)));
        System.out.println("Winning Average is :"+(win/(win+loss)));
        if(win>loss){

            System.out.println("Yeah greatly appreciated ");

        }
        else{

            System.out.println("Disappointed !!!");
        }

    }

}
