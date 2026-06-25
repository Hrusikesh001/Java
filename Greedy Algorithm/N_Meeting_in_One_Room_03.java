
import java.util.*;
public class N_Meeting_in_One_Room_03 {
    public static int maxMeetings(int[] start, int[] end, int n) {
        
        List<Meeting> meetings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            meetings.add(new Meeting(start[i], end[i], i + 1));
        }

        Collections.sort(meetings, (a, b) -> a.end - b.end);

        // Select the first meeting
        int count = 1;
        int lastEndTime = meetings.get(0).end;


        for (int i = 1; i < n; i++) {
            if (meetings.get(i).start > lastEndTime) {
                count++;
                lastEndTime = meetings.get(i).end;
            }
        }
        return count;
    }


    static class Meeting {
        int start;
        int end;
        int pos;

        Meeting(int start, int end, int pos) {
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        int n = start.length;
        System.out.println(maxMeetings(start, end, n));
    }
}
