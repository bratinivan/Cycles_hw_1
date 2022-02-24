public class TestSQRService {
    public static boolean testMethod(){
        int leftBound = 200;
        int rightBound = 300;
        int res = 3;

        SQRService sqrService = new SQRService();
        return res == sqrService.countSquaresInRange(leftBound, rightBound);
    }
    public static void main(String[] args) {
        if (testMethod()){
            System.out.println("All Right");
        } else {
            System.out.println("Wrong result");
        }
    }
}
