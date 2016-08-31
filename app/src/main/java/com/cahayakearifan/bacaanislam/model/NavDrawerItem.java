package com.cahayakearifan.bacaanislam.model;

/**
 * Created by Ravi on 29/07/15.
 */
public class NavDrawerItem {

    private int icon;
    private String title;
    private int notificationCount;


    public NavDrawerItem() {

    }

    public NavDrawerItem(int icon, String title, int notificationCount) {
        this.icon = icon;
        this.title = title;
        this.notificationCount = notificationCount;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNotificationCount() {
        return notificationCount;
    }

    public void setNotificationCount(int notificationCount) {
        this.notificationCount = notificationCount;
    }
}
