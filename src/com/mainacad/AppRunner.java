package com.mainacad;

import com.mainacad.model.ConnectionInfo;
import com.mainacad.model.Gender;
import com.mainacad.model.User;
import com.mainacad.service.ConnectionInfoService;
import com.mainacad.service.FileManagerService;
import java.util.logging.Logger;
import com.mainacad.*;

import javax.naming.MalformedLinkException;

public class AppRunner {

    private static Logger logger = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) {

        //      ConnectionInfo connectionInfo = ConnectionInfoService.generateConnectionInfoQueue(1).peek();
//
        ////      FileManagerService.writeText("connections.txt", connectionInfo.toString(), true);
//
        //      logger.info("\n" + FileManagerService.readText("connections.txt" ));

        User user = new User();
        user.setGender(Gender.MALE);

        logger.info(String.valueOf(user.getGender()));
    }
}




























