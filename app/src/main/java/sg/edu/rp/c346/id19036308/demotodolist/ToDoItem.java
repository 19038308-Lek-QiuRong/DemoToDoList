package sg.edu.rp.c346.id19036308.demotodolist;

import java.util.Calendar;

public class ToDoItem {

    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle(){
        return title;
    }

    public Calendar getDate(){
        return date;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setDate(Calendar date){
        this.date = date;
    }

    public String toString(){
        String str = date.get(Calendar.YEAR) + "/"+ (date.get(Calendar.MONTH) + 1) + "/" + date.get(Calendar.DAY_OF_MONTH) + "("+ getDay(date.get(Calendar.DAY_OF_WEEK))+")";
        return str;
    }

    private String getDay(int dayOfWeek){
        switch(dayOfWeek-1){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thurday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "";
        }
    }

}
