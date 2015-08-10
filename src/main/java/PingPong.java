public class PingPong {
    public static void main(String[] args) {}


    public String[] isPingPong(Integer userNumber) {

        String[] numberList = new String[userNumber];

       for (Integer index = 0; index < numberList.length; index++) {
           numberList[index] = index + "";
        }

        return numberList;
   }



}
