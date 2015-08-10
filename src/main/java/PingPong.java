public class PingPong {
    public static void main(String[] args) {}


    public String[] isPingPong(Integer userNumber) {

        String[] numberList = new String[userNumber];

       for (Integer index = 1; index <= numberList.length; index++) {
           if (index % 15 ==0) {
               numberList[index - 1] = "ping-pong";
           }
           else if (index %3==0 ){
              numberList[index - 1] = "ping";

           }
           else if (index %5==0){
              numberList[index - 1] = "pong";

           }

           else{
               numberList[index -1 ] = index + "";
           }




        }


        return numberList;
   }



}
