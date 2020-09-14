package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SortDate {

    static class DateItem {
        String datetime;
        DateItem(String date) {
            this.datetime = date;
        }
    }

    static class SortByDate implements Comparator<DateItem> {
        @Override
        public int compare(DateItem a, DateItem b) {
            return a.datetime.compareTo(b.datetime);
        }
    }

    public static void main(String[] args) {
        sortDateTimeObject();
        System.out.println("===========================");
        sortDateItem();
    }

    private static void sortDateItem(){
        List<DateItem> dateList = new ArrayList<>();
        dateList.add(new DateItem("2020-03-25"));
        dateList.add(new DateItem("2019-01-27"));
        dateList.add(new DateItem("2020-03-26"));
        dateList.add(new DateItem("2020-02-26"));

        //==============================================

        Iterator<DateItem> itDate = dateList.iterator();
        while (itDate.hasNext()){
            System.out.println(itDate.next().datetime);
        }
        System.out.println("==========Sorted date==========");
        Collections.sort(dateList, new SortByDate());
        dateList.forEach(date -> {
            System.out.println(date.datetime);
        });
    }

    private static void sortDateTimeObject() {
        List<LocalDateTime>dateTimeList=new ArrayList<LocalDateTime>();
        dateTimeList.add(LocalDateTime.of(2012, 05, 12, 5, 16));
        dateTimeList.add(LocalDateTime.of(2014, 03, 23, 11, 26));
        dateTimeList.add(LocalDateTime.of(2011, 02, 13, 9, 36));
        dateTimeList.add(LocalDateTime.of(2013, 11, 12, 5, 16));
        dateTimeList.add(LocalDateTime.of(2017, 8, 11, 21, 26));
        dateTimeList.add(LocalDateTime.of(2016, 9, 05, 19, 36));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
                .ofPattern("MM/dd/yyyy '@'hh:mm a");
        System.out.println("---> Date & Time Object List Before Sort (MM/dd/yyyy '@'hh:mm a)");
        for(LocalDateTime dateTime:dateTimeList)
        {
            System.out.println(dateTime.format(dateTimeFormatter));
        }
        // LocalDateTime  internally having Comparable interface no need additional Comparator
        Collections.sort(dateTimeList);

        System.out.println("---> Date & Time Object List After Sort (MM/dd/yyyy '@'hh:mm a)");
        for(LocalDateTime dateTime:dateTimeList)
        {
            System.out.println(dateTime.format(dateTimeFormatter));
        }

    }

}
