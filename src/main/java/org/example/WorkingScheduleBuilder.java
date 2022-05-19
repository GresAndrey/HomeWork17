package org.example;

import java.util.ArrayList;
import java.util.List;

public class WorkingScheduleBuilder {
    List<Boolean> schedule = new ArrayList<>();
    private int size;

    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            throw new IllegalArgumentException("size не может равняться 0 или быть отрицательным");
        }
    }

    public void dayOff() {
        schedule.add(false);
    }

    public void  dayOffs(int count) {
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                schedule.add(false);
            }
        } else {
            throw new IllegalArgumentException("count не может равняться 0 или быть отрицательным");
        }
    }

    public void workDay() {
        schedule.add(true);
    }

    public void workDays(int count) {
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                schedule.add(true);
            }
        } else {
            throw new IllegalArgumentException("count не может равняться 0 или быть отрицательным");
        }
    }

    public List<Boolean> build() {
        if (schedule.size() < size) {
            for (int i = schedule.size(); schedule.size() < size; i++) {
                schedule.add(false);
            }
            System.out.println(schedule);
        } else if (schedule.size() > size) {
            System.out.println(schedule.subList(schedule.size() - size , schedule.size() ));
        } else {
            System.out.println(schedule);
        }
        return schedule;
    }
}
