public class SQRService {
    public int countSquaresInRange(int leftBound, int rightBound){
        int start = 10;
        int finish = 99;
        int count = 0;
        for (int i = start; i < finish+1; i++){
            if (i*i >= leftBound && i*i <= rightBound){
                count = count + 1; // count += 1
            }
        }
        return count;
    }
}
