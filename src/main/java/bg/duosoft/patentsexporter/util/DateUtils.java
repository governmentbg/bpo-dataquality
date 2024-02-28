package bg.duosoft.patentsexporter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class DateUtils {

    public static final String DATE_FORMAT_DOT = "dd.MM.yyyy";
    public static final String DATE_FORMAT_DASH = "yyyy-MM-dd";
    public static final String DATE_FORMAT_SIMPLE = "yyyyMMdd";
    public static final String DATE_TIME_FORMAT_DOT = "dd.MM.yyyy HH:mm:ss";
    public static final String TIME_FORMAT_HOUR_MINUTE_SECOND = "HH:mm:ss";
    public static final SimpleDateFormat DATE_TIME_FORMATTER = new SimpleDateFormat(DATE_TIME_FORMAT_DOT);
    public static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat(DATE_FORMAT_DOT);
    public static final SimpleDateFormat DATE_FORMATTER_DASH = new SimpleDateFormat(DATE_FORMAT_DASH);
    public static final SimpleDateFormat DATE_FORMATTER_SIMPLE = new SimpleDateFormat(DATE_FORMAT_SIMPLE);
    public static final SimpleDateFormat TIME_FORMATTER_HOUR_MINUTE_SECOND = new SimpleDateFormat(TIME_FORMAT_HOUR_MINUTE_SECOND);

    public static final String formatDate(Date date) {
        return formatDate(date, DATE_FORMATTER);
    }

    public static final String formatDate(Date date, SimpleDateFormat dateFormat) {
        return date == null ? "" : dateFormat.format(date);
    }

    public static final Date parseDateAsString(String dateAsStr) {
        try {
            return dateAsStr == null ? null : DATE_FORMATTER_DASH.parse(dateAsStr);
        } catch (ParseException e) {
            throw new RuntimeException("Can not parse date!");
        }
    }

    public static final String formatDateTime(Date date) {
        return date == null ? "" : DATE_TIME_FORMATTER.format(date);
    }

    public static Date localDateToDate(LocalDate localDate) {
        return localDate == null ? null : Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDate dateToLocalDate(Date date) {
        if (date == null) {
            return null;
        }
        return date instanceof java.sql.Date ? ((java.sql.Date) date).toLocalDate() : date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalDateTime convertToLocalDatTime(Date dateToConvert) {
        if (dateToConvert == null) {
            return null;
        }
        return dateToConvert instanceof java.sql.Date ? ((java.sql.Date)dateToConvert).toLocalDate().atStartOfDay() : dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

    public static LocalDate convertToLocalDate(Date dateToConvert) {
        if (dateToConvert == null) {
            return null;
        }
        return dateToConvert instanceof java.sql.Date ? ((java.sql.Date) dateToConvert).toLocalDate() : convertToLocalDatTime(dateToConvert).toLocalDate();
    }

    public static Date convertToDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static Date convertToDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static boolean isDateEqualsToCurrentDate(Date date) {
        if (Objects.isNull(date))
            return false;

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = DateUtils.convertToLocalDatTime(date);
        return now.getYear() == localDateTime.getYear() &&
                now.getMonth() == localDateTime.getMonth() &&
                now.getDayOfMonth() == localDateTime.getDayOfMonth();
    }

    public static boolean isDateEquals(Date firstDate, Date secondDate) {
        if (Objects.isNull(firstDate) || Objects.isNull(secondDate))
            return false;

        LocalDateTime firstLocalDateTime = DateUtils.convertToLocalDatTime(firstDate);
        LocalDateTime secondLocalDateTime = DateUtils.convertToLocalDatTime(secondDate);
        return firstLocalDateTime.getYear() == secondLocalDateTime.getYear() &&
                firstLocalDateTime.getMonth() == secondLocalDateTime.getMonth() &&
                firstLocalDateTime.getDayOfMonth() == secondLocalDateTime.getDayOfMonth();
    }


    public static Date removeHoursFromDate(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static Date addSecondsToDate(Date date, long seconds) {
        if (Objects.isNull(date))
            return null;

        LocalDateTime localDateTime = convertToLocalDatTime(date).plusSeconds(seconds);
        return convertToDate(localDateTime);
    }

}
