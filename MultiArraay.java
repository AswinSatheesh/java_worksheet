public class MultiArraay {
    public static void main(String[] args){
        int[][] multiArray = {{1,2,3,4}, {5,6,7}};
        // System.out.println(multiArray.length);
        for (int i = 0; i < multiArray.length; ++i){
            for (int j = 0; j < multiArray[i].length; ++j){
                System.out.println(multiArray[i][j]);
            }
        }
    }
}
