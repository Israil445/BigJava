public class Robot {
    private int robotPosX=0;
    private int robotPosY=0;
    private String direction;
    public Robot(int x,int y,String initialDirection){
        setRobotPosX(robotPosX);
        setRobotPosY(robotPosY);
        setRobotDirection(initialDirection);


    }

    public void setRobotPosX(int robotPosX){
        this.robotPosX=robotPosX;
    }
    public void setRobotPosY(int robotPosY){
        this.robotPosY=robotPosY;
    }
    public void setRobotDirection(String direction){
        this.direction=direction;
    }
    public int getRobotPosX(){
        return robotPosX;
    }
    public int getRobotPosY(){
        return robotPosY;
    }
    public String getDirection(){
        return direction;
    }

    public int[] getLocation(){
        int[] location = new int[2];
        location[0]=getRobotPosX();
        location[1]=getRobotPosY();
        return location;
    }

    public void move(){
        if(getDirection()=="north"){
            setRobotPosX(this.robotPosX+1);
        }
        else if(getDirection()=="south"){
            setRobotPosX(this.robotPosX-1);
        }
        else if(getDirection()=="west"){
            setRobotPosY(this.robotPosY+1);
        }
        else if(getDirection()=="east"){
            setRobotPosY(this.robotPosY-1);
        }
    }

    public void turnLeft(){
        if(getDirection()=="north"){
            setRobotDirection("west");
        }
        else if(getDirection()=="west"){
            setRobotDirection("south");
        }
        else if(getDirection()=="south"){
            setRobotDirection("east");
        }
        else if(getDirection()=="east"){
            setRobotDirection("north");
        }
    }

    public void turnRight(){
        if(getDirection() == "north"){
            setRobotDirection("east");
        }else if(getDirection() == "east"){
            setRobotDirection("south");
        }else if(getDirection() == "south"){
           setRobotDirection("west");
        }else if(getDirection() == "west"){
           setRobotDirection("north");
        }
    }


    public static void main(String[] args) {
        Robot robot =new Robot(0,0,"north");
        robot.move();
        System.out.println(robot.getLocation()[0]+" "+robot.getLocation()[1]);
        robot.turnLeft();
        System.out.println(robot.getDirection());
        robot.move();
        System.out.println(robot.getLocation()[0]+" "+robot.getLocation()[1]);
        robot.turnRight();
        System.out.println(robot.getDirection());
        robot.move();
        System.out.println(robot.getLocation()[0]+" "+robot.getLocation()[1]);


    }
}
