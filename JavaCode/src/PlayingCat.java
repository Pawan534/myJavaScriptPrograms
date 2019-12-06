public class PlayingCat {
    // write your code here
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 55));
        System.out.println(isCatPlaying(false, 35));
    }
    public static boolean isCatPlaying(boolean summer, int temperature){

        boolean summerTemp = (temperature>=25 && temperature<=45)?true:false;
        boolean winterTemp = (temperature>=25 && temperature<=35)?true:false;

        if(summer){
            return summerTemp;
        } else{
            return winterTemp;
        }
    }

}