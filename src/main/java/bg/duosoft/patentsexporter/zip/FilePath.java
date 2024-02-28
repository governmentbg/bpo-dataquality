package bg.duosoft.patentsexporter.zip;


import bg.duosoft.patentsexporter.util.UtilsPatent;

import java.io.File;

public class FilePath {

    public static String path(String mainDirectoryPath, String patentsDirectoryName, String yearDirectoryName, String numberDirectoryName, String journalNameByDate, String subDirectoryName) {

        StringBuilder sb = new StringBuilder();
        sb.append(mainDirectoryPath);
        String patentsDirectoryPath = createDirectory(mainDirectoryPath, patentsDirectoryName, sb);
        String yearDirectoryPath = createDirectory(patentsDirectoryPath, yearDirectoryName, sb);
        String numberDirectoryPath = createDirectory(yearDirectoryPath, numberDirectoryName, sb);
        String subDirectoryPath = createDirectory(numberDirectoryPath, subDirectoryName, sb);
        return createDirectory(subDirectoryPath, journalNameByDate, sb);
    }

    private static String createDirectory(String parentDirectoryPath, String newDirectoryName, StringBuilder sb) {
        sb.append("/").append(newDirectoryName);
        File patentsDirectory = new File(sb.toString());
        String patentsDirectoryPath = sb.toString();
        if (!patentsDirectory.exists())
            UtilsPatent.createFolder(newDirectoryName, parentDirectoryPath);
        return patentsDirectoryPath;
    }

}
