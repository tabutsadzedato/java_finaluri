package ge.edu.btu;

import java.io.File;

public class FileCounter {

    public static void main(String[] args) {
        File startDir = new File("C:\\Users\\PC\\Desktop\\BTU_DOCUMENTS");
        int result = findBeginningWithBTU(startDir);
        System.out.println("მოძებნილი ფაილების რაოდენობა: " + result);
    }

    private static int findBeginningWithBTU(File Path){
        try {
            int res = 0;
            File[] files = Path.listFiles();
            for(File currentFile : files){
                if(beginsWithBTU(currentFile.getName())) {
                    res++;
                };
                if(currentFile.isDirectory()) {
                    res += findBeginningWithBTU(currentFile);
                }
            }
            return res;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }
    private static boolean beginsWithBTU(String word){
        if(word.length() < 3) {
            return false;
        }
        return "btu".equals(word.substring(0, 3));
    }
}