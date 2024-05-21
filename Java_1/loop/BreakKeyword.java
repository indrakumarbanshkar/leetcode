package project.problem.loop;

public class BreakKeyword {
    public static void main(String[] args) {
        for (int i = 1; ; i++) {
            if (i == 4) {

                break;

            }
            System.out.println(i);
        }


        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if(i==j){
                    break;
                }
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
