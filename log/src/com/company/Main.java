package com.company;

import java.util.Date;
import  java.util.*;
class LogEntry
{
    private String ipAddress;
    private Date accessTime;
    private String request;
    private int statusCode;
    private int bytesReturned;

    public LogEntry(String ip, Date time, String req, int status, int bytes) {
        ipAddress = ip;
        accessTime = time;
        request = req;
        statusCode = status;
        bytesReturned = bytes;

    }

    public String getIpAddress()
    {
        return ipAddress;
    }
    public Date getAccessTime() {
        return accessTime;
    }
    public String getRequest() {
        return request;
    }
    public int getStatusCode() {
        return statusCode;
    }
    public int getBytesReturned() {
        return bytesReturned;
    }

    public String toString() {
        return ipAddress + " " + accessTime + " " + request
                + " " + statusCode + " " + bytesReturned;
    }
}
public class Main {

    public static void main(String[] args) {
        LogEntry l = new LogEntry("1.2.3.4",new Date(),"examplereqest",200,500);
        System.out.println(l);
    }

    }