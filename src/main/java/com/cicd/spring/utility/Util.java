package com.cicd.spring.utility;

import java.util.Date;

public class Util {
    public static final String welcomeTemplate="<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "    <title>Welcome Page</title>\n" +
            "    <style>\n" +
            "        body {\n" +
            "            font-family: Arial, sans-serif;\n" +
            "            background-color: #f0f8ff;\n" +
            "            color: #333;\n" +
            "            display: flex;\n" +
            "            justify-content: center;\n" +
            "            align-items: center;\n" +
            "            height: 100vh;\n" +
            "            margin: 0;\n" +
            "        }\n" +
            "        .welcome-container {\n" +
            "            text-align: center;\n" +
            "            padding: 20px;\n" +
            "            border: 2px solid #ccc;\n" +
            "            border-radius: 10px;\n" +
            "            background-color: #fff;\n" +
            "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" +
            "        }\n" +
            "        h1 {\n" +
            "            color: #4CAF50;\n" +
            "        }\n" +
            "        p {\n" +
            "            font-size: 1.2em;\n" +
            "        }\n" +
            "    </style>\n" +
            "</head>\n" +
            "<body>\n" +
            "    <div class=\"welcome-container\">\n" +
            "        <h1>Welcome,\n to Our CI/CD demo Website!</h1>\n" +new Date()+
            "        <p>We're delighted to have you here. Explore and enjoy your stay!</p>\n" +
            "    </div>\n" +
            "</body>\n" +
            "</html>\n";
}
