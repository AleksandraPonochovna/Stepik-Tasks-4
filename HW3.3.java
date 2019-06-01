package com.company;

public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

package com.company;

public class Robot {
    Direction direction = Direction.UP;
    private int x = 0;
    private int y = 0;

    public static void main(String[] args) {
        int toX = 3;
        int toY = 0;
        Robot robot = new Robot();
        robot.moveRobot(robot, toX, toY);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }
    }

    public Direction getDirection() {
        return direction;
    }

    public void turnLeft() {
        System.out.println("Rotate 90 degrees counterclockwise.");
        switch (getDirection()) {
            case UP:
                direction = direction.LEFT;
                break;
            case DOWN:
                direction = direction.RIGHT;
                break;
            case LEFT:
                direction = direction.UP;
                break;
            case RIGHT:
                direction = direction.DOWN;
                break;
        }
    }

    public void turnRight() {
        System.out.println("Rotate 90 degrees clockwise.");
        switch (getDirection()) {
            default:
            case DOWN:
                direction = Direction.LEFT;
                break;
            case UP:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
            case LEFT:
                direction = Direction.UP;
        }

    }

    public void stepForward() {
        switch (getDirection()) {
            default:
            case RIGHT:
                x++;
                System.out.println("Шаг направо.");
                break;
            case LEFT:
                x--;
                System.out.println("Шаг налево.");
                break;
            case UP:
                y++;
                System.out.println("Шаг вперед.");
                break;
            case DOWN:
                y--;
                System.out.println("Шаг назад.");
                break;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
