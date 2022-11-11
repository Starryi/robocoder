package net.starryi.robocode;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

/**
 * @author Starryi
 * @version 1.0
 * Created by Starryi on 2022/11/12
 */
public class MyFirstRobot extends AdvancedRobot {

    @Override
    public void run() {
        //noinspection InfiniteLoopStatement
        while (true) {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        fire(1.0);
    }
}
