//https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
public class LeaserBeams {
    public static void main(String[] args) {
    String[] bank = {"011001","000000","010100","001000"};
    int[] ans = {3,0,2,1};

        System.out.println (numberOfBeams ( bank ));
    }
    public static int numberOfBeams(String[] bank) {

      int col = bank[0].length ();
      int lastcount = 0;
      int total =0;
      for(String str : bank){
          int count = 0;
          for (int i = 0; i < col; i++) {
              if(str.charAt ( i ) =='1'){
                  count++;
              }
          }
          total+= (lastcount*count);
          if(count!=0) lastcount = count;

      }
        return total;
    }
}
