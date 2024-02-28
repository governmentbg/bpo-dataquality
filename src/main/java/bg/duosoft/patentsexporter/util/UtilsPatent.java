package bg.duosoft.patentsexporter.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UtilsPatent {

	public static String getDateAsString(LocalDate date) {
		if (date == null)
			return null;
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		return formatter.format(date);
	}

	public static String toFourNumbers(String number) {

		switch (number.length()) {
		case 0:
			number = "0000";
			break;
		case 1:
			number = "000" + number;
			break;
		case 2:
			number = "00" + number;
			break;
		case 3:
			number = "0" + number;
			break;
		default:
			break;
		}

		return number;
	}

	public static String toSixNumbers(String number) {

		switch (number.length()) {
		case 0:
			number = "000000";
			break;
		case 1:
			number = "00000" + number;
			break;
		case 2:
			number = "0000" + number;
			break;
		case 3:
			number = "000" + number;
			break;
		case 4:
			number = "00" + number;
			break;
		case 5:
			number = "0" + number;
			break;
		default:
			break;
		}

		return number;
	}

	public static File createFile(String uniqueName, String directoryPath) {
		File file = new File(directoryPath + "/" + uniqueName + ".xml");
		return file;
	}

	public static String createFolder(String name, String directoryPath) {
		File directory = new File(directoryPath + "/" + name);
		if (!directory.exists())
			directory.mkdir();
		return directory.getPath();
	}
}
