public class PassThePillowProblem {

    public static void main(String[] args) {
        PassThePillowProblem solution = new PassThePillowProblem();
        System.out.println(solution.passThePillow(18,38));
    }
    public int passThePillow(int n, int time) {
        int i=1;
        while(time>0){
            while(i<n && time>0){
                i++; time--;
            }
            while(i>1 && time>0){
                i--;time--;
            }
        }
        return i;
    }
}